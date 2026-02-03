package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ne implements na {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final cvw d = new cvw();

    public ne(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.na
    public final void a(nb nbVar) {
        throw null;
    }

    @Override // defpackage.na
    public final boolean b(nb nbVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.na
    public final boolean c(nb nbVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.na
    public final void d(nb nbVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(nb nbVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nf nfVar = (nf) arrayList.get(i);
            if (nfVar != null && nfVar.b == nbVar) {
                return nfVar;
            }
        }
        nf nfVar2 = new nf(this.b, nbVar);
        arrayList.add(nfVar2);
        return nfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        cvw cvwVar = this.d;
        Menu menu2 = (Menu) cvwVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        os osVar = new os(this.b, menu);
        cvwVar.put(menu, osVar);
        return osVar;
    }
}
