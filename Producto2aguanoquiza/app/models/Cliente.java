package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import org.junit.runner.Cliente;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import com.avaje.ebean.PagedList;

import play.data.format.Formats;
import play.data.validation.Constraints;

@Entity
public class Cliente extends Model{
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String apellido;
    
    @Constraints.Required
    public String direccion;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date fecha;
        
    
    public static Find<Long,Cliente> find = new Find<Long,Cliente>(){};

}
