package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbk {
    public final dyws a;
    public final String b;
    public final int c;
    private final dyyv d;

    public dzbk(dyyv dyyvVar, int i, dyws dywsVar, String str) {
        this.d = dyyvVar;
        this.a = dywsVar;
        this.c = i;
        this.b = str;
    }

    public final ListenableFuture a(boolean z, String str, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        ListenableFuture listenableFutureF = z ? this.d.f(str, i) : this.d.g(str, i);
        eika.l(listenableFutureF, new dzbj(this, i, z, epochMilli), eoqg.a);
        return listenableFutureF;
    }
}
