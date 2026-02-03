package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxy implements nnr {
    private final nxz a = new nxz(null, 0, "audio/ac4");
    private final mfr b = new mfr(16384);
    private boolean c;

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        mfr mfrVar = this.b;
        int iA = nnsVar.a(mfrVar.a, 0, 16384);
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
        int i;
        mfr mfrVar = new mfr(10);
        int i2 = 0;
        while (true) {
            nnsVar.i(mfrVar.a, 0, 10);
            mfrVar.K(0);
            if (mfrVar.l() != 4801587) {
                break;
            }
            mfrVar.L(3);
            int i3 = mfrVar.i();
            i2 += i3 + 10;
            nnsVar.g(i3);
        }
        nnsVar.k();
        nnsVar.g(i2);
        int i4 = 0;
        int i5 = i2;
        while (true) {
            int i6 = 7;
            nnsVar.i(mfrVar.a, 0, 7);
            mfrVar.K(0);
            int iN = mfrVar.n();
            if (iN == 44096 || iN == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = mfrVar.a;
                int i7 = nmw.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i8 == 65535) {
                        i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i6 = 4;
                    }
                    if (iN == 44097) {
                        i6 += 2;
                    }
                    i = i8 + i6;
                }
                if (i == -1) {
                    return false;
                }
                nnsVar.g(i - 7);
            } else {
                nnsVar.k();
                i5++;
                if (i5 - i2 >= 8192) {
                    return false;
                }
                nnsVar.g(i5);
                i4 = 0;
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
