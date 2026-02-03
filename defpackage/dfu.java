package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfu implements der {
    private final dft a;

    public dfu(dft dftVar) {
        this.a = dftVar;
    }

    @Override // defpackage.der
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final djh a(dib dibVar) {
        int[] iArr;
        Object[] objArr;
        int i;
        int[] iArr2;
        Object[] objArr2;
        char c;
        dft dftVar = this.a;
        cuh cuhVar = dftVar.b;
        cug cugVar = new cug(cuhVar.e + 2);
        cuh cuhVar2 = new cuh(cuhVar.e);
        int[] iArr3 = cuhVar.b;
        Object[] objArr3 = cuhVar.c;
        long[] jArr = cuhVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            c = '\b';
                            int i6 = iArr3[i5];
                            dfs dfsVar = (dfs) objArr3[i5];
                            cugVar.f(i6);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            deh dehVar = (deh) dibVar.a.invoke(dfsVar.a);
                            des desVar = dfsVar.b;
                            int i7 = dfsVar.c;
                            cuhVar2.f(i6, new djg(dehVar, desVar));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c = '\b';
                        }
                        j >>= c;
                        i4++;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!cuhVar.b(0)) {
            if (cugVar.b < 0) {
                cwh.c("Index must be between 0 and size");
            }
            cugVar.e(cugVar.b + 1);
            int[] iArr4 = cugVar.a;
            int i8 = cugVar.b;
            if (i8 != 0) {
                fcur.l(iArr4, iArr4, 1, 0, i8);
            }
            iArr4[0] = 0;
            cugVar.b++;
        }
        if (!cuhVar.b(dftVar.a)) {
            cugVar.f(dftVar.a);
        }
        int i9 = cugVar.b;
        if (i9 != 0) {
            int[] iArr5 = cugVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i9);
        }
        return new djh(cugVar, cuhVar2, dftVar.a, dev.d);
    }
}
