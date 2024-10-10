public class Majority{
    public int majority(int a[]){
        int freq=0,result=0;
        for(int i = 0;i < a.length;i++){
            if(freq == 0)
                result = a[i];
            if(result == a[i])
                freq++;
            else
                freq--;
        }
        return result;
    }
public static void main(String[] args) {
    int a[] = {1,2,1,2,1};
    Majority obj = new Majority();
    System.out.println(obj.majority(a));
}
}