package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atw extends CameraCaptureSession.StateCallback {
    final /* synthetic */ aty a;

    public atw(aty atyVar) {
        this.a = atyVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            aty atyVar = this.a;
            ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
            if (atyVar.b.get()) {
                if (atyVar.a != null) {
                    bbs.f("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    atyVar.a.close();
                }
                atyVar.a = imageWriterNewInstance;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }
}
