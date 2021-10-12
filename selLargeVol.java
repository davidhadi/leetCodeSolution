class Solution {
    public int maxArea(int[] height) {
        int tempArea = 0;
        int area;
        
        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(height[i] > height[j]){
                   area = height[j] * (j-i);
                }
                else{
                   area = height[i] * (j-i);
                }
                
                if(tempArea < area){
                    tempArea = area;
                }
            }
        }
        return tempArea;
    }
}