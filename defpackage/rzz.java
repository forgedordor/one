package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzz extends OutputStream {
    final /* synthetic */ saa a;
    private final byte b;
    private final rzx c = new rzx();

    public rzz(saa saaVar, byte b) {
        this.a = saaVar;
        this.b = b;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.a();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.c.b();
        if (i2 > 0) {
            try {
                saa saaVar = this.a;
                synchronized (saaVar) {
                    saaVar.d(this.b, i2);
                    DataOutputStream dataOutputStream = saaVar.e;
                    dataOutputStream.write(bArr, i, i2);
                    dataOutputStream.flush();
                }
            } catch (IOException e) {
                throw new rzs(e);
            }
        }
    }
}
