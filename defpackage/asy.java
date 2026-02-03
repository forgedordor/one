package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asy extends asv {
    public final Object m;
    public List n;
    ListenableFuture o;
    public final axn p;
    public final axp q;
    private final ScheduledExecutorService r;
    private final axd s;
    private final axc t;
    private final AtomicBoolean u;

    public asy(bly blyVar, bly blyVar2, aqq aqqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(aqqVar, executor, scheduledExecutorService, handler);
        this.m = new Object();
        this.u = new AtomicBoolean(false);
        this.s = new axd(blyVar, blyVar2);
        this.p = new axn(blyVar.d(CaptureSessionStuckQuirk.class) || blyVar.d(IncorrectCaptureStateQuirk.class));
        this.t = new axc(blyVar2);
        this.q = new axp(blyVar2);
        this.r = scheduledExecutorService;
    }

    @Override // defpackage.asv, defpackage.asm
    public final void b(asn asnVar) {
        asn asnVar2;
        asn asnVar3;
        w("Session onConfigured()");
        axc axcVar = this.t;
        aqq aqqVar = this.b;
        List listB = aqqVar.b();
        List listA = aqqVar.a();
        if (axcVar.a()) {
            LinkedHashSet<asn> linkedHashSet = new LinkedHashSet();
            Iterator it = listB.iterator();
            while (it.hasNext() && (asnVar3 = (asn) it.next()) != asnVar) {
                linkedHashSet.add(asnVar3);
            }
            for (asn asnVar4 : linkedHashSet) {
                asnVar4.k().a(asnVar4);
            }
        }
        super.b(asnVar);
        if (axcVar.a()) {
            LinkedHashSet<asn> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = listA.iterator();
            while (it2.hasNext() && (asnVar2 = (asn) it2.next()) != asnVar) {
                linkedHashSet2.add(asnVar2);
            }
            for (asn asnVar5 : linkedHashSet2) {
                asnVar5.k().h(asnVar5);
            }
        }
    }

    @Override // defpackage.asv, defpackage.ask
    public final boolean e() {
        boolean z;
        synchronized (this.m) {
            if (v()) {
                this.s.a(this.n);
            } else {
                ListenableFuture listenableFuture = this.o;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            ListenableFuture listenableFuture2 = null;
            try {
                synchronized (this.a) {
                    if (!this.l) {
                        ListenableFuture listenableFuture3 = this.j;
                        if (listenableFuture3 != null) {
                            listenableFuture2 = listenableFuture3;
                        }
                        this.l = true;
                    }
                    z = !v();
                }
            } finally {
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(true);
                }
            }
        }
        return z;
    }

    @Override // defpackage.asv, defpackage.asm
    public final void h(asn asnVar) {
        synchronized (this.m) {
            this.s.a(this.n);
        }
        w("onClosed()");
        super.h(asnVar);
    }

    @Override // defpackage.asv, defpackage.asn
    public final ListenableFuture m() {
        return bqk.c(1500L, this.r, this.p.b());
    }

    @Override // defpackage.asv, defpackage.asn
    public final void o() throws CameraAccessException {
        if (!this.u.compareAndSet(false, true)) {
            w("close() has been called. Skip this invocation.");
            return;
        }
        if (this.q.a) {
            try {
                w("Call abortCaptures() before closing session.");
                lcg.j(this.g, "Need to call openCaptureSession before using this API.");
                this.g.a().abortCaptures();
            } catch (Exception e) {
                e.toString();
                w("Exception when calling abortCaptures()".concat(e.toString()));
            }
        }
        w("Session call close()");
        this.p.b().b(new Runnable() { // from class: asw
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x();
            }
        }, this.d);
    }

    @Override // defpackage.asv, defpackage.asn
    public final void p() {
        u();
        this.p.c();
    }

    @Override // defpackage.asv, defpackage.asn
    public final void q(int i) {
        if (i == 5) {
            synchronized (this.m) {
                if (v() && this.n != null) {
                    w("Close DeferrableSurfaces for CameraDevice error.");
                    Iterator it = this.n.iterator();
                    while (it.hasNext()) {
                        ((bjz) it.next()).d();
                    }
                }
            }
        }
    }

    @Override // defpackage.asv, defpackage.asn
    public final void s(List list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.p.a(captureCallback);
        lcg.j(this.g, "Need to call openCaptureSession before using this API.");
        this.g.a.b(list, this.d, captureCallbackA);
    }

    final void w(String str) {
        bbs.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    final /* synthetic */ void x() {
        w("Session call super.close()");
        super.o();
    }
}
