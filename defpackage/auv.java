package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class auv {
    final CameraCaptureSession a;
    final Object b;

    public auv(CameraCaptureSession cameraCaptureSession, Object obj) {
        lcg.i(cameraCaptureSession);
        this.a = cameraCaptureSession;
        this.b = obj;
    }

    public void a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.setRepeatingBurst(list, new auj(executor, captureCallback), ((auu) this.b).a);
    }

    public void b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.captureBurst(list, new auj(executor, captureCallback), ((auu) this.b).a);
    }

    public void c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.setRepeatingRequest(captureRequest, new auj(executor, captureCallback), ((auu) this.b).a);
    }
}
