package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jza {
    public final int a;
    public final int b;
    public final boolean c;

    public jza(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jza)) {
            return false;
        }
        jza jzaVar = (jza) obj;
        return this.a == jzaVar.a && this.b == jzaVar.b && this.c == jzaVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
