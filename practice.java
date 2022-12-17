public class Sample {
	public static void main(String[] args){
	    int[] points = new int[4];
	    double[] weights = new double[5];
	    boolean[] answers = new boolean[3];
	    String[] names = new String[3];
	    
	    int[] moneyList = {121902,8302,55100};
	    for(int i=0; i<moneyList.length;i++){
	        System.out.println(moneyList[i]);
	    }
	    
	    for(int money : moneyList){
	        System.out.println(money);
	    }
	   // 練習４－３の５行目はNULLが入っているので参照ができない
	   //６行目は添え字を２と指定しているが配列の要素は２つしかないので添え字は０か１しか指定できない
	   
	   int[] numbers = {3,4,9};
	   System.out.println("1桁の数字を入力してください");
	   int input =new java.util.Scanner(System.in).nextInt();
	   for(int result : numbers){
	      if(result == input){
	          System.out.println("アタリ");
	      }
	   }
	}