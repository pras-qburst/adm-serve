
package com.admin.service;

import java.util.List;

import com.admin.persistence.domain.Product;

public interface ProductService {

	List<Product> getProductsForChannel( String channelId);


}
