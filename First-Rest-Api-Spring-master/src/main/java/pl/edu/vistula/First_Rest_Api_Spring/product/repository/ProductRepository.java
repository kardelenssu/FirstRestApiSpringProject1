package pl.edu.vistula.First_Rest_Api_Spring.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.First_Rest_Api_Spring.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

