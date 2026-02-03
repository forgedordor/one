package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzy extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ saa a;
    private final rzx b = new rzx();

    public rzy(saa saaVar) {
        this.a = saaVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        byte[] bArr = new byte[(int) Math.min(j, 2048L)];
        synchronized (this.a) {
            j2 = 0;
            while (j2 < j) {
                int i = read(bArr);
                if (i < 0) {
                    break;
                }
                j2 += i;
            }
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iB;
        this.b.b();
        saa saaVar = this.a;
        synchronized (saaVar) {
            saaVar.d((byte) 95, i2);
            byte bA = saaVar.a();
            if (bA == 45) {
                iB = saaVar.b();
                if (iB > 0) {
                    if (iB <= i2) {
                        saaVar.a.readFully(bArr, i, iB);
                    } else {
                        throw new rzp(a.s(iB, i2, "Expected at most ", " bytes, got: "));
                    }
                }
            } else {
                throw new sac(bA);
            }
        }
        return iB;
    }
}
