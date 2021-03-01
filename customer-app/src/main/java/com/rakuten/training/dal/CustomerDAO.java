package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Customer;


public class CustomerDAO {
		
		public Customer save(Customer toBeSaved);
		public Customer findbyId(int id);
		public List<Product> findAll();
		public void deleteById(int id);

	}

}
