

package com.store.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.store.persistence.domain.Product;

/**
 * 
 * Provides Product related db methods
 * 
 * @author prasanth
 *
 */
public interface ProductRepository extends Repository<Product, Long> {

	
	
	@Query("from Product product where product.productId= ?")
	List<Product> findByProductId(String productId);
	
	
	@Query(value="select * from product product join service_type st on product.product_id=st.product_id where st.service_type_id=?",nativeQuery = true)
	List<Product> findByServiceId(String service_type_id);
	
	@Query(value="select * from product prod  join product_channel_mapping  pcm on  (prod.id  = pcm.product_id)  where pcm.channel_id= ?",nativeQuery = true)
	List<Product> findByDeliveryChannelId(String channel_id);

	
	
}
