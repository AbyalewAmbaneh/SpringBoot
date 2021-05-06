package edu.miu.cs.cs544.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.cs.cs544.domain.Customer_1;

@Repository
@Transactional
public interface Customer_1Repository extends JpaRepository<Customer_1, Integer> {

}
