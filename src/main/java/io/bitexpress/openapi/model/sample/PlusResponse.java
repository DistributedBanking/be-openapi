package io.bitexpress.openapi.model.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PlusResponse {
	private String message;

	private BigDecimal result;

	private Date time;

	private Long uid;
}
