package com.lambda.orders.service;

import com.lambda.orders.model.Customer;
import com.lambda.orders.model.Order;
import com.lambda.orders.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository custrepo;
    
    @Override
    public List<Customer> findAll()
    {
        ArrayList<Customer> list = new ArrayList<>();
        custrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    
    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        Customer newCust = new Customer();
        newCust.setAgentcode(customer.getAgentcode());
        newCust.setCustcode(customer.getCustcode());
        newCust.setCustcity(customer.getCustcity());
        newCust.setCustname(customer.getCustname());
        newCust.setCustcountry(customer.getCustcountry());
        newCust.setWorkingarea(customer.getWorkingarea());
        newCust.setGrade(customer.getGrade());
        newCust.setOpeningamt(customer.getOpeningamt());
        newCust.setReceiveamt(customer.getReceiveamt());
        newCust.setPaymentamt(customer.getPaymentamt());
        newCust.setOutstandingamt(customer.getOutstandingamt());
        newCust.setPhone(customer.getPhone());
        
        return custrepo.save(newCust);
    }
    
    @Override
    public Customer findCustomerByCode(long custcode) throws EntityNotFoundException
    {
        return custrepo.findById(custcode).orElseThrow(() -> new EntityNotFoundException(Long.toString(custcode)));
    }
    
    @Override
    public void delete(long custcode)
    {
        if(custrepo.findById(custcode).isPresent())
        {
            custrepo.deleteById(custcode);
        }
        else throw new EntityNotFoundException();
    }
    
    @Override
    public Customer update(Customer customer, long custcode)
    {
        Customer oldCustomer = custrepo.findById(custcode).orElseThrow(() -> new EntityNotFoundException(Long.toString(custcode)));
        
        if(customer.getCustname() != null)
        {
            oldCustomer.setCustname(customer.getCustname());
        }
        if(customer.getCustcity() != null)
        {
            oldCustomer.setCustcity(customer.getCustcity());
        }
        if(customer.getWorkingarea() != null)
        {
            oldCustomer.setWorkingarea(customer.getWorkingarea());
        }
        if(customer.getCustcountry() != null)
        {
            oldCustomer.setCustcountry(customer.getCustcountry());
        }
        if(customer.getGrade() != null)
        {
            oldCustomer.setGrade(customer.getGrade());
        }
        if(customer.getOpeningamt() != 0)
        {
            oldCustomer.setOpeningamt(customer.getOpeningamt());
        }
        if(customer.getReceiveamt() != 0)
        {
            oldCustomer.setReceiveamt(customer.getReceiveamt());
        }
        if(customer.getPaymentamt() != 0)
        {
            oldCustomer.setPaymentamt(customer.getPaymentamt());
        }
        if(customer.getOutstandingamt() != 0)
        {
            oldCustomer.setOutstandingamt(customer.getOutstandingamt());
        }
        if(customer.getPhone() != null)
        {
            oldCustomer.setPhone(customer.getPhone());
        }
        if(customer.getAgentcode() != 0)
        {
            oldCustomer.setAgentcode(customer.getAgentcode());
        }
        
        return custrepo.save(oldCustomer);
    }
}
