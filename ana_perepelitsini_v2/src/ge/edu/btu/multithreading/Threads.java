package ge.edu.btu.multithreading;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

class Threads implements Runnable {
    private Thread thread;
    private String threadName;

    Threads(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            while(true){
                try (Stream<Path> files = Files.list(Paths.get("/home/ana/Desktop/BTU_DOCUMENT"))) {
                    long count = files.count();
                    System.out.println("Thread: " + count);
                }
                Thread.sleep(1800);
            }
        } catch (InterruptedException | IOException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        while (true){
        File dir = new File("/home/ana/Desktop/BTU_DOCUMENT");
        String[] files = dir.list();
        System.out.println("input word: ");
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        for(int i=0;i<files.length;i++){
            if(files[i].contains(word))System.out.println(files[i]);
        }
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start ();
        }
        }
    }
}