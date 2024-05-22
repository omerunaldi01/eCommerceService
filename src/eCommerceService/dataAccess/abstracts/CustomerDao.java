package eCommerceService.dataAccess.abstracts;

import java.util.List;

import eCommerceService.entities.concretes.Customer;

public interface CustomerDao {
   List<Customer> getAll();
   Customer getById(int id);
   void add(Customer customer);
   void update(Customer customer);
   void delete(Customer customer);

}
