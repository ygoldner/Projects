package org.projects.user.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.projects.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Yael Goldner (goldny) on 22/05/2019
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private HashMap<String, User> users = new HashMap<String, User>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(User user){
        users.put(user.getId(), user);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAll(){
        return new ArrayList<User>(users.values());
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User findById(@PathParam("id") String id){
        return users.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(User user){
        users.put(user.getId(), user);
    }

    @Path("/{id}")
    @DELETE
    public void deleteById(@PathParam("id") String id){
        users.remove(id);
    }

}
