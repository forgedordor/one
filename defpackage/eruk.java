package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eruk implements erwg {
    private final SecretKeySpec a;
    private final Cipher b = erul.i();
    private final byte[] c;
    private final ByteBuffer d;
    private long e;

    public eruk(erul erulVar, byte[] bArr) {
        this.e = 0L;
        this.e = 0L;
        byte[] bArrB = erfy.b(erulVar.a);
        byte[] bArrB2 = erfy.b(7);
        this.c = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(erulVar.e());
        this.d = byteBufferAllocate;
        byteBufferAllocate.put((byte) erulVar.e());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        this.a = erulVar.k(bArrB, bArr);
    }

    @Override // defpackage.erwg
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // defpackage.erwg
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        GCMParameterSpec gCMParameterSpecJ = erul.j(this.c, this.e, false);
        Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        if (!byteBuffer2.hasRemaining()) {
            cipher.doFinal(byteBuffer, byteBuffer3);
        } else {
            cipher.update(byteBuffer, byteBuffer3);
            cipher.doFinal(byteBuffer2, byteBuffer3);
        }
    }

    @Override // defpackage.erwg
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        GCMParameterSpec gCMParameterSpecJ = erul.j(this.c, this.e, true);
        Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        cipher.doFinal(byteBuffer, byteBuffer2);
    }
}
