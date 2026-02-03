package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjp {
    public final int a;
    public final int b;

    public dcjp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof dcjp) {
            dcjp dcjpVar = (dcjp) obj;
            if (this.a == dcjpVar.a && this.b == dcjpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
