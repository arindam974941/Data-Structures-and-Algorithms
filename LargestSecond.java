// 2 traversal solution. (time complexity:O(n), auxuliary spase complexity:O(n))
/*import java.util.Scanner;
public class LargestSecond {
    int getLarge(int ar[]){
        int max= ar[0];
        for (int i=0;i<ar.length;i++){
            if (max<ar[i]){
                max= ar[i];
            }
        }
        return max;
    }
    int secondLargest(int ar[]){
         int l=getLarge(ar);
        int sub = l-ar[0],k=-1;
        for (int i=0;i<ar.length && ar[i]!=l;i++){
            if (sub>l-ar[i]){
                sub = l-ar[i];
                k=i;
                
            }
        }
        return k;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of the array");
        int size = s.nextInt();
        int ar[] = new int[size];
        System.out.print("enter array elements");
        for (int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();
        }
        LargestSecond l = new LargestSecond();
        // int t= l.getLarge(ar);
        System.out.print(ar[l.secondLargest(ar)]);
    }
}*/

//  EFFICIENT APPROCH:IN ONE TRAVERSAL (time complexity:O(n), auxuliary spase complexity:O(1))

import java.util.Scanner;
public class LargestSecond {
    int secondLargest(int ar[]){
         int largest=0,res=-1;
        for (int i=1;i<ar.length;i++){
            if (ar[i]>ar[largest]){
                res=largest;
                largest = i;
            }
            else if (ar[i]<ar[largest]){
                if(res==-1 || ar[res]<ar[i])
                res=i;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of the array");
        int size = s.nextInt();
        int ar[] = new int[size];
        System.out.print("enter array elements");
        for (int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();
        }
        LargestSecond l = new LargestSecond();
        System.out.print(l.secondLargest(ar));
    }
}