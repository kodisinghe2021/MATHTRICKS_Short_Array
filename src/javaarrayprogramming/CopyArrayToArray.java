package javaarrayprogramming;

public class CopyArrayToArray {

    public static void main(String[] args) {
        //create First Array
        String names[] = {"amal", "kamal", "chamal", "namal", "salmal"};
        //create an Empty Array
        String copyOfNames[] = new String[names.length];
        int i=0;
        for (String r : names) {
          copyOfNames[i]=r;  
          i++;
        }
        // First Array
        for(String r: names){System.out.print(r+" ");}
        System.out.println("");
        //Copy of First Array
        for(String r: copyOfNames){System.out.print(r+" ");}
    }

}
