package impl;

import play.twirl.api.Html;
import views.html.index;

/**
 * Created by poligori on 14/10/27.
 */
public class StandardIndexImpl implements StandardIndex{

        @Override
        public Html operation() {
            return index.render("Hello World.");

    }
}
