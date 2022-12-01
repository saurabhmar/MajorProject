
}
package com.cybage.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Complaints;
import com.cybage.repository.complaintsRepository;



@Service
public class complaintsService {

	
	@Autowired
	private ComplaintsRepository complaintsRepository;
		public Complaints addComplaints(Complaints complaints) 
	{
		 return ( complaintsRepository).save(complaints);
				
	}
		public List<Complaints> getAllComplaintss(Complaints complaints) 
		{
			return complaintsRepository.findAll();

		}
		public  void deleteComplaints(int complaintsId) {
			
			 complaintsRepository.deleteById(complaintsId);
							
		}
}
