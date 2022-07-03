//勇者の名前を自分で入れる式にしたい！

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者",50,30,50);
        Monster monster = new Monster("ゴブリン",20);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);

    }
}
