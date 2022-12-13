package com.mahedi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahedi.model.OnlineShop;
import com.mahedi.repository.OnlineShopRepository;
@Service
public class OnlineShopServiceImpl implements OnlineShopService{

	
	@Autowired
	private OnlineShopRepository onlineShopRepository;
	
	@Override
	public List<OnlineShop> getAllProducts() {
		return onlineShopRepository.findAll();
	}

}
