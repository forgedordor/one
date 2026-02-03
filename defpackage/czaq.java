package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czaq extends cyvb {
    private boolean K = false;

    public czaq() {
        x(new czap(this));
    }

    @Override // defpackage.cyve, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        GalleryBrowserActivity galleryBrowserActivity = (GalleryBrowserActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        eyik eyikVar = ahknVar.cD;
        galleryBrowserActivity.s = (cogw) eyikVar.b();
        galleryBrowserActivity.t = (cukm) ahhkVar.f.b();
        galleryBrowserActivity.u = ahhkVar.h;
        galleryBrowserActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        galleryBrowserActivity.w = (cpch) ahnhVar.qj.b();
        galleryBrowserActivity.x = ahhkVar.i;
        galleryBrowserActivity.A = ahnhVar.Wy;
        galleryBrowserActivity.B = ahnhVar.wF;
        galleryBrowserActivity.C = ahknVar.da;
        galleryBrowserActivity.D = ahhkVar.k;
        galleryBrowserActivity.E = (eigp) ahknVar.aI.b();
        galleryBrowserActivity.F = ahhkVar.f;
        galleryBrowserActivity.G = ahknVar.b.mW;
        galleryBrowserActivity.J = (cogw) eyikVar.b();
    }
}
