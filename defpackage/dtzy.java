package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzy implements ejxr {
    final /* synthetic */ Executor a;
    final /* synthetic */ dtpi b;
    final /* synthetic */ Context c;
    final /* synthetic */ ejwi d;
    final /* synthetic */ ecev e;

    public dtzy(Executor executor, dtpi dtpiVar, Context context, ejwi ejwiVar, ecev ecevVar) {
        this.a = executor;
        this.b = dtpiVar;
        this.c = context;
        this.d = ejwiVar;
        this.e = ecevVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [dxfa, java.lang.Object] */
    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        feyx feyxVar = new feyx();
        feyxVar.a(dtzz.a, TimeUnit.MILLISECONDS);
        feyxVar.b(dtzz.b, TimeUnit.MILLISECONDS);
        long j = dtzz.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        feyxVar.w = fezr.B(j, timeUnit);
        feyxVar.e = true;
        dtzx dtzxVar = new dtzx(this.a, this.b.g());
        dxff dxffVar = new dxff(new feyy(feyxVar));
        Context context = this.c;
        dxfd dxfdVar = new dxfd(dxffVar, context, dtzxVar);
        dxfdVar.h(((ejwt) this.d).a);
        return new dtzv(context, dxfdVar, dxffVar, this.e, dtzxVar);
    }
}
