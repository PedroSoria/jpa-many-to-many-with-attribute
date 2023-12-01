package com.manytomany.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);

		// @Autowired
		// public ICustomerRepository customerRepository;
		// @Autowired
		// public IVeicelRepository veicelRepository;

		// Customer customer1 = new Customer();
		// customer1.setName("cliente1");

		// Veicle veicle1 = new Veicle();
		// veicle1.setName("Auto1");

	}

}
