package org.RestWebApi.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.RestWebApi.modal.Product;
import org.RestWebApi.service.ProductService;

@Path("/secured")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ProductResource {

	ProductService productService = new ProductService();

	@GET
	@Path("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GET
	@Path("/products/{productId}")
	public Product getProduct(@PathParam("productId") long id) {
		return productService.getProduct(id);
	}

	@POST
	@Path("/products")
	public Response addProduct(Product product) {
	
		productService.addProduct(product);
		return Response.status(Status.CREATED).build();

	}

	@PUT
	@Path("/products/{productId}")
	public Response updateProduct(@PathParam("productId") long id, Product product) {
		product.setId(id);
		Boolean bool = productService.updateproduct(product);
		if (bool == true) {
			return Response.status(Status.OK).build();
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@DELETE
	@Path("/products/{productId}")
	public Response deleteProduct(@PathParam("productId") long id) {

		Boolean bool=productService.deleteProduct(id);
		if(bool==true)
		{
		return Response.status(Status.OK).build();
		}
		else
		{
		return Response.status(Status.BAD_REQUEST).build();
		}
	}

}
