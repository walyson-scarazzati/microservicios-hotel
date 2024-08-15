package com.msvc.calificacion.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.msvc.calificacion.service.entities.Calificacion;

public interface CalificacionRepository extends MongoRepository<Calificacion,Long> {

    List<Calificacion> findByUsuarioId(String usuarioId);
    List<Calificacion> findByHotelId(String hotelId);
}
