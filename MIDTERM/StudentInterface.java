package MIDTERM;

class Student {
   // Attributes
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   int student_age = 20;
   String suffix = "";

   // Constructor
   public Student(String fName, String mName, String lName, String suffix, int age) {
      first_name = fName;
      middle_name = mName;
      last_name = lName;
      this.suffix = suffix;
      student_age = age;
   }

   // Getters
   public String getFirstName() {
      return first_name;
   }

   public String getMiddleName() {
      return middle_name;
   }

   public String getLastName() {
      return last_name;
   }

   public String getSuffix() {
      return suffix;
   }

   public int getAge() {
      return student_age;
   }

   // Setters
   public void setFirstName(String fName) {
      first_name = fName;
   }

   public void setMiddleName(String mName) {
      middle_name = mName;
   }

   public void setLastName(String lName) {
      last_name = lName;
   }

   public void setSuffix(String sfx) {
      suffix = sfx;
   }

   public void setAge(int age) {
      student_age = age;
   }

   // Custom Methods/Computed Properties
   public String getFullName() {
      return first_name + " " + middle_name + " " + last_name + " " + suffix;
   }
}

public class StudentInterface {

   public static void main(String[] args) {
      Student s1 = new Student("Anjo", "Mania", "World", "Jr.", 25);
      System.out.println("Student Full Name: " + s1.getFullName());
   }
}
