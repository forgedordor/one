package defpackage;

import android.os.IBinder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyb implements View.OnAttachStateChangeListener {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;
    final /* synthetic */ hox d;

    public dmyb(SurfaceView surfaceView, hox hoxVar, hox hoxVar2, hox hoxVar3) {
        this.a = surfaceView;
        this.b = hoxVar;
        this.c = hoxVar2;
        this.d = hoxVar3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ekrd ekrdVar = (ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$7$1$1$1", "onViewAttachedToWindow", 177, "EmbeddedGallery.kt");
        SurfaceView surfaceView = this.a;
        IBinder hostToken = surfaceView.getHostToken();
        hox hoxVar = this.b;
        ekrdVar.I("Attached surface to window (token %s - was %s): %s", hostToken, dmyf.b(hoxVar), view);
        if (dmyf.b(hoxVar) == null) {
            dmyf.j(hoxVar, surfaceView.getHostToken());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        ((ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$7$1$1$1", "onViewDetachedFromWindow", 190, "EmbeddedGallery.kt")).t("Detached surface from window: %s", view);
        hox hoxVar = this.c;
        EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(hoxVar);
        if (embeddedPhotoPickerSessionC != null) {
            dmyf.k(embeddedPhotoPickerSessionC);
        }
        dmyf.i(this.d, 0L);
        dmyf.g(hoxVar, null);
        dmyf.j(this.b, null);
    }
}
