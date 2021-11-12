package javaarrayprogramming;

public class CopyArrayToArray {

    public static void main(String[] args) {
//First array
        String names[] = {"amal", "kamal", "namal", "salmal", "galmal"};
//Empty Array
        String copyOFNames[] = new String[names.length];
        
        //copy values 
        int i=0;
        for(String r:names){
            copyOFNames[i]=r;
            i++;
        }
        //print First Array
        for(String r : names){
            System.out.print(r+" ");
        }
        System.out.println("");
        //Print copy of array
             for(String r : copyOFNames){
            System.out.print(r+" ");
        }   
    }

}
