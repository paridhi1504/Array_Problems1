public class TrappingRainwater {
    public static int TrappedWater(int height[]) {
        //calculate left max boundary -array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary- array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i > 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        //loop
        int trappedwater = 0;
        for (int i = 0; i < height.length; i++) {
            //waterlevel = min(lrftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedwater += (waterlevel - height[i]);

        }
        return trappedwater;
    }
    public static void main(String args[]){
        int h[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water is = " +TrappedWater(h));

    }

}
