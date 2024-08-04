package com.example.runner;

import com.example.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookOperations implements CommandLineRunner {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) throws Exception {

        //*  SAVE OPERATIONS *//
            /*
            mongoTemplate.save(new Book(200,"Core Java", 300, "Kathy",1996.70));
            mongoTemplate.save(new Book(201,"JSP & Servlet", 400, "Kathy",3100.10));
            mongoTemplate.save(new Book(202,"Spring", 500, "Walls",2000.00));
            mongoTemplate.save(new Book(203,"HTML & CSS", 1000, "Thomas",2010.00));
            mongoTemplate.save(new Book(204,"Design Patterns", 530, "Devendra Singh",1500.00));
            */


        System.out.println("All records inserted successfully");
    }
}
