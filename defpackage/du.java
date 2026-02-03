package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class du extends dx {
    final /* synthetic */ akv a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ adx c;
    final /* synthetic */ adi d;
    final /* synthetic */ ea e;

    public du(ea eaVar, akv akvVar, AtomicReference atomicReference, adx adxVar, adi adiVar) {
        this.e = eaVar;
        this.a = akvVar;
        this.b = atomicReference;
        this.c = adxVar;
        this.d = adiVar;
    }

    @Override // defpackage.dx
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        ea eaVar = this.e;
        sb.append(eaVar.l);
        sb.append("_rq#");
        sb.append(eaVar.ae.getAndIncrement());
        this.b.set(((adq) this.a.a(null)).c(sb.toString(), eaVar, this.c, this.d));
    }
}
