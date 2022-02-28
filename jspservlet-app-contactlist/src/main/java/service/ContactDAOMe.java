package service;
 
import java.util.List;
import home.coder.project.workspace.jspservlet-app-contactlist.src.main.java.model.Contact;
/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface ContactDAOMe {
     
    public void saveOrUpdate(Contact contact);
     
    public void delete(int contactId);
     
    public Contact get(int contactId);
     
    public List<Contact> list();
}
