package com.amdocs.cargomanagement.service;

import java.util.List;

import com.amdocs.cargomanagement.Exception.CargoNotFoundException;
import com.amdocs.cargomanagement.entity.Truck;

public interface TruckService {
public Truck saveTruck(Truck truck,Integer cid) throws CargoNotFoundException;
public List<Truck> getAllTrucks();
public Truck getTruckById(int tid);
public Truck UpdateTruck(int tid,Truck truck);
public void deleteTruck(int tid);

//public List<Truck> getTruckByCargoId(int cid) ;
}
