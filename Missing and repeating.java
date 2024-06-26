class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        HashSet<Integer> a=new HashSet<Integer>();
        int t[]=new int[2];
        for(int i=0;i<n;i++){
            if(a.contains(arr[i]))
            t[0]=arr[i];
            //else
            a.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(!a.contains(i)){
               t[1]=i;
               break; 
            }
        }
        return t;
    }
}
