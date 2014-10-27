package impl;

import models.Product;
import play.db.ebean.Model;
import play.twirl.api.Html;

import java.util.List;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductIndexImpl implements ProductIndex{

    @Override
    public Html operation() {

        List<Product> products=null;
        try {
            products = new Model.Finder<Integer, Product>(Integer.class, Product.class).all();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally {
            return views.html.product.index.render(products);
        }

    }
}
