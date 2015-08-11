
package com.store.service;

import java.util.List;

import com.store.persistence.domain.Product;

public interface ProductService {

	List<Product> getProductsForChannel( String channelId);


}
