package vttp2022.paf.assessment.eshop.respositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import static vttp2022.paf.assessment.eshop.respositories.Queries.*;
import vttp2022.paf.assessment.eshop.models.Customer;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// You cannot change the method's signature
	public Optional<Customer> findCustomerByName(String name) {

		// TODO: Task 3 

		final List<Customer> rsvps = new LinkedList<>();
		final SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_SELECT_CUSTOMERS_BY_NAME, name);

        while (rs.next()) {
            rsvps.add(Customer.create(rs));
        }
        // return rsvps.get(0); // need to match Optional

		 // erorr code
		 if (rsvps.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{'error_code' : " + "Cusotmer not found }");
		 }
		 
					return ResponseEntity
					            .status(HttpStatus.OK)
					            .contentType(MediaType.APPLICATION_JSON)
					            .body(rsvps.toString());
					}
				}
// ---

// Optional<String> opt = Optional.of("name");
// opt.ifPresent(name -> System.out.println(name.length()));

// ----

// return people.stream()
// .filter(p -> p.getName().equals(name))
// .filter(p -> p.getAge().get() >= age.orElse(0))
// .collect(Collectors.toList());

// W22 for controller to return error code
