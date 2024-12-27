class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int result = 0;
        int a = values[0];
        for(int i = 1;i<values.length;i++){
            if((values[i]-i+a)>result){
                result = values[i]-i+a;
            }
            if((values[i]+i)>a){
                a= values[i]+i;
            }
        }
        return result;
    }
}
