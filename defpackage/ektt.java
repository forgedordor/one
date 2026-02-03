package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektt extends ektv {
    public final int[] a;
    public final int b;
    private final ekte c;
    private final ekte d;

    public ektt(ekte ekteVar, ekte ekteVar2) {
        int iH;
        this.c = ekteVar;
        this.d = ekteVar2;
        int iB = ekteVar.b() + ekteVar2.b();
        int i = 0;
        ekwr.a(iB <= 28, "metadata size too large");
        int[] iArr = new int[iB];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            ekrz ekrzVarE = e(i);
            long j2 = ekrzVarE.d | j;
            if (j2 != j || (iH = h(ekrzVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = ekrzVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(ekrz ekrzVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ekrzVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ektv
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ektv
    public final Object b(ekrz ekrzVar) {
        ekwr.a(!ekrzVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(ekrzVar, iArr, this.b);
        if (iH >= 0) {
            return ekrzVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.ektv
    public final Set c() {
        return new ektr(this);
    }

    @Override // defpackage.ektv
    public final void d(ektl ektlVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            ekrz ekrzVarE = e(i2 & 31);
            if (ekrzVarE.b) {
                ektlVar.b(ekrzVarE, new ekts(this, ekrzVarE, i2), obj);
            } else {
                ektlVar.a(ekrzVarE, ekrzVarE.c(f(i2)), obj);
            }
        }
    }

    public final ekrz e(int i) {
        ekte ekteVar = this.c;
        int iB = ekteVar.b();
        return i >= iB ? this.d.c(i - iB) : ekteVar.c(i);
    }

    public final Object f(int i) {
        ekte ekteVar = this.c;
        int iB = ekteVar.b();
        return i >= iB ? this.d.e(i - iB) : ekteVar.e(i);
    }
}
