package br.com.sossystem.api.service;

import br.com.sossystem.api.domain.Product;
import br.com.sossystem.api.repository.ProductRepository;
import br.com.sossystem.api.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado! Id: " + id + ", Tipo: " + Product.class.getName()));
    }
}
