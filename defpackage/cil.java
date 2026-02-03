package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cil {
    public final /* synthetic */ cim a;
    public final /* synthetic */ cif b;
    public final /* synthetic */ biu c;

    public /* synthetic */ cil(cim cimVar, cif cifVar, biu biuVar) {
        this.a = cimVar;
        this.b = cifVar;
        this.c = biuVar;
    }

    public final void a() {
        cif cifVar;
        while (true) {
            cim cimVar = this.a;
            cifVar = this.b;
            AtomicReference atomicReference = cimVar.a.f;
            if (atomicReference.compareAndSet(cifVar, null)) {
                cifVar.d(ciq.IDLE);
                break;
            } else if (atomicReference.get() != cifVar) {
                break;
            }
        }
        biu biuVar = this.c;
        cifVar.c();
        biuVar.g().d(cifVar);
    }
}
