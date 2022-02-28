package model;

import javax.swing.ImageIcon;

public class Contact {
    private int contactId;
    private String contactName;
    private int contactNumber;
    private ImageIcon contactImage;
    protected Contact(int contactId,String contactname,int contactNumber,ImageIcon contactImage) {
        this.contactId = contactId;
        this.contactName = contactname;
        this.contactNumber = contactNumber;
        this.contactImage = contactImage;

    }
    public int getId(){
        return contactId;
    }
    public void setId(Integer contactId){
        this.contactId=contactId;
    }

    public String getName(){
        return contactName;
    }
    public void setName(String contactName){
        this.contactName=contactName;
    }

    public int getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(Integer contactNumber){
        this.contactNumber=contactNumber;
    }

    public ImageIcon getcontactImage(){
        return contactImage;
    }
    public void setcontactImage(ImageIcon contactImage){
        this.contactImage=contactImage;
    }




    
}
