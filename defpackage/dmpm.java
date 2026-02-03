package defpackage;

import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpm implements adf {
    final /* synthetic */ dmpn a;

    public dmpm(dmpn dmpnVar) {
        this.a = dmpnVar;
    }

    @Override // defpackage.adf
    public final void a() {
        dmpn dmpnVar = this.a;
        if (dmpnVar.u) {
            return;
        }
        dmpnVar.u = true;
        Object objBb = dmpnVar.bb();
        CameraActivity cameraActivity = (CameraActivity) dmpnVar;
        ahhk ahhkVar = (ahhk) objBb;
        cameraActivity.o = (eg) ahhkVar.g.b();
        cameraActivity.p = (dnhb) ahhkVar.bi.b();
        cameraActivity.q = (fdjx) ahhkVar.N.b();
        cameraActivity.r = Optional.of((dmpl) ahhkVar.bj.b());
    }
}
