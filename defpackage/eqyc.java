package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eqyc {
    int[] a;
    private final int b;

    public eqyc(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = eqxz.f(bArr);
        this.b = i;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    final ByteBuffer c(byte[] bArr, int i) {
        int[] iArrB = b(eqxz.f(bArr), i);
        int[] iArr = (int[]) iArrB.clone();
        eqxz.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrB[i2] = iArrB[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferC = c(bArr, this.b + i2);
            if (i2 == i) {
                erup.a(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                erup.a(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }
}
