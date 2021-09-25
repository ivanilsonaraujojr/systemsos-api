package br.com.sossystem.api.service;

import br.com.sossystem.api.domain.Address;
import br.com.sossystem.api.repository.AddressRepository;
import br.com.sossystem.api.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address findById(Long id){
        Optional<Address> obj = addressRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado! Id: " + id + ", Tipo: " + Address.class.getName()));
    }

}
