package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwvm extends cukc {
    private boolean n = false;

    public cwvm() {
        x(new cwvl(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ShareIntentActivity shareIntentActivity = (ShareIntentActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        shareIntentActivity.s = (cogw) ahknVar.cD.b();
        shareIntentActivity.t = (cukm) ahhkVar.f.b();
        shareIntentActivity.u = ahhkVar.h;
        shareIntentActivity.v = (baci) ahknVar.dg.b();
        shareIntentActivity.w = (cpch) ahknVar.a.qj.b();
        shareIntentActivity.x = ahhkVar.i;
    }
}
