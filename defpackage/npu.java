package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npu implements nnr {
    private final byte[] a;
    private final mfr b;
    private final nnx c;
    private nnu d;
    private nox e;
    private int f;
    private mbt g;
    private noc h;
    private int i;
    private int j;
    private npt k;
    private int l;
    private long m;

    public npu() {
        this(null);
    }

    private final long h(mfr mfrVar, boolean z) {
        boolean zC;
        mee.f(this.h);
        int i = mfrVar.b;
        while (i <= mfrVar.c - 16) {
            mfrVar.K(i);
            noc nocVar = this.h;
            int i2 = this.j;
            nnx nnxVar = this.c;
            if (nny.c(mfrVar, nocVar, i2, nnxVar)) {
                mfrVar.K(i);
                return nnxVar.a;
            }
            i++;
        }
        if (!z) {
            mfrVar.K(i);
            return -1L;
        }
        while (true) {
            int i3 = mfrVar.c;
            if (i > i3 - this.i) {
                mfrVar.K(i3);
                return -1L;
            }
            mfrVar.K(i);
            try {
                zC = nny.c(mfrVar, this.h, this.j, this.c);
            } catch (IndexOutOfBoundsException unused) {
                zC = false;
            }
            if (mfrVar.b <= mfrVar.c && zC) {
                mfrVar.K(i);
                return this.c.a;
            }
            i++;
        }
    }

    private final void i() {
        long j = this.m * 1000000;
        noc nocVar = this.h;
        String str = mgb.a;
        this.e.o(j / nocVar.e, 1, this.l, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0286 A[LOOP:0: B:74:0x016a->B:91:0x0286, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r25, defpackage.non r26) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npu.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.d = nnuVar;
        this.e = nnuVar.p(0, 1);
        nnuVar.r();
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            npt nptVar = this.k;
            if (nptVar != null) {
                nptVar.b(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.G(0);
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        nnz.a(nnsVar, false);
        mfr mfrVar = new mfr(4);
        nnsVar.i(mfrVar.a, 0, 4);
        return mfrVar.r() == 1716281667;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public npu(byte[] bArr) {
        this.a = new byte[42];
        this.b = new mfr(new byte[32768], 0);
        this.c = new nnx();
        this.f = 0;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
