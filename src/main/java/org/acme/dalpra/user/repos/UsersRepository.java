package org.acme.dalpra.user.repos;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.acme.dalpra.user.entity.User;

import java.util.UUID;

@Path("users")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class UsersRepository implements PanacheRepositoryBase<User, UUID> {
}
