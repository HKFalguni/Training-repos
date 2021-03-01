package com.rakuten.training.dal;

 class CustomerDAOJpaImpl {
	package com.rakuten.training.dal;

	

	@Repository
	@Transactional
	public class CustomerDAOJpaImpl implements CustomerDAO {
		
		@Autowired
		EntityManager em;
		

		@Override
		public Customer save(Customer toBeSaved) {
			em.persist(toBeSaved);
			return toBeSaved;
		}

		@Override
		public Customer findbyId(int id) {
			
			return em.find(Customer.class, id);
		}

		@Override
		public List<Customer> findAll() {
			Query q = em.createQuery("select p from Customer as p");
			return q.getResultList();
		}

		@Override
		public void deleteById(int id) {
			Customer p = em.find(Customer.class,id);
			em.remove(p);
			
		}
		
		

	}


}
