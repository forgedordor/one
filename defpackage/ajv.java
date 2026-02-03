package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajv extends ajn {
    public final int a;

    public ajv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajv) && this.a == ((ajv) obj).a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return "{indexingType: " + this.a + "}";
    }
}
