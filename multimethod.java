package javaapplication1;

public class multimethod {
    public static void main(String[] args){
        String strarr[]={"City","I","about","three","from","o'clock","on","returned"};
        int  intarr[]={2,4,1,6,3};
        double start=System.nanoTime();
        String str1[]=insertionsort(strarr);
        double el1=System.nanoTime()-start;
        print(str1);
        start=System.nanoTime();
        int int1[]=insertionsort(intarr);
        double el2=System.nanoTime()-start;
        print(int1);
        start=System.nanoTime();
        String str2[]=bubblesort(strarr);
        double el3=System.nanoTime()-start;
        print(str2);
        start=System.nanoTime();
        int int2[]=bubblesort(intarr);
        double el4=System.nanoTime()-start;
        print(int2);
        start=System.nanoTime();
        int val2=binarysearch("a",str2);
        double el5=System.nanoTime()-start;
        System.out.println(val2);
        start=System.nanoTime();
        int val=binarysearch(6,int1);
        double el6=System.nanoTime()-start;
        System.out.println(val);
        double[] arc={el1,el2,el3,el4,el5,el6};
        String[] arcw={"insertionsort for string","insertionsort for int","bubblesort for string","bubblesort for int","binarysearch string","binarysearch for int"};
        double temp;
        String temp1;
        for(int i=1;i<6;i++){
            if(arc[i]<=arc[i-1]) continue;
            for(int j=i;j>0;j--){
                if(arc[j]>arc[j-1]){
                    temp=arc[j];
                    temp1=arcw[j];
                    arc[j]=arc[j-1];
                    arcw[j]=arcw[j-1];
                    arc[j-1]=temp;
                    arcw[j-1]=temp1;
                }
            }
        }
        for(int i=0;i<6;i++){
        System.out.print(arcw[i]+"--");
        System.out.println(arc[i]);
        }
    }
    public static String[] insertionsort(String arr[]){
        int n=arr.length;
        String temp;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j].compareTo(arr[j-1])>=0) continue;
                if(arr[j].compareTo(arr[j-1])<0){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }             
        }
        return arr;
    }
    public static String[] bubblesort(String arr[]){
        int n=arr.length;
        String temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] insertionsort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>=arr[j-1]) continue;
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] bubblesort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    
    public static void print(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static int binarysearch(String key ,String arr[]){
        int n=arr.length;
        int f=0,l=n-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            if(key.equals(arr[mid])) return mid;
            else if(key.compareTo(arr[mid])<0) l=mid-1;
            else f=mid+1;
        }
        return -1;
    }
    public static int binarysearch(int key,int arr[]){
        int n=arr.length;
        int f=0,l=n-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            if(key==arr[mid]) return mid;
            else if(key<arr[mid]) l=mid-1;
            else f=mid+1;
        }
        return -1;
    }

    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    
}
