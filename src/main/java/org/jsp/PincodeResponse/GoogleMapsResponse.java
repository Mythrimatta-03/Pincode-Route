package org.jsp.PincodeResponse;

import java.util.List;

import org.jsp.Entity.Route;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoogleMapsResponse {
	 private List<Route> routes;
}
