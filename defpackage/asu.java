package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asu extends CameraCaptureSession.StateCallback {
    final /* synthetic */ asv a;

    public asu(asv asvVar) {
        this.a = asvVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        asv asvVar = this.a;
        asvVar.t(cameraCaptureSession);
        asvVar.f(asvVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        asv asvVar = this.a;
        asvVar.t(cameraCaptureSession);
        asvVar.g(asvVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        asv asvVar = this.a;
        asvVar.t(cameraCaptureSession);
        asvVar.h(asvVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        kog kogVar;
        try {
            asv asvVar = this.a;
            asvVar.t(cameraCaptureSession);
            asvVar.a(asvVar);
            asv asvVar2 = this.a;
            synchronized (asvVar2.a) {
                lcg.j(asvVar2.i, "OpenCaptureSession completer should not null");
                kogVar = asvVar2.i;
                asvVar2.i = null;
            }
            kogVar.c(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            asv asvVar3 = this.a;
            synchronized (asvVar3.a) {
                lcg.j(asvVar3.i, "OpenCaptureSession completer should not null");
                kog kogVar2 = asvVar3.i;
                asvVar3.i = null;
                kogVar2.c(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        kog kogVar;
        try {
            asv asvVar = this.a;
            asvVar.t(cameraCaptureSession);
            asvVar.b(asvVar);
            asv asvVar2 = this.a;
            synchronized (asvVar2.a) {
                lcg.j(asvVar2.i, "OpenCaptureSession completer should not null");
                kogVar = asvVar2.i;
                asvVar2.i = null;
            }
            kogVar.b(null);
        } catch (Throwable th) {
            asv asvVar3 = this.a;
            synchronized (asvVar3.a) {
                lcg.j(asvVar3.i, "OpenCaptureSession completer should not null");
                kog kogVar2 = asvVar3.i;
                asvVar3.i = null;
                kogVar2.b(null);
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        asv asvVar = this.a;
        asvVar.t(cameraCaptureSession);
        asvVar.c(asvVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        asv asvVar = this.a;
        asvVar.t(cameraCaptureSession);
        asvVar.i(asvVar, surface);
    }
}
