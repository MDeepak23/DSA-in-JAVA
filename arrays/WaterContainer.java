class WaterContainer {
    public int water(int heights[]){
        int maxwater =0;
        int lb = 0,rb = heights.length-1;
        while(lb<rb){
            int w = rb-lb;
            int h = Math.min(heights[lb],heights[rb]);
            int area = w*h; 
            maxwater = Math.max(area,maxwater);
            if(heights[lb]<heights[rb])
              lb++;  
            else
              rb--;
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int heights[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        WaterContainer obj = new WaterContainer();
        System.out.println(obj.water(heights));
    }
}