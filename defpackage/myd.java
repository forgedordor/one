package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myd extends mdn {
    public int[] e;
    private int[] f;

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f;
        mee.f(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.b.e) * this.c.e);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                int iJ = (mgb.j(this.b.d) * i) + iPosition;
                int i2 = this.b.d;
                if (i2 == 2) {
                    byteBufferK.putShort(byteBuffer.getShort(iJ));
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException(a.g(i2, "Unexpected encoding: "));
                    }
                    byteBufferK.putFloat(byteBuffer.getFloat(iJ));
                }
            }
            iPosition += this.b.e;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // defpackage.mdn
    public final mdk j(mdk mdkVar) throws mdl {
        int[] iArr = this.e;
        if (iArr == null) {
            return mdk.a;
        }
        int i = mdkVar.d;
        if (i != 2 && i != 4) {
            throw new mdl(mdkVar);
        }
        int i2 = mdkVar.c;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new mdk(mdkVar.b, length, i) : mdk.a;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new mdl("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", mdkVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // defpackage.mdn
    protected final void l() {
        this.f = this.e;
    }

    @Override // defpackage.mdn
    protected final void n() {
        this.f = null;
        this.e = null;
    }
}
