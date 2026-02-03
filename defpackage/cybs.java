package defpackage;

import com.google.android.apps.messaging.ui.debug.cloudstore.keyretrievalclient.KeyRetrievalClientActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cybs extends cukc {
    private boolean n = false;

    public cybs() {
        x(new cybr(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        KeyRetrievalClientActivity keyRetrievalClientActivity = (KeyRetrievalClientActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        keyRetrievalClientActivity.s = (cogw) ahknVar.cD.b();
        keyRetrievalClientActivity.t = (cukm) ahhkVar.f.b();
        keyRetrievalClientActivity.u = ahhkVar.h;
        keyRetrievalClientActivity.v = (baci) ahknVar.dg.b();
        keyRetrievalClientActivity.w = (cpch) ahknVar.a.qj.b();
        keyRetrievalClientActivity.x = ahhkVar.i;
    }
}
