package com.springbook.ioc.injection;

import java.util.Set;
//중복값을허용하지 않는 집합 객체를 사용

public class CollectionBean {
	private Set<String> addressList;
	
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	public Set<String> getAddressList(){
		return addressList;
	}
}
