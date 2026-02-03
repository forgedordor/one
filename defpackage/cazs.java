package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazs {
    public final Map a;
    public final Map b;
    public final Optional c;

    public cazs(Map map, Map map2, Optional optional) {
        this.a = map;
        this.b = map2;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cazs)) {
            return false;
        }
        cazs cazsVar = (cazs) obj;
        return fdbq.f(this.a, cazsVar.a) && fdbq.f(this.b, cazsVar.b) && fdbq.f(this.c, cazsVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SchedulingTransactionResult(duplicateRows=" + this.a + ", newRows=" + this.b + ", maybeSchedulingDeferred=" + this.c + ")";
    }
}
