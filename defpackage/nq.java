package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes.dex */
class nq {
    final Context a;
    public cvw b;
    public cvw c;

    public nq(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof kzw)) {
            return menuItem;
        }
        kzw kzwVar = (kzw) menuItem;
        if (this.b == null) {
            this.b = new cvw();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(kzwVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ok okVar = new ok(this.a, kzwVar);
        this.b.put(kzwVar, okVar);
        return okVar;
    }

    final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof kzx)) {
            return subMenu;
        }
        kzx kzxVar = (kzx) subMenu;
        if (this.c == null) {
            this.c = new cvw();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(kzxVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        oy oyVar = new oy(this.a, kzxVar);
        this.c.put(kzxVar, oyVar);
        return oyVar;
    }
}
