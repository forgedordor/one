package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebep extends ebcx {
    public final ByteBuffer a;

    public ebep(OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(1024);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.put((byte) i);
        super.write(i);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.put(bArr);
        super.write(bArr);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.put(bArr, i, i2);
        super.write(bArr, i, i2);
    }
}
