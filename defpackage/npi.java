package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npi implements nnr {
    public npl[] a;
    private final mfr b;
    private final nph c;
    private final boolean d;
    private final nvl e;
    private int f;
    private nnu g;
    private npj h;
    private long i;
    private long j;
    private npl k;
    private int l;
    private long m;
    private long n;
    private int o;
    private boolean p;

    @Deprecated
    public npi() {
        this(1, nvl.a);
    }

    private final npl h(int i) {
        for (npl nplVar : this.a) {
            if (nplVar.c == i || nplVar.d == i) {
                return nplVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x034d  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r22, defpackage.non r23) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.f = 0;
        if (this.d) {
            nnuVar = new nvo(nnuVar, this.e);
        }
        this.g = nnuVar;
        this.j = -1L;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (npl nplVar : this.a) {
            if (nplVar.j == 0) {
                nplVar.h = 0;
            } else {
                nplVar.h = nplVar.m[mgb.al(nplVar.l, j, true)];
            }
        }
        if (j == 0) {
            this.f = this.a.length != 0 ? 3 : 0;
        } else {
            this.f = 6;
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        mfr mfrVar = this.b;
        nnsVar.i(mfrVar.a, 0, 12);
        mfrVar.K(0);
        if (mfrVar.f() != 1179011410) {
            return false;
        }
        mfrVar.L(4);
        return mfrVar.f() == 541677121;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public npi(int i, nvl nvlVar) {
        this.e = nvlVar;
        this.d = 1 == (i ^ 1);
        this.b = new mfr(12);
        this.c = new nph();
        this.g = new nol();
        this.a = new npl[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.i = -9223372036854775807L;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
