package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnd implements lun {
    final /* synthetic */ dmng a;
    private bdv b;

    public dmnd(dmng dmngVar) {
        this.a = dmngVar;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        this.b = (bdv) this.a.m.c();
        ekrd ekrdVar = (ekrd) dmng.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl$stateRestorer$1", "onPause", 147, "CameraManagerImpl.kt");
        bdv bdvVar = this.b;
        ekrdVar.t("Camera pausing, saving zoom ratio %.2f", bdvVar != null ? Float.valueOf(bdvVar.c()) : null);
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        bdv bdvVar = this.b;
        Float fValueOf = bdvVar != null ? Float.valueOf(bdvVar.c()) : null;
        if (fValueOf != null) {
            ((ekrd) dmng.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl$stateRestorer$1", "onResume", 140, "CameraManagerImpl.kt")).t("Camera resumed, restoring zoom ratio %.2f", fValueOf);
            this.a.o(fValueOf.floatValue());
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
