package io.bitexpress.openapi.model.content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 开放接口请求头
 * 
 * @author shenyue
 *
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiRequestHeader {
	/**
	 * 请求时间
	 */
	@NotNull
	private Date requestTime;

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

	/**
	 * 保留字段.返回时携带
	 */
	@Size(max = 50)
	private String preserved;

	@JsonIgnore
	public ServiceIndex getServiceIndex() {
		return new ServiceIndex(service, serviceVersion);
	}

	@JsonIgnore
	public void setServiceIndex(ServiceIndex serviceIndex) {
		this.service = serviceIndex.getService();
		this.serviceVersion = serviceIndex.getServiceVersion();
	}


}
