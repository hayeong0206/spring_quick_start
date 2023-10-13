package com.springbook.ioc.injection;

import java.util.Map;
//중복값을허용하지 않는 집합 객체를 사용

public class CollectionBean {
	private Map<String, String> addressList;
	
	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
	public Map<String, String> getAddressList(){
		return addressList;
	}
}
