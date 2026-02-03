package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nt implements Runnable {
    final /* synthetic */ nv a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ oc c;
    final /* synthetic */ nu d;

    public nt(nu nuVar, nv nvVar, MenuItem menuItem, oc ocVar) {
        this.d = nuVar;
        this.a = nvVar;
        this.b = menuItem;
        this.c = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv nvVar = this.a;
        if (nvVar != null) {
            nw nwVar = this.d.a;
            nwVar.f = true;
            nvVar.b.i(false);
            nwVar.f = false;
        }
        MenuItem menuItem = this.b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.c.z(menuItem, 4);
        }
    }
}
