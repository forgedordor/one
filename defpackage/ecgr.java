package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgr {
    private final ecev a;
    private final Uri b;

    public ecgr(ecev ecevVar, Uri uri) {
        this.a = ecevVar;
        this.b = uri;
    }

    public final long a() {
        return this.a.a(this.b);
    }

    public final void b(InputStream inputStream, long j) throws IOException {
        ecev ecevVar = this.a;
        Uri uri = this.b;
        long jA = ecevVar.a(uri);
        if (j > jA) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(jA)));
        }
        OutputStream outputStream = (OutputStream) ecevVar.c(uri, j > 0 ? new ecgw() : new echm());
        try {
            elec.a(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
