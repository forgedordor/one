package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekek extends eker implements Iterator {
    protected ekek() {
    }

    protected abstract Iterator b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return b().hasNext();
    }

    @Override // defpackage.eker
    protected /* bridge */ /* synthetic */ Object hp() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b().remove();
    }
}
