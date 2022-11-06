package dataAccess.abstracts;

import entities.concretes.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Integer> {
    List<Phone> getAll();
    public void add(Phone phone);

    public void delete(Phone phone,int id);
    public void update(Phone phone, int id );
}
