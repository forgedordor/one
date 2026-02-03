package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqb extends ActionMode.Callback2 {
    private final jqd a;

    public jqb(jqd jqdVar) {
        this.a = jqdVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = jqc.a.f;
        jqd jqdVar = this.a;
        if (itemId == i) {
            fdae fdaeVar = jqdVar.c;
            if (fdaeVar != null) {
                fdaeVar.invoke();
            }
        } else if (itemId == jqc.b.f) {
            fdae fdaeVar2 = jqdVar.d;
            if (fdaeVar2 != null) {
                fdaeVar2.invoke();
            }
        } else if (itemId == jqc.c.f) {
            fdae fdaeVar3 = jqdVar.e;
            if (fdaeVar3 != null) {
                fdaeVar3.invoke();
            }
        } else if (itemId == jqc.d.f) {
            fdae fdaeVar4 = jqdVar.f;
            if (fdaeVar4 != null) {
                fdaeVar4.invoke();
            }
        } else {
            if (itemId != jqc.e.f) {
                return false;
            }
            fdae fdaeVar5 = jqdVar.g;
            if (fdaeVar5 != null) {
                fdaeVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        jqd jqdVar = this.a;
        if (jqdVar.c != null) {
            jqd.a(menu, jqc.a);
        }
        if (jqdVar.d != null) {
            jqd.a(menu, jqc.b);
        }
        if (jqdVar.e != null) {
            jqd.a(menu, jqc.c);
        }
        if (jqdVar.f != null) {
            jqd.a(menu, jqc.d);
        }
        if (jqdVar.g == null) {
            return true;
        }
        jqd.a(menu, jqc.e);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        fdae fdaeVar = this.a.a;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ihu ihuVar = this.a.b;
        if (rect != null) {
            rect.set((int) ihuVar.b, (int) ihuVar.c, (int) ihuVar.d, (int) ihuVar.e);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        jqd jqdVar = this.a;
        jqd.b(menu, jqc.a, jqdVar.c);
        jqd.b(menu, jqc.b, jqdVar.d);
        jqd.b(menu, jqc.c, jqdVar.e);
        jqd.b(menu, jqc.d, jqdVar.f);
        jqd.b(menu, jqc.e, jqdVar.g);
        return true;
    }
}
