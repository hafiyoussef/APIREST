package com.kb.rest.resource;
 
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.kb.service.ProfService;
import com.kb.model.Personnel;
 import com.kb.service.ModuleService;
 import com.kb.dao.PersonnelDAO;
@Path("/api")
public class ProfResource {
	
 
    // CRUD -- READ operation
	@GET
	@Path("/perso")
	@Produces("application/json")
	public Response getAllProfesseur() throws JSONException {

		//get the list of profs
		List<Personnel> perso = new ProfService().getAllProfesseur();
		//Convert users to a JSON object
		JSONArray jsonUsers = new JSONArray();
		
		for(int i = 0; i < perso.size(); i++) {
			Personnel p = perso.get(i);
			JSONObject jsonUser = new JSONObject();
			jsonUser.put("id", p.getId());
			jsonUser.put("nom", p.getNom());
			jsonUser.put("prenom", p.getPrenom());
			jsonUser.put("date_naissance", p.getDate_naissance());
			jsonUsers.put(jsonUser);
			
		}
		
		String result = "" + jsonUsers;
		return Response.status(200).entity(result).build();
	
		
	}	
	@GET
	@Path("/modules")
	@Produces("application/json")
	public Response getAllModule() throws JSONException {

		//get the list of profs
		List<com.kb.model.Module> mod = new ModuleService().getAllModule();
		//Convert users to a JSON object
		JSONArray jsonUsers = new JSONArray();
		
		for(int i = 0; i < mod.size(); i++) {
			com.kb.model.Module m = mod.get(i);
			JSONObject jsonUser = new JSONObject();
			
			jsonUser.put("nb_heures_tp", m.getTb_heures_tp());
			jsonUser.put("nb_heures_td", m.getNb_heures_td());
			jsonUser.put("nb_heures_cours", m.getNb_heures_cours());
			jsonUser.put("titre", m.getTitre());
			jsonUsers.put(jsonUser);
			
		}
		
		String result = "" + jsonUsers;
		return Response.status(200).entity(result).build();
	
		
	}
	@GET
    @Path("/perso/{id}")
    @Produces("application/json")
	
	public Response getPersonnel(@PathParam("id") int id) {
		Personnel per = new ProfService().getPersonnel( id);
		//Convert users to a JSON object
				JSONArray jsonUsers = new JSONArray();
				
					JSONObject jsonUser = new JSONObject();
					jsonUser.put("id", per.getId());
					jsonUser.put("nom", per.getNom());
					jsonUser.put("prenom", per.getPrenom());
					jsonUser.put("date_naissance", per.getDate_naissance());
					jsonUsers.put(jsonUser);
				
				String result = "" + jsonUsers;
				return Response.status(200).entity(result).build();
       
    }
	@Path("/perso/post")
	@POST	
	@Consumes("application/json")
	@Produces("application/json")	
	public Response addProf(InputStream jUserStream) throws org.json.simple.parser.ParseException {
		System.out.println("--> addProf");
		JSONParser jsonParser = new JSONParser();
		org.json.simple.JSONObject jsonObject;
		try {
			jsonObject = (org.json.simple.JSONObject)jsonParser.parse(
			   new InputStreamReader(jUserStream, "UTF-8"));
			
			Personnel u = new Personnel(Integer.parseInt((String)jsonObject.get("id")), (String)jsonObject.get("nom"), (String)jsonObject.get("prenom"),  (String)jsonObject.get("date_naissance"));
			
			PersonnelDAO pDao = new PersonnelDAO();
			//JSONArray jsonUsers = new JSONArray();
			
			/*JSONObject jsonUser = new JSONObject();
			jsonUser.put("id",u.getId());
			jsonUser.put("nom", u.getNom());
			jsonUser.put("prenom", u.getPrenom());
			jsonUser.put("date_naissance",u.getDate_naissance());
			//jsonUsers.put(jsonUser);
			*/
			pDao.addPersonnel(u);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						
		String result = "{'success':1}" ;
		return Response.status(200).entity(result).build();		
	}
   
}