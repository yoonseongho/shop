package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDetailDto {
    private Long cartItemId; // 장바구니 상품 아이디

    private String itemNm; // 상품명

    private int price; // 가격

    private int count; // 수량

    private String imgUrl; // 상품이미지 경로

    public CartDetailDto(Long cartItemId, String itemNm, int price, int count, String imgUrl) {
        this.cartItemId = cartItemId;
        this.itemNm = itemNm;
        this.price = price;
        this.imgUrl = imgUrl;
        this.count = count;
    }
}