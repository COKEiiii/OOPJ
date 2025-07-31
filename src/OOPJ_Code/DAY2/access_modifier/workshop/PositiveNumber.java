package OOPJ_Code.DAY2.access_modifier.workshop;

public class PositiveNumber {
    private int number;
    public PositiveNumber(int number) {
        if (number > 0) {
            this.number = number;
        }else  {
            System.out.println("Number must be positive");
        }
    }
    public int getN(){
        return number;
    }
    public boolean setN(int n){
        if (n >0) {
            this.number = n;
            return true;
        }else  {
            System.out.println("Number must be positive");
            return false;
        }
    }
}
