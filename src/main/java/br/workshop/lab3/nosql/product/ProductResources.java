package br.workshop.lab3.nosql.product;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
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
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
@Path("/products")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ProductResources {

    @Inject
    @RestClient
    Products products;

    @POST
    public ProductResponse add(ProductRequest request) {
        return products.add(request);
    }

    @PUT
    @Path("{id}")
    public ProductResponse update(@PathParam("id") String id, ProductRequest request) {
        return products.update(id, request);
    }

    @GET
    @Path("{id}")
    public ProductResponse get(@PathParam("id") String id) {
        return products.get(id);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") String id) {
        products.delete(id);
    }

    @GET
    public List<ProductResponse> listAll(@QueryParam("name") String name,
                                         @QueryParam("page") @DefaultValue("1") Integer page,
                                         @QueryParam("size") @DefaultValue("10") Integer size) {

        return products.listAll(name, page, size);
    }

}
