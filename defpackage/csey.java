package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csey {
    public final float a;
    private final int b;
    private final int c;

    public csey(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = i2 == 0 ? 1.0f : (i2 - i) / i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csey)) {
            return false;
        }
        csey cseyVar = (csey) obj;
        return this.b == cseyVar.b && this.c == cseyVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        return "Distance(differences=" + this.b + ", total=" + this.c + ")";
    }
}
