package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eruc implements erwg {
    final /* synthetic */ erud a;
    private final SecretKeySpec b;
    private final SecretKeySpec c;
    private final Cipher d = erud.i();
    private final Mac e;
    private final byte[] f;
    private final ByteBuffer g;
    private long h;

    public eruc(erud erudVar, byte[] bArr) {
        this.a = erudVar;
        this.h = 0L;
        this.e = erudVar.j();
        this.h = 0L;
        byte[] bArrB = erfy.b(erudVar.a);
        byte[] bArrB2 = erfy.b(7);
        this.f = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(erudVar.e());
        this.g = byteBufferAllocate;
        byteBufferAllocate.put((byte) erudVar.e());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        byte[] bArrM = erudVar.m(bArrB, bArr);
        this.b = erudVar.l(bArrM);
        this.c = erudVar.k(bArrM);
    }

    @Override // defpackage.erwg
    public final ByteBuffer a() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.erwg
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        byte[] bArr = this.f;
        int iPosition = byteBuffer3.position();
        byte[] bArrN = erud.n(bArr, this.h, false);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrN);
        Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.update(byteBuffer, byteBuffer3);
        cipher.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer3.put(mac.doFinal(), 0, this.a.b);
    }

    @Override // defpackage.erwg
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = this.f;
        int iPosition = byteBuffer2.position();
        byte[] bArrN = erud.n(bArr, this.h, true);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrN);
        Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer2.put(mac.doFinal(), 0, this.a.b);
    }
}
