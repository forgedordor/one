package defpackage;

import android.app.appsearch.AppSearchResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aip {
    public static void a(AppSearchResult appSearchResult, kop kopVar) {
        b(appSearchResult, kopVar, Function$CC.identity());
    }

    public static void b(AppSearchResult appSearchResult, kop kopVar, Function function) {
        lcg.i(appSearchResult);
        if (!appSearchResult.isSuccess()) {
            kopVar.h(new ahy(appSearchResult.getResultCode(), appSearchResult.getErrorMessage()));
            return;
        }
        try {
            kopVar.g(function.apply(appSearchResult.getResultValue()));
        } catch (Throwable th) {
            kopVar.h(th);
        }
    }
}
