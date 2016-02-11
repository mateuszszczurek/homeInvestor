package com.investor.web;

import com.investor.app.RestInterface;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RestInterface.class)
public class DepositsIntegrationTests {
}
