

package com.admin.service;

import java.util.List;

import com.admin.persistence.domain.Product;
import com.admin.persistence.domain.ServiceType;

public interface ServiceTypeService {

	List<ServiceType> getAllServiceTypeForChannel( String channelId);


}
