package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/stair")
public class StairController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> get(@RequestParam String stair) {
	

		int i = Integer.valueOf(stair);
		StringBuffer sb = new StringBuffer();

		if (0 < i && i <= 100) {

			for (int j = 0; j < i; j++) {
				int spaces = (i - 1) - j;

				// Print Spaces
				for (int k = 0; k < spaces; k++) {
					sb.append(" ");
				}

				// Print #
				for (int k = 0; k <= j; k++) {
					sb.append("#");
				}

				sb.append("\n");
			}

		} else {
			return new ResponseEntity<String>("Input must be between 1 and 100", HttpStatus.OK);
		}

		return new ResponseEntity<String>(sb.toString(), HttpStatus.OK);
	}

}
