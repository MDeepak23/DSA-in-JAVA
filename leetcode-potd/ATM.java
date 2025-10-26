//2241. Design an ATM Machine
/*
There is an ATM machine that stores banknotes of 5 denominations: 20, 50, 100, 200, and 500 dollars. 
Initially the ATM is empty. The user can use the machine to deposit or withdraw any amount of money.

When withdrawing, the machine prioritizes using banknotes of larger values.

For example, if you want to withdraw $300 and there are 2 $50 banknotes, 1 $100 banknote, and 1 $200 banknote, 
then the machine will use the $100 and $200 banknotes.
However, if you try to withdraw $600 and there are 3 $200 banknotes and 1 $500 banknote, 
then the withdraw request will be rejected because the machine will first try to use the $500 banknote and 
then be unable to use banknotes to complete the remaining $100. 
Note that the machine is not allowed to use the $200 banknotes instead of the $500 banknote.
 */
import java.util.Arrays;

class ATM {
     int[] deno = {20,50,100,200,500};
     int []count;
    public ATM() {
        count = new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            count[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int []used = new int[5];
        int remaining = amount;
        for(int i=4;i>=0;i--){
            used[i] = Math.min(count[i],remaining/deno[i]);
            remaining-=used[i]*deno[i];
            

        }
        if(remaining!=0){
            return new int[]{-1};
        }
        for(int i=0;i<5;i++){
            count[i]-=used[i];
        }
        return used;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.deposit(new int[]{0, 0, 1, 2, 1});
        System.out.println(Arrays.toString(atm.withdraw(600))); // [0,0,1,0,1]

        atm.deposit(new int[]{0, 1, 0, 1, 1});
        System.out.println(Arrays.toString(atm.withdraw(600)));
        System.out.println(Arrays.toString(atm.withdraw(550)));
    }
}
