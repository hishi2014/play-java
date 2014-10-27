package impl;

import play.twirl.api.Html;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductCreateImpl implements ProductCreate {

    public Html operation(){

        return views.html.product.add.render("product");
    };
}
