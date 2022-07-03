import java.util.*;
public class Sowrd {
    public String name;
    public int value;

    public Sowrd(String name,int value){
        this.name=name;
        this.value = value;
    }
    //剣の火力のランダム補正
    public int totalHit(){
        int r = new Random().nextInt(3);
        return this.value + r;

    }
}
