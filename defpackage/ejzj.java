package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzj extends ejyt {
    final /* synthetic */ ekak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejzj(ekak ekakVar) {
        super(ekakVar);
        this.b = ekakVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ejzi(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.b.remove(obj) != null;
    }
}
