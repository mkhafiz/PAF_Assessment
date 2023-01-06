package vttp2022.paf.assessment.eshop.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

// DO NOT CHANGE THIS CLASS
public class Customer {

	private String name;
	private String address;
	private String email;

	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public String getAddress() { return this.address; }
	public void setAddress(String address) { this.address = address; }

	public String getEmail() { return this.email; }
	public void setEmail(String email) { this.email = email; }

	// Added

	public static Customer create(SqlRowSet rs) {
        final Customer r = new Customer();
        r.setName(rs.getString("name"));
        r.setAddress(rs.getString("address"));
        r.setEmail(rs.getString("email"));
        return r;
    }
}
