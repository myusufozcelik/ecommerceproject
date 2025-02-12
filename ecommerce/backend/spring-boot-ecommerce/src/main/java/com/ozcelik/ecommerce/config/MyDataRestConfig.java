package com.ozcelik.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.ozcelik.ecommerce.entity.Product;
import com.ozcelik.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		// disable HTTP Methods for Product: put,post and delete
		
		config.getExposureConfiguration()
		.forDomainType(Product.class)
		.withItemExposure((metdata,httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
		
		// disable HTTP Methods for ProductCategory: put,post and delete

		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metdata,httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
		
	}
	
}
