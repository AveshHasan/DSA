package HashMap;
import java.util.HashMap;
public class BasicHash {
    public static void main(String[] args) {
        //HashMap stores key value pair
        //In this String is mapped with integer

        HashMap<String,Integer> empId = new HashMap<>();

        //Giving input in hashMap as key and its value
        empId.put("Avesh",61);
        empId.put("Hasan",239);
        empId.put("Avean",0241);

        //HashMap don't store value in order
        System.out.println(empId);

        //Find wether key is present in the HashMap or not
        System.out.println(empId.containsKey("Avesh"));

        //Find wether a value present in the HashMap or not
        System.out.println(empId.containsValue(239));

        //This will replace the existing value in the HashMap
        //if data is not present it will automatically add it
        empId.put("Alien",123);
        System.out.println("After Updating HashMap :"+empId);
        
        //This will not replace or put if data is not present while put does
        empId.replace("Avesh",145);
        System.out.println("After replacing :"+empId);

        //This wiil remove hashMap key value pair
        empId.remove("Alien");
        System.out.println("Removed key value :"+empId);

        empId.putIfAbsent("Iron Man",420);
        System.out.println("This will put if only not present "+empId);
        System.out.println(empId.get("Avesh"));

    }
}
