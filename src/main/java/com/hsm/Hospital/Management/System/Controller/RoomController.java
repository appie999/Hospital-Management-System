package com.hsm.Hospital.Management.System.Controller;


import com.hsm.Hospital.Management.System.Dto.RoomDTO;
import com.hsm.Hospital.Management.System.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService service;


    @PostMapping
    public RoomDTO saveRoom(@RequestBody RoomDTO dto){
        return service.saveRoom(dto);
    }

    @GetMapping
    public List<RoomDTO> getAllRoom(){
        return service.getAllRooms();
    }

    @GetMapping("/{id}")
    public RoomDTO getRoomById(@PathVariable Long id){
        return service.getRoomById(id);
    }

    @PutMapping("/{id}")
    public RoomDTO editRoom(@PathVariable Long id, @RequestBody RoomDTO dto){
        return service.editRoom(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id){
        service.deleteRoom(id);
    }
}
