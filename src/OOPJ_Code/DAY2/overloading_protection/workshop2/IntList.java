package OOPJ_Code.DAY2.overloading_protection.workshop2;

import java.util.ArrayList;

public class IntList {
    public ArrayList<Integer> list = new ArrayList<>();
    public IntList(int [] array) {
        this.list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            this.list.add(array[i]);
        }
    }
    public void print() {
        System.out.print("List: ");
        for (int i = 0; i < this.list.size(); i++) {
            if (i < this.list.size() - 1) {
                System.out.print(this.list.get(i) + "" + ",");
            }else  {
                System.out.println(this.list.get(i));
            }
        }
    }
    public float getMean() {
        int sum = 0;
        for (int i = 0; i < this.list.size(); i++) {
            sum += this.list.get(i);
        }
        return (float) sum / this.list.size();
    }
    public int removeFront(int n){
        int removeNum = this.list.get(n-1);
        for (int i = 0; i < n; i++) {
            this.list.remove(0);
        }
        return removeNum;
    }
    public int removeBack(int n){
        int removeNum = this.list.get(list.size()-n);
        for (int i = 0; i < n; i++) {
            this.list.remove(list.size()-1);
        }
        return removeNum;
    }
}
