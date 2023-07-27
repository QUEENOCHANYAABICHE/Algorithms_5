package org.app;

//A FUNCTION THAT MASKS ALL DIGITS OF A STRING ASIDES THE LAST 4 DIGITS
import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String number = scanner.next();
        if(number == null) {
            System.out.println("NULL");
        }else {
//if it was only strings w/o dashes id use replaceAll(".(?=.{4}", "#")
            System.out.println(number.replaceAll("[^-](?=.{4})", "#"));
        }
    }
}
