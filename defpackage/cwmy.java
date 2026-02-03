package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwmy extends cukf {
    private boolean n = false;

    public cwmy() {
        x(new cwmx(this));
    }

    @Override // defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MessageStatusListActivity messageStatusListActivity = (MessageStatusListActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        messageStatusListActivity.s = (cogw) ahknVar.cD.b();
        messageStatusListActivity.t = (cukm) ahhkVar.f.b();
        messageStatusListActivity.u = ahhkVar.h;
        messageStatusListActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        messageStatusListActivity.w = (cpch) ahnhVar.qj.b();
        messageStatusListActivity.x = ahhkVar.i;
        messageStatusListActivity.A = ahnhVar.Wy;
        messageStatusListActivity.B = ahnhVar.wF;
        messageStatusListActivity.C = ahknVar.da;
        messageStatusListActivity.D = ahhkVar.k;
        messageStatusListActivity.E = (eigp) ahknVar.aI.b();
        messageStatusListActivity.F = ahhkVar.f;
        messageStatusListActivity.G = ahknVar.b.mW;
    }
}
