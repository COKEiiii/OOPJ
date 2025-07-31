package OOPJ_Code.DAY2.access_modifier.workshop;

public class Program {
    public static void main(String[] args) {
        PositiveNumber pn = new PositiveNumber(10);

        int[] arr ={20,-1,2};

        for (int i = 0; i < arr.length; i++) {
            if(pn.setN(arr[i])) {
                System.out.printf("Update successful. N is not %d\n", pn.getN());
        }
            else  {
                System.out.printf("Update failed. N is still %d\n", pn.getN());
            }
        }
    }
}
