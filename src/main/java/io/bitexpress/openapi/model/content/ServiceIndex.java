package io.bitexpress.openapi.model.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceIndex {
	/**
	 * 接口名称
	 */
	@NotBlank
	@Size(max = 50)
	private String service;

	/**
	 * 接口版本
	 */
	@NotNull
	private BigDecimal serviceVersion;



}
