package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhf {
    private volatile riy a;
    private final rjd b;

    public rhf(rjd rjdVar) {
        this.b = rjdVar;
    }

    public final riy a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    rjf rjfVar = this.b.a;
                    File cacheDir = rjfVar.a.getCacheDir();
                    rje rjeVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, rjfVar.b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        rjeVar = new rje(file);
                    }
                    this.a = rjeVar;
                }
                if (this.a == null) {
                    this.a = new riz();
                }
            }
        }
        return this.a;
    }
}
