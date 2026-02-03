package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxss extends cukc {
    private boolean n = false;

    public cxss() {
        x(new cxsr(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DebugGServiceKeysActivity debugGServiceKeysActivity = (DebugGServiceKeysActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        debugGServiceKeysActivity.s = (cogw) ahknVar.cD.b();
        debugGServiceKeysActivity.t = (cukm) ahhkVar.f.b();
        debugGServiceKeysActivity.u = ahhkVar.h;
        debugGServiceKeysActivity.v = (baci) ahknVar.dg.b();
        debugGServiceKeysActivity.w = (cpch) ahknVar.a.qj.b();
        debugGServiceKeysActivity.x = ahhkVar.i;
    }
}
