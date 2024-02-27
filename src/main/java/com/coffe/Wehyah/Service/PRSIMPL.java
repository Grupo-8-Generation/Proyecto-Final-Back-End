package com.coffe.Wehyah.Service;
import com.coffe.Wehyah.Model.Product;
import com.coffe.Wehyah.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PRSIMPL implements ProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> consultarProducto() {
        return (List<Product>) this.productRepo.findAll();
    }

    @Override
    public Product crearProducto(Product product) {
        return this.productRepo.save(product);
    }

    @Override
    public Product actualizarProducto(Product product) {
        return this.productRepo.save(product);
    }

    @Override
    public Product buscarProducto(int id) {
        return this.productRepo.findById(id).get();
    }

    @Override
    public void eliminarProducto(int id) {
        this.productRepo.deleteById(id);
    }
}