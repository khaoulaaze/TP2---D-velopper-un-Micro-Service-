package ma.hafsaemsi.tp2bankaccountservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.hafsaemsi.tp2bankaccountservice.enums.AccountType;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BankAccountResponseDTO {

    private String id ;
    private Date createAt ;
    private Double balance ;
    private String currency ;
    private AccountType type ;
}
