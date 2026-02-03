package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final nob k;
    private final mbt l;

    public noc(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, nob nobVar, mbt mbtVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = nobVar;
        this.l = mbtVar;
    }

    private static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return mgb.s((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final mau c(byte[] bArr, mbt mbtVar) {
        bArr[4] = -128;
        mbt mbtVarD = d(mbtVar);
        mat matVar = new mat();
        matVar.c("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        matVar.n = i;
        matVar.E = this.g;
        matVar.F = this.e;
        matVar.G = mgb.n(this.h);
        matVar.p = Collections.singletonList(bArr);
        matVar.k = mbtVarD;
        return new mau(matVar);
    }

    public final mbt d(mbt mbtVar) {
        mbt mbtVar2 = this.l;
        return mbtVar2 == null ? mbtVar : mbtVar2.d(mbtVar);
    }

    public final noc e(nob nobVar) {
        return new noc(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, nobVar, this.l);
    }

    public noc(byte[] bArr, int i) {
        mfq mfqVar = new mfq(bArr);
        mfqVar.l(i * 8);
        this.a = mfqVar.d(16);
        this.b = mfqVar.d(16);
        this.c = mfqVar.d(24);
        this.d = mfqVar.d(24);
        int iD = mfqVar.d(20);
        this.e = iD;
        this.f = g(iD);
        this.g = mfqVar.d(3) + 1;
        int iD2 = mfqVar.d(5) + 1;
        this.h = iD2;
        this.i = f(iD2);
        this.j = mfqVar.e(36);
        this.k = null;
        this.l = null;
    }
}
