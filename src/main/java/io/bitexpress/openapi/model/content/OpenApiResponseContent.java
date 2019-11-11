package io.bitexpress.openapi.model.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 开放接口请求内容
 * 
 * @author shenyue
 *
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiResponseContent<T> {

	/**
	 * 请求头
	 */
	@NotNull
	@Valid
	private OpenApiResponseHeader header;

	/**
	 * 请求体
	 */
	@Valid
	private T body;

}
