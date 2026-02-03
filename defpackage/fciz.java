package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fciz extends fbzg {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public fciz(byte[] bArr, int i, int i2) {
        ejwl.b(i >= 0, "offset must be >= 0");
        ejwl.b(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        ejwl.b(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fcix
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.fcix
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.fcix
    public final /* bridge */ /* synthetic */ fcix g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new fciz(this.c, i2, i);
    }

    @Override // defpackage.fcix
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.c, this.a, iRemaining);
        this.a += iRemaining;
    }

    @Override // defpackage.fcix
    public final void j(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.fcix
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.fcix
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
