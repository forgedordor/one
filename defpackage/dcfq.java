package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class dcfq {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public void b(dcgp dcgpVar) {
        throw null;
    }

    public void c(dcgp dcgpVar) {
        throw null;
    }
}
