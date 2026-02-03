package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbn {
    public final dyyv a;
    public final dyws b;
    public final String c;
    public final int d;

    public dzbn(dyyv dyyvVar, int i, dyws dywsVar, String str) {
        this.a = dyyvVar;
        this.b = dywsVar;
        this.d = i;
        this.c = str;
    }

    public final ListenableFuture a(boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        ListenableFuture listenableFutureA = z ? this.a.a() : this.a.c();
        eika.l(listenableFutureA, new dzbl(this, z, epochMilli), eoqg.a);
        return listenableFutureA;
    }
}
