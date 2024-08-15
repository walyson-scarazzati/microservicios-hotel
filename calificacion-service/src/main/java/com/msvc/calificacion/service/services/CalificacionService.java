package com.msvc.calificacion.service.services;

import java.util.List;

import com.msvc.calificacion.service.entities.Calificacion;

public interface CalificacionService {

    Calificacion create(Calificacion calificacion);

    List<Calificacion> getCalificaciones();

    List<Calificacion> getCalificacionesByUsuarioId(String usuarioId);

    List<Calificacion> getCalificacionesByHotelId(String hotelId);

}
