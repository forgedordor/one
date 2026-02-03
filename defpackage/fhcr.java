package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcr extends fezk {
    IOException a;
    private final fezk b;
    private final fffb c;

    public fhcr(fezk fezkVar) {
        this.b = fezkVar;
        this.c = new fffv(new fhcq(this, fezkVar.c()));
    }

    @Override // defpackage.fezk
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.fezk
    public final feyt b() {
        return this.b.b();
    }

    @Override // defpackage.fezk
    public final fffb c() {
        return this.c;
    }

    @Override // defpackage.fezk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
