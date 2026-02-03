package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degq {
    public final deia a;
    public final long b;

    public degq(deia deiaVar, long j) {
        this.a = deiaVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof degq)) {
            return false;
        }
        degq degqVar = (degq) obj;
        return this.b == degqVar.b && Objects.equals(this.a, degqVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b));
    }

    public final String toString() {
        return "Ticks{originalTicker=BasicPhysicalTicker, value=" + this.b + "}";
    }
}
