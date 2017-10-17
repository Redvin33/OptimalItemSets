package com.itemsets.OptimalItemSets;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@RunWith(SpringRunner.class)
@SpringBootTest

public class OptimalItemSetsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void allItemsTest() {
		try {
			URL url = new URL("http://localhost:2015/items");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			int responsecode = con.getResponseCode();
			assertEquals(responsecode, 200);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail();
		}
	}

	@Test
	public void nonExistingItem() {
		try {
			URL url = new URL("http://localhost:2015/items/999999");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			int responsecode = connection.getResponseCode();
			System.out.println(responsecode);
			assertSame(responsecode, 404);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}   fail();
	}

}
