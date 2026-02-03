package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipv extends cipw {
    private final Map a;

    public cipv() {
        this(fcvp.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cipv) && fdbq.f(this.a, ((cipv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(repairResults=" + this.a + ")";
    }

    public cipv(Map map) {
        map.getClass();
        this.a = map;
    }
}
