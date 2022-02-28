package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;

import org.apache.taglibs.standard.tag.common.core.CatchTag;

public class ContactDao implements ContactDAOMe{
    private JdbcTemplate jdbcTemplate;
 
    public ContactDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public void saveOrUpdate(Contact contact) {
        // implementation details goes here...
        if (contact.getcontactId() > 0) {
            // update
            String sql = "UPDATE contact SET name=?,"
                        + "ContactNumber=? WHERE contactId=?";
            jdbcTemplate.update(sql, contact.getcontactName(), contact.getContactNumber(), contact.getcontactId());
        } else {
            // insert
            String sql = "INSERT INTO contact (contactName, contactNumber)"
                        + " VALUES (?,?)";
                        jdbcTemplate.update(sql, contact.getcontactName(), contact.getContactNumber(), contact.getcontactId());
        }
    }
 
    @Override
    public void delete(int contactId) {
        // implementation details goes here...
        String sql = "DELETE FROM contact WHERE contact_id=?";
    jdbcTemplate.update(sql, contactId);
    }
 
    @Override
    public List<Contact> list() {
        // implementation details goes here...
        String sql = "SELECT * FROM contact";
    List<Contact> listContact = jdbcTemplate.query(sql, new RowMapper<Contact>() {
 
        @Override
        public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
            Contact aContact = new Contact();
 
            aContact.setcontactId(rs.getInt("contactId"));
            aContact.setcontactName(rs.getString("contactname"));
            aContact.setcontactNumber(rs.getString("contactNumber"));
 
            return aContact;
        }
 
    });
 
    return listContact;
    }
 
    @Override
    public Contact get(int contactId) {
        // implementation details goes here...
        String sql = "SELECT * FROM contact WHERE contact_id=" + contactId;
    return jdbcTemplate.query(sql, new ResultSetExtractor<Contact>() {
 
        @Override
        public Contact extractData(ResultSet rs) throws SQLException,
                DataAccessException {
            if (rs.next()) {
                Contact contact = new Contact();
                contact.setcontactId(rs.getInt("contactId"));
                contact.setcontactName(rs.getString("ContactName"));
                contact.setcontactNumber(rs.getString("contactNumber"));
                return contact;
            }
 
            return null;
        }
 
    });
    }
    
}
