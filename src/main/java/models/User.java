package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by melnikov on 26.05.2015.
 */
@Entity
@Table(name = "users")
public class User {
    private String email;

    @Id
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
