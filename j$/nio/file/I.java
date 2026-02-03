package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* loaded from: classes9.dex */
public final /* synthetic */ class I implements Closeable {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ I(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ I g(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new I(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
