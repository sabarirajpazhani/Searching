class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        int search = 25;
        int index = -1;
        boolean flag = false; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                index = i;
                flag = true;
            }
        }

        if(flag){
            System.out.println("Index :" + index);
        }
        else{
            System.out.println("Not found");
        }

    }
}