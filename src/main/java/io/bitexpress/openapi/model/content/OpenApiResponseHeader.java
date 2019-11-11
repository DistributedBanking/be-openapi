package io.bitexpress.openapi.model.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 开放接口相应头
 * 
 * @author shenyue
 *
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiResponseHeader {
	/**
	 * 响应时间
	 */
	@NotNull
	private Date responseTime;
	/**
	 * 响应代码
	 */
	@NotBlank
	@Size(max = 200)
	private String responseCode;

	/**
	 * 错误消息
	 */
	@Size(max = 200)
	private String errorMessage;

	/**
	 * 保留字段.返回时携带
	 */
	@Size(max = 500)
	private String preserved;

}
