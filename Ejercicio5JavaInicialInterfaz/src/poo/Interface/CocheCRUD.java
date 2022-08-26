package poo.Interface;


import java.util.List;

public interface CocheCRUD {

    // Declaro los métodos

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);

}
