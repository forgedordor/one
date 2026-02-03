package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazq {
    public final Map a;
    public final Map b;

    public cazq(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cazq)) {
            return false;
        }
        cazq cazqVar = (cazq) obj;
        return fdbq.f(this.a, cazqVar.a) && fdbq.f(this.b, cazqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuplicationResult(potentialDuplicatesInDb=" + this.a + ", duplicatesInBatch=" + this.b + ")";
    }
}
