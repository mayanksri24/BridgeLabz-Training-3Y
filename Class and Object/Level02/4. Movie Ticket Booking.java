package com.bridgelabz.oops.leveltwo;

class MovieTicket {
    String film;
    int seatNo;
    double price;
    boolean reserved;

    MovieTicket(String f) {
        film = f;
    }

    void book(int seat, double p) {
        if (!reserved) {
            seatNo = seat;
            price = p;
            reserved = true;
            System.out.println("Booked: " + film + " | Seat " + seatNo + " | Rs." + price);
        } else {
            System.out.println("Seat already taken.");
        }
    }

    void printTicket() {
        if (reserved)
            System.out.println("Ticket: " + film + " [" + seatNo + "] - Rs." + price);
        else
            System.out.println("No booking yet.");
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Interstellar");
        t.printTicket();
        t.book(12, 300);
        t.book(15, 350);
        t.printTicket();
    }
}
