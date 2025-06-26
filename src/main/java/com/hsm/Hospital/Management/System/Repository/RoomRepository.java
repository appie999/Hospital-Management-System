package com.hsm.Hospital.Management.System.Repository;

import com.hsm.Hospital.Management.System.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByRoomNumber(Long roomNumber);
}

