public class J46 {
    public static void main(String[] args) {
        int i=0;
        
        for(i=0;i<args.length;i++){
            if(args[i].charAt(0)<65 || args[i].charAt(0)> 91 ){
                System.out.print("Error Occured     :"+args[i]);        // sahil parmar nileshbhai
                                                                        // args0 args1  args3      
                return;
            }
            else {
                System.out.println(args[i]);
            }
        }
    }
}
