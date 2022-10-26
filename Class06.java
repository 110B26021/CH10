class Test{
    protected int height = 10;  //將height宣告成protected
    protected int width;  //將width宣告成protected
    
    public Test{  
    ...
    }
    class Test(int w){  
    ...
    }
    ...
    
    class lala extends Test{
        public lala(){
        ...
        }
        public lala(int w,int v){  
            width = w;  //在子類別裡可直接取用父類別裡的protected成員
            ...
        }
    }
}
