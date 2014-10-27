package controllers;

import com.google.inject.Inject;
import impl.*;
import play.mvc.*;

public class Application extends Controller {

    @Inject
    private StandardIndex standardIndex;

    public Result index() {
        return ok(standardIndex.operation());
    }

}
