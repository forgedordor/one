package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnb {
    private static final pmx b = new pln();
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList a = new ArrayList();

    static csq a() {
        csq csqVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (csqVar = (csq) weakReference.get()) != null) {
            return csqVar;
        }
        csq csqVar2 = new csq();
        threadLocal.set(new WeakReference(csqVar2));
        return csqVar2;
    }

    public static void b(ViewGroup viewGroup, pmx pmxVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (pmxVar == null) {
            pmxVar = b;
        }
        pmx pmxVarClone = pmxVar.clone();
        d(viewGroup, pmxVarClone);
        pmh.a(viewGroup);
        c(viewGroup, pmxVarClone);
    }

    public static void c(ViewGroup viewGroup, pmx pmxVar) {
        if (pmxVar == null || viewGroup == null) {
            return;
        }
        pna pnaVar = new pna(pmxVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(pnaVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(pnaVar);
    }

    public static void d(ViewGroup viewGroup, pmx pmxVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pmx) arrayList.get(i)).u(viewGroup);
            }
        }
        if (pmxVar != null) {
            pmxVar.p(viewGroup, true);
        }
        if (((pmh) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
