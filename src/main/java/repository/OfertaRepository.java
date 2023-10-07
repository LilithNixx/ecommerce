package repository;

//Para usar la clase List sin tener que hacer referencia al paquete entero. La clase List representa una colección ordenada de elementos que puede contener duplicados.
import java.util.List;

//CrudRepository es ina interfaz generica que se puede parametrizar con dos tipos: T: representa el tipo de entidad, ID: representa el tipo de identificador (clave primaria). Incluye metodos como save, findById, finAll, delete, count.
import org.springframework.data.repository.CrudRepository;

import Entities.Oferta;

public interface OfertaRepository extends CrudRepository<Oferta, Integer> {
    
    //List<tipo de retorno> metodo. Se devolverá una lista de objetos de la clase Oferta que representa un registro de la entidad Oferta en la base de datos.
    List<Oferta> findAll();
    
    Oferta findById(long id);

}
