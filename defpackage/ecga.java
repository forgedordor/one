package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.FileLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecga implements Closeable {
    private FileLock a;

    public ecga(FileLock fileLock) {
        this.a = fileLock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileLock fileLock = this.a;
        if (fileLock != null) {
            fileLock.release();
            this.a = null;
        }
    }
}
