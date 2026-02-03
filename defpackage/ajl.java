package defpackage;

import android.app.appsearch.AppSearchBatchResult;
import android.app.appsearch.BatchResultCallback;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajl implements BatchResultCallback {
    private final kop a;
    private final Function b;

    public ajl(kop kopVar, Function function) {
        this.a = kopVar;
        lcg.i(function);
        this.b = function;
    }

    public static ajl a(kop kopVar) {
        return new ajl(kopVar, Function$CC.identity());
    }

    public final void onResult(AppSearchBatchResult appSearchBatchResult) {
        lcg.i(appSearchBatchResult);
        aes aesVar = new aes();
        Function function = this.b;
        for (Map.Entry entry : appSearchBatchResult.getSuccesses().entrySet()) {
            try {
                Object objApply = function.apply(entry.getValue());
                Object key = entry.getKey();
                lcg.i(key);
                aesVar.a();
                aesVar.b(key, new aew(0, objApply, null));
            } catch (Throwable th) {
                aesVar.b(entry.getKey(), aew.a(th));
            }
        }
        for (Map.Entry entry2 : appSearchBatchResult.getFailures().entrySet()) {
            Object key2 = entry2.getKey();
            int resultCode = aib$$ExternalSyntheticApiModelOutline0.m84m(entry2.getValue()).getResultCode();
            String errorMessage = aib$$ExternalSyntheticApiModelOutline0.m84m(entry2.getValue()).getErrorMessage();
            lcg.i(key2);
            aesVar.a();
            aesVar.b(key2, new aew(resultCode, null, errorMessage));
        }
        aesVar.d = true;
        this.a.g(new aet(aesVar.a, aesVar.b, aesVar.c));
    }

    public final void onSystemError(Throwable th) {
        this.a.h(th);
    }
}
