

package com.store.service;

import java.util.List;

import com.store.persistence.domain.Product;
import com.store.persistence.domain.ServiceType;

public interface ServiceTypeService {

	List<ServiceType> getAllServiceTypeForChannel( String channelId);


}
