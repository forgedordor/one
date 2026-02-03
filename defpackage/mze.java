package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mze extends mdn {
    private static final int e = Float.floatToIntBits(Float.NaN);

    private static void o(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == e) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 21) {
            byteBufferK = k((i / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferK = k(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & 255;
                int i4 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(i3 | i4 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferK = k((i / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i);
            while (iPosition < iLimit) {
                int i5 = byteBuffer.get(iPosition + 3) & 255;
                int i6 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                o(i5 | i6 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // defpackage.mdn
    public final mdk j(mdk mdkVar) throws mdl {
        int i = mdkVar.d;
        String str = mgb.a;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new mdk(mdkVar.b, mdkVar.c, 4);
        }
        if (i == 4) {
            return mdk.a;
        }
        throw new mdl(mdkVar);
    }
}
