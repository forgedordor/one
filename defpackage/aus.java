package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aus {
    public final auv a;

    public aus(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new aut(cameraCaptureSession);
        } else {
            this.a = new auv(cameraCaptureSession, new auu(handler));
        }
    }

    public final CameraCaptureSession a() {
        return this.a.a;
    }
}
