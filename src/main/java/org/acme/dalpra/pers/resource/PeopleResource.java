package org.acme.dalpra.pers.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import org.acme.dalpra.pers.entity.Person;
import org.acme.dalpra.pers.repos.PersonRepository;

public interface PeopleResource extends PanacheRepositoryResource<PersonRepository, Person, Long> {

}