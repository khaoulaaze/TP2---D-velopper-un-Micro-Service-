package ma.hafsaemsi.bankaccountservice.entities;

import ma.hafsaemsi.bankaccountservice.enums.AccountType;

import javax.swing.text.html.parser.Entity;
import java.util.Date;
@Entity
@Data

public class BankAccount {
    private String id ;
    private Date createAt ;
    private Double balance ;
    private String currency ;
    private AccountType type ;

}
