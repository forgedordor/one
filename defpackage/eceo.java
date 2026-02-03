package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eceo extends ecgn {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public eceo(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
        ecgq.a(outputStream != null, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((echr) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((echr) it.next()).a(1);
        }
    }

    @Override // defpackage.ecgn, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((echr) it.next()).a(bArr.length);
        }
    }

    @Override // defpackage.ecgn, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((echr) it.next()).a(i2);
        }
    }
}
