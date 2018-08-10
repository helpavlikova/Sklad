package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Login zamestnance ( konkretni radek v tabulce Login ).
 * 
 * @author Honza
 */
@Entity
@Table(name="Login")
public class Login {
    
    /**
    * Jendoznacný identifikator loginu.
    */
    @Id
    @Column(name="USERNAME")
    private String username;
    
    /**
    * Heslo k prislusnemu loginu.
    */
    @Column(name="PW")
    private String password;
    
    public Login() {
        
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
      
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Login: '" + username + "', password: '" + password + "'";
    }
    
    
}
