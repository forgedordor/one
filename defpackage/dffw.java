package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffw extends FilterOutputStream {
    static final dfny a = dfod.a(177202284);
    private final long b;
    private final int c;
    private final dfdv d;
    private final String e;
    private int f;
    private int g;

    public dffw(long j, int i, int i2, OutputStream outputStream, dfdv dfdvVar, String str) {
        this(j, i2, outputStream, dfdvVar, str);
        this.f = i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        long j = FileTransferEvent.j(this.f, this.c);
        this.d.b(((Boolean) a.a()).booleanValue() ? new FileTransferEvent(20012, this.b, j, this.e) : new FileTransferEvent(20012, this.b, j), dhjl.FILE_TRANSFER_PROGRESS_OUTPUT_STREAM);
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f += i2;
        int i3 = this.g + i2;
        this.g = i3;
        if (i3 > 20480) {
            this.g = i3 - 20480;
            flush();
        }
        super.write(bArr, i, i2);
    }

    public dffw(long j, int i, OutputStream outputStream, dfdv dfdvVar, String str) {
        super(outputStream);
        this.b = j;
        this.c = i;
        this.d = dfdvVar;
        this.e = str;
    }
}
