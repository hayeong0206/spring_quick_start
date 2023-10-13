package com.springbook.ioc.injection;

import java.util.Properties;
//중복값을허용하지 않는 집합 객체를 사용

public class CollectionBean {
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	public Properties getAddressList(){
		return addressList;
	}
}
