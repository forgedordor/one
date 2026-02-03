package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avh extends avg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avh(CameraDevice cameraDevice) {
        super(cameraDevice, null);
        lcg.i(cameraDevice);
    }

    @Override // defpackage.avg, defpackage.avj
    public final void a(aws awsVar) throws CameraAccessException, aub {
        Object objD = awsVar.a.d();
        lcg.i(objD);
        try {
            this.a.createCaptureSession(abn$$ExternalSyntheticApiModelOutline0.m24m(objD));
        } catch (CameraAccessException e) {
            throw new aub(e);
        }
    }
}
