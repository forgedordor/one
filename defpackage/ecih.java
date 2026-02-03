package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecih implements eora {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ ejxm c;
    final /* synthetic */ ecik d;
    final /* synthetic */ Integer e;
    final /* synthetic */ ecil f;

    public ecih(ecil ecilVar, AtomicBoolean atomicBoolean, Set set, ejxm ejxmVar, ecik ecikVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = ejxmVar;
        this.d = ecikVar;
        this.e = num;
        this.f = ecilVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.a.get()) {
            this.b.size();
            this.c.a(ecil.a);
            return;
        }
        this.b.size();
        ecik ecikVar = this.d;
        synchronized (ecikVar.c) {
            ekhx.o(ecikVar.b);
        }
        ecil.a.convert(this.e.intValue(), this.f.g);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
