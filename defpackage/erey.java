package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erey {
    public static final erey a = new erey();
    public final AtomicReference b = new AtomicReference(new erft(new erfr()));

    public final Object a(eqsg eqsgVar, Class cls) {
        return ((erft) this.b.get()).a(eqsgVar, cls);
    }

    public final synchronized void b(erfp erfpVar) {
        AtomicReference atomicReference = this.b;
        erfr erfrVar = new erfr((erft) atomicReference.get());
        erfrVar.a(erfpVar);
        atomicReference.set(new erft(erfrVar));
    }

    public final synchronized void c(erfu erfuVar) {
        AtomicReference atomicReference = this.b;
        erfr erfrVar = new erfr((erft) atomicReference.get());
        erfrVar.b(erfuVar);
        atomicReference.set(new erft(erfrVar));
    }
}
