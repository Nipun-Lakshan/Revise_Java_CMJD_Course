class Revise03 {
    public static void main(String[] args) {

        // String Literal (String Value)
        System.out.println("\nHello World!");

        // String Object (Reference Data Type)
        String message = "Hello World!";
        System.out.println(message);

        /*String msg = new String("Hello World");
        System.out.println(msg);*/ // Not a good way for Strings whether they are objects.

        // Useful Methods in Strings
        // =========================

        String example = "Hello World";
        System.out.println(example);
        example = "!!" + example;
        System.out.println(example);
        System.out.println(example.startsWith("qq")); // False
        System.out.println(example.startsWith("!!")); // True
        System.out.println(example.endsWith("!!")); // False
        example += "!!";
        System.out.println(example);
        System.out.println("Length of The String :- " + example.length()); // 15
        System.out.println("Index of H in String :- " + example.indexOf("H")); // 2
        System.out.println("Index of Q in String :- " + example.indexOf("Q")); // -1
        System.out.println("Replaced Statement :- " + example.replace("!!", ""));
        System.out.println("Lower Case: - " + example.toLowerCase());
        System.out.println("Upper Case: - " + example.toUpperCase());
        String note = ("      " + "Jenny Lecture's" + " l"); // Add Some Spaces
        System.out.println(note);
        System.out.println(note.trim()); // Remove Unwanted Space From The Beginning  of The Word
        String s1 = "Hello";
        String s2 = "World";
        String result = s1.concat(" ").concat(s2);  // "Hello World"
        System.out.println(result);
    }
}
