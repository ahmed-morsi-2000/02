public class WelcomeMessage extends First01{

    public static void main(String[] args) {
        System.out.println("hallo in the world of java !!");
        addValue(5);





    }

    public static void addValue(int number){
        int x =0;
        if (number ==0){
            System.out.println("Done my friend !!");

        }else {
            System.out.println("You such a good one !!");
            number--;
            addValue(number);


        }
    }

    void messageWelcome(String name){

        System.out.println("Hallo in our new class" + name);

    };


}
