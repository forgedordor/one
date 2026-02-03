package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erub implements erwf {
    final /* synthetic */ erud a;
    private SecretKeySpec b;
    private SecretKeySpec c;
    private Cipher d;
    private Mac e;
    private byte[] f;

    public erub(erud erudVar) {
        this.a = erudVar;
    }

    @Override // defpackage.erwf
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArrN = erud.n(this.f, i, z);
        int iRemaining = byteBuffer.remaining();
        int i2 = this.a.b;
        if (iRemaining < i2) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = iPosition + (iRemaining - i2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        this.e.init(this.c);
        this.e.update(bArrN);
        this.e.update(byteBufferDuplicate);
        byte[] bArrCopyOf = Arrays.copyOf(this.e.doFinal(), i2);
        byte[] bArr = new byte[i2];
        byteBufferDuplicate2.get(bArr);
        if (!MessageDigest.isEqual(bArr, bArrCopyOf)) {
            throw new GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        this.d.init(1, this.b, new IvParameterSpec(bArrN));
        this.d.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.erwf
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        int iRemaining = byteBuffer.remaining();
        erud erudVar = this.a;
        if (iRemaining != erudVar.e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != erudVar.e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f = new byte[7];
        byte[] bArr2 = new byte[erudVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f);
        byte[] bArrM = erudVar.m(bArr2, bArr);
        this.b = erudVar.l(bArrM);
        this.c = erudVar.k(bArrM);
        this.d = erud.i();
        this.e = erudVar.j();
    }
}
