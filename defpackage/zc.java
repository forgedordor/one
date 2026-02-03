package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zc implements oa {
    final /* synthetic */ Toolbar a;

    public zc(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
        Toolbar toolbar = this.a;
        if (!toolbar.a.j()) {
            toolbar.v.b(ocVar);
        }
        oa oaVar = toolbar.B;
        if (oaVar != null) {
            oaVar.H(ocVar);
        }
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        return false;
    }
}
