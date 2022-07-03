public abstract class Charactor {

    //キャラクターのフィールドは名前とHP
    private String name;
    private int hp;
    //コンストラクタ
    public Charactor(String name,int hp){
        this.name = name;
        this.hp=hp;
    }

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public int getHp(){return this.hp;}
    public void setHp(int hp){this.hp = hp;}

    //走る オーバーライド前提
    public abstract void run();


}
