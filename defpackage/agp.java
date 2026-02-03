package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agp extends ajn {
    public final int a;
    public final int b;

    public agp(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException("Start point must be less than or equal to end point");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agp)) {
            return false;
        }
        agp agpVar = (agp) obj;
        return this.a == agpVar.a && this.b == agpVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "MatchRange { start: " + this.a + " , end: " + this.b + "}";
    }
}
