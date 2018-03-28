package com.geshaofeng.jsonparseexception;

import com.geshaofeng.jsonparseexception.form.Json;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/exceptions")
public class JsonParseExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonParseExceptionApplication.class, args);
	}

	@PostMapping("/json-parse")
	public void jsonParseException(@RequestBody Json json) {
		boolean flag = true;
	}

}
