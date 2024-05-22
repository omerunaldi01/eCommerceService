package eCommerceService.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceService.dataAccess.abstracts.CustomerDao;
import eCommerceService.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public List<Customer> getAll() {

		return customers;
	}

	@Override
	public Customer getById(int id) {
		
		return customers.get(id);
	}

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile müşteri eklendi : "+customer.getIsim());

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate ile müşteri güncellendi : "+customer.getIsim());

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate ile müşteri silindi : "+customer.getIsim());

	}
}
