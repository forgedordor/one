package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rtq implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public rtq(rtr rtrVar) {
        this.a = new WeakReference(rtrVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        rtr rtrVar = (rtr) this.a.get();
        if (rtrVar == null) {
            return true;
        }
        List list = rtrVar.c;
        if (list.isEmpty()) {
            return true;
        }
        int iB = rtrVar.b();
        int iA = rtrVar.a();
        if (!rtr.d(iB, iA)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rtz) arrayList.get(i)).g(iB, iA);
        }
        rtrVar.c();
        return true;
    }
}
