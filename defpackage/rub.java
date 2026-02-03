package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rub implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public rub(ruc rucVar) {
        this.a = new WeakReference(rucVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        ruc rucVar = (ruc) this.a.get();
        if (rucVar == null) {
            return true;
        }
        List list = rucVar.c;
        if (list.isEmpty()) {
            return true;
        }
        int iB = rucVar.b();
        int iA = rucVar.a();
        if (!ruc.d(iB, iA)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rtz) arrayList.get(i)).g(iB, iA);
        }
        rucVar.c();
        return true;
    }
}
