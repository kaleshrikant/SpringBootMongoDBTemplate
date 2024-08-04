package com.example.runner;

import com.example.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

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

        //*  INSERT OPERATIONS *//
            /*
            mongoTemplate.insert(List.of(
                    new Book(300,"Core Java", 300, "Kathy",1996.70),
                    new Book(301,"JSP & Servlet", 400, "Kathy",3100.10),
                    new Book(302,"Spring", 500, "Walls",2000.00),
                    new Book(303,"HTML & CSS", 1000, "Thomas",2010.00),
                    new Book(304,"Design Patterns", 530, "Devendra Singh",1500.00)
            ), "Book");


        mongoTemplate.insertAll(List.of(
                new Book(400,"Core Java", 300, "Kathy",1996.70),
                new Book(401,"JSP & Servlet", 400, "Kathy",3100.10),
                new Book(402,"Spring", 500, "Walls",2000.00),
                new Book(403,"HTML & CSS", 1000, "Thomas",2010.00),
                new Book(404,"Design Patterns", 530, "Devendra Singh",1500.00)
        ));

        System.out.println("All records inserted successfully");
        */

        //*  FIND OPERATIONS *//

        List<Book> books = mongoTemplate.findAll(Book.class);
            books.forEach(System.out::println);

        System.out.println("-------------------------------");

        List<Book> booksList = mongoTemplate.findAll(Book.class,"Book");
        booksList.forEach(System.out::println);

        System.out.println("All records fetched successfully");
    }
}
