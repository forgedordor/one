package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czdb extends cyvb {
    private boolean K = false;

    public czdb() {
        x(new czda(this));
    }

    @Override // defpackage.cyve, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        eyik eyikVar = ahknVar.cD;
        gifBrowserActivity.s = (cogw) eyikVar.b();
        gifBrowserActivity.t = (cukm) ahhkVar.f.b();
        gifBrowserActivity.u = ahhkVar.h;
        gifBrowserActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        gifBrowserActivity.w = (cpch) ahnhVar.qj.b();
        gifBrowserActivity.x = ahhkVar.i;
        gifBrowserActivity.A = ahnhVar.Wy;
        gifBrowserActivity.B = ahnhVar.wF;
        gifBrowserActivity.C = ahknVar.da;
        gifBrowserActivity.D = ahhkVar.k;
        gifBrowserActivity.E = (eigp) ahknVar.aI.b();
        gifBrowserActivity.F = ahhkVar.f;
        gifBrowserActivity.G = ahknVar.b.mW;
        gifBrowserActivity.J = (cogw) eyikVar.b();
    }
}
