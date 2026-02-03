package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhji {
    public static void a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            dhja.i(e, "Unable to close resource %s", closeable.toString());
        }
    }
}
