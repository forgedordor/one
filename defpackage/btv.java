package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btv {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final bms g;
    public int h;
    public int i;
    public btu j;
    private bdp n;
    private boolean m = false;
    private final Set o = new HashSet();
    public boolean k = false;
    public final List l = new ArrayList();

    public btv(int i, int i2, bms bmsVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = bmsVar;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.j = new btu(bmsVar.d(), i2);
    }

    private final void l() {
        lcg.d(!this.m, "Consumer can only be linked once.");
        this.m = true;
    }

    public final bdp a(biu biuVar) {
        return b(biuVar, true);
    }

    public final bdp b(biu biuVar, boolean z) {
        box.b();
        f();
        bms bmsVar = this.g;
        bdp bdpVar = new bdp(bmsVar.d(), biuVar, true, bmsVar.e(), bmsVar.a(), bmsVar.b(), new Runnable() { // from class: btl
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorService scheduledExecutorServiceA = bpn.a();
                final btv btvVar = this.a;
                scheduledExecutorServiceA.execute(new Runnable() { // from class: btq
                    @Override // java.lang.Runnable
                    public final void run() {
                        btv btvVar2 = btvVar;
                        if (btvVar2.k) {
                            return;
                        }
                        btvVar2.i();
                    }
                });
            }
        });
        try {
            final bjz bjzVar = bdpVar.j;
            btu btuVar = this.j;
            btuVar.getClass();
            if (btuVar.i(bjzVar, new btm(btuVar))) {
                ListenableFuture listenableFutureC = btuVar.c();
                bjzVar.getClass();
                listenableFutureC.b(new Runnable() { // from class: btn
                    @Override // java.lang.Runnable
                    public final void run() {
                        bjzVar.d();
                    }
                }, bpc.a());
            }
            this.n = bdpVar;
            j();
            return bdpVar;
        } catch (bjx e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            bdpVar.f();
            throw e2;
        }
    }

    public final bjz c() {
        box.b();
        f();
        l();
        return this.j;
    }

    public final ListenableFuture d(final int i, final bcs bcsVar, bcs bcsVar2) {
        box.b();
        f();
        l();
        final btu btuVar = this.j;
        final bcs bcsVar3 = null;
        return bqk.g(btuVar.b(), new bpr(btuVar, i, bcsVar, bcsVar3) { // from class: btk
            public final /* synthetic */ btu b;
            public final /* synthetic */ int c;
            public final /* synthetic */ bcs d;
            public final /* synthetic */ bcs e = null;

            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                Surface surface = (Surface) obj;
                lcg.i(surface);
                final btu btuVar2 = this.b;
                try {
                    btuVar2.f();
                    bty btyVar = new bty(surface, this.c, this.a.g.d(), this.d, null);
                    ListenableFuture listenableFuture = btyVar.a;
                    btuVar2.getClass();
                    listenableFuture.b(new Runnable() { // from class: btp
                        @Override // java.lang.Runnable
                        public final void run() {
                            btuVar2.e();
                        }
                    }, bpc.a());
                    lcg.d(btuVar2.q == null, "Consumer can only be linked once.");
                    btuVar2.q = btyVar;
                    return bqk.b(btyVar);
                } catch (bjx e) {
                    return new bql(e);
                }
            }
        }, bpn.a());
    }

    public final void e(Runnable runnable) {
        box.b();
        f();
        this.o.add(runnable);
    }

    public final void f() {
        lcg.d(!this.k, "Edge is already closed.");
    }

    public final void g() {
        box.b();
        this.j.d();
        this.k = true;
    }

    public final void h() {
        box.b();
        f();
        this.j.d();
    }

    public final void i() {
        box.b();
        f();
        btu btuVar = this.j;
        box.b();
        if (btuVar.p != null || btuVar.h()) {
            this.m = false;
            this.j.d();
            bms bmsVar = this.g;
            this.j = new btu(bmsVar.d(), this.a);
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public final void j() {
        final bdo bdoVar;
        Executor executor;
        box.b();
        final ayu ayuVar = new ayu(this.d, this.i, this.h, this.c, this.b, this.e);
        bdp bdpVar = this.n;
        if (bdpVar != null) {
            synchronized (bdpVar.b) {
                bdpVar.k = ayuVar;
                bdoVar = bdpVar.l;
                executor = bdpVar.m;
            }
            if (bdoVar != null && executor != null) {
                executor.execute(new Runnable() { // from class: bcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        Range range = bdp.a;
                        bdoVar.a(ayuVar);
                    }
                });
            }
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(ayuVar);
        }
    }

    public final void k(final int i, final int i2) {
        box.c(new Runnable() { // from class: bto
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                btv btvVar = this.a;
                int i3 = btvVar.i;
                int i4 = i;
                if (i3 != i4) {
                    btvVar.i = i4;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = i2;
                if (btvVar.h != i5) {
                    btvVar.h = i5;
                } else if (!z) {
                    return;
                }
                btvVar.j();
            }
        });
    }
}
