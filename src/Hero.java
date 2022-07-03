
import java.io.*;
public class Hero extends Charactor{
//    ==================フィールド===========================
    //HPは継承して、ガッツとMPはHeroクラスでオーバーライド。名前は自分で決めてもらう？！
    private String name;
    private int gattu;
    private  int mp;
    Sowrd sowrd = new Sowrd("はじまりの剣",5);


//    ==================コンストラクタ===========================
    public Hero(String name,int hp,int mp,int gattu){
        super(name,hp);
        this.mp= mp;
        this.gattu=gattu;
        System.out.println(super.getName()+"誕生");
        System.out.println("初期値　名前："+getName()+" HP："+getHp()+" MP:"+getMp()+" ガッツ："+getGattu());
        System.out.println("勇者の名前を入力してください");
        this.name = inputName();
        System.out.println("勇者の名前は"+ this.name);



    }
    //    ==================ここまでコンストラクタ===========================
    //    ==================getter setter===========================

    //mpのgetterとsetter
    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){this.mp=mp;}
    //ガッツのgetterとsetter
    public int getGattu(){
        return this.gattu;
    }
    public void setGattu(int gattu){this.gattu=gattu;}

    //    ==================getter setter===========================

    //    ==================メソッド===========================
    //名前を入力してもらいその値を返す
    public String inputName(){
            String inputName = new java.util.Scanner(System.in).nextLine();

            if(inputName == null){
                throw new IllegalArgumentException("名前がnullである。処理を中断");
            }
            if(inputName.length() <=1){
                throw new IllegalArgumentException("名前が短すぎる。処理を中断");
            }
            if(inputName.length() >= 8){
                throw new IllegalArgumentException("名前が長すぎる。処理を中断");
            }
            return inputName;
        }



   //走るをオーバーライド
    @Override
    public void run(){
        System.out.println(this.getName()+"は走って逃げた");
        System.out.println(this.getName()+"のガッツは5減った");
        this.setGattu(this.getGattu()-5);
        System.out.println("現在のガッツは"+this.getGattu());
    }

    public void attack(Monster monster){
        System.out.println("勇者は攻撃した");
        System.out.println(monster.getName()+"は"+sowrd.totalHit()+"HPが減った");
        monster.setHp(monster.getHp()-sowrd.totalHit());
        if(monster.getHp()<0){
            System.out.println(monster.getName()+"を倒した！");
        }
    }



}
