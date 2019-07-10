package javaapplication1;

public class mergesort {
    public static void main(String[] args){
        int[] arr={1,3,2,4,9,5,6,7};
        mergesort(0,arr.length-1,arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
    public static void merge(int f,int mid,int l,int[]arr){
        int n1=mid-f+1;
        int n2=l-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
            arr1[i]=arr[f+i];
        for(int i=0;i<n2;i++)
            arr2[i]=arr[mid+1+i];
        int i=0,j=0;
        while (i < n1 && j < n2) 
            arr[f++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++]; 
        while (i < n1)  
            arr[f++] = arr1[i++];
        while (j < n2)    
            arr[f++] = arr2[j++];
    }
    public static void mergesort(int f,int l,int[] arr){
        if(f<l){
            int mid=f+(l-f)/2;
            mergesort(f,mid,arr);
            mergesort(mid+1,l,arr);
            merge(f,mid,l,arr);
        }  
    }
}
