package routing;

import com.commercetools.sunrise.common.controllers.ReverseRouter;
import com.commercetools.sunrise.common.reverserouter.*;
import com.google.inject.AbstractModule;

public class ReverseRouterModule extends AbstractModule {

    @Override
    protected void configure() {
        final ReverseRouterImpl reverseRouter = new ReverseRouterImpl();
        bind(ReverseRouter.class).toInstance(reverseRouter);
        bind(ProductReverseRouter.class).toInstance(reverseRouter);
        bind(CheckoutReverseRouter.class).toInstance(reverseRouter);
        bind(HomeReverseRouter.class).toInstance(reverseRouter);
        bind(AddressBookReverseRouter.class).toInstance(reverseRouter);
        bind(MyPersonalDetailsReverseRouter.class).toInstance(reverseRouter);
        bind(MyOrdersReverseRouter.class).toInstance(reverseRouter);
        bind(CartReverseRouter.class).toInstance(reverseRouter);
    }
}