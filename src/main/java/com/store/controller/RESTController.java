package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.store.persistence.domain.Product;
import com.store.persistence.domain.ProductCategory;
import com.store.persistence.domain.ServiceType;
import com.store.service.CategoriesService;
import com.store.service.ProductService;
import com.store.service.ServiceTypeService;

/**
 * Rest Controller to receive all incomming API calls
 * 
 * @author prasanth
 *
 *
 */

@RestController
@RequestMapping("/api")
public class RESTController {

	@Qualifier("categoriesService")
	@Autowired
	private CategoriesService categoriesService;

	@Qualifier("productService")
	@Autowired
	private ProductService productService;

	@Qualifier("serviceTypeService")
	@Autowired
	private ServiceTypeService serviceTypeService;

	/**
	 * Serve JSON response to provide all products by Channel Id
	 * 
	 * @param channelId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/products/{channelId}")
	public List<Product> getAllProductsByChannelId(
			@PathVariable("channelId") String channelId) {

		// return categoriesService.getCategoriesForChannel(channelId);
		return productService.getProductsForChannel(channelId);
	}

	/**
	 * Serve JSON response to provide all product categories by Channel Id
	 * 
	 * @param channelId
	 * @return
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/categories/{channelId}")
	public List<ProductCategory> getAllCatagorieByChannelId(
			@PathVariable("channelId") String channelId) {

		return categoriesService.getCategoriesForChannel(channelId);
	}

	/**
	 * Serve JSON response to provide all service type by Channel Id
	 * 
	 * @param channelId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/service/{channelId}")
	public List<ServiceType> getAllServiceTypesByChannelId(
			@PathVariable("channelId") String channelId) {

		return serviceTypeService.getAllServiceTypeForChannel(channelId);
	}

}
