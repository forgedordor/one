package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajx extends ajn {
    public final int a;
    public final int b;

    public ajx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajx)) {
            return false;
        }
        ajx ajxVar = (ajx) obj;
        return this.a == ajxVar.a && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(ajxVar.b));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "{indexingType: " + this.a + ", tokenizerType: " + this.b + "}";
    }
}
