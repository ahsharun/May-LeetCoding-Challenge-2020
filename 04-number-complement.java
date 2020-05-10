class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(num > 0){
            int d = num % 2;
            arrayList.add(d);
            num /= 2;
        }
        int ar[] = new int[arrayList.size()];
        int l = 0;
        for (int a: arrayList) {
            if(a==1){
                ar[l] = 0;
            }else{
                ar[l] = 1;
            }
            l++;
        }
        int sum =0;
        for(int i=0; i< ar.length-1;i++){
            sum = (int) (sum + (ar[i] * Math.pow(2, i)));
        }
        return sum;
    }
}
