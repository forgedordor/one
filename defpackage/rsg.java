package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsg {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(rte rteVar) {
        boolean z = true;
        if (rteVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean zRemove = set.remove(rteVar);
        if (!set2.remove(rteVar) && !zRemove) {
            z = false;
        }
        if (z) {
            rteVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
