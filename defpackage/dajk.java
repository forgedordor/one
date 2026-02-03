package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajk extends wi {
    public lcf d;
    public int e;
    private final fcsu f;
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private boolean i = true;

    public dajk(fcsu fcsuVar) {
        this.f = fcsuVar;
    }

    @Override // defpackage.wi
    public final wv b(int i) {
        this.d.getClass();
        if (this.i) {
            ((adaw) this.f.b()).a(adaw.c);
            this.i = false;
        }
        if (this.e == i) {
            wv wvVar = (wv) this.d.a();
            if (wvVar != null) {
                this.g.incrementAndGet();
                return wvVar;
            }
            this.h.incrementAndGet();
        }
        return super.b(i);
    }

    @Override // defpackage.wi
    public final void e(wv wvVar) {
        lcf lcfVar = this.d;
        lcfVar.getClass();
        if (this.e == wvVar.f && lcfVar.b(wvVar)) {
            return;
        }
        super.e(wvVar);
    }
}
