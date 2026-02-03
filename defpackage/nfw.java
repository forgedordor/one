package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfw {
    public final mfr a = new mfr(32);
    public nfv b;
    public nfv c;
    public nfv d;
    public long e;
    public final niu f;

    public nfw(niu niuVar) {
        this.f = niuVar;
        nfv nfvVar = new nfv(0L);
        this.b = nfvVar;
        this.c = nfvVar;
        this.d = nfvVar;
    }

    public static nfv b(nfv nfvVar, mix mixVar, nfy nfyVar, mfr mfrVar) {
        if (mixVar.j()) {
            long j = nfyVar.b;
            int iN = 1;
            mfrVar.G(1);
            nfv nfvVarG = g(nfvVar, j, mfrVar.a, 1);
            long j2 = j + 1;
            byte b = mfrVar.a[0];
            int i = b & 128;
            int i2 = b & 127;
            mit mitVar = mixVar.c;
            byte[] bArr = mitVar.a;
            if (bArr == null) {
                mitVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            nfvVar = g(nfvVarG, j2, mitVar.a, i2);
            long j3 = j2 + i2;
            if (z) {
                mfrVar.G(2);
                nfvVar = g(nfvVar, j3, mfrVar.a, 2);
                j3 += 2;
                iN = mfrVar.n();
            }
            int[] iArr = mitVar.d;
            if (iArr == null || iArr.length < iN) {
                iArr = new int[iN];
            }
            int[] iArr2 = mitVar.e;
            if (iArr2 == null || iArr2.length < iN) {
                iArr2 = new int[iN];
            }
            if (z) {
                int i3 = iN * 6;
                mfrVar.G(i3);
                nfvVar = g(nfvVar, j3, mfrVar.a, i3);
                j3 += i3;
                mfrVar.K(0);
                for (int i4 = 0; i4 < iN; i4++) {
                    iArr[i4] = mfrVar.n();
                    iArr2[i4] = mfrVar.m();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = nfyVar.a - ((int) (j3 - nfyVar.b));
            }
            now nowVar = nfyVar.c;
            String str = mgb.a;
            byte[] bArr2 = nowVar.b;
            byte[] bArr3 = mitVar.a;
            int i5 = nowVar.a;
            int i6 = nowVar.c;
            int i7 = nowVar.d;
            mitVar.f = iN;
            mitVar.d = iArr;
            mitVar.e = iArr2;
            mitVar.b = bArr2;
            mitVar.c = i5;
            mitVar.g = i6;
            mitVar.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = mitVar.i;
            cryptoInfo.numSubSamples = iN;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            mis misVar = mitVar.j;
            MediaCodec.CryptoInfo.Pattern pattern = misVar.b;
            pattern.set(i6, i7);
            misVar.a.setPattern(pattern);
            long j4 = nfyVar.b;
            int i8 = (int) (j3 - j4);
            nfyVar.b = j4 + i8;
            nfyVar.a -= i8;
        }
        if (!mixVar.d()) {
            mixVar.h(nfyVar.a);
            return f(nfvVar, nfyVar.b, mixVar.d, nfyVar.a);
        }
        mfrVar.G(4);
        nfv nfvVarG2 = g(nfvVar, nfyVar.b, mfrVar.a, 4);
        int iM = mfrVar.m();
        nfyVar.b += 4;
        nfyVar.a -= 4;
        mixVar.h(iM);
        nfv nfvVarF = f(nfvVarG2, nfyVar.b, mixVar.d, iM);
        nfyVar.b += iM;
        int i9 = nfyVar.a - iM;
        nfyVar.a = i9;
        ByteBuffer byteBuffer = mixVar.g;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            mixVar.g = ByteBuffer.allocate(i9);
        } else {
            mixVar.g.clear();
        }
        return f(nfvVarF, nfyVar.b, mixVar.g, nfyVar.a);
    }

    private static nfv e(nfv nfvVar, long j) {
        while (j >= nfvVar.b) {
            nfvVar = nfvVar.d;
        }
        return nfvVar;
    }

    private static nfv f(nfv nfvVar, long j, ByteBuffer byteBuffer, int i) {
        nfv nfvVarE = e(nfvVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (nfvVarE.b - j));
            byteBuffer.put(nfvVarE.c.a, nfvVarE.a(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == nfvVarE.b) {
                nfvVarE = nfvVarE.d;
            }
        }
        return nfvVarE;
    }

    private static nfv g(nfv nfvVar, long j, byte[] bArr, int i) {
        nfv nfvVarE = e(nfvVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (nfvVarE.b - j));
            System.arraycopy(nfvVarE.c.a, nfvVarE.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == nfvVarE.b) {
                nfvVarE = nfvVarE.d;
            }
        }
        return nfvVarE;
    }

    public final int a(int i) {
        nfv nfvVar = this.d;
        if (nfvVar.c == null) {
            nio nioVarB = this.f.b();
            nfv nfvVar2 = new nfv(this.d.b);
            nfvVar.c = nioVarB;
            nfvVar.d = nfvVar2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void c(long j) {
        nfv nfvVar;
        if (j != -1) {
            while (true) {
                nfvVar = this.b;
                if (j < nfvVar.b) {
                    break;
                }
                this.f.c(nfvVar.c);
                this.b = this.b.b();
            }
            if (this.c.a < nfvVar.a) {
                this.c = nfvVar;
            }
        }
    }

    public final void d(int i) {
        long j = this.e + i;
        this.e = j;
        nfv nfvVar = this.d;
        if (j == nfvVar.b) {
            this.d = nfvVar.d;
        }
    }
}
