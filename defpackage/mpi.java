package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpi {
    public final niu a;
    public final long b;
    public final long c;
    public final long d;
    public final HashMap e;
    public long f;
    private final long g;
    private final long h;

    public mpi() {
        this(new niu(), 50000, 50000, 1000, 2000);
    }

    public static void b(int i, int i2, String str, String str2) {
        mee.b(i >= i2, a.q(str2, str, " cannot be less than "));
    }

    final int a() {
        Iterator it = this.e.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((mph) it.next()).b;
        }
        return i;
    }

    public final void c(mwx mwxVar) {
        if (this.e.remove(mwxVar) != null) {
            d();
        }
    }

    public final void d() {
        if (this.e.isEmpty()) {
            this.a.d();
        } else {
            this.a.e(a());
        }
    }

    public final boolean e(msb msbVar) {
        mph mphVar = (mph) this.e.get(msbVar.a);
        mee.f(mphVar);
        long jMin = this.g;
        float f = msbVar.c;
        int iA = this.a.a();
        int iA2 = a();
        if (f > 1.0f) {
            jMin = Math.min(mgb.u(jMin, f), this.h);
        }
        long j = msbVar.b;
        if (j < Math.max(jMin, 500000L)) {
            boolean z = iA < iA2;
            mphVar.a = z;
            if (!z && j < 500000) {
                mff.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.h || iA >= iA2) {
            mphVar.a = false;
        }
        return mphVar.a;
    }

    protected mpi(niu niuVar, int i, int i2, int i3, int i4) {
        b(i3, 0, "bufferForPlaybackMs", "0");
        b(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i, i3, "minBufferMs", "bufferForPlaybackMs");
        b(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(i2, i, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.a = niuVar;
        this.g = mgb.w(i);
        this.h = mgb.w(i2);
        this.b = mgb.w(i3);
        this.c = mgb.w(i4);
        this.d = mgb.w(0L);
        this.e = new HashMap();
        this.f = -1L;
    }
}
