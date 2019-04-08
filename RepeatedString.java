import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    public static long getLetterCount(String word, long length) {
        long count = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == 'a')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int l = word.length();
        long freq = sc.nextLong();
        long q = 0, r = 0;
        q = freq / l;
        r = freq % l;
        long length = (r == 0) ? 0 : r;
        long aCount = q * getLetterCount(word, word.length()) + getLetterCount(word, length);
        System.out.println(aCount);
        sc.close();
    }

}