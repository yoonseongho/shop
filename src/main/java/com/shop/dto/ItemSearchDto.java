package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType; // 상품등록일

    private ItemSellStatus searchSellStatus; // 판매상태

    private String searchBy; //유형선택

    private String searchQuery = ""; // 검색쿼리문
}