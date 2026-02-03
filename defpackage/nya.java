package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nya implements nnr {
    private final nyb a;
    private final mfr b;
    private final mfr c;
    private final mfq d;
    private nnu e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public nya() {
        this(null);
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        mee.g(this.e);
        mfr mfrVar = this.b;
        int iA = nnsVar.a(mfrVar.a, 0, 2048);
        if (!this.i) {
            this.e.w(new nop(-9223372036854775807L));
            this.i = true;
        }
        if (iA == -1) {
            return -1;
        }
        mfrVar.K(0);
        mfrVar.J(iA);
        if (!this.h) {
            this.a.b = this.f;
            this.h = true;
        }
        this.a.a(mfrVar);
        return 0;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.e = nnuVar;
        this.a.b(nnuVar, new nzq(0, 1));
        nnuVar.r();
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.h = false;
        this.a.e();
        this.f = j2;
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        mfr mfrVar;
        int i = 0;
        while (true) {
            mfrVar = this.c;
            nnsVar.i(mfrVar.a, 0, 10);
            mfrVar.K(0);
            if (mfrVar.l() != 4801587) {
                break;
            }
            mfrVar.L(3);
            int i2 = mfrVar.i();
            i += i2 + 10;
            nnsVar.g(i2);
        }
        nnsVar.k();
        nnsVar.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i;
        do {
            nnsVar.i(mfrVar.a, 0, 2);
            mfrVar.K(0);
            if (nyb.f(mfrVar.n())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                nnsVar.i(mfrVar.a, 0, 4);
                mfq mfqVar = this.d;
                mfqVar.l(14);
                int iD = mfqVar.d(13);
                if (iD <= 6) {
                    i5++;
                    nnsVar.k();
                    nnsVar.g(i5);
                } else {
                    nnsVar.g(iD - 6);
                    i4 += iD;
                }
            } else {
                i5++;
                nnsVar.k();
                nnsVar.g(i5);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i < 8192);
        return false;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public nya(byte[] bArr) {
        this.a = new nyb(true, null, 0, "audio/mp4a-latm");
        this.b = new mfr(2048);
        this.g = -1L;
        mfr mfrVar = new mfr(10);
        this.c = mfrVar;
        this.d = new mfq(mfrVar.a);
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
