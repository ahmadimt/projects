package com.imti.techolution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TecholutionApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TecholutionApplication.class, args);
		List<String> lines = new ArrayList<>();
		if (args.length == 1) {
			lines = Files.lines(Paths.get(args[0])).collect(Collectors.toList());
		} else {
			lines = Files.lines(Paths.get("src/main/resources/input.txt")).collect(Collectors.toList());
		}
		if (!lines.isEmpty()) {

		}
	}
}
