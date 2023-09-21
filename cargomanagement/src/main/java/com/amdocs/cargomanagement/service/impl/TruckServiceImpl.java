package com.amdocs.cargomanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.cargomanagement.Exception.CargoNotFoundException;
import com.amdocs.cargomanagement.entity.Cargo;
import com.amdocs.cargomanagement.entity.Truck;
import com.amdocs.cargomanagement.repo.CargoRepository;
import com.amdocs.cargomanagement.repo.TruckRepository;
import com.amdocs.cargomanagement.service.TruckService;



@Service
public class TruckServiceImpl implements TruckService{

	private TruckRepository truckrepo;
	private CargoRepository cargorepo;
	
	@Autowired
	public TruckServiceImpl(TruckRepository truckrepo,CargoRepository cargorepo) {
		//super();
		this.truckrepo = truckrepo;
		this.cargorepo=cargorepo;
	}
	
	@Override
	public Truck saveTruck(Truck truck,Integer cid) throws CargoNotFoundException{
		// TODO Auto-generated method stub
		Cargo cargo2=cargorepo.findById(cid).orElse(null);
		if(cargo2!=null)
		{truck.setCargo(cargo2);
		 return truckrepo.save(truck);
		}
		else
		{
			throw new CargoNotFoundException("cargo was not found");
		}
	}

	@Override
	public List<Truck> getAllTrucks() {
		// TODO Auto-generated method stub
		return truckrepo.findAll();
	}

	@Override
	public Truck getTruckById(int tid) {
		// TODO Auto-generated method stub
		return truckrepo.findById(tid).orElse(null);
	}

	@Override
	public Truck UpdateTruck(int tid, Truck truck) {
		// TODO Auto-generated method stub
Truck existingtruck=truckrepo.findById(tid).orElse(null);
		
		if(existingtruck!=null)
		{
			existingtruck.setLicense(truck.getLicense());
			existingtruck.setDriverName(truck.getDriverName());
		return truckrepo.save(existingtruck);
		}
		return null;
	}

	@Override
	public void deleteTruck(int tid) {
		// TODO Auto-generated method stub
		 truckrepo.deleteById(tid);
		
	}
/*
	@Override
	public List<Truck> getTruckByCargoId(int cid) {
		// TODO Auto-generated method stub
		 Cargo cargo = cargorepo.findById(cid).orElse(null);
	        return truckrepo.findByCargo(cid);
	}
*/
}
