package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aur extends CameraCaptureSession.StateCallback {
    final CameraCaptureSession.StateCallback a;
    private final Executor b;

    public aur(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.b = executor;
        this.a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: auk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onActive(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aun
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onCaptureQueueEmpty(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aul
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onClosed(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: auq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onConfigureFailed(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: auo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onConfigured(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aup
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onReady(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
        this.b.execute(new Runnable() { // from class: aum
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onSurfacePrepared(cameraCaptureSession, surface);
            }
        });
    }
}
