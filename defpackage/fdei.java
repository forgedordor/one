package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdei implements fdev {
    private final AtomicReference a;

    public fdei(fdev fdevVar) {
        this.a = new AtomicReference(fdevVar);
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        fdev fdevVar = (fdev) this.a.getAndSet(null);
        if (fdevVar != null) {
            return fdevVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
