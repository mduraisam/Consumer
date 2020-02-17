package com.txn.moneychanger.receiverapp;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.txn.moneychanger.kafka.model.MoneyExchange;

@RunWith(SpringJUnit4ClassRunner.class)
class ReceiverAppTest {

	@Autowired
	RestTemplate restTemplate;

	@Test
	public void testPublish() throws Exception {

		final String uri = "http://localhost:8082/receiver";

		//List<String> result = restTemplate.getForObject(uri, (List) Object.class);

		//Assert.assertEquals(true, lst.size() > 0);
	}

}
