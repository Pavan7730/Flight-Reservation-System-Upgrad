package com.company;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class main {
    public main() {
    }

    public static void main(String[] args) {
        Flight flight = new Flight("1", "2", 3, 4);
        String[] var10000 = new String[]{"peanuts", "almonds"};
        var10000 = new String[]{"hyd", "chennai"};
        Passenger xm = new Passenger("x", "y", "c", "v", "123", "b");
        String y = xm.getContact();
        System.out.println(y + xm.getAddress());
        flight.getFlightDetails();

        public static void printTicketDetails(Ticket ticket);
        {
            String TicketDetails = ticket.getPNR_number();
            System.out.println(TicketDetails);
        }
    }
}