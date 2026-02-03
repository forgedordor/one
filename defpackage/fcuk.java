package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcuk<E> extends AbstractCollection<E> implements Collection<E>, fdco {
    protected fcuk() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
