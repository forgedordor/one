package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bjz {
    public final Object e;
    public int f;
    public boolean g;
    public kog h;
    public final ListenableFuture i;
    public kog j;
    public final ListenableFuture k;
    public final Size l;
    public final int m;
    public Class n;
    public static final Size b = new Size(0, 0);
    private static final boolean a = bbs.h("DeferrableSurface");
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final AtomicInteger d = new AtomicInteger(0);

    public bjz() {
        this(b, 0);
    }

    protected abstract ListenableFuture a();

    public final ListenableFuture b() {
        synchronized (this.e) {
            if (this.g) {
                return new bql(new bjx("DeferrableSurface already closed.", this));
            }
            return a();
        }
    }

    public final ListenableFuture c() {
        return bqk.d(this.i);
    }

    public void d() {
        kog kogVar;
        synchronized (this.e) {
            if (this.g) {
                kogVar = null;
            } else {
                this.g = true;
                this.j.b(null);
                if (this.f == 0) {
                    kogVar = this.h;
                    this.h = null;
                } else {
                    kogVar = null;
                }
                if (bbs.h("DeferrableSurface")) {
                    bbs.a("DeferrableSurface", "surface closed,  useCount=" + this.f + " closed=true " + this);
                }
            }
        }
        if (kogVar != null) {
            kogVar.b(null);
        }
    }

    public final void e() {
        kog kogVar;
        synchronized (this.e) {
            int i = this.f;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.f = i2;
            if (i2 == 0 && this.g) {
                kogVar = this.h;
                this.h = null;
            } else {
                kogVar = null;
            }
            if (bbs.h("DeferrableSurface")) {
                bbs.a("DeferrableSurface", "use count-1,  useCount=" + this.f + " closed=" + this.g + " " + this);
                if (this.f == 0) {
                    g("Surface no longer in use", d.get(), c.decrementAndGet());
                }
            }
        }
        if (kogVar != null) {
            kogVar.b(null);
        }
    }

    public final void f() {
        synchronized (this.e) {
            int i = this.f;
            if (i == 0) {
                if (this.g) {
                    throw new bjx("Cannot begin use on a closed surface.", this);
                }
                i = 0;
            }
            this.f = i + 1;
            if (bbs.h("DeferrableSurface")) {
                if (this.f == 1) {
                    g("New surface in use", d.get(), c.incrementAndGet());
                }
                bbs.a("DeferrableSurface", "use count+1, useCount=" + this.f + " " + this);
            }
        }
    }

    public final void g(String str, int i, int i2) {
        if (!a && bbs.h("DeferrableSurface")) {
            bbs.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        bbs.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final boolean h() {
        boolean z;
        synchronized (this.e) {
            z = this.g;
        }
        return z;
    }

    public bjz(Size size, int i) {
        this.e = new Object();
        this.f = 0;
        this.g = false;
        this.l = size;
        this.m = i;
        ListenableFuture listenableFutureA = kol.a(new koi() { // from class: bju
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                bjz bjzVar = this.a;
                synchronized (bjzVar.e) {
                    bjzVar.h = kogVar;
                }
                return a.h(bjzVar, "DeferrableSurface-termination(", ")");
            }
        });
        this.i = listenableFutureA;
        this.k = kol.a(new koi() { // from class: bjv
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                bjz bjzVar = this.a;
                synchronized (bjzVar.e) {
                    bjzVar.j = kogVar;
                }
                return a.h(bjzVar, "DeferrableSurface-close(", ")");
            }
        });
        if (bbs.h("DeferrableSurface")) {
            g("Surface created", d.incrementAndGet(), c.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            listenableFutureA.b(new Runnable() { // from class: bjw
                @Override // java.lang.Runnable
                public final void run() {
                    bjz bjzVar = this.a;
                    try {
                        bjzVar.i.get();
                        bjzVar.g("Surface terminated", bjz.d.decrementAndGet(), bjz.c.get());
                    } catch (Exception e) {
                        bbs.c("DeferrableSurface", "Unexpected surface termination for " + bjzVar + "\nStack Trace:\n" + stackTraceString);
                        synchronized (bjzVar.e) {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", bjzVar, Boolean.valueOf(bjzVar.g), Integer.valueOf(bjzVar.f)), e);
                        }
                    }
                }
            }, bpc.a());
        }
    }
}
