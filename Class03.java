class Test{
    private int height = 10;
    private int width;
    
    public Test{  //父類別裡沒有引數的建構元
    ...
    }
    class Test(int w){  //父類別裡有一個引數的建構元
    ...
    }
    ...
    
    class lala extends Test{
        public lala(){
        ...
        }
        public lala(int w,int v){  //子類別裡有兩個引數的建構元
            super(w);  //呼叫父類別哩，有引數的建構元
            ...
        }
    }
}
