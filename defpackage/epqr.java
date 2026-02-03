package defpackage;

import com.google.communication.synapse.security.scytale.MediaEncryptor;
import com.google.media.webrtc.common.StatusOr;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqr extends InputStream implements InputStreamRetargetInterface {
    private final InputStream a;
    private final boolean b;
    private boolean c;
    private int d;
    private final byte[] e;
    private byte[] f;
    private final MediaEncryptor g;
    private final int h;
    private final int i;

    public epqr(InputStream inputStream, MediaEncryptor mediaEncryptor, int i) {
        int blockSize = MediaEncryptor.getBlockSize();
        ejwl.a(blockSize <= 102400);
        int i2 = (102400 / blockSize) * blockSize;
        this.c = false;
        this.d = 0;
        ejwl.b(i2 % MediaEncryptor.getBlockSize() == 0, "bockSize must be a multiple of MediaEncryptor.getBlockSize()");
        this.a = inputStream;
        this.g = mediaEncryptor;
        this.i = i;
        this.h = i2;
        this.e = new byte[i2];
        this.b = true;
    }

    private final StatusOr a(byte[] bArr, boolean z) {
        return this.i == 1 ? this.g.encrypt(bArr, z) : this.g.decrypt(bArr, z);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            this.a.close();
        }
        super.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        byte[] bArr = this.f;
        if (bArr == null || bArr.length == (i = this.d)) {
            i = 0;
            if (this.c) {
                this.f = new byte[0];
            } else {
                InputStream inputStream = this.a;
                byte[] bArr2 = this.e;
                int i2 = this.h;
                int i3 = inputStream.read(bArr2, 0, i2);
                int i4 = 0;
                while (true) {
                    if (i3 == -1) {
                        this.c = true;
                        StatusOr statusOrA = a(Arrays.copyOf(bArr2, i4), true);
                        if (!statusOrA.hasValue) {
                            throw new IOException("Unable to process chunk", statusOrA.status.asException());
                        }
                        this.f = (byte[]) statusOrA.value;
                    } else {
                        i4 += i3;
                        if (i4 == bArr2.length) {
                            StatusOr statusOrA2 = a(bArr2, false);
                            if (!statusOrA2.hasValue) {
                                throw new fbtf(statusOrA2.status);
                            }
                            this.f = (byte[]) statusOrA2.value;
                        } else {
                            i3 = inputStream.read(bArr2, i4, i2 - i4);
                        }
                    }
                }
            }
            this.d = 0;
        }
        byte[] bArr3 = this.f;
        if (bArr3 == null || bArr3.length == 0) {
            return -1;
        }
        byte b = bArr3[i];
        this.d = i + 1;
        return b & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
