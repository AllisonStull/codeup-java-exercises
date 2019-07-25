public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        String myString= "string";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
//        daniel advises to always use x++ clear code is better than tricky code
//        System.out.println(++x);
        System.out.println(x);


// # 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        int y = 4;
        y += 5;

        int a = 3;
        int b = 4;
        b *= a;

        int f = 10;
        int g = 2;
        f /= g;
        g -= f;

//        #14
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max++;
//        max += 10;
        System.out.println(max);


//        getting past the bouncer dont do this
        byte little =(byte)max;
        System.out.println(little);
    }


}
