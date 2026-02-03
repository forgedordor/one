package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcr extends bab {
    private final AtomicBoolean b;

    public bcr(bbm bbmVar) {
        super(bbmVar);
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.bab, defpackage.bbm, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
