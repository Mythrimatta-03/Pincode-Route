package org.jsp.PincodeRepository;

import org.jsp.Entity.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PincodeRepository extends JpaRepository<Pincode, Long> {
	
}
