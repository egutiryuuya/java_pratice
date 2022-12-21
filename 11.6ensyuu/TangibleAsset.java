// implementsとemtendsの使い分け
// 継承元            継承先             使用するキーワード  継承元の数
// クラス            クラス             extends             1つ
// インターフェース  クラス             implements          1つ以上
// インターフェース  インターフェース   extends             1つ以上


public abstract class TangibleAsset extends Asset
  implements Thing{
    String color;
    double weight;
    public TangibleAsset(String name, int price,String color){
      super(name,price)
      this.color = color;
  }
    public String getColor(){return this.color};
    public void getWeight(){return this.weight};
    void setWeight(double weight){
      this.weight = weight;
    }
}