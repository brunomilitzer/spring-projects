package br.com.brunomilitzer.trainings.spring.springorm.test;

import br.com.brunomilitzer.trainings.spring.springorm.dao.ProductDAO;
import br.com.brunomilitzer.trainings.spring.springorm.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        ProductDAO productDAO = ( ProductDAO ) ctx.getBean( "productDAO" );

        Product product = new Product();
        product.setId( 1 );
        product.setName( "Galaxy S20" );
        product.setDescription( "Samsung Galaxy S20" );
        product.setPrice( 1000.00 );

        Product product2 = new Product();
        product2.setId( 2 );
        product2.setName( "Galaxy S20+" );
        product2.setDescription( "Samsung Galaxy S20+" );
        product2.setPrice( 1100.00 );

        Product product3 = new Product();
        product3.setId( 3 );
        product3.setName( "Galaxy S20 Ultra" );
        product3.setDescription( "Samsung Galaxy S20 Ultra" );
        product3.setPrice( 1200.00 );

        /*int result = productDAO.create( product );
        int result2 = productDAO.create( product2 );
        int result3 = productDAO.create( product3 );*/
        //productDAO.update( product );
        //productDAO.delete( product );

        //Product p1 = productDAO.findById( product.getId() );

        //System.out.println(p1);

        List<Product> products = productDAO.findAll();

        System.out.println(products);
    }
}
