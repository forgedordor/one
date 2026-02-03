package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddtf extends FileOutputStream implements ecgg, ecfp {
    private final ParcelFileDescriptor a;

    public ddtf(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.ecfp
    public final FileChannel a() {
        return getChannel();
    }

    @Override // defpackage.ecgg
    public final void b() throws SyncFailedException {
        getFD().sync();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
