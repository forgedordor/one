package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwi {
    protected ffwg[] a;
    protected ffwg[] b;
    private ffwa c;
    private ffwg d;

    public ffwi(ffwa ffwaVar, ffwg ffwgVar) {
        int i;
        int iB;
        int[] iArr;
        this.c = ffwaVar;
        this.d = ffwgVar;
        int iC = ffwgVar.c();
        this.a = new ffwg[iC];
        int i2 = 0;
        while (true) {
            i = iC >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3 + 1];
            iArr2[i3] = 1;
            this.a[i2] = new ffwg(this.c, iArr2);
            i2++;
        }
        while (i < iC) {
            int i4 = i + i;
            int[] iArr3 = new int[i4 + 1];
            iArr3[i4] = 1;
            ffwg ffwgVar2 = new ffwg(this.c, iArr3);
            ffwg[] ffwgVarArr = this.a;
            ffwg ffwgVar3 = this.d;
            int[] iArr4 = ffwgVar2.c;
            int[] iArr5 = ffwgVar3.c;
            int iA = ffwg.a(iArr5);
            if (iA == -1) {
                throw new ArithmeticException("Division by zero");
            }
            int length = iArr4.length;
            int[] iArrI = new int[length];
            int iA2 = ffwgVar2.a.a(ffwg.d(iArr5));
            System.arraycopy(iArr4, 0, iArrI, 0, length);
            while (iA <= ffwg.a(iArrI)) {
                int iB2 = ffwgVar2.a.b(ffwg.d(iArrI), iA2);
                int iA3 = ffwg.a(iArrI) - iA;
                int iA4 = ffwg.a(iArr5);
                if (iA4 == -1) {
                    iArr = new int[1];
                } else {
                    int[] iArr6 = new int[iA4 + iA3 + 1];
                    System.arraycopy(iArr5, 0, iArr6, iA3, iA4 + 1);
                    iArr = iArr6;
                }
                iArrI = ffwg.i(ffwgVar2.h(iArr, iB2), iArrI);
            }
            ffwgVarArr[i] = new ffwg(ffwgVar2.a, iArrI);
            i++;
        }
        int iC2 = this.d.c();
        ffwg[] ffwgVarArr2 = new ffwg[iC2];
        int i5 = iC2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            ffwgVarArr2[i6] = new ffwg(this.a[i6]);
        }
        this.b = new ffwg[iC2];
        while (i5 >= 0) {
            this.b[i5] = new ffwg(this.c, i5);
            i5--;
        }
        int i7 = 0;
        while (i7 < iC2) {
            int i8 = i7 + 1;
            if (ffwgVarArr2[i7].b(i7) == 0) {
                boolean z = false;
                int i9 = i8;
                while (i9 < iC2) {
                    if (ffwgVarArr2[i9].b(i7) != 0) {
                        a(ffwgVarArr2, i7, i9);
                        a(this.b, i7, i9);
                        i9 = iC2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iA5 = this.c.a(ffwgVarArr2[i7].b(i7));
            ffwgVarArr2[i7].g(iA5);
            this.b[i7].g(iA5);
            for (int i10 = 0; i10 < iC2; i10++) {
                if (i10 != i7 && (iB = ffwgVarArr2[i10].b(i7)) != 0) {
                    ffwg ffwgVarE = ffwgVarArr2[i7].e(iB);
                    ffwg ffwgVarE2 = this.b[i7].e(iB);
                    ffwgVarArr2[i10].f(ffwgVarE);
                    this.b[i10].f(ffwgVarE2);
                }
            }
            i7 = i8;
        }
    }

    private static void a(ffwg[] ffwgVarArr, int i, int i2) {
        ffwg ffwgVar = ffwgVarArr[i];
        ffwgVarArr[i] = ffwgVarArr[i2];
        ffwgVarArr[i2] = ffwgVar;
    }
}
