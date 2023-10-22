// removal of duplicate element in an sorted array

/*import java.util.Scanner;
public class RemoveDuplicate {
    int duplicateRemuval(int ar[]){
         int c=1,i=1,d=0;
         while(i<ar.length){
            if (ar[i]!=ar[d]){
                d=i;
                i++;
                c++;
            }
            else if (ar[i]==ar[d])
            i++;
         }
         return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("ent array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        RemoveDuplicate r = new RemoveDuplicate();
        System.out.print(r.duplicateRemuval(ar));
    }
}*/
//  ANOTHER SOLUTION
import java.util.Scanner;
public class RemoveDuplicate {
    int duplicateRemuval(int ar[]){
         int res=1;
         for(int i=1;i<ar.length;i++){
            if (ar[i]!=ar[res-1]){
                ar[res]=ar[i];
                res++;
            }
         }
         return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("ent array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        RemoveDuplicate r = new RemoveDuplicate();
        System.out.print(r.duplicateRemuval(ar));
    }
}

