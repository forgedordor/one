package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqy {
    public final int a;
    private final int b;

    public zqy(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqy)) {
            return false;
        }
        zqy zqyVar = (zqy) obj;
        return this.b == zqyVar.b && this.a == zqyVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a;
    }

    public final String toString() {
        return "SelectionOffset(x=" + this.b + ", y=" + this.a + ")";
    }

    public zqy() {
        this(0, 0);
    }
}
