package defpackage;

import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czxy extends cukc {
    private boolean n = false;

    public czxy() {
        x(new czxx(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ZeroStateSearchActivity zeroStateSearchActivity = (ZeroStateSearchActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        zeroStateSearchActivity.s = (cogw) ahknVar.cD.b();
        zeroStateSearchActivity.t = (cukm) ahhkVar.f.b();
        zeroStateSearchActivity.u = ahhkVar.h;
        zeroStateSearchActivity.v = (baci) ahknVar.dg.b();
        zeroStateSearchActivity.w = (cpch) ahknVar.a.qj.b();
        zeroStateSearchActivity.x = ahhkVar.i;
    }
}
