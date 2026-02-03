package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbl {
    public final Context a;
    public final eosc b;
    public final ListenableFuture c;

    public dtbl(Context context, eosc eoscVar) {
        this.a = context;
        this.b = eoscVar;
        ListenableFuture listenableFutureSubmit = eoscVar.submit(new Callable() { // from class: dtbi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            }
        });
        listenableFutureSubmit.getClass();
        this.c = listenableFutureSubmit;
    }

    public final ListenableFuture a() {
        final fdap fdapVar = new fdap() { // from class: dtbg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("zb", "");
                return string == null ? "" : string;
            }
        };
        return eooq.f(this.c, new ejvr() { // from class: dtbh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.b);
    }
}
