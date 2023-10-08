package repository;

//Para usar la clase List sin tener que hacer referencia al paquete entero. La clase List representa una colección ordenada de elementos que puede contener duplicados.
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
//CrudRepository es ina interfaz generica que se puede parametrizar con dos tipos: T: representa el tipo de entidad, ID: representa el tipo de identificador (clave primaria). Incluye metodos como save, findById, finAll, delete, count.
//JPpaRepository: interfaz diseñada para simplificar la implementacion de aceso a la bd. Proporciona una serie de métodos.
//La diferencia entre los dos están en que JpaRepository extiende y CrudRepository agrega funcionalidades adicionales.
import org.springframework.data.repository.CrudRepository;

//Para usar la anotación @Repository que le dice a Spring que la clase debe ser escaneada y gestionada como un componente de repositorio.
import org.springframework.stereotype.Repository;

//Se usa para aplicar la anotación @Transactional a un método o clase, indicando que este debe ser ejecutado dentro de una transacción. 
//Transacción: serie de operaciones que se ejecutan como una unidad atómica e indivisible. 
//import org.springframework.transaction.annotation.Transactional;

//javax.persistence.EntityManager se usa para realizar operaciones de lectura y escritura en la base de datos JPA: persistencia, recuperacion, actualizacion, eliminacion, gestion del ciclo de vida, control de transacciones, control de cache
//import javax.persistence.EntityManager;
//Se usa con la anotacion @PersistenceContext para inyectar un EntityManager en una clase de componente.
//import javax.persistence.PersistenceContext;


import Entities.Oferta;

//Interfaz para crear, buscar, modificar, eliminar

@Repository
public interface OfertaRepository extends CrudRepository<Oferta, Integer> {
    
    //List<tipo de retorno> metodo. Se devolverá una lista de objetos de la clase Oferta que representa un registro de la entidad Oferta en la base de datos.
    List<Oferta> findAll();
    
    Oferta findById(long id);


}
