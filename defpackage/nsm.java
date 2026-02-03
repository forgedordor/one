package defpackage;

import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsm implements nnr {
    public boolean a;
    private final mfr b;
    private final noj c;
    private final nof d;
    private final noh e;
    private final nox f;
    private nnu g;
    private nox h;
    private nox i;
    private int j;
    private mbt k;
    private long l;
    private long m;
    private long n;
    private long o;
    private int p;
    private nso q;

    public nsm() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [noq, nso] */
    /* JADX WARN: Type inference failed for: r3v38, types: [nsn] */
    /* JADX WARN: Type inference failed for: r5v18, types: [nnu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int h(defpackage.nns r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsm.h(nns):int");
    }

    private final long i(long j) {
        return this.l + ((j * 1000000) / this.c.d);
    }

    private final void j() {
        nso nsoVar = this.q;
        if ((nsoVar instanceof nsj) && nsoVar.y()) {
            long j = this.o;
            if (j == -1 || j == this.q.f()) {
                return;
            }
            nsj nsjVar = (nsj) this.q;
            this.q = new nsj(this.o, nsjVar.a, nsjVar.b, nsjVar.c);
            nnu nnuVar = this.g;
            mee.f(nnuVar);
            nnuVar.w(this.q);
            mee.f(this.h);
            this.q.w();
        }
    }

    private static boolean k(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean l(nns nnsVar) {
        nso nsoVar = this.q;
        if (nsoVar != null) {
            long jF = nsoVar.f();
            if (jF != -1 && nnsVar.e() > jF - 4) {
                return true;
            }
        }
        try {
            return !nnsVar.n(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean m(nns nnsVar, boolean z) throws EOFException {
        int iE;
        int i;
        int iA;
        nnsVar.k();
        if (((nni) nnsVar).b == 0) {
            mbt mbtVarA = this.e.a(nnsVar, null);
            this.k = mbtVarA;
            if (mbtVarA != null) {
                this.d.b(mbtVarA);
            }
            iE = (int) nnsVar.e();
            if (!z) {
                nnsVar.l(iE);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!l(nnsVar)) {
                mfr mfrVar = this.b;
                mfrVar.K(0);
                int iE2 = mfrVar.e();
                if ((i == 0 || k(iE2, i)) && (iA = nok.a(iE2)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(iE2);
                        i = iE2;
                    }
                    nnsVar.g(iA - 4);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        j();
                        throw new EOFException();
                    }
                    if (z) {
                        nnsVar.k();
                        nnsVar.g(iE + i4);
                    } else {
                        nnsVar.l(1);
                    }
                    i = 0;
                    i3 = i4;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                j();
                throw new EOFException();
            }
        }
        if (z) {
            nnsVar.l(iE + i3);
        } else {
            nnsVar.k();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) throws Throwable {
        mee.g(this.h);
        String str = mgb.a;
        int iH = h(nnsVar);
        if (iH == -1 && (this.q instanceof nsk)) {
            if (this.q.w() != i(this.m)) {
                throw null;
            }
        }
        return iH;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.g = nnuVar;
        nox noxVarP = nnuVar.p(0, 1);
        this.h = noxVarP;
        this.i = noxVarP;
        this.g.r();
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        nso nsoVar = this.q;
        if (nsoVar instanceof nsk) {
            throw null;
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        return m(nnsVar, true);
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public nsm(byte[] bArr) {
        this.b = new mfr(10);
        this.c = new noj();
        this.d = new nof();
        this.l = -9223372036854775807L;
        this.e = new noh();
        nno nnoVar = new nno();
        this.f = nnoVar;
        this.i = nnoVar;
        this.o = -1L;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
