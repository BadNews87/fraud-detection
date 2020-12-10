package com.benarczyk.kris.frauddetection;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseClass {

    @Before
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}
