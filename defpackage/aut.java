package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aut extends auv {
    public aut(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // defpackage.auv
    public final void a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // defpackage.auv
    public final void b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // defpackage.auv
    public final void c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        this.a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
