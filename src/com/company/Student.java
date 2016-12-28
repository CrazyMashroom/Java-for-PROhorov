package com.company;

public class Student {
  private String name;
  private String lname;
  private int age;
  private boolean gender;//true - male, false - female

  public Student() {
    name = "";
    lname = "";
    age = 0;
    gender = false;
  }

  public Student(String stName, String stLname, int stAge, boolean stGender) {
    name = stName;
    lname = stLname;
    age = stAge;
    gender = stGender;
  }

  public void setName(String stName) {
    name = stName;
  }

  public String getName() {
    return name;
  }

  public void setLname(String stLname) {
    lname = stLname;
  }

  public String getLname() {
    return lname;
  }

  public void setAge(int stAge) {
    age = stAge;
  }

  public int getAge() {
    return age;
  }

  public void setGender(boolean stGen) {
    gender = stGen;
  }

  public boolean getGen() {
    return gender;
  }

  public void setArmy(boolean stArm) {
    gender = stArm;
  }

  public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Last name: " + lname);
    System.out.println("Age: " + age);
    if (gender)
      System.out.println("Gender: male");
    else
      System.out.println("Gender: female");
      System.out.println("");
  }
}
