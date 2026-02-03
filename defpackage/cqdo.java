package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqdo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/StreamUtil");

    public static void a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 28, "StreamUtil.java")).t("Unable to close resource %s", cqcv.b(closeable.toString()));
        }
    }

    public static void b(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 42, "StreamUtil.java")).t("Unable to close resource %s", cqcv.b(autoCloseable.toString()));
            }
        }
    }
}
