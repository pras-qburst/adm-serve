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
  
  
 

  @RequestMapping(method = RequestMethod.GET, value="/products/{channelId}")
  public List<Product> getAllProductsByChannelId(@PathVariable("channelId") String channelId){
   
	  //return categoriesService.getCategoriesForChannel(channelId);
	  return productService.getProductsForChannel(channelId);
  }
  

  @RequestMapping(method = RequestMethod.GET, value="/categories/{channelId}")
  public List<ProductCategory> getAllCatagorieByChannelId(@PathVariable("channelId") String channelId){
   
	  return categoriesService.getCategoriesForChannel(channelId);
  }
  
  @RequestMapping(method = RequestMethod.GET, value="/service/{channelId}")
  public List<ServiceType> getAllServiceTypesByChannelId(@PathVariable("channelId") String channelId){
   
	  //return categoriesService.getCategoriesForChannel(channelId);
	  return serviceTypeService.getAllServiceTypeForChannel(channelId);
  }
  
 /* @RequestMapping(method = RequestMethod.GET)
  public Map<String, Object> getAllBooks(){
    List<City> books = bookRepository.findAll();
    Map<String, Object> response = new LinkedHashMap<String, Object>();
    response.put("totalBooks", books.size());
    response.put("books", books);
    return response;
  }*/
}
