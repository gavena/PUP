public class Hello {  // class declaraion
  public static void main(String[] args) {   // Method signature of the first object to be executed
    System.out.println("Hello World"); 
int n=10;
int i=0,t1=0,t2=1;
    for (i = 1; i <= n; ++i)
       { System.out.print(t1 + " + ");
         int sum = t1 + t2;
         //System.out.println("sum=" + sum + "t1=" + t1+ "t2=" + t2);
         t1 = t2;
         t2 = sum;}


  }
}


//Read me
/*
Save the code in a file named Hello.java
Compile the code by running javac Hello.java  -> this will create 1 class in your working dir
Run the program by running java Hello

for more learning  https://www.w3schools.com/java/

https://www.edureka.co/blog/cheatsheets/java-cheat-sheet/

*/