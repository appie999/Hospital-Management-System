package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.RoomDTO;
import com.hsm.Hospital.Management.System.Entity.Patient;
import com.hsm.Hospital.Management.System.Entity.Room;
import com.hsm.Hospital.Management.System.Mapper.RoomMapper;
import com.hsm.Hospital.Management.System.Repository.PatientRepository;
import com.hsm.Hospital.Management.System.Repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    public RoomService(RoomRepository roomRepository, RoomMapper roomMapper) {
        this.roomRepository = roomRepository;
        this.roomMapper = roomMapper;
    }

    public RoomDTO saveRoom(RoomDTO dto){
        return roomMapper.toDTO(roomRepository.save(roomMapper.toEntity(dto)));
    }

    public RoomDTO getRoomById(Long id){
        Room room = roomRepository.findById(id).orElseThrow(()->new RuntimeException("room not found"));
        return roomMapper.toDTO(room);
    }

    public List<RoomDTO> getAllRooms(){
        return roomRepository.findAll().stream().map(roomMapper::toDTO).toList();
    }

    public RoomDTO editRoom(Long id, RoomDTO dto){
        Room room = roomRepository.findById(id).get();
        room.setId(dto.getId());
        room.setRoomNumber(dto.getRoomNumber());
        room.setOccupied(dto.getOccupied());
//        room.setAssignedPatient(dto.getAssignedPatientId());
        return roomMapper.toDTO(roomRepository.save(room));
    }

    public void deleteRoom(Long id){
        roomRepository.deleteById(id);
    }
}
