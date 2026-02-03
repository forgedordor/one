package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czao extends cyvb {
    private boolean K = false;

    public czao() {
        x(new czan(this));
    }

    @Override // defpackage.cyve, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        CameraActivity cameraActivity = (CameraActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        eyik eyikVar = ahknVar.cD;
        cameraActivity.s = (cogw) eyikVar.b();
        cameraActivity.t = (cukm) ahhkVar.f.b();
        cameraActivity.u = ahhkVar.h;
        cameraActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        cameraActivity.w = (cpch) ahnhVar.qj.b();
        cameraActivity.x = ahhkVar.i;
        cameraActivity.A = ahnhVar.Wy;
        cameraActivity.B = ahnhVar.wF;
        cameraActivity.C = ahknVar.da;
        cameraActivity.D = ahhkVar.k;
        cameraActivity.E = (eigp) ahknVar.aI.b();
        cameraActivity.F = ahhkVar.f;
        cameraActivity.G = ahknVar.b.mW;
        cameraActivity.J = (cogw) eyikVar.b();
    }
}
