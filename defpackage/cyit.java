package defpackage;

import com.google.android.apps.messaging.ui.debug.database.DatabaseActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cyit extends cukc {
    private boolean n = false;

    public cyit() {
        x(new cyis(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DatabaseActivity databaseActivity = (DatabaseActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        databaseActivity.s = (cogw) ahknVar.cD.b();
        databaseActivity.t = (cukm) ahhkVar.f.b();
        databaseActivity.u = ahhkVar.h;
        databaseActivity.v = (baci) ahknVar.dg.b();
        databaseActivity.w = (cpch) ahknVar.a.qj.b();
        databaseActivity.x = ahhkVar.i;
    }
}
