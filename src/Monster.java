public class Monster extends Charactor{
    //    ==================フィールド===========================
//    private String name;
//    private int hp;
    //    ==================コンストラクタ===========================
    public Monster(String name,int hp){
        super(name,hp);
    }
    //nameのセッターゲッター
//    public String getName(){
//        return this.name;
//    }
//    public void setName(String name){this.name=name;}
//    //hpのセッターゲッター
//    public int getHp(){
//        return this.hp;
//    }
//    public void setHp(int hp){this.hp=hp;}

    //キャラクターから継承して
    //モンスター作って
    //ゴブリン＞＞ビッグゴブリン
    //スカル
    public void run(){
        System.out.println(this.getName()+"は走って逃げた");
    }
}
