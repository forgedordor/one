package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzd extends mdn {
    public boolean e;
    public long f;
    private int g;
    private int h;
    private byte[] j;
    private byte[] m;
    private int i = 0;
    private int k = 0;
    private int l = 0;

    public mzd() {
        mee.a(true);
        byte[] bArr = mgb.b;
        this.j = bArr;
        this.m = bArr;
    }

    private final int o(int i) {
        int i2 = this.g;
        return (i / i2) * i2;
    }

    private final int p(int i) {
        int iQ = ((q(2000000L) - this.i) * this.g) - (this.j.length >> 1);
        mee.c(iQ >= 0);
        return o((int) Math.min((i * 0.2f) + 0.5f, iQ));
    }

    private final int q(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private static int r(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void s(boolean z) {
        int i;
        int length;
        int i2 = this.l;
        int length2 = this.j.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.i == 0) {
            if (z) {
                t(i2, 3);
                length = i2;
            } else {
                mee.c(i2 >= (length2 >> 1));
                length = this.j.length >> 1;
                t(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iP = p(i4) + (this.j.length >> 1);
                t(iP, 2);
                int i5 = i3 + i4;
                i = iP;
                length = i5;
            } else {
                int iP2 = p(i4);
                t(iP2, 1);
                i = iP2;
                length = i4;
            }
        }
        mee.d(length % this.g == 0, a.g(length, "bytesConsumed is not aligned to frame size: %s"));
        mee.c(i2 >= i);
        this.l -= length;
        int i6 = this.k + length;
        this.k = i6;
        this.k = i6 % this.j.length;
        this.i = this.i + (i / this.g);
        this.f += (length - i) / r2;
    }

    private final void t(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        mee.a(this.l >= i);
        if (i2 == 2) {
            int i4 = this.k;
            int i5 = this.l;
            int i6 = i4 + i5;
            byte[] bArr = this.j;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.m, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.m, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.m, 0, i8);
                    System.arraycopy(this.j, 0, this.m, i8, i7);
                }
            }
        } else {
            int i9 = this.k;
            int i10 = i9 + i;
            byte[] bArr2 = this.j;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.m, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.m, 0, i11);
                System.arraycopy(this.j, 0, this.m, i11, i - i11);
            }
        }
        mee.b(i % this.g == 0, a.g(i, "sizeToOutput is not aligned to frame size: "));
        mee.c(this.k < this.j.length);
        byte[] bArr3 = this.m;
        mee.b(i % this.g == 0, a.g(i, "byteOutput size is not aligned to frame size "));
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int iR = r(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (iR * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = 127;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = -128;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        k(i).put(bArr3, 0, i).flip();
    }

    private static final boolean u(byte b, byte b2) {
        return Math.abs(r(b, b2)) > 1024;
    }

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            if (this.h != 0) {
                mee.c(this.k < this.j.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (u(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.g;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.k;
                int i4 = this.l;
                int i5 = i3 + i4;
                int length = this.j.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.j, i5, iMin);
                int i6 = this.l + iMin;
                this.l = i6;
                mee.c(i6 <= this.j.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                s(z);
                if (z) {
                    this.h = 0;
                    this.i = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.j.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (u(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.g;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.h = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // defpackage.mdn, defpackage.mdm
    public final boolean h() {
        return super.h() && this.e;
    }

    @Override // defpackage.mdn
    protected final mdk j(mdk mdkVar) throws mdl {
        if (mdkVar.d == 2) {
            return mdkVar.b == -1 ? mdk.a : mdkVar;
        }
        throw new mdl(mdkVar);
    }

    @Override // defpackage.mdn
    public final void l() {
        if (h()) {
            int i = this.b.c;
            this.g = i + i;
            int iO = o(q(100000L) / 2);
            int i2 = iO + iO;
            if (this.j.length != i2) {
                this.j = new byte[i2];
                this.m = new byte[i2];
            }
        }
        this.h = 0;
        this.f = 0L;
        this.i = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // defpackage.mdn
    public final void m() {
        if (this.l > 0) {
            s(true);
            this.i = 0;
        }
    }

    @Override // defpackage.mdn
    public final void n() {
        this.e = false;
        byte[] bArr = mgb.b;
        this.j = bArr;
        this.m = bArr;
    }
}
