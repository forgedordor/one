package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msg {
    public final nen a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public msg(nen nenVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        mee.a(!z3 || z);
        mee.a(!z2 || z);
        mee.a(true);
        this.a = nenVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = false;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final msg a(long j) {
        return j == this.c ? this : new msg(this.a, this.b, j, this.d, this.e, this.h, this.i, this.j);
    }

    public final msg b(long j) {
        return j == this.b ? this : new msg(this.a, j, this.c, this.d, this.e, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            msg msgVar = (msg) obj;
            if (this.b == msgVar.b && this.c == msgVar.c && this.d == msgVar.d && this.e == msgVar.e && this.h == msgVar.h && this.i == msgVar.i && this.j == msgVar.j && Objects.equals(this.a, msgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((iHashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
