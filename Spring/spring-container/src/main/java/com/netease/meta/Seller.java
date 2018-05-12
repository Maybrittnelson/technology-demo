package com.netease.meta;

import java.util.ArrayList;
public class Seller extends User {
	private ArrayList<Good> goods;
	
	public Seller(int id, int personId, String name) {
		super(id, personId, name);
		
	}
	
	public void setGoods(ArrayList<Good> goods) {
		this.goods = goods;
	}
	
	public ArrayList<Good> getGoods() {
		return goods;
	}
}
