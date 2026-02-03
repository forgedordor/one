package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coss implements Callable {
    final /* synthetic */ aubq a;
    final /* synthetic */ cosv b;

    public coss(cosv cosvVar, aubq aubqVar) {
        this.a = aubqVar;
        this.b = cosvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((bbca) this.b.f.b()).c(this.a.d);
    }
}
