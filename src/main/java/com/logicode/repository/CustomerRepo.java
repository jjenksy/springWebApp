package com.logicode.repository;

import com.logicode.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jjenkins on 11/1/2016.
 */
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    /**
     * Te method findBy need to be postfixed with the exact variable we are looking for's name
     * @param customerName the customerName
     * @return
     */
    //find the customer by there name
    List<Customer> findBycustomerName(String customerName);

    //find by the ID
    List<Customer> findByid(Long id);
}
