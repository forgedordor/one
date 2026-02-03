package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcja extends fbzg {
    final ByteBuffer a;

    public fcja(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fcix
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.fcix
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.fcix
    public final /* bridge */ /* synthetic */ fcix g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new fcja(byteBufferDuplicate);
    }

    @Override // defpackage.fcix
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        ByteBuffer byteBuffer2 = this.a;
        int iLimit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + iRemaining);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(iLimit);
    }

    @Override // defpackage.fcix
    public final void j(OutputStream outputStream, int i) throws IOException {
        a(i);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.fcix
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.fcix
    public final void l(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
