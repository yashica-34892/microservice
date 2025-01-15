package com.healthcare.billing_service.repository;

import com.healthcare.billing_service.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {}
