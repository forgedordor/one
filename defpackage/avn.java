package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avn extends CameraManager.AvailabilityCallback {
    final CameraManager.AvailabilityCallback a;
    public final Object b = new Object();
    public boolean c = false;
    private final Executor d;

    public avn(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.d = executor;
        this.a = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: avl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.onCameraAccessPrioritiesChanged();
                    }
                });
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(final String str) {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: avk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.onCameraAvailable(str);
                    }
                });
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(final String str) {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: avm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.onCameraUnavailable(str);
                    }
                });
            }
        }
    }
}
