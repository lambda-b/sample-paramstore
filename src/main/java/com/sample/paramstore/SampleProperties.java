package com.sample.paramstore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SampleProperties
 */
@Getter
@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties
public class SampleProperties {

	/** normalParam */
	private final String normalParam;

	/** secureParam */
	private final String secureParam;

	/** normalParams */
	private final String[] multipleParams;

}
