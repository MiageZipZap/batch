package com.rest.jersey.jerseyclient;

import java.util.Date;

import model.StagHealthPath;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
/**
 * 
 * @author samuel.koulibali
 *
 */
public class JerseyClient {
	public static void main(String[] args) {
		try {
			//TODO: should read from file or Json call
			StagHealthPath hp = new StagHealthPath(1,"1","Samuel","11","Mondor","27/04/2015","28/04/2015",new Date(System.currentTimeMillis()),"200000","json file");
			
			/**
			 * Rest Client configuration merge jackson with jersey
			 * <init-param><param-name>com.sun.jersey.api.json.POJOMappingFeature</param-name>
			 * <param-value>true</param-value>
			 * </init-param>
			 * 
			 */
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
			Client client = Client.create(clientConfig);
			
			//attached Web ressource
			WebResource webResource = client.resource("http://localhost:8081/Scheduler_Job_WS/rest/jsonServices/send");
			
			//configure Rest call
			ClientResponse response = webResource.accept("application/json")
					.type("application/json").post(ClientResponse.class, hp);
			
			//Raise exception if call failed
			//TODO: constant for HTTP error and success code
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus()+response.toString());
			}
			
			//TODO: remove this and implement proper return
			String output = response.getEntity(String.class);
			System.out.println("Server response .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
