package edu.miu.cs.cs544;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.cs.cs544.domain.Customer_1;
import edu.miu.cs.cs544.repository.Customer_1Repository;

@Component
public class StartupRunner implements CommandLineRunner {

	@Autowired

	private Customer_1Repository repository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Date d1 = parseDate("2019,9,23");
		Date d2 = parseDate("2020,9,23");
		Date d3 = parseDate("2022,9,23");

		Customer_1 cntry_1 = new Customer_1("Abyalew", "Hunegnaw", "ab@gmail.com", d1);
		Customer_1 cntry_2 = new Customer_1("Kany", "ronald", "kr@gmail.com", d2);
		 Customer_1 cntry_3 = new Customer_1("Ronald", "KOman", "RK@gmail.com", d3);

		repository.save(cntry_1);
		repository.save(cntry_2);
		repository.save(cntry_3);
	}

	public static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
