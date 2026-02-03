package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gh {
    public static final gp a = new gn();
    public static final gp b;

    static {
        gp gpVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            cls.getClass();
            gpVar = (gp) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gpVar;
    }

    public static final void a(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
