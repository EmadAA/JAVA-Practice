// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 class multi extends Thread
{
    public void run(){
        for (int i=1; i<=5; i++)
        {
            try{
                Thread.sleep(500);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
             System.out.println(i);
        }
    }
}
class th {
    public static void main(String[] args) {
        multi T1 = new multi();
        multi T2 = new multi();
        multi T3 = new multi();
        T1.start();
        try{
                T1.join(1500);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        T2.start();
        T3.start();
    }
}