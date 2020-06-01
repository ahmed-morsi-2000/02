public class WelcomeMessage {

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

}
