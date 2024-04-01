package com.example.demo.service;

import com.example.demo.Model.Account;
import com.example.demo.Model.Activity;
import com.example.demo.Model.TransferType;
import com.example.demo.Model.Type;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {


    @Override
    public Activity getActivity() {
        return Activity.builder()
                .branchNo(1234)
                .to(Account.builder()
                        .accountId(12356)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a to demo bankAcc")
                        .build())
                .from(Account.builder()
                        .accountId(12121)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a from demo bankAcc")
                        .build())
                .fees(new BigDecimal("450.00"))
                .grossAmount(new BigDecimal("540.00"))
                .netAmount(new BigDecimal("720.00"))
                .type(Type.INTERNAL_TRANSFER)
                .transferType(TransferType.PARTIAL)
                .build();
    }

    @Override
    public List<Activity> getAllActivity() {
        return List.of(Activity.builder()
                .branchNo(4321)
                .to(Account.builder()
                        .accountId(65321)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a to demo bankAcc")
                        .build())
                .from(Account.builder()
                        .accountId(212121)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a from demo bankAcc")
                        .build())
                .fees(new BigDecimal("450.00"))
                .grossAmount(new BigDecimal("540.00"))
                .netAmount(new BigDecimal("720.00"))
                .type(Type.INTERNAL_TRANSFER)
                .transferType(TransferType.PARTIAL)
                .build(), Activity.builder()
                .branchNo(1234)
                .to(Account.builder()
                        .accountId(65321)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a to demo bankAcc")
                        .build())
                .from(Account.builder()
                        .accountId(12121)
                        .accountName("Saving")
                        .ifscCode("ICICI123")
                        .accountDescription("Its a from demo bankAcc")
                        .build())
                .fees(new BigDecimal("450.00"))
                .grossAmount(new BigDecimal("540.00"))
                .netAmount(new BigDecimal("720.00"))
                .type(Type.INTERNAL_TRANSFER)
                .transferType(TransferType.PARTIAL)
                .build());
    }
}
