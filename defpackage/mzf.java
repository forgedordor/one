package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzf extends mdn {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = mgb.b;
    private int k;

    @Override // defpackage.mdn, defpackage.mdm
    public final long a(long j) {
        return j - mgb.x(this.f + this.e, this.b.b);
    }

    @Override // defpackage.mdn, defpackage.mdm
    public final ByteBuffer c() {
        int i;
        if (super.i() && (i = this.k) > 0) {
            k(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.c();
    }

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.i);
        this.g += iMin / this.b.e;
        this.i -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.i <= 0) {
            int i2 = i - iMin;
            int length = (this.k + i2) - this.j.length;
            ByteBuffer byteBufferK = k(length);
            int iD = mgb.d(length, 0, this.k);
            byteBufferK.put(this.j, 0, iD);
            int iD2 = mgb.d(length - iD, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iD2);
            byteBufferK.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iD2;
            int i4 = this.k - iD;
            this.k = i4;
            byte[] bArr = this.j;
            System.arraycopy(bArr, iD, bArr, 0, i4);
            byteBuffer.get(this.j, this.k, i3);
            this.k += i3;
            byteBufferK.flip();
        }
    }

    @Override // defpackage.mdn, defpackage.mdm
    public final boolean i() {
        return super.i() && this.k == 0;
    }

    @Override // defpackage.mdn
    public final mdk j(mdk mdkVar) throws mdl {
        int i = mdkVar.d;
        if (i != 2 && i != 4) {
            throw new mdl(mdkVar);
        }
        this.h = true;
        return (this.e == 0 && this.f == 0) ? mdk.a : mdkVar;
    }

    @Override // defpackage.mdn
    protected final void l() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.mdn
    protected final void m() {
        if (this.h) {
            if (this.k > 0) {
                this.g += r0 / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.mdn
    protected final void n() {
        this.j = mgb.b;
    }
}
