package com.netease.meta;

import java.sql.Array;
import java.util.ArrayList;

public class Buyer extends User {
	private ArrayList<Good> goods;
	
	public Buyer(int id, int personId, String name) {
		super(id, personId, name);
	}
	
	public ArrayList<Good> getGoods() {
		return goods;
	}
	
	public void setGoods(ArrayList<Good> goods) {
		this.goods = goods;
	}
	
}
