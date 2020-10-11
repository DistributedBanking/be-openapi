package io.bitexpress.openapi.model.envelope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Issuer implements Serializable {


    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String issuerType;
    
    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String issuerCode;

}
