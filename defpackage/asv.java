package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
class asv extends asm implements asn, ask {
    final aqq b;
    final Handler c;
    final Executor d;
    public final ScheduledExecutorService e;
    asm f;
    aus g;
    ListenableFuture h;
    kog i;
    public ListenableFuture j;
    final Object a = new Object();
    public List k = null;
    private boolean m = false;
    public boolean l = false;
    private boolean n = false;

    public asv(aqq aqqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = aqqVar;
        this.c = handler;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    @Override // defpackage.asm
    public final void a(asn asnVar) {
        this.f.getClass();
        p();
        this.b.e(this);
        this.f.a(asnVar);
    }

    @Override // defpackage.asm
    public void b(asn asnVar) {
        this.f.getClass();
        aqq aqqVar = this.b;
        synchronized (aqqVar.b) {
            aqqVar.c.add(this);
            aqqVar.e.remove(this);
        }
        aqqVar.d(this);
        this.f.b(asnVar);
    }

    @Override // defpackage.asm
    public final void c(asn asnVar) {
        asm asmVar = this.f;
        asmVar.getClass();
        asmVar.c(asnVar);
    }

    @Override // defpackage.asm
    public final void d(final asn asnVar) {
        ListenableFuture listenableFuture;
        synchronized (this.a) {
            if (this.n) {
                listenableFuture = null;
            } else {
                this.n = true;
                lcg.j(this.h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.h;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.b(new Runnable() { // from class: aso
                @Override // java.lang.Runnable
                public final void run() {
                    asm asmVar = this.a.f;
                    asmVar.getClass();
                    asmVar.d(asnVar);
                }
            }, bpc.a());
        }
    }

    @Override // defpackage.ask
    public boolean e() {
        throw null;
    }

    @Override // defpackage.asm
    public final void f(asn asnVar) {
        asm asmVar = this.f;
        asmVar.getClass();
        asmVar.f(asnVar);
    }

    @Override // defpackage.asm
    public final void g(asn asnVar) {
        asm asmVar = this.f;
        asmVar.getClass();
        asmVar.g(asnVar);
    }

    @Override // defpackage.asm
    public void h(final asn asnVar) {
        ListenableFuture listenableFuture;
        synchronized (this.a) {
            if (this.m) {
                listenableFuture = null;
            } else {
                this.m = true;
                lcg.j(this.h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.h;
            }
        }
        p();
        if (listenableFuture != null) {
            listenableFuture.b(new Runnable() { // from class: asq
                @Override // java.lang.Runnable
                public final void run() {
                    asv asvVar = this.a;
                    aqq aqqVar = asvVar.b;
                    synchronized (aqqVar.b) {
                        aqqVar.c.remove(asvVar);
                        aqqVar.d.remove(asvVar);
                    }
                    asn asnVar2 = asnVar;
                    asvVar.d(asnVar2);
                    if (asvVar.g == null) {
                        bbs.f("SyncCaptureSessionBase", a.h(asvVar, "[", "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured."));
                        return;
                    }
                    asm asmVar = asvVar.f;
                    asmVar.getClass();
                    asmVar.h(asnVar2);
                }
            }, bpc.a());
        }
    }

    @Override // defpackage.asm
    public final void i(asn asnVar, Surface surface) {
        asm asmVar = this.f;
        asmVar.getClass();
        asmVar.i(asnVar, surface);
    }

    @Override // defpackage.asn
    public final CameraDevice j() {
        lcg.i(this.g);
        return this.g.a().getDevice();
    }

    @Override // defpackage.asn
    public final aus l() {
        lcg.i(this.g);
        return this.g;
    }

    @Override // defpackage.asn
    public ListenableFuture m() {
        return bqk.b(null);
    }

    @Override // defpackage.asn
    public final List n(CaptureRequest captureRequest) {
        aus ausVar = this.g;
        lcg.i(ausVar);
        CameraCaptureSession cameraCaptureSessionA = ausVar.a();
        return cameraCaptureSessionA instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionA).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.asn
    public void o() {
        lcg.j(this.g, "Need to call openCaptureSession before using this API.");
        aqq aqqVar = this.b;
        synchronized (aqqVar.b) {
            aqqVar.d.add(this);
        }
        this.g.a().close();
        this.d.execute(new Runnable() { // from class: asp
            @Override // java.lang.Runnable
            public final void run() {
                asv asvVar = this.a;
                asvVar.d(asvVar);
            }
        });
    }

    @Override // defpackage.asn
    public void p() {
        u();
    }

    @Override // defpackage.asn
    public final void r() throws CameraAccessException {
        lcg.j(this.g, "Need to call openCaptureSession before using this API.");
        this.g.a().stopRepeating();
    }

    @Override // defpackage.asn
    public void s(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        throw null;
    }

    final void t(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new aus(cameraCaptureSession, this.c);
        }
    }

    final void u() {
        synchronized (this.a) {
            List list = this.k;
            if (list != null) {
                bkd.a(list);
                this.k = null;
            }
        }
    }

    final boolean v() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    @Override // defpackage.asn
    public final asm k() {
        return this;
    }

    @Override // defpackage.asn
    public void q(int i) {
    }
}
