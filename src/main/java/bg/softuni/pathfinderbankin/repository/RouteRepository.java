package bg.softuni.pathfinderbankin.repository;

import bg.softuni.pathfinderbankin.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long>  {


}