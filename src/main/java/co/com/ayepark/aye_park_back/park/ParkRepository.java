package co.com.ayepark.aye_park_back.park;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkRepository extends JpaRepository<Park, Integer> {
    
}
