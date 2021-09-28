package secondClasses;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> arr;

    public Box (){
        arr = new ArrayList<>();
    }

    public Box (ArrayList<T> arr){
        this.arr = arr;
    }

    public void addFruit(T fruit){
        arr.add(fruit);
    }

    public Float getWeight(){
        if (this.arr.size()!=0 ) {
            return arr.get(0).getWeight() * arr.size();
        }else {
            return 0.0f;
        }
    }

    public boolean compare(Box secBox){
        return  this.getWeight().compareTo(secBox.getWeight()) == 0;
    }

    public void move(Box SecBox){

        SecBox.arr.addAll(this.arr);
        this.arr.clear();
    }
}
