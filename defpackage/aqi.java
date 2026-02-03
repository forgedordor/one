package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqi extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ aql a;

    public aqi(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            bml bmlVar = aqlVar.e;
            if (bmlVar == null) {
                return;
            }
            bjl bjlVar = bmlVar.g;
            bbs.a("CaptureSession", "Submit FLASH_MODE_OFF request");
            bjj bjjVar = new bjj();
            bjjVar.b = bjlVar.f;
            Iterator it = bjlVar.e().iterator();
            while (it.hasNext()) {
                bjjVar.g((bjz) it.next());
            }
            bjjVar.f(bjlVar.e);
            ald aldVar = new ald();
            aldVar.d(CaptureRequest.FLASH_MODE, 0);
            bjjVar.f(aldVar.a());
            aqlVar.h(Collections.singletonList(bjjVar.b()));
        }
    }
}
