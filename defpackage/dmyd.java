package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyd implements hnx {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;

    public dmyd(hox hoxVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = hoxVar2;
    }

    @Override // defpackage.hnx
    public final void a() {
        ekrd ekrdVar = (ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$lambda$34$lambda$33$$inlined$onDispose$1", "dispose", 209, "EmbeddedGallery.kt");
        hox hoxVar = this.a;
        ekrdVar.t("Closing during disposition photo picker session %s", dmyf.c(hoxVar));
        EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(hoxVar);
        if (embeddedPhotoPickerSessionC != null) {
            dmyf.k(embeddedPhotoPickerSessionC);
        }
        dmyf.g(hoxVar, null);
        dmyf.h(this.b, false);
    }
}
