package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apq implements bmg {
    static final apq a = new apq();

    @Override // defpackage.bmg
    public final void a(Size size, bni bniVar, bmd bmdVar) {
        bml bmlVarW = bniVar.w();
        bjq bjqVarC = blo.b;
        int iB = bml.d().b();
        if (bmlVarW != null) {
            iB = bmlVarW.b();
            bmdVar.c(bmlVarW.c);
            bmdVar.e(bmlVarW.d);
            bmdVar.d(bmlVarW.e());
            bjqVarC = bmlVarW.c();
        }
        bmdVar.r(bjqVarC);
        if (bniVar instanceof blr) {
            Rational rational = axi.a;
            if (((PreviewPixelHDRnetQuirk) awv.a(PreviewPixelHDRnetQuirk.class)) != null && !axi.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                ald aldVar = new ald();
                aldVar.d(CaptureRequest.TONEMAP_MODE, 2);
                bmdVar.h(aldVar.a());
            }
        }
        ale aleVar = new ale(bniVar);
        bmdVar.t(aleVar.a(iB));
        apw apwVar = new apw();
        bjq bjqVar = aleVar.g;
        bmdVar.g((CameraDevice.StateCallback) bjqVar.n(ale.c, apwVar));
        bmdVar.l((CameraCaptureSession.StateCallback) bjqVar.n(ale.d, new apu()));
        bmdVar.f(new aqb(aleVar.b(new anp())));
        bmdVar.u(bniVar.d());
        bmdVar.s(bniVar.b());
        bli bliVarA = bli.a();
        bliVarA.c(ale.f, aleVar.e());
        bjo bjoVar = ale.b;
        Long l = (Long) bjqVar.n(bjoVar, -1L);
        l.longValue();
        bliVarA.c(bjoVar, l);
        bmdVar.h(bliVarA);
        bmdVar.h(aleVar.c());
    }
}
