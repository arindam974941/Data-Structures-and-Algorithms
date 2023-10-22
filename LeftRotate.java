// left rotation of element by 1

import java.util.Scanner;
public class LeftRotate {
    void rotateLeft(int ar[]){
        int c=0;
        for (int i=0;i<ar.length;i++){
            if(i-1<0){
                c=ar[i];
            }
            else{
            ar[i-1]=ar[i];
            }
        }
        ar[ar.length-1]=c;
        System.out.println("the left rotated new array is:");
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
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
        LeftRotate r = new LeftRotate();
       r.rotateLeft(ar);
    }
}
