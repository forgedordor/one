package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ nw a;

    public nr(nw nwVar) {
        this.a = nwVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        nw nwVar = this.a;
        if (nwVar.x()) {
            List list = nwVar.b;
            if (list.size() <= 0 || ((nv) list.get(0)).a.q) {
                return;
            }
            View view = nwVar.d;
            if (view == null || !view.isShown()) {
                nwVar.m();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((nv) it.next()).a.v();
            }
        }
    }
}
