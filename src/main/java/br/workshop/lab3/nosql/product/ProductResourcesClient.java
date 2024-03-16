package br.workshop.lab3.nosql.product;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/products")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface ProductResourcesClient {

    @POST
    ProductResponse add(ProductRequest request);

    @PUT
    @Path("{id}")
    ProductResponse update(@PathParam("id") String id, ProductRequest request);

    @GET
    @Path("{id}")
    ProductResponse get(@PathParam("id") String id);

    @DELETE
    @Path("{id}")
    void delete(@PathParam("id") String id);

    @GET
    List<ProductResponse> listAll(@QueryParam("name") String name,
                                         @QueryParam("page") @DefaultValue("1") Integer page,
                                         @QueryParam("size") @DefaultValue("10") Integer size) ;

}
