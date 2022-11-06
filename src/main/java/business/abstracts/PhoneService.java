package business.abstracts;

import entities.concretes.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PhoneService {
    List<Phone> getAll();
    public void add(Phone phone);
    public void delete(Phone phone);
    public void update(Phone phone, int id );
}
