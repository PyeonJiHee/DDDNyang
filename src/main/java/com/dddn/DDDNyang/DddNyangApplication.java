package com.dddn.DDDNyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DddNyangApplication{

	public static void main(String[] args) {
		SpringApplication.run(DddNyangApplication.class, args);
	}

}
