

package com.store.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.store.persistence.domain.ProductCategory;

public interface CategoriesRepository extends Repository<ProductCategory, Long> {



	
	@Query(value="select * from product_category bc where bc.category_id in (select distinct product.category_id from product product  join product_channel_mapping  pcm on  product.id= pcm.product_id  where pcm.channel_id= ?)",nativeQuery = true)
	List<ProductCategory> findByChannelId(String deliveryChannel);
}
