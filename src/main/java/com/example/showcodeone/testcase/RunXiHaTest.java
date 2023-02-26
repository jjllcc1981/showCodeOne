package com.example.showcodeone.testcase;

import com.example.showcodeone.tools.TestReport_original;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Slf4j
@Listeners({TestReport_original.class})
public class RunXiHaTest {
    @BeforeClass()
    public void beforeClass() {
        log.info("==== RunXiHaTest star ====");

    }
    @AfterClass
    public void afterClass() {
        log.info("==== RunXiHaTest end ====");
    }

    @Test(description = "運行第1次")
    public void runTestdemo1(){
        log.info("runTestdemo1 run");
    }
    @Test(description = "運行第2次")
    public void runTestdemo2(){
        log.info("runTestdemo2 run");
    }
    @Test(description = "運行第3次")
    public void runTestdemo3(){
        log.info("runTestdemo3 run");
    }
    @Test(description = "運行第4次")
    public void runTestdemo4(){
        log.info("runTestdemo4 run");
    }
}
