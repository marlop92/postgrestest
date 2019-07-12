package pl.mlopatka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.mlopatka.model.enitity.Location;

/**
 * Created by marcin.lopatka on 12-07-2019
 */
@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {
}
