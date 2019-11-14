package com.journaldev.sparkdemo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No files provided.");
            System.exit(0);
        }
        WordCounter.wordCount(args[0]);
    }
}
