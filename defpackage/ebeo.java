package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebeo extends ebcw {
    public final ByteBuffer a;

    public ebeo(InputStream inputStream) {
        super(inputStream);
        this.a = ByteBuffer.allocate(1024);
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read() {
        int i = super.read();
        if (i >= 0) {
            this.a.put((byte) i);
        }
        return i;
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final long skip(long j) {
        if (((int) j) >= j) {
            return read(new byte[r0], 0, r0);
        }
        throw new IllegalArgumentException(j + " cannot be cast without changing its value");
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(byte[] bArr) {
        int i = super.read(bArr);
        if (i >= 0) {
            this.a.put(Arrays.copyOf(bArr, i));
        }
        return i;
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        if (i3 >= 0) {
            this.a.put(bArr, i, i2);
        }
        return i3;
    }
}
