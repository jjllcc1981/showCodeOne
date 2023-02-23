package com.example.showcodeone.testcase;

import com.example.showcodeone.tools.TestReport_original;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;
@Slf4j
@Listeners({TestReport_original.class})
public class RunTestOneTest {
    @BeforeClass()
    public void beforeClass() {
        log.info("==== LogInTest star ====");

    }
    @AfterClass
    public void afterClass() {
        log.info("==== LogInTest end ====");
    }

    @Test(description = "RunTestOneTest --- one")
    public void runOne(){
        log.info("======== RunTestOneTest run one");
    }

    @Test(description = "RunTestOneTest --- two")
    public void runTwo(){
        log.info("======== RunTestOneTest run two");
    }
}
