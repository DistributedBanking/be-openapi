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
public class OpenApiRequestContent<T> {

	/**
	 * 请求头
	 */
	@NotNull
	@Valid
	private OpenApiRequestHeader header;

	/**
	 * 请求体
	 */
	@Valid
	private T body;

}
