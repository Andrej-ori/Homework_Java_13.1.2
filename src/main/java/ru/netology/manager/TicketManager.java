package ru.netology.manager;

import ru.netology.data.Ticket;
import ru.netology.repository.TicketRepository;

public class TicketManager {

    private TicketRepository repository = new TicketRepository();

    // методы зависимые от репозитория
    // добавление билета в массив
    public void addTicket(Ticket addTicket) {
        repository.addTicket(addTicket);
    }

    // удаление билета из массива по Id
    public void removeById(int removedId) {
        repository.removeById(removedId);
    }

    // логика менеджерра
    // поиск билета по аэропортам вылета-прилета
    public void TicketData[] findAll (String a)
}
