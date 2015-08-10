/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.admin.persistence.domain.Product;
import com.admin.persistence.repo.ProductRepository;
import com.admin.service.ProductService;

@Component("productService")
@Transactional
class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;



	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	

	@Override
	public List<Product> getProductsForChannel(String channelId) {
		// TODO Auto-generated method stub
		return productRepository.findByDeliveryChannelId(channelId);
	}
	
	

	/*@Override
	public Hotel getHotel(City city, String name) {
		Assert.notNull(city, "City must not be null");
		Assert.hasLength(name, "Name must not be empty");
		return this.hotelRepository.findByCityAndName(city, name);
	}

	@Override
	public Page<Review> getReviews(Hotel hotel, Pageable pageable) {
		Assert.notNull(hotel, "Hotel must not be null");
		return this.reviewRepository.findByHotel(hotel, pageable);
	}*/

	/*@Override
	public Review getReview(Hotel hotel, int reviewNumber) {
		Assert.notNull(hotel, "Hotel must not be null");
		return this.reviewRepository.findByHotelAndIndex(hotel, reviewNumber);
	}

	@Override
	public Review addReview(Hotel hotel, ReviewDetails details) {
		Review review = new Review(hotel, 1, details);
		return reviewRepository.save(review);
	}

	@Override
	public ReviewsSummary getReviewSummary(Hotel hotel) {
		List<RatingCount> ratingCounts = this.hotelRepository.findRatingCounts(hotel);
		return new ReviewsSummaryImpl(ratingCounts);
	}*/

	/*private static class ReviewsSummaryImpl implements ReviewsSummary {

		private final Map<Rating, Long> ratingCount;

		public ReviewsSummaryImpl(List<RatingCount> ratingCounts) {
			this.ratingCount = new HashMap<Rating, Long>();
			for (RatingCount ratingCount : ratingCounts) {
				this.ratingCount.put(ratingCount.getRating(), ratingCount.getCount());
			}
		}

		@Override
		public long getNumberOfReviewsWithRating(Rating rating) {
			Long count = this.ratingCount.get(rating);
			return count == null ? 0 : count;
		}
	}*/
}
