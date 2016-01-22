
package abhirockzz.wordpress.com.payara611;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("users")
public class UsersResource {
    
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public void save(@Valid User user){
        System.out.println("saved :: " + user);
    }
    
    @GET
    @Path("{name}")
    @Produces("application/json")
    public @Valid User get(@PathParam("name") String name){
        return new User(name, name+"@test.com");
    }
}
