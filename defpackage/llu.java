package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class llu implements lml {
    public final File a;
    public final lmj b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public llu(File file, lmj lmjVar) {
        this.a = file;
        this.b = lmjVar;
    }

    @Override // defpackage.ljq
    public final void a() {
        this.c.set(true);
    }

    @Override // defpackage.lml
    public final Object b(fcxy fcxyVar) {
        c();
        return lmc.a(this.a, new llt(this, null), fcxyVar);
    }

    protected final void c() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
