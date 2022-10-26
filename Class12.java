public class Test{
    public static void main(String args[]){
        
        CShape shape[];  //宣告CShape型態的陣列變數
        shape = new CShape[2];  //產生兩個CShape抽象類別型態的變數
        
        shape[0] = new circle(10.0);
        shape[0].Color("Blue");
        shape[0].show();
    }
}
