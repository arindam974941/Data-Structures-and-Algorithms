
/*Q. check the array is sorted or not.
 If the array is sorted then return true otherwise return false */

import java.util.*;
public class CheckSorted {
   
    boolean sortedChecking(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            if (ar[i+1]<ar[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size");
        int size = s.nextInt();
        int ar[]=new int[size];
        System.out.println("enter array element");
        for (int i=0;i<size;i++){
            ar[i]=s.nextInt();
        }
        CheckSorted c = new CheckSorted();
       System.out.print(c.sortedChecking(ar)) ;
    }
}
