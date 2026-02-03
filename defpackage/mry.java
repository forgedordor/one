package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mry implements Handler.Callback, nek, nil, msy, mpj, mtc, mpa, nkz {
    private static final long n = mgb.B(10000);
    private final mpb A;
    private mtq B;
    private boolean D;
    private boolean E;
    private mrx F;
    private mta G;
    private mrw H;
    private boolean J;
    private boolean K;
    private boolean M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private mrx R;
    private long S;
    private long T;
    private int U;
    private boolean V;
    private mpn W;
    private boolean Z;
    public final mtm[] a;
    private final mqm ab;
    private final mpf ac;
    public final mtk[] b;
    public final nim c;
    public final nin d;
    public final mew e;
    public final Looper f;
    public final mej g;
    public final msz h;
    public final long i;
    public final mtu j;
    public boolean k;
    public mqa l;
    public final mpi m;
    private final boolean[] o;
    private final nit p;
    private final mtb q;
    private final mck r;
    private final mcj s;
    private final long t;
    private final mpk u;
    private final ArrayList v;
    private final msi w;
    private final mwx x;
    private final mew y;
    private final boolean z;
    private long Y = -9223372036854775807L;
    private boolean I = false;
    private float aa = 1.0f;
    private mtp C = mtp.a;
    private long X = -9223372036854775807L;
    private long L = -9223372036854775807L;

    public mry(Context context, mth[] mthVarArr, mth[] mthVarArr2, nim nimVar, nin ninVar, mpi mpiVar, nit nitVar, int i, boolean z, mtu mtuVar, mtq mtqVar, mpf mpfVar, long j, Looper looper, mej mejVar, mqm mqmVar, mwx mwxVar, mqa mqaVar, final nkz nkzVar) {
        Looper looper2;
        this.ab = mqmVar;
        this.c = nimVar;
        this.d = ninVar;
        this.m = mpiVar;
        this.p = nitVar;
        this.N = i;
        this.O = z;
        this.B = mtqVar;
        this.ac = mpfVar;
        this.i = j;
        boolean z2 = false;
        this.g = mejVar;
        this.x = mwxVar;
        this.l = mqaVar;
        this.j = mtuVar;
        this.t = mpiVar.d;
        mcl mclVar = mcl.a;
        this.G = mta.i(ninVar);
        this.H = new mrw(this.G);
        int length = mthVarArr.length;
        this.b = new mtk[length];
        this.o = new boolean[length];
        mtj mtjVarD = nimVar.d();
        this.a = new mtm[length];
        boolean z3 = false;
        for (int i2 = 0; i2 < mthVarArr.length; i2++) {
            mthVarArr[i2].s(i2, mwxVar, mejVar);
            this.b[i2] = mthVarArr[i2].l();
            this.b[i2].H(mtjVarD);
            mth mthVar = mthVarArr2[i2];
            if (mthVar != null) {
                mthVar.s(i2, mwxVar, mejVar);
                z3 = true;
            }
            this.a[i2] = new mtm(mthVarArr[i2], mthVarArr2[i2], i2);
        }
        this.z = z3;
        this.u = new mpk(this);
        this.v = new ArrayList();
        this.r = new mck();
        this.s = new mcj();
        nimVar.g = this;
        nimVar.h = nitVar;
        this.V = true;
        mew mewVarB = mejVar.b(looper, null);
        this.y = mewVarB;
        this.w = new msi(mtuVar, mewVarB, new mrq(this), mqaVar);
        this.h = new msz(this, mtuVar, mewVarB, mwxVar);
        mtb mtbVar = new mtb();
        this.q = mtbVar;
        synchronized (mtbVar.a) {
            if (mtbVar.b == null) {
                if (mtbVar.d == 0 && mtbVar.c == null) {
                    z2 = true;
                }
                mee.c(z2);
                mtbVar.c = new HandlerThread("ExoPlayer:Playback", -16);
                mtbVar.c.start();
                mtbVar.b = mtbVar.c.getLooper();
            }
            mtbVar.d++;
            looper2 = mtbVar.b;
        }
        this.f = looper2;
        mew mewVarB2 = mejVar.b(looper2, this);
        this.e = mewVarB2;
        this.A = new mpb(context, looper2, this);
        mewVarB2.d(35, new nkz() { // from class: mrr
            @Override // defpackage.nkz
            public final void c(long j2, long j3, mau mauVar, MediaFormat mediaFormat) {
                nkzVar.c(j2, j3, mauVar, mediaFormat);
                this.a.c(j2, j3, mauVar, mediaFormat);
            }
        }).b();
    }

    private final void A(mca mcaVar, boolean z) {
        B(mcaVar, mcaVar.b, true, z);
    }

    private final void B(mca mcaVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.H.a(1);
            }
            this.G = this.G.f(mcaVar);
        }
        float f2 = mcaVar.b;
        msf msfVar = this.w.e;
        while (true) {
            i = 0;
            if (msfVar == null) {
                break;
            }
            nif[] nifVarArr = msfVar.k.c;
            int length = nifVarArr.length;
            while (i < length) {
                nif nifVar = nifVarArr[i];
                i++;
            }
            msfVar = msfVar.i;
        }
        mtm[] mtmVarArr = this.a;
        while (i < mtmVarArr.length) {
            mtm mtmVar = mtmVarArr[i];
            mtmVar.a.I(f, f2);
            mth mthVar = mtmVar.c;
            if (mthVar != null) {
                mthVar.I(f, f2);
            }
            i++;
        }
    }

    private final void C() {
        boolean zE;
        msi msiVar = this.w;
        if (aj(msiVar.h)) {
            msf msfVar = msiVar.h;
            long j = j(msfVar.c());
            if (msfVar == msiVar.e) {
                msfVar.e(this.S);
            } else {
                msfVar.e(this.S);
                long j2 = msfVar.g.b;
            }
            long j3 = ai(this.G.b, msfVar.g.a) ? this.ac.l : -9223372036854775807L;
            mwx mwxVar = this.x;
            mcl mclVar = this.G.b;
            nen nenVar = msfVar.g.a;
            float f = this.u.b().b;
            boolean z = this.G.m;
            msb msbVar = new msb(mwxVar, j, f, this.K, j3);
            mpi mpiVar = this.m;
            boolean zE2 = mpiVar.e(msbVar);
            msf msfVar2 = msiVar.e;
            if (zE2 || !msfVar2.e || j >= 500000 || this.t <= 0) {
                zE = zE2;
            } else {
                msfVar2.a.q(this.G.t);
                zE = mpiVar.e(msbVar);
            }
        } else {
            zE = false;
        }
        this.M = zE;
        if (zE) {
            msf msfVar3 = msiVar.h;
            mee.f(msfVar3);
            msc mscVar = new msc();
            mscVar.a = msfVar3.e(this.S);
            mscVar.b(this.u.b().b);
            mscVar.a(this.L);
            msfVar3.g(new msd(mscVar));
        }
        X();
    }

    private final void D() {
        msi msiVar = this.w;
        msiVar.i();
        msf msfVar = msiVar.i;
        if (msfVar != null) {
            if (!msfVar.d || msfVar.e) {
                nel nelVar = msfVar.a;
                if (nelVar.o()) {
                    return;
                }
                mpi mpiVar = this.m;
                mcl mclVar = this.G.b;
                nen nenVar = msfVar.g.a;
                if (msfVar.e) {
                    nelVar.c();
                }
                Iterator it = mpiVar.e.values().iterator();
                while (it.hasNext()) {
                    if (((mph) it.next()).a) {
                        return;
                    }
                }
                if (!msfVar.d) {
                    msfVar.h(this, msfVar.g.b);
                    return;
                }
                msc mscVar = new msc();
                mscVar.a = msfVar.e(this.S);
                mscVar.b(this.u.b().b);
                mscVar.a(this.L);
                msfVar.g(new msd(mscVar));
            }
        }
    }

    private final void E() {
        mrw mrwVar = this.H;
        mta mtaVar = this.G;
        boolean z = mrwVar.a | (mrwVar.b != mtaVar);
        mrwVar.a = z;
        mrwVar.b = mtaVar;
        if (z) {
            this.ab.a(mrwVar);
            this.H = new mrw(this.G);
        }
    }

    private final void F(int i) {
        mtm mtmVar = this.a[i];
        try {
            msf msfVar = this.w.e;
            mee.f(msfVar);
            mth mthVarD = mtmVar.d(msfVar);
            mee.f(mthVarD);
            mthVarD.t();
        } catch (IOException | RuntimeException e) {
            int iB = mtmVar.b();
            if (iB != 3 && iB != 5) {
                throw e;
            }
            msi msiVar = this.w;
            nin ninVar = msiVar.e.k;
            nif[] nifVarArr = ninVar.c;
            mff.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(mau.c(nifVarArr[i].b())), e);
            nin ninVar2 = new nin((mtl[]) ninVar.b.clone(), (nif[]) nifVarArr.clone(), ninVar.d, ninVar.e);
            ninVar2.b[i] = null;
            ninVar2.c[i] = null;
            r(i);
            msiVar.e.o(ninVar2, this.G.t);
        }
    }

    private final void G(final int i, final boolean z) {
        boolean[] zArr = this.o;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.y.b(new Runnable() { // from class: mro
                @Override // java.lang.Runnable
                public final void run() {
                    mry mryVar = this.a;
                    mryVar.a[i].b();
                    mwk mwkVar = (mwk) mryVar.j;
                    mwkVar.J(mwkVar.I(), 1033, new mez() { // from class: muz
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    private final void H() {
        mry mryVar;
        mpk mpkVar = this.u;
        float f = mpkVar.b().b;
        msi msiVar = this.w;
        msf msfVar = msiVar.e;
        msf msfVar2 = msiVar.f;
        nin ninVar = null;
        boolean z = true;
        while (msfVar != null && msfVar.e) {
            mta mtaVar = this.G;
            mcl mclVar = mtaVar.b;
            boolean z2 = mtaVar.m;
            nin ninVarQ = msfVar.q();
            nin ninVar2 = msfVar == msiVar.e ? ninVarQ : ninVar;
            nin ninVar3 = msfVar.k;
            if (ninVar3 != null) {
                nif[] nifVarArr = ninVarQ.c;
                if (ninVar3.c.length == nifVarArr.length) {
                    for (int i = 0; i < nifVarArr.length; i++) {
                        if (ninVarQ.a(ninVar3, i)) {
                        }
                    }
                    z &= msfVar != msfVar2;
                    msfVar = msfVar.i;
                    ninVar = ninVar2;
                }
            }
            if (z) {
                msf msfVar3 = msiVar.e;
                boolean z3 = 1 == (msiVar.a(msfVar3) & 1);
                mtm[] mtmVarArr = this.a;
                int length = mtmVarArr.length;
                boolean[] zArr = new boolean[length];
                mee.f(ninVar2);
                long jA = msfVar3.a(ninVar2, this.G.t, z3, zArr);
                mta mtaVar2 = this.G;
                boolean z4 = (mtaVar2.f == 4 || jA == mtaVar2.t) ? false : true;
                mta mtaVar3 = this.G;
                boolean z5 = z4;
                mryVar = this;
                mryVar.G = o(mtaVar3.c, jA, mtaVar3.d, mtaVar3.e, z5, 5);
                if (z5) {
                    mryVar.L(jA);
                }
                mryVar.q();
                boolean[] zArr2 = new boolean[length];
                int i2 = 0;
                while (i2 < mtmVarArr.length) {
                    int iA = mtmVarArr[i2].a();
                    zArr2[i2] = mtmVarArr[i2].o();
                    mtm mtmVar = mtmVarArr[i2];
                    ngc ngcVar = msfVar3.c[i2];
                    long j = mryVar.S;
                    boolean z6 = zArr[i2];
                    mpk mpkVar2 = mpkVar;
                    mtmVar.f(mtmVar.a, ngcVar, mpkVar2, j, z6);
                    mth mthVar = mtmVar.c;
                    if (mthVar != null) {
                        mtmVar.f(mthVar, ngcVar, mpkVar2, j, z6);
                    }
                    if (iA - mtmVarArr[i2].a() > 0) {
                        mryVar.G(i2, false);
                    }
                    mryVar.Q -= iA - mtmVarArr[i2].a();
                    i2++;
                    mpkVar = mpkVar2;
                }
                mryVar.w(zArr2, mryVar.S);
                msfVar3.h = true;
            } else {
                mryVar = this;
                msiVar.a(msfVar);
                if (msfVar.e) {
                    long jMax = Math.max(msfVar.g.b, msfVar.e(mryVar.S));
                    if (mryVar.z && mryVar.ae() && msiVar.g == msfVar) {
                        mryVar.q();
                    }
                    msfVar.o(ninVarQ, jMax);
                }
            }
            mryVar.y(true);
            if (mryVar.G.f != 4) {
                mryVar.C();
                mryVar.ab();
                mryVar.e.j(2);
                return;
            }
            return;
        }
    }

    private final void I() {
        H();
        O(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[PHI: r2 r6 r8
      0x0093: PHI (r2v2 nen) = (r2v1 nen), (r2v21 nen) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r6v3 long) = (r6v2 long), (r6v14 long) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:26:0x006b, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[PHI: r6
      0x00ed: PHI (r6v7 mcl) = (r6v6 mcl), (r6v6 mcl), (r6v13 mcl), (r6v13 mcl) binds: [B:32:0x00a1, B:34:0x00a5, B:40:0x00cd, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.J(boolean, boolean, boolean, boolean):void");
    }

    private final void K() {
        msf msfVar = this.w.e;
        boolean z = false;
        if (msfVar != null && msfVar.g.i && this.I) {
            z = true;
        }
        this.J = z;
    }

    private final void L(long j) {
        msf msfVar = this.w.e;
        long jF = msfVar == null ? j + 1000000000000L : msfVar.f(j);
        this.S = jF;
        this.u.a.c(jF);
        for (mtm mtmVar : this.a) {
            long j2 = this.S;
            mth mthVarD = mtmVar.d(msfVar);
            if (mthVarD != null) {
                mthVarD.F(j2);
            }
        }
        for (msf msfVar2 = r0.e; msfVar2 != null; msfVar2 = msfVar2.i) {
            for (nif nifVar : msfVar2.k.c) {
            }
        }
    }

    private final void M(mcl mclVar, mcl mclVar2) {
        if (mclVar.q() && mclVar2.q()) {
            return;
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        mrv mrvVar = (mrv) arrayList.get(size);
        Object obj = mrvVar.b;
        mte mteVar = mrvVar.a;
        throw null;
    }

    private final void N(long j) {
        ((mfw) this.e).b.sendEmptyMessageAtTime(2, j + ((this.G.f != 3 || ah()) ? n : 1000L));
    }

    private final void O(boolean z) {
        nen nenVar = this.w.e.g.a;
        long jL = l(nenVar, this.G.t, true, false);
        if (jL != this.G.t) {
            mta mtaVar = this.G;
            this.G = o(nenVar, jL, mtaVar.d, mtaVar.e, z, 5);
        }
    }

    private final void P(mrx mrxVar, boolean z) throws Throwable {
        long jLongValue;
        long j;
        long j2;
        nen nenVarG;
        boolean z2;
        nen nenVar;
        long j3;
        boolean z3;
        long j4;
        long jA;
        nen nenVar2;
        long j5;
        long j6;
        boolean z4;
        mta mtaVar;
        int i;
        this.H.a(z ? 1 : 0);
        if (this.E) {
            this.F = mrxVar;
            return;
        }
        mcl mclVar = this.G.b;
        int i2 = this.N;
        boolean z5 = this.O;
        mck mckVar = this.r;
        mcj mcjVar = this.s;
        Pair pairN = n(mclVar, mrxVar, true, i2, z5, mckVar, mcjVar);
        if (pairN == null) {
            Pair pairM = m(this.G.b);
            nenVarG = (nen) pairM.first;
            jLongValue = ((Long) pairM.second).longValue();
            z2 = !this.G.b.q();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairN.first;
            jLongValue = ((Long) pairN.second).longValue();
            long j7 = mrxVar.c;
            j = j7 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j2 = 0;
            nenVarG = this.w.g(this.G.b, obj, jLongValue);
            if (nenVarG.b()) {
                this.G.b.o(nenVarG.a, mcjVar);
                if (mcjVar.d(nenVarG.b) == nenVarG.c) {
                    mcjVar.i();
                }
                z2 = true;
                jLongValue = 0;
            } else {
                z2 = j7 == -9223372036854775807L;
            }
        }
        try {
            if (this.G.b.q()) {
                this.R = mrxVar;
            } else if (pairN == null) {
                if (this.G.f != 1) {
                    S(4);
                }
                J(false, true, false, true);
            } else {
                if (nenVarG.equals(this.G.c)) {
                    msf msfVar = this.w.e;
                    if (msfVar == null || !msfVar.e || jLongValue == j2) {
                        jA = jLongValue;
                    } else {
                        nel nelVar = msfVar.a;
                        long j8 = mckVar.m;
                        if (this.D && j8 != -9223372036854775807L) {
                            Double d = this.C.c;
                        }
                        jA = nelVar.a(jLongValue, this.B);
                    }
                    if (mgb.B(jA) == mgb.B(this.G.t) && ((i = (mtaVar = this.G).f) == 2 || i == 3)) {
                        jLongValue = mtaVar.t;
                    }
                } else {
                    jA = jLongValue;
                }
                this.E = this.D;
                long jK = k(nenVarG, jA, this.G.f == 4);
                boolean z6 = z2 | (jLongValue != jK);
                try {
                    mta mtaVar2 = this.G;
                    mcl mclVar2 = mtaVar2.b;
                    nen nenVar3 = nenVarG;
                    long j9 = j;
                    try {
                        ac(mclVar2, nenVar3, mclVar2, mtaVar2.c, j9, true);
                        nenVar2 = nenVar3;
                        j5 = j9;
                        j6 = jK;
                        z4 = z6;
                        this.G = o(nenVar2, j6, j5, j6, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        nenVar = nenVar3;
                        j3 = j9;
                        j4 = jK;
                        z3 = z6;
                        this.G = o(nenVar, j4, j3, j4, z3, 2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nenVar = nenVarG;
                    j3 = j;
                }
            }
            z4 = z2;
            nenVar2 = nenVarG;
            j6 = jLongValue;
            j5 = j;
            this.G = o(nenVar2, j6, j5, j6, z4, 2);
        } catch (Throwable th3) {
            th = th3;
            nenVar = nenVarG;
            j3 = j;
            z3 = z2;
            j4 = jLongValue;
        }
    }

    private final void Q(mca mcaVar) {
        this.e.a(16);
        this.u.d(mcaVar);
    }

    private final void R(boolean z, int i, boolean z2, int i2) {
        this.H.a(z2 ? 1 : 0);
        Z(z, i, i2);
    }

    private final void S(int i) {
        mta mtaVar = this.G;
        if (mtaVar.f != i) {
            if (i != 2) {
                this.X = -9223372036854775807L;
            }
            this.G = mtaVar.g(i);
        }
    }

    private final void T(float f) {
        this.aa = f;
        float f2 = f * this.A.d;
        int i = 0;
        while (true) {
            mtm[] mtmVarArr = this.a;
            if (i >= mtmVarArr.length) {
                return;
            }
            mtm mtmVar = mtmVarArr[i];
            if (mtmVar.b() == 1) {
                mth mthVar = mtmVar.a;
                Float fValueOf = Float.valueOf(f2);
                mthVar.r(2, fValueOf);
                mth mthVar2 = mtmVar.c;
                if (mthVar2 != null) {
                    mthVar2.r(2, fValueOf);
                }
            }
            i++;
        }
    }

    private final void U() {
        msf msfVar = this.w.e;
        if (msfVar == null) {
            return;
        }
        nin ninVar = msfVar.k;
        int i = 0;
        while (true) {
            mtm[] mtmVarArr = this.a;
            if (i >= mtmVarArr.length) {
                return;
            }
            if (ninVar.b(i)) {
                mtmVarArr[i].i();
            }
            i++;
        }
    }

    private final void V(boolean z, boolean z2) {
        J(z || !this.P, false, true, false);
        this.H.a(z2 ? 1 : 0);
        this.m.c(this.x);
        this.A.a(this.G.m, 1);
        S(1);
    }

    private final void W() {
        this.u.f();
        int i = 0;
        while (true) {
            mtm[] mtmVarArr = this.a;
            if (i >= mtmVarArr.length) {
                return;
            }
            mtm mtmVar = mtmVarArr[i];
            mth mthVar = mtmVar.a;
            if (mtm.p(mthVar)) {
                mtm.s(mthVar);
            }
            mth mthVar2 = mtmVar.c;
            if (mthVar2 != null && mtm.p(mthVar2)) {
                mtm.s(mthVar2);
            }
            i++;
        }
    }

    private final void X() {
        msf msfVar = this.w.h;
        boolean z = true;
        if (!this.M && (msfVar == null || !msfVar.a.o())) {
            z = false;
        }
        mta mtaVar = this.G;
        if (z != mtaVar.h) {
            this.G = mtaVar.a(z);
        }
    }

    private final void Y() {
        mta mtaVar = this.G;
        Z(mtaVar.m, mtaVar.o, mtaVar.n);
    }

    private final void Z(boolean z, int i, int i2) {
        aa(z, this.A.a(z, this.G.f), i, i2);
    }

    static int a(mck mckVar, mcj mcjVar, int i, boolean z, Object obj, mcl mclVar, mcl mclVar2) {
        mcj mcjVar2;
        Object obj2 = mclVar.p(mclVar.o(obj, mcjVar).c, mckVar).b;
        int i2 = 0;
        for (int i3 = 0; i3 < mclVar2.c(); i3++) {
            if (mclVar2.p(i3, mckVar).b.equals(obj2)) {
                return i3;
            }
        }
        int iA = mclVar.a(obj);
        int iB = mclVar.b();
        int i4 = iA;
        int iA2 = -1;
        while (i2 < iB && iA2 == -1) {
            mck mckVar2 = mckVar;
            mcjVar2 = mcjVar;
            int i5 = i;
            boolean z2 = z;
            mcl mclVar3 = mclVar;
            i4 = mclVar3.i(i4, mcjVar2, mckVar2, i5, z2);
            if (i4 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = mclVar2.a(mclVar3.f(i4));
            i2++;
            mclVar = mclVar3;
            mcjVar = mcjVar2;
            mckVar = mckVar2;
            i = i5;
            z = z2;
        }
        mcjVar2 = mcjVar;
        if (iA2 == -1) {
            return -1;
        }
        return mclVar2.n(iA2, mcjVar2).c;
    }

    private final void aa(boolean z, int i, int i2, int i3) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        mta mtaVar = this.G;
        if (mtaVar.m == z2 && mtaVar.o == i2 && mtaVar.n == i3) {
            return;
        }
        this.G = mtaVar.d(z2, i3, i2);
        ad(false, false);
        msi msiVar = this.w;
        for (msf msfVar = msiVar.e; msfVar != null; msfVar = msfVar.i) {
            for (nif nifVar : msfVar.k.c) {
            }
        }
        if (!ah()) {
            W();
            ab();
            msiVar.k(this.S);
            return;
        }
        int i4 = this.G.f;
        if (i4 == 3) {
            this.u.e();
            U();
            this.e.j(2);
        } else if (i4 == 2) {
            this.e.j(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0136, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ab() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.ab():void");
    }

    private final void ac(mcl mclVar, nen nenVar, mcl mclVar2, nen nenVar2, long j, boolean z) {
        if (!ai(mclVar, nenVar)) {
            mca mcaVar = nenVar.b() ? mca.a : this.G.p;
            if (this.u.b().equals(mcaVar)) {
                return;
            }
            Q(mcaVar);
            B(this.G.p, mcaVar.b, false, false);
            return;
        }
        Object obj = nenVar.a;
        mcj mcjVar = this.s;
        int i = mclVar.o(obj, mcjVar).c;
        mck mckVar = this.r;
        mclVar.p(i, mckVar);
        mpf mpfVar = this.ac;
        mbk mbkVar = mckVar.j;
        String str = mgb.a;
        mpfVar.h = mgb.w(mbkVar.a);
        mpfVar.j = mgb.w(mbkVar.b);
        mpfVar.k = mgb.w(mbkVar.c);
        float f = mbkVar.d;
        if (f == -3.4028235E38f) {
            float f2 = mpfVar.a;
            f = 0.97f;
        }
        mpfVar.n = f;
        float f3 = mbkVar.e;
        if (f3 == -3.4028235E38f) {
            float f4 = mpfVar.b;
            f3 = 1.03f;
        }
        mpfVar.m = f3;
        if (f == 1.0f && f3 == 1.0f) {
            mpfVar.h = -9223372036854775807L;
        }
        mpfVar.a();
        if (j != -9223372036854775807L) {
            mpfVar.b(g(mclVar, obj, j));
            return;
        }
        if (!Objects.equals(!mclVar2.q() ? mclVar2.p(mclVar2.o(nenVar2.a, mcjVar).c, mckVar).b : null, mckVar.b) || z) {
            mpfVar.b(-9223372036854775807L);
        }
    }

    private final void ad(boolean z, boolean z2) {
        this.K = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.L = jElapsedRealtime;
    }

    private final boolean ae() {
        if (!this.z) {
            return false;
        }
        for (mtm mtmVar : this.a) {
            if (mtmVar.l()) {
                return true;
            }
        }
        return false;
    }

    private final boolean af() {
        msf msfVar = this.w.e;
        long j = msfVar.g.e;
        if (msfVar.e) {
            return j == -9223372036854775807L || this.G.t < j || !ah();
        }
        return false;
    }

    private static boolean ag(mta mtaVar, mcj mcjVar) {
        nen nenVar = mtaVar.c;
        mcl mclVar = mtaVar.b;
        return mclVar.q() || mclVar.o(nenVar.a, mcjVar).f;
    }

    private final boolean ah() {
        mta mtaVar = this.G;
        return mtaVar.m && mtaVar.o == 0;
    }

    private final boolean ai(mcl mclVar, nen nenVar) {
        if (!nenVar.b() && !mclVar.q()) {
            int i = mclVar.o(nenVar.a, this.s).c;
            mck mckVar = this.r;
            mclVar.p(i, mckVar);
            if (mckVar.c() && mckVar.i && mckVar.f != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private static final boolean aj(msf msfVar) {
        if (msfVar != null) {
            try {
                if (msfVar.e) {
                    for (ngc ngcVar : msfVar.c) {
                        if (ngcVar != null) {
                            ngcVar.c();
                        }
                    }
                } else {
                    msfVar.a.j();
                }
                if (msfVar.c() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void ak(nin ninVar) {
        msi msiVar = this.w;
        msf msfVar = msiVar.h;
        mee.f(msfVar);
        if (msfVar != msiVar.e) {
            long j = msfVar.g.b;
        }
        long j2 = j(msfVar.b());
        long j3 = ai(this.G.b, msfVar.g.a) ? this.ac.l : -9223372036854775807L;
        mpi mpiVar = this.m;
        mwx mwxVar = this.x;
        mcl mclVar = this.G.b;
        float f = this.u.b().b;
        boolean z = this.G.m;
        msb msbVar = new msb(mwxVar, j2, f, this.K, j3);
        nif[] nifVarArr = ninVar.c;
        mph mphVar = (mph) mpiVar.e.get(msbVar.a);
        mee.f(mphVar);
        int length = nifVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                mphVar.b = Math.max(13107200, i2);
                mpiVar.d();
                return;
            }
            nif nifVar = nifVarArr[i];
            if (nifVar != null) {
                switch (nifVar.c().c) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i3 = 144310272;
                        break;
                    case 2:
                        i3 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i3 = 131072;
                        break;
                }
                i2 += i3;
            }
            i++;
        }
    }

    public static final void f(mte mteVar) {
        mteVar.b();
        try {
            mteVar.a.r(mteVar.b, mteVar.c);
        } finally {
            mteVar.a(true);
        }
    }

    private final long g(mcl mclVar, Object obj, long j) {
        mcj mcjVar = this.s;
        int i = mclVar.o(obj, mcjVar).c;
        mck mckVar = this.r;
        mclVar.p(i, mckVar);
        if (mckVar.f == -9223372036854775807L || !mckVar.c() || !mckVar.i) {
            return -9223372036854775807L;
        }
        long j2 = mckVar.g;
        String str = mgb.a;
        return mgb.w((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - mckVar.f) - (j + mcjVar.e);
    }

    private final long h(msf msfVar) {
        long jMax = msfVar.l;
        if (msfVar.e) {
            int i = 0;
            while (true) {
                mtm[] mtmVarArr = this.a;
                if (i >= mtmVarArr.length) {
                    break;
                }
                if (mtmVarArr[i].n(msfVar)) {
                    mth mthVarD = mtmVarArr[i].d(msfVar);
                    mthVarD.getClass();
                    long jF = mthVarD.f();
                    if (jF == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(jF, jMax);
                }
                i++;
            }
        }
        return jMax;
    }

    private final long i() {
        return j(this.G.r);
    }

    private final long j(long j) {
        msf msfVar = this.w.h;
        if (msfVar == null) {
            return 0L;
        }
        return Math.max(0L, j - msfVar.e(this.S));
    }

    private final long k(nen nenVar, long j, boolean z) {
        msi msiVar = this.w;
        return l(nenVar, j, msiVar.e != msiVar.f, z);
    }

    private final long l(nen nenVar, long j, boolean z, boolean z2) {
        W();
        ad(false, true);
        if (z2 || this.G.f == 3) {
            S(2);
        }
        msi msiVar = this.w;
        msf msfVar = msiVar.e;
        msf msfVar2 = msfVar;
        while (msfVar2 != null && !nenVar.equals(msfVar2.g.a)) {
            msfVar2 = msfVar2.i;
        }
        if (z || msfVar != msfVar2 || (msfVar2 != null && msfVar2.f(j) < 0)) {
            s();
            if (msfVar2 != null) {
                while (msiVar.e != msfVar2) {
                    msiVar.c();
                }
                msiVar.a(msfVar2);
                msfVar2.l = 1000000000000L;
                v();
                msfVar2.h = true;
            }
        }
        q();
        if (msfVar2 != null) {
            msiVar.a(msfVar2);
            if (!msfVar2.e) {
                msfVar2.g = msfVar2.g.b(j);
            } else if (msfVar2.f) {
                nel nelVar = msfVar2.a;
                j = nelVar.g(j);
                nelVar.q(j - this.t);
            }
            L(j);
            C();
        } else {
            msiVar.h();
            L(j);
        }
        y(false);
        this.e.j(2);
        return j;
    }

    private final Pair m(mcl mclVar) {
        long j = 0;
        if (mclVar.q()) {
            return Pair.create(mta.a, 0L);
        }
        int iG = mclVar.g(this.O);
        mck mckVar = this.r;
        mcj mcjVar = this.s;
        Pair pairL = mclVar.l(mckVar, mcjVar, iG, -9223372036854775807L);
        nen nenVarG = this.w.g(mclVar, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (nenVarG.b()) {
            mclVar.o(nenVarG.a, mcjVar);
            if (nenVarG.c == mcjVar.d(nenVarG.b)) {
                mcjVar.i();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(nenVarG, Long.valueOf(j));
    }

    private static Pair n(mcl mclVar, mrx mrxVar, boolean z, int i, boolean z2, mck mckVar, mcj mcjVar) {
        Pair pairL;
        mcl mclVar2;
        mcl mclVar3 = mrxVar.a;
        if (mclVar.q()) {
            return null;
        }
        if (true == mclVar3.q()) {
            mclVar3 = mclVar;
        }
        try {
            pairL = mclVar3.l(mckVar, mcjVar, mrxVar.b, mrxVar.c);
            mclVar2 = mclVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!mclVar.equals(mclVar2)) {
            if (mclVar.a(pairL.first) == -1) {
                int iA = a(mckVar, mcjVar, i, z2, pairL.first, mclVar2, mclVar);
                if (iA != -1) {
                    return mclVar.l(mckVar, mcjVar, iA, -9223372036854775807L);
                }
                return null;
            }
            if (mclVar2.o(pairL.first, mcjVar).f && mclVar2.p(mcjVar.c, mckVar).n == mclVar2.a(pairL.first)) {
                return mclVar.l(mckVar, mcjVar, mclVar.o(pairL.first, mcjVar).c, mrxVar.c);
            }
        }
        return pairL;
    }

    private final mta o(nen nenVar, long j, long j2, long j3, boolean z, int i) {
        ngo ngoVar;
        nin ninVar;
        List list;
        ekgb ekgbVarG;
        ngo ngoVar2;
        this.V = (!this.V && j == this.G.t && nenVar.equals(this.G.c)) ? false : true;
        K();
        mta mtaVar = this.G;
        ngo ngoVar3 = mtaVar.i;
        nin ninVar2 = mtaVar.j;
        List list2 = mtaVar.k;
        if (this.h.i) {
            msi msiVar = this.w;
            msf msfVar = msiVar.e;
            ngo ngoVar4 = msfVar == null ? ngo.a : msfVar.j;
            nin ninVar3 = msfVar == null ? this.d : msfVar.k;
            nif[] nifVarArr = ninVar3.c;
            ekfw ekfwVar = new ekfw();
            int length = nifVarArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                nif nifVar = nifVarArr[i2];
                if (nifVar != null) {
                    mbt mbtVar = nifVar.a(0).l;
                    if (mbtVar == null) {
                        ngoVar2 = ngoVar4;
                        ekfwVar.h(new mbt(new mbs[0]));
                    } else {
                        ngoVar2 = ngoVar4;
                        ekfwVar.h(mbtVar);
                        z2 = true;
                    }
                } else {
                    ngoVar2 = ngoVar4;
                }
                i2++;
                ngoVar4 = ngoVar2;
            }
            ngo ngoVar5 = ngoVar4;
            if (z2) {
                ekgbVarG = ekfwVar.g();
            } else {
                int i3 = ekgb.d;
                ekgbVarG = ekoe.a;
            }
            if (msfVar != null) {
                msg msgVar = msfVar.g;
                if (msgVar.c != j2) {
                    msfVar.g = msgVar.a(j2);
                }
            }
            msf msfVar2 = msiVar.e;
            if (msfVar2 == msiVar.f && msfVar2 != null) {
                nin ninVar4 = msfVar2.k;
                int i4 = 0;
                while (true) {
                    mtm[] mtmVarArr = this.a;
                    if (i4 >= mtmVarArr.length) {
                        break;
                    }
                    if (ninVar4.b(i4)) {
                        if (mtmVarArr[i4].b() != 1) {
                            break;
                        }
                        int i5 = ninVar4.b[i4].b;
                    }
                    i4++;
                }
            }
            list = ekgbVarG;
            ninVar = ninVar3;
            ngoVar = ngoVar5;
        } else {
            if (!nenVar.equals(mtaVar.c)) {
                ninVar2 = this.d;
                ngoVar3 = ngo.a;
                int i6 = ekgb.d;
                list2 = ekoe.a;
            }
            ngoVar = ngoVar3;
            ninVar = ninVar2;
            list = list2;
        }
        if (z) {
            mrw mrwVar = this.H;
            if (!mrwVar.d || mrwVar.e == 5) {
                mrwVar.a = true;
                mrwVar.d = true;
                mrwVar.e = i;
            } else {
                mee.a(i == 5);
            }
        }
        return this.G.c(nenVar, j, j2, j3, i(), ngoVar, ninVar, list);
    }

    private final void p() {
        int i = 0;
        while (true) {
            mtm[] mtmVarArr = this.a;
            if (i >= mtmVarArr.length) {
                return;
            }
            mtm mtmVar = mtmVarArr[i];
            mtp mtpVar = this.D ? this.C : null;
            mtmVar.a.r(18, mtpVar);
            mth mthVar = mtmVar.c;
            if (mthVar != null) {
                mthVar.r(18, mtpVar);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q() {
        /*
            r11 = this;
            boolean r0 = r11.z
            if (r0 == 0) goto L59
            boolean r0 = r11.ae()
            if (r0 != 0) goto Lb
            goto L59
        Lb:
            mtm[] r0 = r11.a
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.length
            if (r2 >= r3) goto L52
            r3 = r0[r2]
            int r4 = r3.a()
            mpk r5 = r11.u
            boolean r6 = r3.l()
            if (r6 != 0) goto L21
            goto L45
        L21:
            int r6 = r3.d
            r7 = 4
            r8 = 1
            if (r6 == r7) goto L2e
            r9 = 2
            if (r6 != r9) goto L2c
            r6 = r9
            goto L2e
        L2c:
            r9 = r1
            goto L2f
        L2e:
            r9 = r8
        L2f:
            if (r9 == 0) goto L34
            mth r10 = r3.a
            goto L39
        L34:
            mth r10 = r3.c
            defpackage.mee.f(r10)
        L39:
            r3.e(r10, r5)
            r3.g(r9)
            if (r6 != r7) goto L42
            goto L43
        L42:
            r8 = r1
        L43:
            r3.d = r8
        L45:
            int r5 = r11.Q
            int r3 = r3.a()
            int r4 = r4 - r3
            int r5 = r5 - r4
            r11.Q = r5
            int r2 = r2 + 1
            goto Lf
        L52:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.Y = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.q():void");
    }

    private final void r(int i) {
        mtm[] mtmVarArr = this.a;
        int iA = mtmVarArr[i].a();
        mtm mtmVar = mtmVarArr[i];
        mth mthVar = mtmVar.a;
        mpk mpkVar = this.u;
        mtmVar.e(mthVar, mpkVar);
        mth mthVar2 = mtmVar.c;
        if (mthVar2 != null) {
            boolean z = mtm.p(mthVar2) && mtmVar.d != 3;
            mtmVar.e(mthVar2, mpkVar);
            mtmVar.g(false);
            if (z) {
                mtmVar.j(true);
            }
        }
        mtmVar.d = 0;
        G(i, false);
        this.Q -= iA;
    }

    private final void s() {
        for (int i = 0; i < this.a.length; i++) {
            r(i);
        }
        this.Y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0767 A[PHI: r12
      0x0767: PHI (r12v3 long) = (r12v4 long), (r12v4 long), (r12v4 long), (r12v4 long), (r12v4 long), (r12v5 long) binds: [B:440:0x0714, B:446:0x0721, B:444:0x071e, B:437:0x0700, B:438:0x0702, B:390:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0415 A[EDGE_INSN: B:516:0x0415->B:240:0x0415 BREAK  A[LOOP:1: B:233:0x03e3->B:239:0x0403], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x05e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t() {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.t():void");
    }

    private final void u(msf msfVar, int i, boolean z, long j) {
        mtm mtmVar = this.a[i];
        if (mtmVar.o()) {
            return;
        }
        boolean z2 = msfVar == this.w.e;
        nin ninVar = msfVar.k;
        mtl mtlVar = ninVar.b[i];
        nif nifVar = ninVar.c[i];
        boolean z3 = ah() && this.G.f == 3;
        boolean z4 = !z && z3;
        this.Q++;
        ngc ngcVar = msfVar.c[i];
        long j2 = msfVar.l;
        nen nenVar = msfVar.g.a;
        mpk mpkVar = this.u;
        mau[] mauVarArrR = mtm.r(nifVar);
        int i2 = mtmVar.d;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            mtmVar.e = true;
            mth mthVar = mtmVar.a;
            mthVar.P(mtlVar, mauVarArrR, ngcVar, z4, z2, j, j2, nenVar);
            mpkVar.c(mthVar);
        } else {
            mtmVar.f = true;
            mth mthVar2 = mtmVar.c;
            mee.f(mthVar2);
            mthVar2.P(mtlVar, mauVarArrR, ngcVar, z4, z2, j, j2, nenVar);
            mpkVar.c(mthVar2);
        }
        mrs mrsVar = new mrs(this);
        mth mthVarD = mtmVar.d(msfVar);
        mee.f(mthVarD);
        mthVarD.r(11, mrsVar);
        if (z3 && z2) {
            mtmVar.i();
        }
    }

    private final void v() {
        w(new boolean[this.a.length], this.w.f.d());
    }

    private final void w(boolean[] zArr, long j) {
        mtm[] mtmVarArr;
        long j2;
        msf msfVar = this.w.f;
        nin ninVar = msfVar.k;
        int i = 0;
        while (true) {
            mtmVarArr = this.a;
            if (i >= mtmVarArr.length) {
                break;
            }
            if (!ninVar.b(i)) {
                mtmVarArr[i].h();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < mtmVarArr.length) {
            if (!ninVar.b(i2) || mtmVarArr[i2].n(msfVar)) {
                j2 = j;
            } else {
                j2 = j;
                u(msfVar, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void x(IOException iOException, int i) {
        mpn mpnVar = new mpn(0, iOException, i);
        msf msfVar = this.w.e;
        if (msfVar != null) {
            mpnVar = mpnVar.a(msfVar.g.a);
        }
        mff.d("ExoPlayerImplInternal", "Playback error", mpnVar);
        V(false, false);
        this.G = this.G.e(mpnVar);
    }

    private final void y(boolean z) {
        msf msfVar = this.w.h;
        nen nenVar = msfVar == null ? this.G.c : msfVar.g.a;
        boolean zEquals = this.G.l.equals(nenVar);
        if (!zEquals) {
            this.G = this.G.b(nenVar);
        }
        mta mtaVar = this.G;
        mtaVar.r = msfVar == null ? mtaVar.t : msfVar.b();
        this.G.s = i();
        if ((!zEquals || z) && msfVar != null && msfVar.e) {
            nen nenVar2 = msfVar.g.a;
            ak(msfVar.k);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e3, code lost:
    
        r7 = r9.a(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.mcl r32, boolean r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.z(mcl, boolean):void");
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ void b(nge ngeVar) {
        this.e.d(9, (nel) ngeVar).b();
    }

    @Override // defpackage.nkz
    public final void c(long j, long j2, mau mauVar, MediaFormat mediaFormat) {
        if (this.E) {
            this.e.c(37).b();
        }
    }

    @Override // defpackage.nek
    public final void d(nel nelVar) {
        this.e.d(8, nelVar).b();
    }

    public final void e(mac macVar, boolean z) {
        this.e.g(31, z ? 1 : 0, macVar).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0705  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [mry] */
    /* JADX WARN: Type inference failed for: r4v6, types: [min, nit] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mry.handleMessage(android.os.Message):boolean");
    }
}
