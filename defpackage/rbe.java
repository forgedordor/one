package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbe {
    private final Map a;

    public rbe(rbd rbdVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(rbdVar.a));
    }

    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }
}
