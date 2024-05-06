public class R1FizzBuzz {
    public static void main(String[] args){
        for(int i=0; i<=100;i++){
            int mult3= i % 3;
            int mult5= i % 5;
            if(mult3==0 && mult5==0){
                System.out.println("FizzBuzz "+i);
            } else if (mult3==0) {
                System.out.println("Fizz "+i);
            }else if (mult5==0){
                System.out.println("Buzz "+i);
            }else {
                System.out.println("none: "+ i);
            }
        }
    }

}
