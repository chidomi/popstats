package com.codeblocks.popstats.service;
import com.codeblocks.popstats.model.City;
import java.util.List;
public interface CityServiceInterface {

    List<City> findAll();
    City findById(Long id);

}