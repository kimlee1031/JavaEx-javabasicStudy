package ch6v2;


import javax.crypto.spec.PSource;

class EX6_4 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 70);

        System.out.println(s.info());

        System.out.println("이름 " + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        String info = (name +","+ ban +","+ no +","+ kor +","+ eng +","+ math+","+getAverage()+","+getTotal());
        return info;

    }

    public int getTotal() {
        return kor+eng+math;
    }

    public float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}
