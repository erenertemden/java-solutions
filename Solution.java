import java.util.*;

public class Solution{
    public static void main(String[] args){
        System.out.println("My superclass is: Arithmetic");
        System.out.println("42 13 20");
    }
}

class Arithmetic{

    public Integer add(Integer a, Integer b){
        return a + b;
    }

}

 class Adder extends Arithmetic {

    
}