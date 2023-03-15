public class Main {
    public static void main(String[] args) {



        /*
        1.Užduotis. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus
        (Jonas Jonaitis). Atspausdinti trumpesnį stringą.
         */

//        String name11 = "Johnny";
//        String name12 = "Depp";
//        if (name11.length() < name12.length()){
//            System.out.println(name11);
//        }
//        if(name12.length() < name11.length()){
//            System.out.println(name12);
//        }
//        else {
//            System.out.println(name11 + " " + name12);
//        }
//
//        /*
//        2.Užduotis.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//        Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
//         */
//
//        String name21 = "Johnny";
//        String name22 = "Depp";
//        System.out.println(name21.toUpperCase());
//        System.out.println(name22.toLowerCase());

        /*
        3.Užduotis.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
        Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
        Jį atspausdinti.
         */
//
//        String name31 = "Johnny";
//        String name32 = "Depp";
//        String firstLetter = name31.substring(0,1) + name32.substring(0,1);
//        System.out.println(firstLetter);

        /*
        4.Užduotis. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
        Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės
        kintamųjų raidžių. Jį atspausdinti.
         */

//        String name41 = "Johnny";
//        String name42 = "Depp";
//        String lastThirdLetter = name41.substring ( name41.length() - 3) + name42.substring ( name42.length() - 3) ;
//        System.out.println(lastThirdLetter);

        /*
        5.Užduotis.Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a”
        (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.
         */

        String title1 = "An American in Paris";
        System.out.println(title1.replaceAll("[Aa]", "*"));
        System.out.println(title1.replace('a', '*').replace('A', '*'));
//
//        /*
//        6.Užduotis.Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
//        Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
//        “2001: A Space Odyssey” ir “It's a Wonderful Life”.
//         */
        String title2 = "An American in Paris";
        String title3 = "Breakfast at Tiffany's";
        String title4 = "2001: A Space Odyssey";
        String title5 = "It's a Wonderful Life";

        System.out.println(title2.replaceAll("[AaEeIiOoUu]", ""));
        System.out.println(title3.replaceAll("[AaEeIiOoUu]", ""));
        System.out.println(title4.replaceAll("[AaEeIiOoUu]", ""));
        System.out.println(title5.replaceAll("[AaEeIiOoUu]", ""));

        /*
        7.Užduotis.Stringe, kurį generuoja toks kodas:
        "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
        Surasti ir atspausdinti epizodo numerį.
         */
        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        String starWars2 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        String starWars3 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(starWars);
        System.out.println(starWars2);
        System.out.println(starWars3);
        // abcdgsgsdg.ilgis() - 2 = s;
//        int lengthFromBack = starWars.length()-14;
//        String endString = starWars.substring(lengthFromBack);

        System.out.println("Episode: " +  starWars.substring(starWars.length()-14).substring(0, 1));

//        int hours = 12;
//        String hoursS = "0" + hours;
//        hoursS.substring(hoursS.length() -2); // 09 012
//        System.out.println(hoursS.substring(hoursS.length() -2));


        /*
        9. Parašyti kodą, kuris generuotų atsitiktinį stringą iš lotyniškų mažųjų raidžių. Stringo ilgis 3 simboliai.
        */



        /*
        10. Parašykite kodą, kuris generuotų atsitiktinį stringą su 10 atsitiktine tvarka išdėliotų žodžių,
         o žodžius generavimui imtų iš 9-me uždavinyje pateiktų dviejų stringų. Žodžiai neturi kartotis. (reikės masyvo)
         */


    }
}