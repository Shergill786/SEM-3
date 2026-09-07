public class MMain{
    public static void main(String[] args) {
        try{

            int a=10;

            if(a<18){
                throw new Error("NIGGA");
            }
        System.err.println("NOT NIGGA");

        }
    catch(Error r){
        System.err.println(r.getMessage());
    } 

           }
}
