import java.util.*;

import java.lang.*;

import java.io.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class BufferedReaderInput {
  public static void main(String[] args) throws NumberFormatException, IOException {
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter your name");
    name = br.readLine();

    System.out.println("Enter your age");
    age = Integer.parseInt(br.readLine());

    System.out.println("Enter an address");
    address = br.readLine();

    System.out.println("Enter a phone number, no spaces, with format 9993335555");
    phoneNumber = br.readLine();

    System.out.println("Enter an email");
    email = br.readLine();

    System.out.println("All of the information you entered is: " + name + ", " + age + ", " + address + ", "
        + phoneNumber + ", " + email);

  }
}
