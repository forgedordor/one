package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eqye {
    private final eqyc a;
    private final eqyc b;

    public eqye(byte[] bArr) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    private final byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.b.c(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] e(byte[] bArr, ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = i == 0 ? iRemaining : (iRemaining + 16) - i;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(0L);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract eqyc a(byte[] bArr, int i);

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int iRemaining = byteBuffer.remaining();
        int length = bArr2.length;
        if (iRemaining < length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        eqyc eqycVar = this.a;
        if (byteBuffer.remaining() < length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        eqycVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrA = eqyj.a(d(bArr), e(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrA);
    }

    public final byte[] c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            if (!MessageDigest.isEqual(eqyj.a(d(bArr), e(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            eqyc eqycVar = this.a;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            eqycVar.d(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
