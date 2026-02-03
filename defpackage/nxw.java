package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxw implements nnr {
    private final nxx a = new nxx("audio/ac3");
    private final mfr b = new mfr(2786);
    private boolean c;

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        mfr mfrVar = this.b;
        int iA = nnsVar.a(mfrVar.a, 0, 2786);
        if (iA == -1) {
            return -1;
        }
        mfrVar.K(0);
        mfrVar.J(iA);
        if (!this.c) {
            this.a.a = 0L;
            this.c = true;
        }
        this.a.a(mfrVar);
        return 0;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.a.b(nnuVar, new nzq(0, 1));
        nnuVar.r();
        nnuVar.w(new nop(-9223372036854775807L));
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.c = false;
        this.a.e();
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        int iA;
        mfr mfrVar = new mfr(10);
        int i = 0;
        while (true) {
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
        int i3 = 0;
        int i4 = i;
        while (true) {
            nnsVar.i(mfrVar.a, 0, 6);
            mfrVar.K(0);
            if (mfrVar.n() != 2935) {
                nnsVar.k();
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                nnsVar.g(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = mfrVar.a;
                int[] iArr = nmt.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i5 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iA = i5 + i5;
                } else {
                    byte b = bArr[4];
                    iA = nmt.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    return false;
                }
                nnsVar.g(iA - 6);
            }
        }
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
