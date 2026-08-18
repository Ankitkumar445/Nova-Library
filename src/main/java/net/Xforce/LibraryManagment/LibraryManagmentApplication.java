package net.Xforce.LibraryManagment;

import net.Xforce.LibraryManagment.Entities.Author;
import net.Xforce.LibraryManagment.Entities.Book;
import net.Xforce.LibraryManagment.Entities.Category;
import net.Xforce.LibraryManagment.Entities.Publisher;
import net.Xforce.LibraryManagment.Service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagmentApplication {


	public static void main(String[] args) {SpringApplication.run(LibraryManagmentApplication.class, args);}

}
