package backend;

import entity.Student;

public class Program {
    public static void main(String[] args) {
        // tạo 10 student, chia thành 3 nhóm
        Student student1 = new Student(1, "Nguyễn Văn A", 1);
        Student student2 = new Student(2, "Nguyễn Văn B", 1);
        Student student3 = new Student(3, "Nguyễn Văn C", 1);

        Student student4 = new Student(4, "Nguyễn Văn D", 2);
        Student student5 = new Student(5, "Nguyễn Văn E", 2);
        Student student6 = new Student(6, "Nguyễn Văn F", 2);

        Student student7 = new Student(7, "Nguyễn Văn G", 3);
        Student student8 = new Student(8, "Nguyễn Văn H", 3);
        Student student9 = new Student(9, "Nguyễn Văn I", 3);
        Student student10 = new Student(10, "Nguyễn Văn J", 3);

        //Tạo mảng dữ liệu
        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        //b) kêu gọi cả lớp điểm danh
        System.out.println("Câu b) gọi cả lớp đi điểm danh: ");
        for(Student s : students){
            s.diemDanh();
        }

        System.out.println("**************************");
        System.out.println("\n");

        // c) gọi nhóm 1 đi học bài:
        System.out.println("Câu c) gọi nhóm 1 đi học bài:");
        for(Student s : students){
            if(s.getGroup() == 1){
                s.hocBai();
            }
        }
        System.out.println("**************************");
        System.out.println("\n");

        //d) gọi nhóm 2 đi dọn vệ sinh:
        System.out.println("Câu d) gọi nhóm 2 đi dọn vệ sinh:");
        for(Student s : students){
            if(s.getGroup() == 2){
                s.diDonVeSinh();
            }
        }
        System.out.println("**************************");
    }
}
