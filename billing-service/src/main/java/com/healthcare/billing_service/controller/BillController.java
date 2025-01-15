package com.healthcare.billing_service.controller;

import com.healthcare.billing_service.model.Bill;
import com.healthcare.billing_service.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {
    @Autowired
    private BillRepository repository;

    @GetMapping
    public List<Bill> getAllBills() {
        return repository.findAll();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return repository.save(bill);
    }

    @PutMapping("/{id}")
    public Bill updateBillStatus(@PathVariable Long id, @RequestParam String status) {
        Bill bill = repository.findById(id).orElseThrow(() -> new RuntimeException("Bill not found"));
        bill.setStatus(status);
        return repository.save(bill);
    }
}
