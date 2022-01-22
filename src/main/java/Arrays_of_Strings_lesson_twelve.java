public class Arrays_of_Strings_lesson_twelve {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers [0] = 10;

        String [] strings = new String[3];
        strings [0] = "hello";
        strings [1] = "goodbue";
        strings [2] = "java";


        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }


        System.out.println("Это цикл forEach");
        for(String string:strings){
            System.out.println(string);
        }


        System.out.println("Это цикл forEach для суммы");
        int[] numbers1 = {1,2,3};
            int sum = 0;
        for (int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);

        for (String q:strings) {
            System.out.println(strings);
        }
    }
}
