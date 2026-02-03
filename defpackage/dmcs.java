package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmcs implements fdpm, fdbl {
    final /* synthetic */ dmdo a;

    public dmcs(dmdo dmdoVar) {
        this.a = dmdoVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, dmdo.class, "onCaptureEvent", "onCaptureEvent(Lcom/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManager$CaptureEvent;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        dmdo dmdoVar = this.a;
        dmlx dmlxVar = (dmlx) obj;
        fduf fdufVar = dmdoVar.g;
        if (fdbq.f(fdufVar.c(), dmcf.a)) {
            if (dmlxVar instanceof dmlw) {
                fdil.d(dmdoVar.c, null, null, new dmcl(dmdoVar, dmlxVar, null), 3);
            }
        } else if (dmlxVar instanceof dmlu) {
            xfy xfyVar = dmdoVar.l;
            if (xfyVar != null) {
                ((ains) xfyVar.a.b()).c("Bugle.SelfieGif.Recording.Started.Count");
            }
            fdil.d(dmdoVar.b, null, null, new dmcm(dmdoVar, null), 3);
            dmdoVar.j(100L, BasePaymentResult.ERROR_REQUEST_FAILED);
            fdufVar.f(dmci.a);
        } else if (dmlxVar instanceof dmlv) {
            fdil.d(dmdoVar.b, null, null, new dmcn(dmdoVar, null), 3);
            dmdoVar.j(25L, 125);
            dmdoVar.h();
        } else if (dmlxVar instanceof dmls) {
            dmdoVar.l(0);
        } else if (dmlxVar instanceof dmlw) {
            dojw dojwVar = ((dmlw) dmlxVar).a;
            if (!(dojwVar instanceof dojr)) {
                ((ekrd) dmdo.a.j().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "onCapture", 277, "PopupCameraController.kt")).t("Captured invalid media %s from PopupCamera", dojwVar);
                dmdoVar.l(0);
            } else if (dmdoVar.k) {
                dmdoVar.d.f(dojwVar);
                xfy xfyVar2 = dmdoVar.l;
                if (xfyVar2 != null) {
                    xfyVar2.a();
                }
                dmdoVar.j = null;
                dmdoVar.g();
            } else {
                dmdoVar.j = dojwVar;
                fdufVar.f(new dmcg((dojr) dojwVar));
            }
        } else {
            if (!(dmlxVar instanceof dmlt)) {
                throw new fctg();
            }
            ((ekrd) ((ekrd) dmdo.a.j()).g(((dmlt) dmlxVar).a).h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "onCaptureEvent", 259, "PopupCameraController.kt")).q("Camera capture failed.");
            dmdoVar.l(0);
        }
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
