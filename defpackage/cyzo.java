package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzo extends abs {
    final /* synthetic */ cyzp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyzo(cyzp cyzpVar) {
        super(true);
        this.a = cyzpVar;
    }

    @Override // defpackage.abs
    public final void b() {
        cyzp cyzpVar = this.a;
        GalleryBrowserActivity galleryBrowserActivity = cyzpVar.a;
        ea eaVarH = galleryBrowserActivity.a().h("gallery_browser_fragment_tag");
        cczv cczvVar = cyzf.a;
        if (((Boolean) cczvVar.e()).booleanValue() && eaVarH != null) {
            if (!(eaVarH instanceof cyxz)) {
                throw new IllegalStateException("Unexpected full screen gallery fragment ".concat(eaVarH.toString()));
            }
            cyye cyyeVarH = ((cyxz) eaVarH).H();
            if (((Boolean) cczvVar.e()).booleanValue() && cyyeVarH.m.b()) {
                return;
            }
        }
        cyzpVar.e();
        abs absVar = cyzpVar.b;
        if (absVar != null) {
            absVar.h(false);
        }
        galleryBrowserActivity.c().d();
    }
}
