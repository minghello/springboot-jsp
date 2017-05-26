package com.example.demo.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SampleDAO;
import com.example.demo.service.SampleService;
import com.example.demo.vo.SampleVO;

@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	SampleDAO sampleDAO;
	
	@Override
	public List<SampleVO> selectList() {
		List<SampleVO> result = sampleDAO.selectList();
		
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i).getSeq());
		}
		
		return result;
	}

}