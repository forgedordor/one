package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcj {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public lzz g = lzz.a;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
    }

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b(long j) {
        lzz lzzVar = this.g;
        long j2 = this.d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = lzzVar.b;
        return -1;
    }

    public final int c(long j) {
        lzz lzzVar = this.g;
        int i = lzzVar.b;
        lzzVar.b();
        return -1;
    }

    public final int d(int i) {
        return this.g.a(i).a();
    }

    public final long e(int i, int i2) {
        lzy lzyVarA = this.g.a(i);
        if (lzyVarA.b != -1) {
            return lzyVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            mcj mcjVar = (mcj) obj;
            if (Objects.equals(this.a, mcjVar.a) && Objects.equals(this.b, mcjVar.b) && this.c == mcjVar.c && this.d == mcjVar.d && this.e == mcjVar.e && this.f == mcjVar.f && Objects.equals(this.g, mcjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return mgb.B(this.e);
    }

    public final boolean g(int i) {
        return !this.g.a(i).c();
    }

    public final void h(int i) {
        long j = this.g.a(i).a;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j = this.d;
        long j2 = this.e;
        return (((((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final void i() {
        long j = this.g.c;
    }

    public final void j() {
        int i = this.g.d;
    }

    public final void k(int i) {
        boolean z = this.g.a(i).i;
    }

    public final void l(Object obj, Object obj2, int i, long j, long j2, lzz lzzVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = lzzVar;
        this.f = z;
    }

    public final void m() {
        int i = this.g.b;
    }

    public final void n(Object obj, Object obj2, long j, long j2) {
        l(obj, obj2, 0, j, j2, lzz.a, false);
    }

    public final void o(int i) {
        m();
        if (i == -1) {
            this.g.b();
        }
    }
}
