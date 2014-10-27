package models;

/**
 * Created by poligori on 14/10/27.
 */
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product extends Model{

    /**
     *
     */

    @Id
    public int id;

    public String name;

    public int price;

}

