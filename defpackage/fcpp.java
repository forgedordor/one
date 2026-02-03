package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpp extends fbzg {
    private final ffez a;

    public fcpp(ffez ffezVar) {
        this.a = ffezVar;
    }

    @Override // defpackage.fbzg, defpackage.fcix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.a.B();
    }

    @Override // defpackage.fcix
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.fcix
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.fcix
    public final fcix g(int i) {
        ffez ffezVar = new ffez();
        ffezVar.hO(this.a, i);
        return new fcpp(ffezVar);
    }

    @Override // defpackage.fcix
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fcix
    public final void j(OutputStream outputStream, int i) throws IOException {
        this.a.U(outputStream, i);
    }

    @Override // defpackage.fcix
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iE = this.a.e(bArr, i, i2);
            if (iE == -1) {
                throw new IndexOutOfBoundsException(a.e(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iE;
            i += iE;
        }
    }

    @Override // defpackage.fcix
    public final void l(int i) {
        try {
            this.a.D(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
