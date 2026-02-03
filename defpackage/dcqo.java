package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcqo {
    public abstract File a();

    public abstract File b();

    public abstract File c();

    public final File d() {
        File parentFile = c().getParentFile();
        ejyb.e(parentFile);
        return parentFile;
    }

    public final boolean e() {
        if (c().isFile()) {
            return a().isDirectory();
        }
        return false;
    }
}
