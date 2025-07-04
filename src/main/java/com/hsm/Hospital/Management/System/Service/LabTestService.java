package com.hsm.Hospital.Management.System.Service;


import com.hsm.Hospital.Management.System.Dto.LabTestDTO;
import com.hsm.Hospital.Management.System.Entity.LabTest;
import com.hsm.Hospital.Management.System.Mapper.LabTestMapper;
import com.hsm.Hospital.Management.System.Repository.LabTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabTestService {

    @Autowired
    private LabTestMapper labTestMapper;

    @Autowired
    private LabTestRepository labTestRepository;


    public LabTestDTO saveLabTest(LabTestDTO labTestDTO){
        return labTestMapper.toDTO(labTestRepository.save(labTestMapper.toEntity(labTestDTO)));
    }

    public LabTestDTO editLabTest(Long id, LabTestDTO labTestDTO){
        LabTest labTest = labTestRepository.findById(id).get();
        labTest.setId(labTestDTO.getId());
        labTest.setTestName(labTestDTO.getTestName());
        labTest.setResult(labTestDTO.getResult());
        return labTestMapper.toDTO(labTestRepository.save(labTest));
    }

    public LabTestDTO getLabTestById(Long id){
        return labTestMapper.toDTO(labTestRepository.findById(id).orElseThrow(()->new RuntimeException("lab tast not found")));
    }

    public List<LabTestDTO> getAllLabTests(){
        return labTestRepository.findAll().stream().map(labTest -> labTestMapper.toDTO(labTest)).toList();
    }

    public void deleteLabTest(Long id){
        labTestRepository.deleteById(id);
    }

}
