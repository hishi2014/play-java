package impl;

import models.Product;
import play.db.ebean.Model;
import play.mvc.Result;

import static play.mvc.Results.redirect;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductDeleteImpl implements ProductDelete{

    public Result operation(int id){

        Product product= new Model.Finder<Integer, Product>(Integer.class, Product.class).byId(id);
        product.delete();
        return redirect("/product");

    };
}
