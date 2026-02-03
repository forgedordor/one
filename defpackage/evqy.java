package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqy extends evqz {
    public static final /* synthetic */ int a = 0;
    private final ByteBuffer h;
    private final long i;
    private long j;
    private long k;
    private final long l;
    private int m;
    private int n;
    private int o = Alert.DURATION_SHOW_INDEFINITELY;

    public evqy(ByteBuffer byteBuffer) {
        this.h = byteBuffer.duplicate();
        long jE = evvz.e(byteBuffer);
        this.i = jE;
        this.j = byteBuffer.limit() + jE;
        long jPosition = jE + byteBuffer.position();
        this.k = jPosition;
        this.l = jPosition;
    }

    private final int G(long j) {
        return (int) (j - this.i);
    }

    private final int S() {
        return (int) (this.j - this.k);
    }

    private final void T() {
        long j = this.j + this.m;
        this.j = j;
        int i = (int) (j - this.l);
        int i2 = this.o;
        if (i <= i2) {
            this.m = 0;
            return;
        }
        int i3 = i - i2;
        this.m = i3;
        this.j = j - i3;
    }

    @Override // defpackage.evqz
    public final void A(int i) {
        this.o = i;
        T();
    }

    public final void B(int i) throws evtj {
        if (i >= 0 && i <= S()) {
            this.k += i;
        } else {
            if (i >= 0) {
                throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.evqz
    public final boolean C() {
        return this.k == this.j;
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
            if (S() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new evtj("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                long j = this.k;
                this.k = 1 + j;
                if (evvz.a(j) < 0) {
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
    public final byte[] F() throws evtj {
        int iJ = j();
        if (iJ < 0 || iJ > S()) {
            if (iJ > 0) {
                throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iJ == 0) {
                return evth.b;
            }
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[iJ];
        long j = this.k;
        long j2 = iJ;
        long j3 = j + j2;
        ByteBuffer byteBuffer = this.h;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position(G(j));
                byteBuffer.limit(G(j3));
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                byteBufferSlice.get(bArr);
                this.k += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                evtj evtjVar = new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                evtjVar.initCause(e);
                throw evtjVar;
            }
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public final byte a() throws evtj {
        long j = this.k;
        if (j == this.j) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 1 + j;
        return evvz.a(j);
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
        return (int) (this.k - this.l);
    }

    @Override // defpackage.evqz
    public final int e(int i) throws evtj {
        if (i < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iD = i + d();
        int i2 = this.o;
        if (iD > i2) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = iD;
        T();
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
        long j = this.k;
        if (this.j - j < 4) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 4 + j;
        int iA = evvz.a(j) & 255;
        int iA2 = evvz.a(1 + j) & 255;
        int iA3 = evvz.a(2 + j) & 255;
        return ((evvz.a(j + 3) & 255) << 24) | (iA2 << 8) | iA | (iA3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (defpackage.evvz.a(r3) >= 0) goto L33;
     */
    @Override // defpackage.evqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r9 = this;
            long r0 = r9.k
            long r2 = r9.j
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = defpackage.evvz.a(r0)
            if (r4 < 0) goto L16
            r9.k = r2
            return r4
        L16:
            long r5 = r9.j
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = defpackage.evvz.a(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = defpackage.evvz.a(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = defpackage.evvz.a(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = defpackage.evvz.a(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = defpackage.evvz.a(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = defpackage.evvz.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = defpackage.evvz.a(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = defpackage.evvz.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = defpackage.evvz.a(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.k = r5
            return r0
        L92:
            long r0 = r9.s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evqy.j():int");
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
            this.n = 0;
            return 0;
        }
        int iJ = j();
        this.n = iJ;
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
        long j = this.k;
        if (this.j - j < 8) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 8 + j;
        long jA = evvz.a(j);
        long jA2 = evvz.a(1 + j);
        long jA3 = evvz.a(2 + j);
        long jA4 = evvz.a(3 + j);
        long jA5 = evvz.a(4 + j);
        return ((evvz.a(j + 7) & 255) << 56) | (jA & 255) | ((jA2 & 255) << 8) | ((jA3 & 255) << 16) | ((jA4 & 255) << 24) | ((jA5 & 255) << 32) | ((evvz.a(5 + j) & 255) << 40) | ((evvz.a(6 + j) & 255) << 48);
    }

    @Override // defpackage.evqz
    public final long r() {
        long j;
        long j2;
        int i;
        long j3 = this.k;
        if (this.j != j3) {
            long j4 = 1 + j3;
            byte bA = evvz.a(j3);
            if (bA >= 0) {
                this.k = j4;
                return bA;
            }
            if (this.j - j4 >= 9) {
                long j5 = 2 + j3;
                int iA = (evvz.a(j4) << 7) ^ bA;
                if (iA >= 0) {
                    long j6 = 3 + j3;
                    int iA2 = iA ^ (evvz.a(j5) << 14);
                    if (iA2 >= 0) {
                        j = iA2 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int iA3 = iA2 ^ (evvz.a(j6) << 21);
                        if (iA3 < 0) {
                            i = (-2080896) ^ iA3;
                        } else {
                            j6 = 5 + j3;
                            long jA = (evvz.a(j5) << 28) ^ iA3;
                            if (jA < 0) {
                                long j7 = 6 + j3;
                                long jA2 = (evvz.a(j6) << 35) ^ jA;
                                if (jA2 >= 0) {
                                    long j8 = 7 + j3;
                                    long jA3 = jA2 ^ (evvz.a(j7) << 42);
                                    if (jA3 >= 0) {
                                        j = 4363953127296L ^ jA3;
                                        j5 = j8;
                                    } else {
                                        j7 = 8 + j3;
                                        jA2 = jA3 ^ (evvz.a(j8) << 49);
                                        if (jA2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long jA4 = (jA2 ^ (evvz.a(j7) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j9 = j3 + 10;
                                                if (evvz.a(j5) >= 0) {
                                                    j5 = j9;
                                                }
                                            }
                                            j = jA4;
                                        }
                                    }
                                    this.k = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ jA2;
                                j5 = j7;
                                this.k = j5;
                                return j;
                            }
                            j = 266354560 ^ jA;
                        }
                    }
                    j5 = j6;
                    this.k = j5;
                    return j;
                }
                i = iA ^ (-128);
                j = i;
                this.k = j5;
                return j;
            }
        }
        return s();
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
        if (iJ <= 0 || iJ > S()) {
            if (iJ == 0) {
                return evqs.b;
            }
            if (iJ < 0) {
                throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        evvz.k(this.k, bArr, 0L, j);
        this.k += j;
        evqs evqsVar = evqs.b;
        return new evqq(bArr);
    }

    @Override // defpackage.evqz
    public final String x() throws evtj {
        int iJ = j();
        if (iJ <= 0 || iJ > S()) {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iJ];
        long j = iJ;
        evvz.k(this.k, bArr, 0L, j);
        String str = new String(bArr, evth.a);
        this.k += j;
        return str;
    }

    @Override // defpackage.evqz
    public final String y() throws evtj {
        int iJ = j();
        if (iJ > 0 && iJ <= S()) {
            String strF = evwe.f(this.h, G(this.k), iJ);
            this.k += iJ;
            return strF;
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
        if (this.n != i) {
            throw new evtj("Protocol message end-group tag did not match expected tag.");
        }
    }
}
