package com.bridgelabz.oops.leveltwo;

class ReportCard {
    String name;
    int roll;
    int[] marks;

    ReportCard(String n, int r, int[] m) {
        name = n;
        roll = r;
        marks = m;
    }

    double average() {
        int sum = 0;
        for (int x : marks) sum += x;
        return (double) sum / marks.length;
    }

    char grade() {
        double avg = average();
        if (avg >= 85) return 'A';
        if (avg >= 70) return 'B';
        if (avg >= 55) return 'C';
        if (avg >= 40) return 'D';
        return 'F';
    }

    void show() {
        System.out.println("Student: " + name + " (" + roll + ")");
        System.out.print("Marks: ");
        for (int x : marks) System.out.print(x + " ");
        System.out.println("\nAverage: " + average() + " | Grade: " + grade());
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        ReportCard s1 = new ReportCard("Amit", 101, new int[]{78, 89, 92});
        ReportCard s2 = new ReportCard("Meena", 102, new int[]{40, 55, 60});
        s1.show();
        s2.show();
    }
}

