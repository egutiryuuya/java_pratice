// クラス定義（継承）
public class Computer extends TangibleAsset{
 String makerName;
  // コンストラクタ
  public book(String name,int price, String color,String makerName){
    super(name,price,color);
    this.makerName = makerName;
  }
  
  public String getMakerName(){return this.makerName};
}