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
//        String lastThirdLetters = name41.substring ( name41.length() - 3) + name42.substring ( name42.length() - 3) ;
//        System.out.println(lastThirdLetters);

        /*
        5.Užduotis.Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a”
        (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.
         */
//
//        String title1 = "An American in Paris";
//        System.out.println(title1.replaceAll("[Aa]", "*"));
//        System.out.println(title1.replace('a', '*').replace('A', '*'));
////
////        /*
////        6.Užduotis.Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
////        Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
////        “2001: A Space Odyssey” ir “It's a Wonderful Life”.
////         */
//        String title2 = "An American in Paris";
//        String title3 = "Breakfast at Tiffany's";
//        String title4 = "2001: A Space Odyssey";
//        String title5 = "It's a Wonderful Life";
//
//        System.out.println(title2.replaceAll("[AaEeIiyYOoUu]", ""));
//        System.out.println(title3.replaceAll("[AaEeIiyYOoUu]", ""));
//        System.out.println(title4.replaceAll("[AaEeIiyYOoUu]", ""));
//        System.out.println(title5.replaceAll("[AaEeIiyYOoUu]", ""));
//
//        /*
//        7.Užduotis.Stringe, kurį generuoja toks kodas:
//        "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
//        Surasti ir atspausdinti epizodo numerį.
//         */
//        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        String starWars2 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        String starWars3 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(starWars);
//        System.out.println(starWars2);
//        System.out.println(starWars3);
//        // abcdgsgsdg.ilgis() - 2 = s;
////        int lengthFromBack = starWars.length()-14;
////        String endString = starWars.substring(lengthFromBack);
//
//        System.out.println("Episode: " +  starWars.substring(starWars.length()-14).substring(0, 1));
//
////        int hours = 12;
////        String hoursS = "0" + hours;
//        hoursS.substring(hoursS.length() -2); // 09 012
//        System.out.println(hoursS.substring(hoursS.length() -2));


        /*
        9. Parašyti kodą, kuris generuotų atsitiktinį stringą iš lotyniškų mažųjų raidžių. Stringo ilgis 3 simboliai.
        */



        /*
        10. Parašykite kodą, kuris generuotų atsitiktinį stringą su 10 atsitiktine tvarka išdėliotų žodžių,
         o žodžius generavimui imtų iš 9-me uždavinyje pateiktų dviejų stringų. Žodžiai neturi kartotis. (reikės masyvo)
         */

        System.out.println("MASYVAI");

        int[] num = {1, 4, 6, 0, 4, 8};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);


        int[][] array2d = {{1, 2, 3}, {4, 5, 6},};

        System.out.println(array2d[0][0] + "," + array2d[0][1] + "," + array2d[0][2]);
        System.out.println(array2d[1][0]);


//            Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.
        System.out.println("-----1 užduotis------");

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }
//            Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.
        System.out.println("-----2 užduotis------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//            Sukurkite masyvą su dešimties augalų pavadinimų.
        System.out.println("-----3 užduotis------");

        String[] plantNames = {"aguona", "ramune", "bijūnas", "rožė", "erškėtis", "raktažolė", "puriena", "tulpė", "pakalnutė", "rozmarinas"};
//        Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        System.out.println("-----4 užduotis------");
        for (int i = 0; i < plantNames.length; i++) {
//
            System.out.println(plantNames[i]);
        }
//           Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        System.out.println("-----5 Užduotis----------");
        for (int i = plantNames.length - 1; i >= 0; i--) {
            System.out.println(plantNames[i]);
        }

//            Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius)

        System.out.println("----6 Užduotis--------------");

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);

        }
//        Atspausdinkite kas antrą skaičių nuo 10 iki 50. (pornius) Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.
//        ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        System.out.println("----7 Užduotis--------------");

        for (int i = 10; i <= 50 ; i++) {
            if (i % 10 == 0){
                continue;
            }
            System.out.println(i);

        }
//        Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;

        System.out.println("----8 Užduotis--------------");
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                sum++;
            }
        }
        System.out.println(sum);
        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

        System.out.println("----9 Užduotis--------------");

        int shortNamesCount = 0;
        int longNamesCount = 0;

        for (int i = 0; i < plantNames.length; i++) {
            if (plantNames[i].length() < 5){
                shortNamesCount++;
            }
            if (plantNames[i].length() > 7){
                longNamesCount++;
            }
        }

        System.out.println("trumpesni simboliai- " + shortNamesCount + " ilgesni simboliai" + longNamesCount);

//      Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)

        System.out.println("----10 Užduotis-------------");

        int between = 0;

        for (int i = 0; i < plantNames.length; i++) {
            if (plantNames[i].length()> 5 && plantNames[i].length() < 10){
                between++;
            }
        }
        System.out.println(between);

//
//        String[] plantNames2 = {"aguona", "ramune", "bijūnas", "rožė", "erškėtis", "raktažolė", "puriena", "tulpė", "pakalnutė", "rozmarinas"};
//        for (int i = plantNames2.length - 1; i >= 0; i--) {
//            System.out.println(plantNames2[i]);

//        }






    }
}
