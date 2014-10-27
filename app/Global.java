import com.google.inject.*;
import impl.*;
import play.*;
import play.GlobalSettings;


public class Global extends GlobalSettings {

    /** アプリケーションで使うinjector **/
    private Injector injector;

    @Override
    public void onStart(Application app) {
        super.onStart(app);
        // injectorを作成する
        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(StandardIndex.class).to(StandardIndexImpl.class);
                bind(ProductIndex.class).to(ProductIndexImpl.class);
                bind(ProductCreate.class).to(ProductCreateImpl.class);
                bind(ProductAdd.class).to(ProductAddImpl.class);
                bind(ProductShow.class).to(ProductShowImpl.class);
                bind(ProductDelete.class).to(ProductDeleteImpl.class);
                bind(ProductEdit.class).to(ProductEditImpl.class);
                bind(ProductUpdate.class).to(ProductUpdateImpl.class);
            }
        });
    }
    @Override
    public <A> A getControllerInstance(Class<A> controllerClass) throws Exception {
        // 作成したinjectorをアプリケーションに登録
        return injector.getInstance(controllerClass);
    }

}