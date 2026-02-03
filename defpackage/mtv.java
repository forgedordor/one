package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtv {
    public final long a;
    public final mcl b;
    public final int c;
    public final nen d;
    public final long e;
    public final mcl f;
    public final int g;
    public final nen h;
    public final long i;
    public final long j;

    public mtv(long j, mcl mclVar, int i, nen nenVar, long j2, mcl mclVar2, int i2, nen nenVar2, long j3, long j4) {
        this.a = j;
        this.b = mclVar;
        this.c = i;
        this.d = nenVar;
        this.e = j2;
        this.f = mclVar2;
        this.g = i2;
        this.h = nenVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mtv mtvVar = (mtv) obj;
            if (this.a == mtvVar.a && this.c == mtvVar.c && this.e == mtvVar.e && this.g == mtvVar.g && this.i == mtvVar.i && this.j == mtvVar.j && Objects.equals(this.b, mtvVar.b) && Objects.equals(this.d, mtvVar.d) && Objects.equals(this.f, mtvVar.f) && Objects.equals(this.h, mtvVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
