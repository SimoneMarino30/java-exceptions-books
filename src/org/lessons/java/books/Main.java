package org.lessons.java.books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {

        // Chiedo all' utente quanti libri vuole aggiungere all' array
        Scanner scan = new Scanner(System.in);
        System.out.print("How many books do you want to add? ");
        int nBooks = Integer.parseInt(scan.nextLine());

        Book[] book = new Book[nBooks];

        // Aggiungo i libri all' array
        for (int i = 0; i < nBooks; i++) {

            Book b = null;
            boolean validInput = false;

            do {
                // Provo a costruire il libro validato
                try{
                    // Chiedo gli attributi del libro
                    System.out.println("Title: ");
                    String title = scan.nextLine();

                    //Gestisco l'eccezione sul numero di pagine
                    boolean isInteger = false;
                    int pagesNumber = 0;

                    do {
                        System.out.println("How many pages: ");
                        try {
                            pagesNumber = Integer.parseInt(scan.nextLine());
                            isInteger = true;
                        } catch(NumberFormatException e) {
                            System.out.println("You must insert a number of pages greater than 0");
                        }
                    }while(!isInteger);

                    System.out.println("Author: ");
                    String author = scan.nextLine();

                    System.out.println("Editor: ");
                    String editor = scan.nextLine();

                    b = new Book(title, pagesNumber, author, editor);
                    // L' input è valido, continua...
                    validInput = true;
                // Lancio un errore nel caso di input non validi
                } catch(RuntimeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } while (!validInput);
            // Aggiungo il libro all' array
            book[i] = b;
        }

        // Stampo l' array
            System.out.println(Arrays.toString(book));
        scan.close();
    }
}
