package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arq extends anq {
    static final arq b = new arq();

    private arq() {
    }

    @Override // defpackage.anq, defpackage.bjk
    public final void a(bni bniVar, bjj bjjVar) {
        super.a(bniVar, bjjVar);
        if (!(bniVar instanceof bkp)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        ald aldVar = new ald();
        if (blz.g(bniVar, bkp.a)) {
            int iD = ((bkp) bniVar).D();
            if (((ImageCapturePixelHDRPlusQuirk) awv.a(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iD == 0) {
                    aldVar.d(CaptureRequest.CONTROL_ENABLE_ZSL, true);
                } else if (iD == 1) {
                    aldVar.d(CaptureRequest.CONTROL_ENABLE_ZSL, false);
                }
            }
        }
        bjjVar.f(aldVar.a());
    }
}
