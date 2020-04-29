package chess.model.repository;

import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RoomRepository extends CrudRepository<RoomEntity, Integer> {

    @Query("SELECT * FROM ROOM_TB WHERE USED_YN = :USED_YN")
    Iterable<RoomEntity> findAllByUsedYNEquals(@Param("USED_YN") String usedYN);

    @Query("SELECT * FROM ROOM_TB WHERE USED_YN = :USED_YN")
    Optional<RoomEntity> findByGameId(Integer gameId);
}
