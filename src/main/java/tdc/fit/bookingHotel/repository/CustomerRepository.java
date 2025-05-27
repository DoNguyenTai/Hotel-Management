package tdc.fit.bookingHotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdc.fit.bookingHotel.entity.Customer;
import tdc.fit.bookingHotel.entity.User;




@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Customer findByUserId(User user);



	
}
