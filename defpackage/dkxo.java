package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public dkxo(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxo)) {
            return false;
        }
        dkxo dkxoVar = (dkxo) obj;
        return this.a == dkxoVar.a && this.b == dkxoVar.b && this.c == dkxoVar.c && this.d == dkxoVar.d && this.e == dkxoVar.e && this.f == dkxoVar.f;
    }

    public final int hashCode() {
        int i = true != this.f ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        return (((((((((i2 * 31) + i3) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + i;
    }

    public final String toString() {
        return "RichCardTextResult(spacer=" + this.a + ", title=" + this.b + ", desc=" + this.c + ", actionCount=" + this.d + ", bottomSpacer=" + this.e + ", isTextTruncated=" + this.f + ")";
    }
}
