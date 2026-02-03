package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pfn {
    private final pex a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final fctc c = fctd.a(new fdae() { // from class: pfm
        @Override // defpackage.fdae
        public final Object invoke() {
            return this.a.e();
        }
    });

    public pfn(pex pexVar) {
        this.a = pexVar;
    }

    private final pkl a() {
        return (pkl) this.c.a();
    }

    protected abstract String c();

    public final pkl d() {
        this.a.l();
        return this.b.compareAndSet(false, true) ? a() : e();
    }

    public final pkl e() {
        pex pexVar = this.a;
        pexVar.l();
        pexVar.m();
        return pexVar.e().b().k(c());
    }

    public final void f(pkl pklVar) {
        pklVar.getClass();
        if (pklVar == a()) {
            this.b.set(false);
        }
    }
}
