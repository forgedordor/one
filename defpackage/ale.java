package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ale extends ayh {
    public static final bjo a = new bhd("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final bjo b = new bhd("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final bjo c = new bhd("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final bjo d = new bhd("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final bjo e = new bhd("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final bjo f;

    static {
        new bhd("camera2.captureRequest.tag", Object.class, null);
        f = new bhd("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }

    public ale(bjq bjqVar) {
        super(bjqVar);
    }

    public static bjo d(CaptureRequest.Key key) {
        return new bhd("camera2.captureRequest.option.".concat(String.valueOf(key.getName())), Object.class, key);
    }

    public final int a(int i) {
        return ((Integer) this.g.n(a, Integer.valueOf(i))).intValue();
    }

    public final CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) this.g.n(e, captureCallback);
    }

    public final ayh c() {
        return ayg.a(this.g).b();
    }

    public final String e() {
        return (String) this.g.n(f, null);
    }
}
