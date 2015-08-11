

package com.store.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.store.persistence.domain.ServiceType;

/**
 * 
 * Provides Service Type related db methods
 * 
 * @author prasanth
 *
 */

public interface ServiceTypeRepository extends Repository<ServiceType, Long> {

	
		
	
	@Query(value="select * from service_type st where st.product_id in (select distinct product.id from product product  join product_channel_mapping  pcm on  product.id= pcm.product_id  where pcm.channel_id= ?)",nativeQuery = true)
	List<ServiceType> findByChannelId(String channelId);
		
	
}
