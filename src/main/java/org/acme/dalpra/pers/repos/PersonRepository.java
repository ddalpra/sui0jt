package org.acme.dalpra.pers.repos;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.acme.dalpra.pers.entity.Person;
@Path("people")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class PersonRepository implements PanacheRepository<Person> {
}