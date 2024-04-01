package com.example.demo.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    private String transactionId ;
    private Integer branchNo;
    private BigDecimal netAmount;
    private BigDecimal grossAmount;
    private BigDecimal fees;

    private Account from;

    private Account to;

    private TransferType transferType;

    private Type  type;

}
