package ru.netology.comparator;

import ru.netology.data.Ticket;

import java.util.Comparator;

public class TicketByTimeTravelAscComparator implements Comparator<Ticket> {
    public int compare(Ticket o1, Ticket o2) {
        return o1.getTimeTravel() - o2.getTimeTravel();
    }
}