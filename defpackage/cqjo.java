package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjo {
    public static final void a(File file) {
        if (file.exists()) {
            file.setReadable(true, false);
        }
    }
}
