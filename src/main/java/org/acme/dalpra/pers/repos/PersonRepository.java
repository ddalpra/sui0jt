package org.acme.dalpra.pers.repos;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.acme.dalpra.pers.entity.Person;

import java.util.UUID;

@Path("people")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class PersonRepository implements PanacheRepositoryBase<Person, UUID> {
}