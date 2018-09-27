package com.rest.test.restprj;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/orders")
public class OrderResponse {
	@GET
    @Path("allorders")
    @Produces(MediaType.TEXT_PLAIN)
	public String orders() {
		List<Order> orderList= new ArrayList<Order>();
		orderList.add(new Order(100,102.1f,"USDJPY"));
		orderList.add(new Order(110,101.1f,"USDJPY"));
		String json = new Gson().toJson(orderList);
        return json;
    }
	
	private static class Order {
		private int sz;
		private float prc ;
		private String id;
		public Order(int sz, float prc, String id) {
			super();
			this.sz = sz;
			this.prc = prc;
			this.id = id;
		}
		@Override
		public String toString() {
			return "Order [sz=" + sz + ", prc=" + prc + ", id=" + id + "]";
		}	
	}

}


