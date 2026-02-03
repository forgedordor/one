package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehln {
    public static final String a(String str) {
        return str == null ? "103243289" : "103243289_".concat(new fdgl("[^A-Za-z0-9\\-_:]").b(str, "_"));
    }

    public static final void b(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }
}
