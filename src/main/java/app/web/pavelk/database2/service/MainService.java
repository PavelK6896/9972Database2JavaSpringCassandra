package app.web.pavelk.database2.service;

import app.web.pavelk.database2.model.Book;
import app.web.pavelk.database2.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class MainService implements CommandLineRunner {

    private Scanner scanner = new Scanner(System.in);
    private final BookRepo bookRepo;

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            TimeUnit.MILLISECONDS.sleep(500);
            String next = scanner.next();

            if (next.equals("1")) {
                System.out.println(bookRepo.findAll());
            } else if (next.equals("2")) {
                System.out.println(bookRepo.save(Book.builder().id(1).title("22222222222").build()));
            } else if (next.equals("3")) {
                System.out.println(bookRepo.save(Book.builder().id(1).title("8888888888").build()));
            } else if (next.equals("4")) {
                bookRepo.deleteById(1);
            } else if (next.equals("0")) {
                break;
            }
        }
    }
}
