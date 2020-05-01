package br.com.brunomilitzer.trainings.spring.springdatajpa;

import br.com.brunomilitzer.trainings.spring.springdatajpa.model.Product;
import br.com.brunomilitzer.trainings.spring.springdatajpa.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith( SpringRunner.class )
@SpringBootTest(classes = br.com.brunomilitzer.trainings.spring.springdatajpa.SpringbootApplication.class)
public class SpringbootApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void saveProduct() {
        ProductRepository repository = context.getBean( ProductRepository.class );

        /*Product product = new Product();
        product.setId( 555L );
        product.setName( "Galaxy S20 5G" );
        product.setDescription( "Samsung Galaxy S20 5G" );
        product.setPrice( 1100d );

        repository.save( product );

        Optional<Product> products = repository.findById( 1l );
        Product p1 = null;

        if (products.isPresent()) {
            p1 = products.get();
        }

        System.out.println(p1);

        p1.setPrice( 11111d );

        repository.save( p1 );

        repository.findAll().forEach( System.out::println );*/

        //repository.findByName( "Galaxy S20" ).forEach( System.out::println );

        //repository.findByPrice( 1200D ).forEach( System.out::println );

        repository.findByNameAndPrice( "Galaxy S20 Ultra", 1200D ).forEach( System.out::println );
    }
}
