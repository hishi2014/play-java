package impl;

import models.Product;
import play.data.Form;
import play.mvc.*;
import static play.mvc.Results.redirect;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductAddImpl implements ProductAdd {

    public Result operation(){

        Product product = Form.form(Product.class).bindFromRequest().get();
        product.save();
        return redirect("/product");
    };

}
