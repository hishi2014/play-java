package controllers;

import com.google.inject.Inject;
import impl.*;
import play.mvc.*;

/**
 * Created by poligori on 14/10/27.
 */
public class ProductController extends Controller {

    @Inject
    private ProductIndex productIndex;
    @Inject
    private ProductCreate productCreate;
    @Inject
    private ProductAdd productAdd;
    @Inject
    private ProductShow productShow;
    @Inject
    private ProductDelete productDelete;
    @Inject
    private ProductUpdate productUpdate;
    @Inject
    private ProductEdit productEdit;



    public Result index() {
        return ok(productIndex.operation());
    }

    public Result add() {
        return ok(productCreate.operation());
    }

    public Result addProduct() {
        return productAdd.operation();
    }

    public Result show(int id) {

        return ok(productShow.operation(id));
    }

    public Result delete(int id) {

        return productDelete.operation(id);
    }

    public Result edit(int id){

        return ok(productEdit.operation(id));
    }

    public Result update(){

        return productUpdate.operation();
    }

}
