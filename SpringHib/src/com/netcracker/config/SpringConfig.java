package com.netcracker.config;

import com.netcracker.model.Book;
import com.netcracker.model.Customer;
import com.netcracker.model.Purchase;
import com.netcracker.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = {"classpath:app.properties"})
@ComponentScan(basePackages = "com.netcracker")
public class SpringConfig {

    @Autowired
    Environment enviroment;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(enviroment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(enviroment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(enviroment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(enviroment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    @Bean
    public Class<Customer>  customerClassBean(){
        return Customer.class;
    }
    @Bean
    public Class<Book>  bookClassBean(){
        return Book.class;
    }
    @Bean
    public  Class<Shop> shopClassBean() {return Shop.class;}
    @Bean
    public  Class<Purchase> purchaseClassBean(){return Purchase.class;}

}
