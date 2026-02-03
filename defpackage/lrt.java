package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lrt extends lro {
    public lrt(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void c(long j) throws IOException {
        long j2 = this.b;
        if (j2 > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    public lrt(byte[] bArr) {
        super(bArr);
        this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }
}
