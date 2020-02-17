package com.txn.moneychanger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.kafka.common.KafkaException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.txn.moneychanger.kafka.config.CurrencyRate;
import com.txn.moneychanger.kafka.model.MoneyExchange;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@SpringBootApplication
@EnableSwagger2
@RestController
@RequestMapping("exchage")
public class ReceiverApp {

	private static final Logger logger = LogManager.getLogger(ReceiverApp.class);
	List<MoneyExchange> currencyLst = new ArrayList<>();

	@GetMapping("/receive")
	public List<MoneyExchange> getExchangeRate() {
		return currencyLst;
	}

	@KafkaListener(groupId = "rate_group", topics = "money_exchange", containerFactory = "kafkaListenerContainerFactory")
	public List<MoneyExchange> getRateFromTopic(MoneyExchange moneyExchange) {
		logger.info("getRateFromTopic method invoked ");

		try {
			currencyLst.add(moneyExchange);
		} catch (Exception e) {
			logger.error("Err during Consuming ,Reason:", e);
		}

		return currencyLst;
	}

	public static void main(String[] args) {
		SpringApplication.run(ReceiverApp.class, args);
	}

}
