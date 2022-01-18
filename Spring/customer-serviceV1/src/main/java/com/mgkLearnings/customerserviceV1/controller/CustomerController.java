package com.mgkLearnings.customerserviceV1.controller;


import com.mgkLearnings.customerserviceV1.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customerList = Arrays.asList(
            new Customer(1, "CustOne"),
             new Customer(2, "CustTwo")
    );

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerList;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerList.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
