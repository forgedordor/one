package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import j$.time.Duration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfig implements Runnable {
    private final dfif a;
    private final fcsu b;
    public final long c;
    public final InstantMessageConfiguration d;
    public final String e;
    protected final dfdv f;
    protected final Context g;
    protected final deyb h;
    public int i = 0;
    public volatile boolean j;

    protected dfig(Context context, long j, String str, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, dfdv dfdvVar, deyb deybVar, fcsu fcsuVar) {
        this.g = context;
        this.c = j;
        this.d = instantMessageConfiguration;
        this.e = str;
        this.a = dfifVar;
        this.f = dfdvVar;
        this.h = deybVar;
        this.b = fcsuVar;
    }

    protected static final long h(dfek dfekVar) {
        int i = ((dfeg) dfekVar).a;
        if (i == 1) {
            return 201L;
        }
        if (i == 2) {
            return 202L;
        }
        if (i == 3 || i == 4) {
            return 203L;
        }
        dhja.g("Invalid type %d", Integer.valueOf(i));
        return 8L;
    }

    public void a() {
        this.j = true;
    }

    protected final void b(dfek dfekVar) {
        this.i++;
        this.a.c(dfekVar);
    }

    protected final void c(byte[] bArr, Uri uri) {
        this.a.b(bArr, uri);
    }

    protected final void d(int i, long j) {
        this.f.c(new FileTransferEvent(i, this.c, j, this.e), dhjl.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    protected final void e() throws IOException {
        if (this.j) {
            throw new IOException("Cancelled");
        }
    }

    public final byte[] f(InputStream inputStream) {
        return g(inputStream, -1L);
    }

    final byte[] g(InputStream inputStream, long j) throws IOException {
        e();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            j2 += i;
            if (j != -1 && j2 > j) {
                this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE);
                throw new IOException("Data corrupted, expected " + j + " bytes but received " + j2 + " bytes");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    protected final void i(long j, Duration duration) {
        this.f.c(new FileTransferEvent(20013, this.c, j, this.e, duration), dhjl.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    public String toString() {
        return "File ID " + this.e + ", session ID " + this.c + ", failure count " + this.i + ", cancelled " + this.j;
    }
}
