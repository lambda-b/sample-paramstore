package com.sample.paramstore;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

/**
 * HelloController
 */
@Controller
@RequiredArgsConstructor
@EnableConfigurationProperties(SampleProperties.class)
public class HelloController {

	/** properties */
	private final SampleProperties properties;

	@GetMapping("/")
	public String index(final Model model) {

		model.addAttribute("normal", properties.getNormalParam());
		model.addAttribute("secure", properties.getSecureParam());
		model.addAttribute("multiples", properties.getMultipleParams());

		return "hello";
	}
}
