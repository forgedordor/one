package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwvk extends cukc {
    private boolean n = false;

    public cwvk() {
        x(new cwvj(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ForwardMessageActivity forwardMessageActivity = (ForwardMessageActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        forwardMessageActivity.s = (cogw) ahknVar.cD.b();
        forwardMessageActivity.t = (cukm) ahhkVar.f.b();
        forwardMessageActivity.u = ahhkVar.h;
        forwardMessageActivity.v = (baci) ahknVar.dg.b();
        forwardMessageActivity.w = (cpch) ahknVar.a.qj.b();
        forwardMessageActivity.x = ahhkVar.i;
    }
}
