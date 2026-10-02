package String;
 public class BasicStringComp{
    public static void main(String[] args) {
        //here both a and b pointing to same object stored in a pool of string type in Heap memory
        //but problem arises when one of variable changes it will also change the other too but as String is immutable so it cannot be changed another object is created instead
        //then how can i create a two different variable pointing to same variable by using "new" function
        String a = "Avesh";
        String b = "Avesh";
        //this will print true
        System.out.println(a==b);

        //here creating new object like this saves String each variable in heap instead of saving in pool of string
        String a1 = new String("Avesh");
        String b1 = new String("Avesh");
        //while this print false despite having excatly same variable name
        System.out.println(a1==b1);

    }

 }