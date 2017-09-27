import java.io.*;

import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Unzip {
  public static void main(String[] args) throws Exception {
    String zipname = "classes.zip";
    ZipFile zipFile = new ZipFile(zipname);
    Enumeration enumeration = zipFile.entries();
    while (enumeration.hasMoreElements()) {
      ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
      System.out.println("Unzipping: " + zipEntry.getName());
      BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(zipEntry));
      System.out.println("buffured input created");
      if(zipEntry.isDirectory()) {
          // Assume directories are stored parents first then children.
          System.err.println("Extracting directory: " + zipEntry.getName());
          // This is not robust, just for demonstration purposes.
          (new File(zipEntry.getName())).mkdir();
          continue;
        }
      int size;
      byte[] buffer = new byte[2048];
      BufferedOutputStream bos = new BufferedOutputStream(
          new FileOutputStream(zipEntry.getName()), buffer.length);
      System.out.println("buffured output created");
      while ((size = bis.read(buffer, 0, buffer.length)) != -1) {
        bos.write(buffer, 0, size);
      }
      bos.flush();
      bos.close();
      bis.close();
    }
  }
}