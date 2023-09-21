package com.amdocs.cargomanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.amdocs.cargomanagement.entity.Cargo;
import com.amdocs.cargomanagement.entity.Truck;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Integer>{
	/*
	    Truck findByCargoAndTruckId(Cargo cargo, int  tid);
		List<Truck> findByCargo(int cid);
		*/
}
