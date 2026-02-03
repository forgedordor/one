package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface asn {
    CameraDevice j();

    asm k();

    aus l();

    ListenableFuture m();

    List n(CaptureRequest captureRequest);

    void o();

    void p();

    void q(int i);

    void r();

    void s(List list, CameraCaptureSession.CaptureCallback captureCallback);
}
