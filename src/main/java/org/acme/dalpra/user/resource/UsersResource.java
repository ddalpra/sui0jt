package org.acme.dalpra.user.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import org.acme.dalpra.user.entity.User;
import org.acme.dalpra.user.repos.UsersRepository;

import java.util.UUID;

public interface UsersResource  extends PanacheRepositoryResource<UsersRepository, User, UUID> {
}
