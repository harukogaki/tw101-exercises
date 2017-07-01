package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        for (String book : books)
        {
            //Print to printstream only if substring exists in title
            if (book.contains(partialBookTitle))
               printStream.println(book);
        }
    }
}
