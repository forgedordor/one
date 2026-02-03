package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aet {
    public final Map a;
    private final Map b;
    private final Map c;

    public aet(Map map, Map map2, Map map3) {
        lcg.i(map);
        this.a = map;
        lcg.i(map2);
        this.b = map2;
        lcg.i(map3);
        this.c = map3;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.c);
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.b);
    }

    public final boolean c() {
        return this.b.isEmpty();
    }

    public final String toString() {
        return "{\n  successes: " + this.a + "\n  failures: " + this.b + "\n}";
    }
}
