package io.bitexpress.openapi.model.envelope;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 开放接口信封
 *
 * @author shenyue
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiEnvelope {
    /**
     * 会员id
     *
     * @deprecated use issuerCode
     */
    @Deprecated
    private Long uid;

    /**
     * 发起者代码
     */
    private String issuerCode;

    /**
     * 签名
     */
    @Size(max = 2000)
    private String signature;

    /**
     * 签名版本.可空.默认1
     */
    private BigDecimal signatureVersion;

    /**
     * 内容
     */
    @NotBlank
    private String content;
}
