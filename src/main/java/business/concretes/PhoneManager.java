package business.concretes;

import business.abstracts.PhoneService;
import dataAccess.abstracts.PhoneRepository;
import entities.concretes.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneManager implements PhoneService {

    public PhoneRepository phoneRepository;

    @Autowired
    public PhoneManager(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<Phone> getAll() {
        return this.phoneRepository.findAll();
    }

    @Override
    public void add(Phone phone) {
        this.phoneRepository.add(phone);

    }

    @Override
    public void delete(Phone phone) {
        this.phoneRepository.delete(phone);

    }

    @Override
    public void update(Phone phone, int id) {
        this.phoneRepository.update(phone,id);

    }
}
