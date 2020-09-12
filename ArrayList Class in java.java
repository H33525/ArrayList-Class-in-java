import java.util.*;
class ArrayListExample 
{
    public static void main(String args[]) 
{
        /*Declaration of ArrayList */
   ArrayList<String> al = new ArrayList<String>();

   /*Elements  added to the ArrayList*/
   al.add("Apple");
   al.add("Pear");
   al.add("Banana");
   al.add("PineApple");
   al.add("Orange");

   /* Showing ArrayList elements */
   System.out.println("ArrayList contains: "+al);

   /*Add element at the given index*/
   al.add(0, "Blackberry");
   al.add(1, "Kiwi");

   /*Remove elements from array list like this*/
   al.remove("Pear");
   al.remove("Orange");

   System.out.println("Current ArrayList is: "+al);

   /*Remove element from the given index*/
   al.remove(1);

   System.out.println("Updated ArrayList is:"+al);
  }
 }