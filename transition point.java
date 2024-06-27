class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int s=0;
        int e=arr.length-1;
        int mid=0;
        if(arr[0]==1)
        return 0;
        while(s<=e){
            mid=(s+e)/2;
            if(arr[mid]==1&&arr[mid-1]==0){
                return mid;
            }
            else if(arr[mid]==0){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
