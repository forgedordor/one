package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpq implements bba {
    final /* synthetic */ dmpw a;
    final /* synthetic */ azg b;
    final /* synthetic */ int c;
    final /* synthetic */ fdis d;

    public dmpq(dmpw dmpwVar, azg azgVar, int i, fdis fdisVar) {
        this.a = dmpwVar;
        this.b = azgVar;
        this.c = i;
        this.d = fdisVar;
    }

    @Override // defpackage.bba
    public final void a(bbg bbgVar) {
        dmpw dmpwVar = this.a;
        vun vunVar = dmpwVar.g;
        if (vunVar != null) {
            dmbx dmbxVarA = dmpwVar.a(this.b, this.c);
            doid doidVar = doid.a;
            ekrg ekrgVar = vun.a;
            ekrw ekrwVarI = ekrgVar.i();
            ekrz ekrzVar = eksq.a;
            ekrwVarI.X(ekrzVar, "BugleCamera");
            ((ekrd) ((ekrd) ekrwVarI).g(bbgVar).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/camera/BugleCameraGalleryInteractionListener", "onCameraCaptureFailedWithoutStart", 63, "BugleCameraGalleryInteractionListener.kt")).q("Camera capture failed");
            if (fdbq.f(dmbxVarA, dmbz.a)) {
                if (fdbq.f(doidVar, doidVar)) {
                    ((ains) vunVar.b.b()).c("Bugle.Compose.Gallery.Camera.System.Photo.CaptureFailed.Count");
                } else if (fdbq.f(doidVar, doie.a)) {
                    ((ains) vunVar.b.b()).c("Bugle.Compose.Gallery.Camera.System.Video.CaptureFailed.Count");
                } else {
                    ekrw ekrwVarH = ekrgVar.h();
                    ekrwVarH.X(ekrzVar, "BugleCamera");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/camera/BugleCameraGalleryInteractionListener", "onCameraCaptureFailedWithoutStart", 70, "BugleCameraGalleryInteractionListener.kt")).t("Unexpected media type: %s", doidVar);
                }
            } else if (dmbxVarA.a == dmbu.a) {
                ((ains) vunVar.b.b()).c("Bugle.Compose.Gallery.Camera.InApp.Mini.Photo.CaptureFailed.Count");
            }
        }
        this.d.w(fctl.a(bbgVar));
    }

    @Override // defpackage.bba
    public final void b(bbc bbcVar) {
        this.d.w(bbcVar);
    }
}
