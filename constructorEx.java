class text{
    
    text(int i){
        this();
         System.out.println("int-arg constructor");
        }
        text(){
          System.out.println("no-arg constructor");
        }
    public static void main(String[] A){
        text a=new text(10);
    }
}