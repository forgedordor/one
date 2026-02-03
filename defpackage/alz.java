package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alz extends CameraCaptureSession.CaptureCallback {
    final Set a = new HashSet();
    private final Executor b;

    public alz(Executor executor) {
        this.b = executor;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.b.execute(new Runnable() { // from class: aly
            @Override // java.lang.Runnable
            public final void run() {
                HashSet hashSet = new HashSet();
                Set<ama> set = this.a.a;
                for (ama amaVar : set) {
                    TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
                    if (amaVar.a(totalCaptureResult2)) {
                        hashSet.add(amaVar);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                set.removeAll(hashSet);
            }
        });
    }
}
