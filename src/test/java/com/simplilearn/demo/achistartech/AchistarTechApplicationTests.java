package com.simplilearn.demo.achistartech;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AchistarTechApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(AchistarTechApplicationTests.class);
	@Test
	void contextLoads() {
        logger.info("TestCase is executing......");
        assertEquals(true,true);
    }


}
