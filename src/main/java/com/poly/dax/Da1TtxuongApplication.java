package com.poly.dax;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Da1TtxuongApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(Da1TtxuongApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sussessfull");
	}

}
