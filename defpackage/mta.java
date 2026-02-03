package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mta {
    public static final nen a = new nen(new Object());
    public final mcl b;
    public final nen c;
    public final long d;
    public final long e;
    public final int f;
    public final mpn g;
    public final boolean h;
    public final ngo i;
    public final nin j;
    public final List k;
    public final nen l;
    public final boolean m;
    public final int n;
    public final int o;
    public final mca p;
    public final boolean q = false;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public volatile long u;

    public mta(mcl mclVar, nen nenVar, long j, long j2, int i, mpn mpnVar, boolean z, ngo ngoVar, nin ninVar, List list, nen nenVar2, boolean z2, int i2, int i3, mca mcaVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.b = mclVar;
        this.c = nenVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = mpnVar;
        this.h = z;
        this.i = ngoVar;
        this.j = ninVar;
        this.k = list;
        this.l = nenVar2;
        this.m = z2;
        this.n = i2;
        this.o = i3;
        this.p = mcaVar;
        this.r = j3;
        this.s = j4;
        this.t = j5;
        this.u = j6;
    }

    public static mta i(nin ninVar) {
        mcl mclVar = mcl.a;
        nen nenVar = a;
        ngo ngoVar = ngo.a;
        int i = ekgb.d;
        return new mta(mclVar, nenVar, -9223372036854775807L, 0L, 1, null, false, ngoVar, ninVar, ekoe.a, nenVar, false, 1, 0, mca.a, 0L, 0L, 0L, 0L, false);
    }

    public final mta a(boolean z) {
        return new mta(this.b, this.c, this.d, this.e, this.f, this.g, z, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mta b(nen nenVar) {
        return new mta(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, nenVar, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mta c(nen nenVar, long j, long j2, long j3, long j4, ngo ngoVar, nin ninVar, List list) {
        nen nenVar2 = this.l;
        boolean z = this.m;
        int i = this.n;
        int i2 = this.o;
        mca mcaVar = this.p;
        long j5 = this.r;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new mta(this.b, nenVar, j2, j3, this.f, this.g, this.h, ngoVar, ninVar, list, nenVar2, z, i, i2, mcaVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final mta d(boolean z, int i, int i2) {
        return new mta(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, z, i, i2, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mta e(mpn mpnVar) {
        return new mta(this.b, this.c, this.d, this.e, this.f, mpnVar, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mta f(mca mcaVar) {
        return new mta(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, mcaVar, this.r, this.s, this.t, this.u, false);
    }

    public final mta g(int i) {
        return new mta(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final mta h(mcl mclVar) {
        return new mta(mclVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, false);
    }

    public final boolean j() {
        return this.f == 3 && this.m && this.o == 0;
    }
}
