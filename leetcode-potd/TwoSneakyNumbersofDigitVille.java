class TwoSneakyNumbersofDigitVille {
    public int[] getSneakyNumbers(int[] nums) {
       HashMap<Integer,Integer> a = new HashMap<>();
       int arr[] = new int[2];
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
            
        }
    int c=0;    for(Map.Entry<Integer,Integer> entry:a.entrySet()){
            if(entry.getValue()>1){
                arr[c++]= entry.getKey();
                    
            }
        }
        return arr;
        
    }
}
