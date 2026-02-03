package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebh {
    public final Map a;

    public eebh(Map map) {
        map.getClass();
        this.a = map;
    }

    public final eebh a(eebh eebhVar) {
        return new eebh(fcwa.j(this.a, eebhVar.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eebh) && fdbq.f(this.a, ((eebh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SwatchiePalette(data=" + this.a + ")";
    }
}
