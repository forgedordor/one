package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbzi implements fbzl, fchn {
    private boolean D;
    private final int E;
    public fcbg o;
    public final Object p = new Object();
    public final fcmu q;
    public final fchq r;
    public int s;
    public boolean t;

    protected fbzi(int i, fcmm fcmmVar, fcmu fcmuVar) {
        this.q = fcmuVar;
        fchq fchqVar = new fchq(this, fbnp.a, i, fcmmVar, fcmuVar);
        this.r = fchqVar;
        this.o = fchqVar;
        this.E = 32768;
    }

    private final void c() {
        boolean zN;
        synchronized (this.p) {
            zN = n();
            if (!zN) {
                Logger logger = fbzj.t;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.D), Integer.valueOf(this.s), Integer.valueOf(this.E), Boolean.valueOf(this.t)});
                }
            }
        }
        if (zN) {
            g().e();
        }
    }

    protected void d() {
        ejwl.l(g() != null);
        synchronized (this.p) {
            ejwl.m(!this.D, "Already allocated");
            this.D = true;
        }
        c();
    }

    protected abstract fcmp g();

    @Override // defpackage.fchn
    public final void l(fcmo fcmoVar) {
        g().d(fcmoVar);
    }

    public final void m(int i) {
        boolean z;
        synchronized (this.p) {
            ejwl.m(this.D, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.s;
            int i3 = this.E;
            int i4 = i2 - i;
            this.s = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.p) {
            z = false;
            if (this.D && this.s < this.E && !this.t) {
                z = true;
            }
        }
        return z;
    }
}
