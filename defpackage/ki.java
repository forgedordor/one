package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ki implements oa {
    final /* synthetic */ kk a;

    public ki(kk kkVar) {
        this.a = kkVar;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
        kk kkVar = this.a;
        if (kkVar.a.B()) {
            kkVar.b.onPanelClosed(108, ocVar);
            return;
        }
        Window.Callback callback = kkVar.b;
        if (callback.onPreparePanel(0, null, ocVar)) {
            callback.onMenuOpened(108, ocVar);
        }
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        return false;
    }
}
