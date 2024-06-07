public class ArraySubjects {
    public static void main(String[] args) {

        String[][] subjects ={ {"Data Structures and Algorithms","Programming & Logic",
                "Software Engineering","Theory of Computation"},
                {"Discrete mathematics","Web technology",
                        "Digital Electronics","numerical Methods"},
                {"Operating System", "E-Commerce",
                        "Operation Research", "Computer Fumdamentals"}};

        System.out.println("Subject Of Semester 1 = " + subjects[0][0]);
        System.out.println("Subject Of Semester 2 = " + subjects[0][1]);
        System.out.println("Subject Of Semester 3 = " + subjects[0][2]);
    }
}
