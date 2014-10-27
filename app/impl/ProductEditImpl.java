package impl;

import models.Product;
import play.db.ebean.Model;
import play.twirl.api.Html;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductEditImpl implements ProductEdit{

    public Html operation(int id){
        Product product= new Model.Finder<Integer, Product>(Integer.class, Product.class).byId(id);
        return views.html.product.edit.render(product);

    };
}
