package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbst {
    public final fbsy a;
    public final Map b;

    public fbst(fbsy fbsyVar, Map map) {
        this.a = fbsyVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public final Collection a() {
        return this.b.values();
    }
}
