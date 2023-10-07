package repository;

//Para usar la clase List sin tener que hacer referencia al paquete entero. La clase List representa una colección ordenada de elementos que puede contener duplicados.
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//CrudRepository es ina interfaz generica que se puede parametrizar con dos tipos: T: representa el tipo de entidad, ID: representa el tipo de identificador (clave primaria). Incluye metodos como save, findById, finAll, delete, count.
//JPpaRepository: interfaz diseñada para simplificar la implementacion de aceso a la bd. Proporciona una serie de métodos.
//La diferencia entre los dos están en que JpaRepository extiende y CrudRepository agrega funcionalidades adicionales.
//import org.springframework.data.repository.CrudRepository;


import Entities.Oferta;

public interface OfertaRepository extends JpaRepository<Oferta, Integer> {
    
    //List<tipo de retorno> metodo. Se devolverá una lista de objetos de la clase Oferta que representa un registro de la entidad Oferta en la base de datos.
    List<Oferta> findAll();
    
    Oferta findById(long id);

}
