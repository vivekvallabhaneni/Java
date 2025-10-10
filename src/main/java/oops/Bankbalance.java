package oops;

public class Bankbalance {
    private  double balance;

    public Bankbalance(double intialbalance) {
        if(intialbalance>=0){
            balance=intialbalance;
        }
        else{
            System.out.println("Invalid intial balance. Setting to 0.");
            balance=0;
        }
    }
    
}
