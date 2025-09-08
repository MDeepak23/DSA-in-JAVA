class NonRepeatingCharacter {
    public char nonRep(String s) {
        // code here
        HashMap<Character,Integer> a = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e : a.entrySet()){
            if(e.getValue() ==1){
                return e.getKey();
                
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRep(s));
    }
}
