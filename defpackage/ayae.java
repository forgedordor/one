package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayae implements fdae {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ aybe b;
    final /* synthetic */ fdci c;
    final /* synthetic */ int d;

    public ayae(AtomicBoolean atomicBoolean, aybe aybeVar, fdci fdciVar, int i) {
        this.a = atomicBoolean;
        this.b = aybeVar;
        this.c = fdciVar;
        this.d = i;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.set(true);
        return ((cnqt) this.b.F.b()).f((alqm) this.c.a, this.d);
    }
}
