package com.amdocs.cargomanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.cargomanagement.Exception.CargoNotFoundException;
import com.amdocs.cargomanagement.entity.Truck;
import com.amdocs.cargomanagement.service.impl.CargoServiceImpl;
import com.amdocs.cargomanagement.service.impl.TruckServiceImpl;



@RestController
@RequestMapping("/trucks")
public class TruckController {
	private TruckServiceImpl truckserv;
	private CargoServiceImpl cargoserv;
	
	//http://localhost:8087/trucks
	public TruckController(TruckServiceImpl truckserv ,CargoServiceImpl cargoserv)
	{
		super();
		this.truckserv=truckserv;
		this.cargoserv=cargoserv;
	}
	/*
	@GetMapping("/cargo/{cid}")
    public List<Truck> getTruckByCargoId(@PathVariable int cid) {
        return truckserv.getTruckByCargoId(cid);
    }
	*/
	@PostMapping("/insert/{cid}")
	public Truck saveTruck(@RequestBody Truck truck, @PathVariable Integer cid) throws CargoNotFoundException
	{
		return truckserv.saveTruck(truck,cid);
	}
	
	@GetMapping("/alltrucks")
	public List<Truck> getAllTrucks()
	{
		return truckserv.getAllTrucks();
		
	}
	
	@GetMapping("/{tid}")
	public Truck getTruckById(@PathVariable int tid)
	{
		return truckserv.getTruckById(tid);
	}
	
	@PutMapping("/update/{tid}")
	public Truck updateTruck(@PathVariable int tid,@RequestBody Truck truck)
	{
		return truckserv.UpdateTruck(tid, truck);
	}
	
	@DeleteMapping("/delete/{tid}")
	public void deleteTruck(@PathVariable int tid)
	{
		truckserv.deleteTruck(tid);
	}
	
}
