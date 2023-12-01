package com.manytomany.manytomany;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

import com.manytomany.manytomany.entity.Customer;
import com.manytomany.manytomany.entity.Sale;
import com.manytomany.manytomany.entity.Veicle;
import com.manytomany.manytomany.repository.ICustomerRepository;
import com.manytomany.manytomany.repository.ISaleRepository;
import com.manytomany.manytomany.repository.IVeicelRepository;

import jakarta.transaction.Transactional;

@Component
public class SeedData implements ApplicationRunner {

    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    private IVeicelRepository veicelRepository;
    @Autowired
    private ISaleRepository saleRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setName("Pablo");

        Veicle veicle1 = new Veicle();
        veicle1.setName("Mercedes");

        Sale sale = new Sale();
        sale.setCustomer(customer1);
        sale.setVeicle(veicle1);
        sale.setNumber(3);

        ArrayList<Sale> sales = new ArrayList<>();
        sales.add(sale);

        customer1.setSales(sales);

        customerRepository.save(customer1);
        veicelRepository.save(veicle1);
        saleRepository.save(sale);

    }
}
