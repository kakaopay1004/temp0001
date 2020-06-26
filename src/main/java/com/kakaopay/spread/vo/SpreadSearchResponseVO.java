package com.kakaopay.spread.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpreadSearchResponseVO {

    private String spreadDate;

    private int money;

    private int giveMoney;

    private List<ReceiveUserVO> receivedUsers;

}
