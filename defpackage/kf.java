package defpackage;

import android.view.Menu;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kf implements Runnable {
    final /* synthetic */ kk a;

    public kf(kk kkVar) {
        this.a = kkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk kkVar = this.a;
        Menu menuA = kkVar.a();
        Menu menu = true != (menuA instanceof oc) ? null : menuA;
        if (menu != null) {
            ((oc) menu).s();
        }
        try {
            menuA.clear();
            Window.Callback callback = kkVar.b;
            if (!callback.onCreatePanelMenu(0, menuA) || !callback.onPreparePanel(0, null, menuA)) {
                menuA.clear();
            }
            if (menu != null) {
                ((oc) menu).r();
            }
        } catch (Throwable th) {
            if (menu != null) {
                ((oc) menu).r();
            }
            throw th;
        }
    }
}
