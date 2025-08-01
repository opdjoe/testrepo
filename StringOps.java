// public class StringOps {
//     public static void main(String[] args) {
//         //Creates a String literal
//         String s1 = "Hello World";
//         System.out.println(s1);

//         //Creates a String Object
//         String s2 = new String("Hello World");
//         System.out.println(s2);

//         String s3 = "Hello World";

//         System.out.println("s1 and s2 comparison "+ (s1==s2));
        
//         System.out.println("s2 and s3 comparison "+ (s2==s3));

//         System.out.println("s1 and s2 comparison "+ (s1==s3));

//     }
// }

// public class StringOps {
//     public static void main(String[] args) {
//         String s1 = "The quick brown fox jumped over the lazy dog";

//         System.out.println(s1.length());

//         char[] strAsArr = s1.toCharArray();
//         System.out.println(strAsArr.length);

//         System.out.println(strAsArr);

//         System.out.println("The first char of the string is "+ strAsArr[0]);
//         System.out.println("The last char of the string is "+ strAsArr[strAsArr.length-1]);

//         System.out.println("The index of T is "+ s1.indexOf('T'));
//         System.out.println("The index of g is "+ s1.indexOf('g'));

//         //This will return -1 because there is no 's' char in the string
//         System.out.println("The index of s is "+ s1.indexOf('s'));

//     }
// }


// STRING COMPARISON
// public class StringOps {
//     public static void main(String s[]) {
//         String s1 = "Washington";
//         String s2 = new String("Washington");
//         String s3 = "WASHINGTON";

//         System.out.println("Equality check s1 and s2 - "+s1.equals(s2));
//         System.out.println("Equality check s1 and s3 - "+s1.equals(s3));
//         System.out.println("Equality check s1 and s3 ignoring case - "+s1.equalsIgnoreCase(s3));

//         System.out.println("s1 in lowercase - "+s1.toLowerCase());
//         System.out.println("s3 in lowercase - "+s3.toLowerCase());

//         System.out.println("s1 and s3 lowercase equality check - " +
//                             s1.toLowerCase().equals((s3.toLowerCase())));

//         System.out.println("s1 in uppercase - "+s1.toUpperCase());
//         System.out.println("s3 in uppercase - "+s3.toUpperCase());

//         String s4 = "50F1A";
//         System.out.println("s4 in lowercase - "+s4.toLowerCase());

//         String regexStr = "^W.*";
//         System.out.println("s1 matches regex ^W.* - "+s1.matches(regexStr));
//         System.out.println("s3 matches regex ^W.* - "+s3.matches(regexStr));

//         String s5 = "     WASHINGTON          ";
//         System.out.println("Equality check s3 and s5 - "+s3.equals(s5));
//         s5 = s5.strip();
//         System.out.println("Equality check after stripping s3 and s5 - "+s3.equals(s5));
//     }

// }

//CONCATENATION and SUBSTRINGING
public class StringOps {
    public static void main(String[] args) {
        String s1 = "Washington";
        String s2 = " DC";
        s1 = s1.concat(s2);
        System.out.println("s1 " + s1);
        s1 = s1.substring(0,10);//starting from index 0 to length of string
        System.out.println("s1 " + s1);

        System.out.println("s1.substring(7,10) " + s1.substring(7,8));//second argument is the count
        System.out.println("s1.substring(7) " + s1.substring(7));//starting from index 7 to end(length of spring)

        //PRACTICE
        System.out.println("-------------------------------");

        String mapel1 = "Mapel Tree";
        String mapel2 = "Mapel Tree";

        System.out.println("mapel1 == mapel2? " + (mapel1==mapel2));

        String mapel_obj = new String("Mapel Tree");
        System.out.println("Equality check of literal mapel1 and mapel_obj with '==' " + (mapel1==mapel_obj));
        System.out.println("Equality check of literal mapel1 and mapel_obj with '.equals' " + (mapel1.equals(mapel_obj)));

        String mapel_alone = mapel1.substring(0,6);
        String tree_alone = mapel1.substring(6);
        System.out.println("Separating Mapel fro Tree with substring " + mapel_alone);
        System.out.println("Separating Tree from Mapel with substring " + tree_alone);
        System.out.println("Concat the separate string back " + mapel_alone.concat(tree_alone));
        System.out.println("Convert to lowercase " + mapel1.toLowerCase());
        System.out.println("Convert to Uppercase " + mapel1.toUpperCase());

    }
}