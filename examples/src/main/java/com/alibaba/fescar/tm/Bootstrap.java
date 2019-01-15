package com.alibaba.fescar.tm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    public static void main(String[] args) throws InterruptedException, IOException {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-storage-service.xml");
        context.registerShutdownHook();
        context.start();
        while (true) {
            try {
                Thread.currentThread();
                Thread.sleep(3L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
