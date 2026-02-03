package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucf implements ehwh {
    public final fcsu a;
    public final Context b;
    public final eksp c;
    private final fdjx d;

    /* compiled from: PG */
    public interface a {
        ucm d();
    }

    public ucf(fcsu fcsuVar, fdjx fdjxVar, Context context) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        this.a = fcsuVar;
        this.d = fdjxVar;
        this.b = context;
        this.c = eksp.c("BugleCms");
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ucg(this, null));
    }
}
