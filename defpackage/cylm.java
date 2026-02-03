package defpackage;

import com.google.android.apps.messaging.ui.debug.workqueue.pwqui.PwqDebugUiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cylm extends cukc {
    private boolean n = false;

    public cylm() {
        x(new cyll(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        PwqDebugUiActivity pwqDebugUiActivity = (PwqDebugUiActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        pwqDebugUiActivity.s = (cogw) ahknVar.cD.b();
        pwqDebugUiActivity.t = (cukm) ahhkVar.f.b();
        pwqDebugUiActivity.u = ahhkVar.h;
        pwqDebugUiActivity.v = (baci) ahknVar.dg.b();
        pwqDebugUiActivity.w = (cpch) ahknVar.a.qj.b();
        pwqDebugUiActivity.x = ahhkVar.i;
    }
}
