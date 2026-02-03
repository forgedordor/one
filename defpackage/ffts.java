package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffts {
    static fftr a(ffte ffteVar, ffth ffthVar, fftb fftbVar) {
        double d;
        int iCeil = ffteVar.a.b;
        byte[][] bArrK = ffua.k(ffthVar.a);
        fftr[] fftrVarArr = new fftr[bArrK.length];
        for (int i = 0; i < bArrK.length; i++) {
            fftrVarArr[i] = new fftr(0, bArrK[i]);
        }
        ffta fftaVar = new ffta();
        fftaVar.e = fftbVar.d;
        fftaVar.f = fftbVar.e;
        fftaVar.a = fftbVar.a;
        fftaVar.b = 0;
        fftaVar.c = fftbVar.c;
        fftaVar.g = fftbVar.f;
        fftb fftbVar2 = new fftb(fftaVar);
        while (iCeil > 1) {
            int i2 = 0;
            while (true) {
                d = iCeil >> 1;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                ffta fftaVar2 = new ffta();
                fftaVar2.e = fftbVar2.d;
                fftaVar2.f = fftbVar2.e;
                fftaVar2.a = fftbVar2.a;
                fftaVar2.b = fftbVar2.b;
                fftaVar2.c = i2;
                fftaVar2.g = fftbVar2.f;
                fftbVar2 = new fftb(fftaVar2);
                int i3 = i2 + i2;
                fftrVarArr[i2] = b(ffteVar, fftrVarArr[i3], fftrVarArr[i3 + 1], fftbVar2);
                i2++;
            }
            if ((iCeil & 1) == 1) {
                fftrVarArr[(int) Math.floor(d)] = fftrVarArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(iCeil / 2.0d);
            ffta fftaVar3 = new ffta();
            fftaVar3.e = fftbVar2.d;
            fftaVar3.f = fftbVar2.e;
            fftaVar3.a = fftbVar2.a;
            fftaVar3.b = fftbVar2.b + 1;
            fftaVar3.c = fftbVar2.c;
            fftaVar3.g = fftbVar2.f;
            fftbVar2 = new fftb(fftaVar3);
        }
        return fftrVarArr[0];
    }

    static fftr b(ffte ffteVar, fftr fftrVar, fftr fftrVar2, fftj fftjVar) {
        if (fftrVar == null) {
            throw new NullPointerException("left == null");
        }
        if (fftrVar2 == null) {
            throw new NullPointerException("right == null");
        }
        int i = fftrVar.a;
        if (i != fftrVar2.a) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] bArrC = ffwk.c(ffteVar.c);
        if (fftjVar instanceof fftb) {
            fftb fftbVar = (fftb) fftjVar;
            ffta fftaVar = new ffta();
            fftaVar.e = fftbVar.d;
            fftaVar.f = fftbVar.e;
            fftaVar.a = fftbVar.a;
            fftaVar.b = fftbVar.b;
            fftaVar.c = fftbVar.c;
            fftaVar.g = 0;
            fftjVar = new fftb(fftaVar);
        } else if (fftjVar instanceof ffsy) {
            ffsy ffsyVar = (ffsy) fftjVar;
            ffsx ffsxVar = new ffsx();
            ffsxVar.e = ffsyVar.d;
            ffsxVar.f = ffsyVar.e;
            ffsxVar.a = ffsyVar.a;
            ffsxVar.b = ffsyVar.b;
            ffsxVar.g = 0;
            fftjVar = new ffsy(ffsxVar);
        }
        ffsz ffszVar = ffteVar.b;
        byte[] bArrA = ffszVar.a(bArrC, fftjVar.a());
        if (fftjVar instanceof fftb) {
            fftb fftbVar2 = (fftb) fftjVar;
            ffta fftaVar2 = new ffta();
            fftaVar2.e = fftbVar2.d;
            fftaVar2.f = fftbVar2.e;
            fftaVar2.a = fftbVar2.a;
            fftaVar2.b = fftbVar2.b;
            fftaVar2.c = fftbVar2.c;
            fftaVar2.g = 1;
            fftjVar = new fftb(fftaVar2);
        } else if (fftjVar instanceof ffsy) {
            ffsy ffsyVar2 = (ffsy) fftjVar;
            ffsx ffsxVar2 = new ffsx();
            ffsxVar2.e = ffsyVar2.d;
            ffsxVar2.f = ffsyVar2.e;
            ffsxVar2.a = ffsyVar2.a;
            ffsxVar2.b = ffsyVar2.b;
            ffsxVar2.g = 1;
            fftjVar = new ffsy(ffsxVar2);
        }
        byte[] bArrA2 = ffszVar.a(bArrC, fftjVar.a());
        if (fftjVar instanceof fftb) {
            fftb fftbVar3 = (fftb) fftjVar;
            ffta fftaVar3 = new ffta();
            fftaVar3.e = fftbVar3.d;
            fftaVar3.f = fftbVar3.e;
            fftaVar3.a = fftbVar3.a;
            fftaVar3.b = fftbVar3.b;
            fftaVar3.c = fftbVar3.c;
            fftaVar3.g = 2;
            fftjVar = new fftb(fftaVar3);
        } else if (fftjVar instanceof ffsy) {
            ffsy ffsyVar3 = (ffsy) fftjVar;
            ffsx ffsxVar3 = new ffsx();
            ffsxVar3.e = ffsyVar3.d;
            ffsxVar3.f = ffsyVar3.e;
            ffsxVar3.a = ffsyVar3.a;
            ffsxVar3.b = ffsyVar3.b;
            ffsxVar3.g = 2;
            fftjVar = new ffsy(ffsxVar3);
        }
        byte[] bArrA3 = ffszVar.a(bArrC, fftjVar.a());
        int i2 = ffteVar.a.a;
        int i3 = i2 + i2;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (fftrVar.a()[i4] ^ bArrA2[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5 + i2] = (byte) (fftrVar2.a()[i5] ^ bArrA3[i5]);
        }
        int length = bArrA.length;
        int i6 = ffszVar.a;
        if (length != i6) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i3 == i6 + i6) {
            return new fftr(i, ffszVar.b(1, bArrA, bArr));
        }
        throw new IllegalArgumentException("wrong in length");
    }
}
