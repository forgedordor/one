package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgh {
    public final int a;
    public final int b;

    public ejgh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejgh)) {
            return false;
        }
        ejgh ejghVar = (ejgh) obj;
        return this.a == ejghVar.a && this.b == ejghVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }

    public ejgh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ ejgh(byte[] bArr) {
        this(0, 0);
    }
}
