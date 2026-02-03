package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfhd extends AbstractHttpEntity {
    public final dffe a;
    public final FileTransferInfo b;
    private final long c;
    private final long d;
    private final dfdv e;
    private final dgfu f;
    private final String g;

    public dfhd(long j, dffe dffeVar, FileTransferInfo fileTransferInfo, dfdv dfdvVar, dgfu dgfuVar, String str) {
        this.c = j;
        this.a = dffeVar;
        this.b = fileTransferInfo;
        this.d = (fileTransferInfo.f - dffeVar.a) - 1;
        this.e = dfdvVar;
        this.f = dgfuVar;
        this.g = str;
        String str2 = fileTransferInfo.b;
        str2.getClass();
        setContentType(str2);
    }

    @Override // org.apache.http.HttpEntity
    public final InputStream getContent() throws FileNotFoundException {
        InputStream inputStreamB = this.f.b(this.b.a().toString());
        long j = this.a.a + 1;
        for (long jSkip = 0; jSkip < j; jSkip += inputStreamB.skip(j - jSkip)) {
        }
        return inputStreamB;
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.d;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) throws IOException {
        dffw dffwVar = new dffw(this.c, (int) this.a.a, (int) this.b.f, outputStream, this.e, this.g);
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = content.read(bArr);
                if (i == -1) {
                    dffwVar.flush();
                    return;
                }
                dffwVar.write(bArr, 0, i);
            }
        } finally {
            content.close();
        }
    }
}
