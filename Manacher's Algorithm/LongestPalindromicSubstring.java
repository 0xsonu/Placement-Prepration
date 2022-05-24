/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
package sonuk.algo;

import java.util.Scanner;

public class LongestPalindromicSubstring {
  public static void main(String[] args) {
    System.out.print("Enter a string to find its longest palindromic substring: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next().toLowerCase();
    sc.close();
    System.out.println(Longest_Palindrom_In_String(s));
  }

  public static String toString(char[] a) {
    return new String(a);
  }

  public static String Longest_Palindrom_In_String(String s) {
    if (s.length() <= 1)
      return s;
    int len = 0;
    int lenIndex = -1;
    char ch[] = new char[2 * s.length() + 1];
    for (int i = 0; i < s.length(); i++) {
      ch[2 * i] = s.charAt(i);
      ch[2 * i + 1] = '|';
    }

    int[] arr = new int[ch.length];
    int center = 0, radius = 0;
    int oldCenter, oldRadius;
    while (center < ch.length) {
      while (center - (radius + 1) >= 0 && center + (radius + 1) < ch.length
          && ch[center - (radius + 1)] == ch[center + (radius + 1)]) {
        radius += 1;
      }

      arr[center] = radius;

      oldCenter = center;
      oldRadius = radius;

      center += 1;
      radius = 0;

      while (center <= oldCenter + oldRadius) {
        int mirroredCenter = oldCenter - (center - oldCenter);
        int maxMirroredRadius = oldCenter + oldRadius - center;
        if (arr[mirroredCenter] < maxMirroredRadius) {
          arr[center] = arr[mirroredCenter];
          center += 1;
        } else if (arr[mirroredCenter] > maxMirroredRadius) {
          arr[center] = maxMirroredRadius;
          center += 1;
        } else {
          radius = maxMirroredRadius;
          break;
        }
      }

    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > len) {
        len = arr[i];
        lenIndex = i;
      }
    }
    char res[] = new char[len];
    int ptr = 0;
    System.out.println("len " + len);
    System.out.println("lenIndex " + lenIndex);
    for (int i = lenIndex - len; i <= lenIndex + len; i++) {
      if (ch[i] != '|') {
        res[ptr] = ch[i];
        ptr++;
      }

    }

    return toString(res);
  }
}