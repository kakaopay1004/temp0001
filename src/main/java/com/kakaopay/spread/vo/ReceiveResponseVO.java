package com.kakaopay.spread.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class ReceiveResponseVO {

    @ApiModelProperty(value = "받은 금액")
    private int money;

}
