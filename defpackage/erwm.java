package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwm implements eqrz {
    private final eqyh a;
    private final byte[] b;

    public erwm(byte[] bArr, byte[] bArr2) {
        this.a = new eqyh(bArr);
        this.b = bArr2;
    }

    private final byte[] c(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.c(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), null);
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return c(bArr);
        }
        if (ergh.e(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, length, bArr.length));
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrB = erfy.b(24);
        byteBufferAllocate.put(bArrB);
        this.a.b(byteBufferAllocate, bArrB, bArr, null);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrArray : erup.b(bArr3, bArrArray);
    }
}
