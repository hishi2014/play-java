package impl;

import models.Product;
import play.db.ebean.Model;
import play.twirl.api.Html;
import scala.Int;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductShowImpl implements ProductShow{

    @Override
    public Html operation(int id){

        Product product= new Model.Finder<Integer, Product>(Integer.class, Product.class).byId(id);
        return views.html.product.show.render(product);

    };
}
