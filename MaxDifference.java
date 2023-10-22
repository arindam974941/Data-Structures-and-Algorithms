// NIVE APPROCH
/*import java.util.Scanner;
public class MaxDifference {
    int findMaxDiff(int ar[]){
        int max=ar[1]-ar[0],res;
        for (int i=0;i<ar.length-1;i++){ 
            for (int j=i+1;j<ar.length;j++){
                res=ar[j]-ar[i];
                if(res>max)
                max=res;
            }
        }
        return max;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of the array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("ent array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        MaxDifference m = new MaxDifference();
        System.out.println("the maximum difference is: "+m.findMaxDiff(ar));
    }
}*/
 
// efficient solution

import java.util.Scanner;
public class MaxDifference {
    int findMaxDiff(int ar[]){
        int max=ar[1]-ar[0],res,min=ar[0];
        for (int i=1;i<ar.length-1;i++){ 
            res=ar[i]-min;
            if (res>max)
           {
            max=res;
           }
           if (ar[i]<min){
           min = ar[i];
           }
        }
        return max;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of the array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("enter array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        MaxDifference m = new MaxDifference();
        System.out.println("the maximum difference is: "+m.findMaxDiff(ar));
    }
}