package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjd {
    public static final kjd a = new kjd(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public kjd(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        int iB = b() / 2;
        int iA = a() / 2;
        return ((this.c + iA) & 4294967295L) | ((this.b + iB) << 32);
    }

    public final long d() {
        return (this.b << 32) | (this.c & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjd)) {
            return false;
        }
        kjd kjdVar = (kjd) obj;
        return this.b == kjdVar.b && this.c == kjdVar.c && this.d == kjdVar.d && this.e == kjdVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}
