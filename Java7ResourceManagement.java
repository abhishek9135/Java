import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.nio.file.FileSystems;
import java.nio.charset.Charset;


public class Java7ResourceManagement {
  public static void main(String[] args) {
    try (MyResource mr = new MyResource()) {
      System.out.println("MyResource Created in try-with-resources");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Out of try-Catch Block. ");
    }
    static class MyResource implements AutoCloseable {
      @Override
      public void close() throws Exception {
        System.out.println("Closing Resources");
      }
    }
  }