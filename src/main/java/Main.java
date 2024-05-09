import java.io.File;
import java.util.Scanner;

import engine.AppInterface;
import engine.IndexStore;
import engine.ProcessingEngine;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to File Retrieval System!");
        
        System.out.println("Enter no of threads: ");
        int numThreads = sc.nextInt();

        ProcessingEngine processingEngine = new ProcessingEngine(new IndexStore(), numThreads );
        AppInterface appInterface = new AppInterface(processingEngine);
        appInterface.start();
    }

}
