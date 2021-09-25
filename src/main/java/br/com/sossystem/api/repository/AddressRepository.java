package br.com.sossystem.api.repository;

import br.com.sossystem.api.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
