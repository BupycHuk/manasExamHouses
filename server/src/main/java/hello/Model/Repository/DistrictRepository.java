package hello.Model.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
public interface DistrictRepository extends CrudRepository <District, Long> {
    Iterable<Distirct> findByName (String Name);
}
