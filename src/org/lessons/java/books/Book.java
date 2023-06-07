package org.lessons.java.books;

public class Book {
    private String title;
    private int pagesNumber;
    private String author;
    private String editor;

    // CONSTRUCTOR
    public Book(String title, int pagesNumber, String author, String editor) throws RuntimeException {
        if(title != null && !title.isBlank()) {
            this.title = title;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - title must be a valid string");
        }
        if(pagesNumber > 0) {
            this.pagesNumber = pagesNumber;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - pages must be a number greater than 0");
        }
        if(author != null && !author.isBlank()) {
            this.author = author;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - author must be a valid string");
        }
        if(editor != null && !editor.isBlank()) {
            this.editor = editor;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - editor must be a valid string");
        }
    }

    // GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && !title.isBlank()) {
            this.title = title;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - title must be a valid string");
        }
    }


    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author != null && !author.isBlank()) {
            this.author = author;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - author must be a valid string");
        }
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        if(editor != null && !editor.isBlank()) {
            this.editor = editor;
        } else {
            throw new RuntimeException("You've inserted a wrong value, please be sure that: \n - author must be a valid string");
        }
    }

    // METHODS


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}


