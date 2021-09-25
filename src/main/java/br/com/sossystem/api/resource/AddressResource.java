package br.com.sossystem.api.resource;

import br.com.sossystem.api.domain.Address;
import br.com.sossystem.api.domain.Product;
import br.com.sossystem.api.service.AddressService;
import br.com.sossystem.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id){
        Address address = addressService.findById(id);
        return ResponseEntity.ok().body(address);
    }

}
