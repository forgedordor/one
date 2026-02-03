package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eruj implements erwf {
    final /* synthetic */ erul a;
    private SecretKeySpec b;
    private Cipher c;
    private byte[] d;

    public eruj(erul erulVar) {
        this.a = erulVar;
    }

    @Override // defpackage.erwf
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        this.c.init(2, this.b, erul.j(this.d, i, z));
        this.c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.erwf
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        int iRemaining = byteBuffer.remaining();
        erul erulVar = this.a;
        if (iRemaining != erulVar.e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != erulVar.e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.d = new byte[7];
        byte[] bArr2 = new byte[erulVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.d);
        this.b = erulVar.k(bArr2, bArr);
        this.c = erul.i();
    }
}
