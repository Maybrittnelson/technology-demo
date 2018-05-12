package com.netease.meta;

import java.util.ArrayList;

public class Good {
	private int id;
	private int goodsId;
	private String name;
	private double price;
	private boolean sell;
	private boolean buy;
	
	public Good(int id, int goodsId, String name, double price) {
		this.id = id;
		this.goodsId = goodsId;
		this.name = name;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean getSell() {
		return sell;
	}

	public void setSell(boolean sell) {
		this.sell = sell;
	}

	public boolean getBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

}
