package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erep {
    public static final erep a = new erep(DesugarCollections.unmodifiableMap(new HashMap()));
    private final Map b;

    public erep(Map map) {
        this.b = map;
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof erep) {
            return this.b.equals(((erep) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
