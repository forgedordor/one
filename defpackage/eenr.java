package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenr {
    public final oc a;
    public int b = 0;
    private int e = 0;
    public int c = 0;
    private final List d = new ArrayList();

    public eenr(oc ocVar) {
        this.a = ocVar;
        c();
    }

    public final int a() {
        return this.d.size();
    }

    public final MenuItem b(int i) {
        return (MenuItem) this.d.get(i);
    }

    public final void c() {
        List list = this.d;
        list.clear();
        this.b = 0;
        this.e = 0;
        this.c = 0;
        int i = 0;
        while (true) {
            oc ocVar = this.a;
            if (i >= ocVar.size()) {
                break;
            }
            MenuItem item = ocVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!list.isEmpty() && !(list.get(list.size() - 1) instanceof eenj) && item.isVisible()) {
                    list.add(new eenj());
                }
                list.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    list.add(item2);
                    this.b++;
                    if (item2.isVisible()) {
                        this.e++;
                    }
                }
                list.add(new eenj());
            } else {
                list.add(item);
                this.b++;
                if (item.isVisible()) {
                    this.e++;
                    this.c++;
                }
            }
            i++;
        }
        if (list.isEmpty() || !(list.get(list.size() - 1) instanceof eenj)) {
            return;
        }
        list.remove(list.size() - 1);
    }
}
