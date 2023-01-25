public class String_Example {
    public static void main(String[] args) {
       String name = "Paridhi Singh";
       System.out.println(name);


       // int value = name.length();
      //  System.out.println(value);


      //  String lstring = name.toLowerCase();
       // System.out.println(lstring);


       // String ustring = name.toUpperCase();
       // System.out.println(ustring);


       // String nonTrimmedString = "    Pardhi Singh   ";
       // System.out.println(nonTrimmedString);

     //   String trimmedString = nonTrimmedString.trim();
     //   System.out.println(trimmedString); */

      //  String substring = name.substring(10);
     //   System.out.println(substring);

     //   String substring2 = name.substring(0,4);
     //   System.out.println(substring2);

       String namereplace = name.replace('r','d');
        System.out.println(namereplace);

        System.out.println(name.replace("r", "dhi"));

        System.out.println(name.startsWith("P"));

        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("h"));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));

    }
}
