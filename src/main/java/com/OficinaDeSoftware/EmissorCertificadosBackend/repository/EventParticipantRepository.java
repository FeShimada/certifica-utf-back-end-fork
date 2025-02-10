package com.OficinaDeSoftware.EmissorCertificadosBackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OficinaDeSoftware.EmissorCertificadosBackend.domain.EventParticipant;

public interface EventParticipantRepository extends MongoRepository<EventParticipant, String> {

     List<EventParticipant> findAllByNrUuidParticipant( String nrUuidParticipant );

     boolean existsByNrUuidParticipantAndIdEvent( String nrUuidParticipant, String idEvent );

     List<EventParticipant> findAllByIdEvent(String idEvent );

     void deleteByIdEventAndNrUuidParticipant( String idEvent, String nrUuidParticipant );
}
