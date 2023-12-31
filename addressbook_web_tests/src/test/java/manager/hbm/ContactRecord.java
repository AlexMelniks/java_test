package manager.hbm;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "addressbook")

public class ContactRecord {

    @Id
    @Column(name = "id")
    public int id;

    @Column(name = "firstname")
    public String firstName;

    @Column(name = "lastname")
    public String lastName;
    @Column(name = "photo")
    public String photo;


    public String home;
    public String mobile;
    public String work;
    public String phone2;
    public String email;
    public String email2;
    public String email3;
    public String address;
    public String address2;
    public String nickname = "";
    public String company = "";
    public String title = "";
    public Date deprecated = null;

    public String fax = "";
    public String im = "";
    public String im2 = "";
    public String im3 = "";
    public String homepage = "";
    public int bday = 0;
    public String bmonth = "";
    public String byear = "";
    public int aday = 0;
    public String amonth = "";
    public String ayear = "";
    public String notes = "";
    public String middlename = "";

    public ContactRecord() {
    }

    public ContactRecord(int id, String lastName, String firstName, String photo, String address, String address2, String email, String email2, String email3, String home, String mobile, String work, String phone2 ) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.photo = photo;
        this.address = address;
        this.address2 = address2;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.phone2 = phone2;
    }
}