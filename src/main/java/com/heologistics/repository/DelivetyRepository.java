// DelivetyRepository.java
package com.heologistics.repository;

import com.heologistics.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DelivetyRepository extends JpaRepository<Receipt, Integer> {

}
