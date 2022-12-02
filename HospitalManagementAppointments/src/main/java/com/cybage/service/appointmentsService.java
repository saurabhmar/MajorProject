package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Appointmentt;

import com.cybage.repository.appointmentsRepository;

@Service
public class appointmentsService {
@Autowired
private AppointmenttRepository appointmenttRepository;
	public Appointmentt addAppointmentt(Appointmentt appointmentt) 
{
	 return appointmenttRepository.save(appointmentt);
			
}
	public List<Appointmentt> getAllAppointmentts(Appointmentt appointmentt) 
	{
		return appointmenttRepository.findAll();

	}
	public Appointmentt getAppointmenttById(int id) 
{
	 return appointmenttRepository.findById(id)
	 .orElse(null);
			
}
	public  void deleteAppointmentt(int id) {
		
		 appointmenttRepository.deleteById(id);
						
	}
	
	
	
	
	public Appointmentt updateAppointmentt(int id,Appointmentt appointmentt) {
		
		Appointmentt appointmentt1=appointmenttRepository.findById(id).get();
		if(appointmentt.getAppointmenttName()!=null)
		appointmentt1.setAppointmenttName(appointmentt.getAppointmenttName());
		//if(appointmentt.getPrice()!=0)
		//appointmentt1.setPrice(appointmentt.getPrice());
		
		 return appointmenttRepository.save(appointmentt);
			
	}
	
