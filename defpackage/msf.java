package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msf {
    public final nel a;
    public final Object b;
    public final ngc[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public msg g;
    public boolean h;
    public msf i;
    public ngo j = ngo.a;
    public nin k;
    public long l;
    private final boolean[] m;
    private final mtk[] n;
    private final nim o;
    private final msz p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ndi] */
    public msf(mtk[] mtkVarArr, long j, nim nimVar, niu niuVar, msz mszVar, msg msgVar, nin ninVar) {
        this.n = mtkVarArr;
        this.l = j;
        this.o = nimVar;
        this.p = mszVar;
        this.b = msgVar.a.a;
        this.g = msgVar;
        this.k = ninVar;
        int length = mtkVarArr.length;
        this.c = new ngc[length];
        this.m = new boolean[length];
        nen nenVar = msgVar.a;
        long j2 = msgVar.b;
        long j3 = msgVar.d;
        Object objY = mtg.y(nenVar.a);
        nen nenVarA = nenVar.a(mtg.x(nenVar.a));
        msx msxVar = (msx) mszVar.c.get(objY);
        mee.f(msxVar);
        mszVar.f.add(msxVar);
        msw mswVar = (msw) mszVar.e.get(msxVar);
        if (mswVar != null) {
            mswVar.a.h(mswVar.b);
        }
        msxVar.c.add(nenVarA);
        nef nefVarW = msxVar.a.w(nenVarA, niuVar, j2);
        mszVar.b.put(nefVarW, msxVar);
        mszVar.c();
        this.a = j3 != -9223372036854775807L ? new ndi(nefVarW, true, 0L, j3) : nefVarW;
    }

    private final void r() {
        if (!n()) {
            return;
        }
        int i = 0;
        while (true) {
            nin ninVar = this.k;
            if (i >= ninVar.a) {
                return;
            }
            ninVar.b(i);
            nif nifVar = this.k.c[i];
            i++;
        }
    }

    private final void s() {
        if (!n()) {
            return;
        }
        int i = 0;
        while (true) {
            nin ninVar = this.k;
            if (i >= ninVar.a) {
                return;
            }
            ninVar.b(i);
            nif nifVar = this.k.c[i];
            i++;
        }
    }

    public final long a(nin ninVar, long j, boolean z, boolean[] zArr) {
        mtk[] mtkVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ninVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !ninVar.a(this.k, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            mtkVarArr = this.n;
            if (i2 >= mtkVarArr.length) {
                break;
            }
            mtkVarArr[i2].eM();
            i2++;
        }
        r();
        this.k = ninVar;
        s();
        nel nelVar = this.a;
        nif[] nifVarArr = ninVar.c;
        boolean[] zArr3 = this.m;
        ngc[] ngcVarArr = this.c;
        long jH = nelVar.h(nifVarArr, zArr3, ngcVarArr, zArr, j);
        for (mtk mtkVar : mtkVarArr) {
            mtkVar.eM();
        }
        this.f = false;
        for (int i3 = 0; i3 < ngcVarArr.length; i3++) {
            if (ngcVarArr[i3] != null) {
                mee.c(ninVar.b(i3));
                mtkVarArr[i3].eM();
                this.f = true;
            } else {
                mee.c(nifVarArr[i3] == null);
            }
        }
        return jH;
    }

    public final long b() {
        if (!this.e) {
            return this.g.b;
        }
        long jC = this.f ? this.a.c() : Long.MIN_VALUE;
        return jC == Long.MIN_VALUE ? this.g.e : jC;
    }

    public final long c() {
        if (this.e) {
            return this.a.e();
        }
        return 0L;
    }

    public final long d() {
        return this.g.b + this.l;
    }

    public final long e(long j) {
        return j - this.l;
    }

    public final long f(long j) {
        return j + this.l;
    }

    public final void g(msd msdVar) {
        mee.c(n());
        this.a.n(msdVar);
    }

    public final void h(nek nekVar, long j) {
        this.d = true;
        this.a.k(nekVar, j);
    }

    public final void i() {
        r();
        nel nelVar = this.a;
        try {
            boolean z = nelVar instanceof ndi;
            msz mszVar = this.p;
            if (z) {
                mszVar.e(((ndi) nelVar).a);
            } else {
                mszVar.e(nelVar);
            }
        } catch (RuntimeException e) {
            mff.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void j(msf msfVar) {
        if (msfVar == this.i) {
            return;
        }
        r();
        this.i = msfVar;
        s();
    }

    public final void k() {
        nel nelVar = this.a;
        if (nelVar instanceof ndi) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((ndi) nelVar).m(0L, j);
        }
    }

    public final boolean l() {
        if (this.e) {
            return !this.f || this.a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean m() {
        if (this.e) {
            return l() || b() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final boolean n() {
        return this.i == null;
    }

    public final long o(nin ninVar, long j) {
        return a(ninVar, j, false, new boolean[this.n.length]);
    }

    public final void p(mcl mclVar) {
        this.e = true;
        this.j = this.a.i();
        nin ninVarQ = q();
        msg msgVar = this.g;
        long jMax = msgVar.b;
        long j = msgVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jO = o(ninVarQ, jMax);
        long j2 = this.l;
        msg msgVar2 = this.g;
        this.l = j2 + (msgVar2.b - jO);
        this.g = msgVar2.b(jO);
    }

    public final nin q() {
        ngo ngoVar = this.j;
        nen nenVar = this.g.a;
        nim nimVar = this.o;
        mtk[] mtkVarArr = this.n;
        nin ninVarN = nimVar.n(mtkVarArr, ngoVar);
        for (int i = 0; i < ninVarN.a; i++) {
            if (ninVarN.b(i)) {
                if (ninVarN.c[i] == null) {
                    mtkVarArr[i].eM();
                    z = false;
                }
                mee.c(z);
            } else {
                mee.c(ninVarN.c[i] == null);
            }
        }
        for (nif nifVar : ninVarN.c) {
        }
        return ninVarN;
    }
}
