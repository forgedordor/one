package defpackage;

import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cujn extends cukc {
    private boolean n = false;

    public cujn() {
        x(new cujm(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        PermissionCheckActivity permissionCheckActivity = (PermissionCheckActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        permissionCheckActivity.s = (cogw) ahknVar.cD.b();
        permissionCheckActivity.t = (cukm) ahhkVar.f.b();
        permissionCheckActivity.u = ahhkVar.h;
        permissionCheckActivity.v = (baci) ahknVar.dg.b();
        permissionCheckActivity.w = (cpch) ahknVar.a.qj.b();
        permissionCheckActivity.x = ahhkVar.i;
    }
}
