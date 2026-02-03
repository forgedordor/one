package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avd extends CameraDevice.StateCallback {
    final CameraDevice.StateCallback a;
    private final Executor b;

    public avd(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.b = executor;
        this.a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: auz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onClosed(cameraDevice);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: avb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onDisconnected(cameraDevice);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        this.b.execute(new Runnable() { // from class: ava
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onError(cameraDevice, i);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: avc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onOpened(cameraDevice);
            }
        });
    }
}
