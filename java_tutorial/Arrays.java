class Student {

    int rollno;
    StringTutorial name;
    int marks;
}

public class Arrays {
    public static void main(StringTutorial[] args) {
        // int nums[][] = new int[3][4];

        // // for (int i = 0; i < 3; i++) {
        // // for (int j = 0; j < 4; j++) {
        // // nums[i][j] = (int) (Math.random() * 100);
        // // System.out.print(nums[i][j] + " ");
        // // }
        // // System.out.println();
        // // }

        // // Enhanced for loop
        // for (int n[] : nums) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Alex";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Max";
        s2.marks = 56;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Harsh";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " " + students[i].rollno + " " +
        // students[i].marks);
        // }

        for (Student stud : students) {
            System.out.println(stud.name + " " + stud.rollno + " " + stud.marks);
        }

    }
}
