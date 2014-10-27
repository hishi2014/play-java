package impl;

import models.Product;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Result;

import static play.mvc.Results.redirect;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductUpdateImpl implements ProductUpdate {

    public Result operation(){

        Product prdct = Form.form(Product.class).bindFromRequest().get();
        Product product= new Model.Finder<Integer, Product>(Integer.class, Product.class).byId(prdct.id);
        product.name=prdct.name;
        product.price=prdct.price;
        product.update();
        return redirect("/product");

    };
}
