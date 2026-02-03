package defpackage;

import android.app.appsearch.AppSearchManager;
import android.app.appsearch.AppSearchResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aie {
    static final Executor a;
    public static final /* synthetic */ int b = 0;

    static {
        if (aev.a == null) {
            synchronized (aev.class) {
                if (aev.a == null) {
                    aev.a = new aga();
                }
            }
        }
        a = Executors.newCachedThreadPool();
    }

    public static ListenableFuture a(final aid aidVar) {
        AppSearchManager appSearchManagerM = aib$$ExternalSyntheticApiModelOutline0.m(aidVar.a.getSystemService(aib$$ExternalSyntheticApiModelOutline0.m()));
        final kop kopVar = new kop();
        appSearchManagerM.createSearchSession(new AppSearchManager.SearchContext.Builder(aidVar.b).build(), aidVar.c, new Consumer() { // from class: aib
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AppSearchResult appSearchResultM84m = aib$$ExternalSyntheticApiModelOutline0.m84m(obj);
                int i = aie.b;
                boolean zIsSuccess = appSearchResultM84m.isSuccess();
                kop kopVar2 = kopVar;
                if (!zIsSuccess) {
                    kopVar2.h(new ahy(appSearchResultM84m.getResultCode(), appSearchResultM84m.getErrorMessage()));
                } else {
                    aid aidVar2 = aidVar;
                    kopVar2.g(new aio(aib$$ExternalSyntheticApiModelOutline0.m90m(appSearchResultM84m.getResultValue()), aidVar2.c, aidVar2.a));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return kopVar;
    }
}
