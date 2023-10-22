// NIVE SOLUTION

/*import java.util.Scanner;
public class MoveZeroToEnd {
    void moveZero(int ar[]){
        int temp;
        for (int i=0;i<ar.length;i++){
            if (ar[i]==0){
                for (int j=i+1;j<ar.length;j++){
                  if (ar[j]!=0){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                  }
                }
            }
        }
        System.out.println("after moving 0 to the end of the array:");
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
          }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of the array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("ent array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        MoveZeroToEnd r = new MoveZeroToEnd();
       r.moveZero(ar);
    }
}*/
 
// EFFICIENT APPROCH

import java.util.Scanner;
public class MoveZeroToEnd {
    void moveZero(int ar[]){
        int temp,count=0;
        for (int i=0;i<ar.length;i++){
            if (ar[i]!=0){
                temp=ar[i];
                ar[i]=ar[count];
                ar[count]=temp;
                count++;
            }
        }
        System.out.println("after moving 0 to the end of the array:");
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
          }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of the array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("ent array elements:");
        for (int i=0;i<size;i++){
          ar[i]= sc.nextInt();
        }
        MoveZeroToEnd r = new MoveZeroToEnd();
       r.moveZero(ar);
    }
}
