package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ned implements mhl {
    private final mhl a;
    private final int b;
    private final byte[] c;
    private int d;
    private final nfl e;

    public ned(mhl mhlVar, int i, nfl nflVar) {
        mee.a(i > 0);
        this.a = mhlVar;
        this.b = i;
        this.e = nflVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            mhl mhlVar = this.a;
            byte[] bArr2 = this.c;
            int i4 = 0;
            if (mhlVar.a(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iA = mhlVar.a(bArr3, i4, i6);
                        if (iA != -1) {
                            i4 += iA;
                            i6 -= iA;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        nfl nflVar = this.e;
                        mfr mfrVar = new mfr(bArr3, i5);
                        long jMax = !nflVar.m ? nflVar.j : Math.max(nflVar.n.d(true), nflVar.j);
                        int iA2 = mfrVar.a();
                        nox noxVar = nflVar.l;
                        mee.f(noxVar);
                        noxVar.m(mfrVar, iA2);
                        noxVar.o(jMax, 1, iA2, 0, null);
                        nflVar.m = true;
                    }
                }
                i3 = this.b;
                this.d = i3;
            }
            return -1;
        }
        int iA3 = this.a.a(bArr, i, Math.min(i3, i2));
        if (iA3 != -1) {
            this.d -= iA3;
        }
        return iA3;
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mhl
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.mhl
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mhl
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.mhl
    public final void f(min minVar) {
        mee.f(minVar);
        this.a.f(minVar);
    }
}
