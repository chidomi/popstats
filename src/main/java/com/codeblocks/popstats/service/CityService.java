package com.codeblocks.popstats.service;

import java.util.List;
import com.codeblocks.popstats.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CityService implements CityServiceInterface {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<City> findAll() {

        String sql = "SELECT * FROM cities";

        return jtm.query(sql, new BeanPropertyRowMapper<>(City.class));
    }

    @Override
    public City findById(Long id) {

        String sql = "SELECT * FROM cities WHERE id = ?";

        //return jtm.queryForObject(sql, new Object[]{id},
        //        new BeanPropertyRowMapper<>(City.class));

        return jtm.queryForObject(sql, 
                new BeanPropertyRowMapper<>(City.class), id);
    }
}