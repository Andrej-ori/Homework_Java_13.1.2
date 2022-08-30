package ru.netology.manager;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.netology.data.Ticket;
import ru.netology.exception.NotFoundException;
import ru.netology.exception.AlreadyExistsException;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
public class TicketManagerTest {

    @Mock
    TicketRepository repository = Mockito.mock(TicketRepository.class);

    @InjectMocks
    TicketManager manager = new TicketManager(repository);

    // тестовые данные
    Ticket ticket1 = new Ticket(1, 1_000, "SVO", "LED", 45);
    Ticket ticket2 = new Ticket(2, 3_200, "DST", "TYG", 120);
    Ticket ticket3 = new Ticket(3, 753, "SDF", "SVO", 260);
    Ticket ticket4 = new Ticket(4, 10_580, "SVO", "LED", 45);
    Ticket ticket5 = new Ticket(5, 3_000, "DST", "REB", 90);
    Ticket ticket6 = new Ticket(6, 2_753, "SDF", "SVO", 259);
    Ticket ticket7 = new Ticket(7, 12_300, "SVO", "LED", 45);
    Ticket ticket8 = new Ticket(8, 300, "VFR", "LED", 220);
    Ticket ticket9 = new Ticket(9, 753, "DGY", "SVO", 230);
    Ticket ticket10 = new Ticket(10, 100, "SVO", "LED", 60);
    Ticket ticket11 = new Ticket(11, 35_000, "NYR", "TYG", 120);
    Ticket ticket12 = new Ticket(12, 7_535, "SDF", "LED", 259);
    Ticket ticket5Duble = new Ticket(5, 234 , "SDF", "SDS", 456);




}
