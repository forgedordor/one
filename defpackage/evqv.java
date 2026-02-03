package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqv extends evqz {
    private final byte[] a;
    private int h;
    private int i;
    private int j;
    private final int k;
    private int l;
    private int m = Alert.DURATION_SHOW_INDEFINITELY;

    public evqv(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.h = i2 + i;
        this.j = i;
        this.k = i;
    }

    private final void S() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = i - this.k;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    @Override // defpackage.evqz
    public final void A(int i) {
        this.m = i;
        S();
    }

    public final void B(int i) throws evtj {
        if (i >= 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (i <= i2 - i3) {
                this.j = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.evqz
    public final boolean C() {
        return this.j == this.h;
    }

    @Override // defpackage.evqz
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.evqz
    public final boolean E(int i) throws evtj {
        int iB = evwj.b(i);
        int i2 = 0;
        if (iB == 0) {
            if (this.h - this.j < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new evtj("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.a;
                int i3 = this.j;
                this.j = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new evtj("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (iB == 1) {
            B(8);
            return true;
        }
        if (iB == 2) {
            B(j());
            return true;
        }
        if (iB == 3) {
            Q();
            z(evwj.c(evwj.a(i), 4));
            return true;
        }
        if (iB == 4) {
            P();
            return false;
        }
        if (iB != 5) {
            throw new evti();
        }
        B(4);
        return true;
    }

    @Override // defpackage.evqz
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) throws evtj {
        if (i > 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.j = i4;
                return Arrays.copyOfRange(this.a, i3, i4);
            }
        }
        if (i > 0) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            return evth.b;
        }
        throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws evtj {
        int i = this.j;
        if (i == this.h) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 1;
        return bArr[i];
    }

    @Override // defpackage.evqz
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.evqz
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.evqz
    public final int d() {
        return this.j - this.k;
    }

    @Override // defpackage.evqz
    public final int e(int i) {
        if (i < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        if (iD < 0) {
            throw new evtj("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.m;
        if (iD > i2) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = iD;
        S();
        return i2;
    }

    @Override // defpackage.evqz
    public final int f() {
        return j();
    }

    @Override // defpackage.evqz
    public final int g() {
        return i();
    }

    @Override // defpackage.evqz
    public final int h() {
        return j();
    }

    public final int i() throws evtj {
        int i = this.j;
        if (this.h - i < 4) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.evqz
    public final int j() {
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.j = i5;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.evqz
    public final int k() {
        return i();
    }

    @Override // defpackage.evqz
    public final int l() {
        return H(j());
    }

    @Override // defpackage.evqz
    public final int m() throws evtj {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int iJ = j();
        this.l = iJ;
        if (evwj.a(iJ) != 0) {
            return iJ;
        }
        throw new evtj("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.evqz
    public final int n() {
        return j();
    }

    @Override // defpackage.evqz
    public final long o() {
        return q();
    }

    @Override // defpackage.evqz
    public final long p() {
        return r();
    }

    public final long q() throws evtj {
        int i = this.j;
        if (this.h - i < 8) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    @Override // defpackage.evqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evqv.r():long");
    }

    final long s() throws evtj {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new evtj("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.evqz
    public final long t() {
        return q();
    }

    @Override // defpackage.evqz
    public final long u() {
        return J(r());
    }

    @Override // defpackage.evqz
    public final long v() {
        return r();
    }

    @Override // defpackage.evqz
    public final evqs w() throws evtj {
        int iJ = j();
        if (iJ > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iJ <= i - i2) {
                evqs evqsVarZ = evqs.z(this.a, i2, iJ);
                this.j += iJ;
                return evqsVarZ;
            }
        }
        if (iJ == 0) {
            return evqs.b;
        }
        byte[] bArrG = G(iJ);
        evqs evqsVar = evqs.b;
        return new evqq(bArrG);
    }

    @Override // defpackage.evqz
    public final String x() throws evtj {
        int iJ = j();
        if (iJ > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iJ <= i - i2) {
                String str = new String(this.a, i2, iJ, evth.a);
                this.j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.evqz
    public final String y() throws evtj {
        int iJ = j();
        if (iJ > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iJ <= i - i2) {
                String strG = evwe.g(this.a, i2, iJ);
                this.j += iJ;
                return strG;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.evqz
    public final void z(int i) throws evtj {
        if (this.l != i) {
            throw new evtj("Protocol message end-group tag did not match expected tag.");
        }
    }
}
