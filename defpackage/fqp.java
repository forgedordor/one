package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqp {
    private final Map a;

    public fqp(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fqp) {
            return fdbq.f(this.a, ((fqp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
