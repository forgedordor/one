package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pw implements oa {
    final /* synthetic */ ActionMenuView a;

    public pw(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
        oa oaVar = this.a.d;
        if (oaVar != null) {
            oaVar.H(ocVar);
        }
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        za zaVar = this.a.e;
        if (zaVar == null) {
            return false;
        }
        Toolbar toolbar = zaVar.a;
        if (toolbar.v.c(menuItem)) {
            return true;
        }
        zh zhVar = toolbar.x;
        return zhVar != null && zhVar.a(menuItem);
    }
}
