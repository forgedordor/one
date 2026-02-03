package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxb {
    public final Set a;
    private final dswx b;

    public dsxb(Set set, dswx dswxVar) {
        this.a = set;
        this.b = dswxVar;
    }

    public final void a(boolean z) {
        if (z) {
            return;
        }
        d(new IllegalStateException());
    }

    public final void b(Object obj) {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", "Inserted: ".concat(String.valueOf(String.valueOf(obj))));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dswy) it.next()).b(obj);
        }
    }

    public final void c(Object obj) {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", "Removed: ".concat(String.valueOf(String.valueOf(obj))));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dswy) it.next()).c(obj);
        }
    }

    public final void d(RuntimeException runtimeException) {
        this.b.a(runtimeException);
    }

    public final boolean e() {
        return !this.a.isEmpty();
    }

    public final void f(Object obj, int i, int i2) {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            String strValueOf = String.valueOf(obj);
            String strA = emmy.a(i);
            if (i == 0) {
                throw null;
            }
            Log.v("GIL", "Visibility: " + strValueOf + "; " + strA + " -> " + emmy.a(i2));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dswy) it.next()).g(obj, i2);
        }
    }
}
