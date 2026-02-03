package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqb extends bhr {
    public final CameraCaptureSession.CaptureCallback a;

    public aqb(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
