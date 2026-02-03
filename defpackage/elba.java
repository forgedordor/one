package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elba extends AbstractSet {
    final /* synthetic */ elbb a;

    public elba(elbb elbbVar) {
        this.a = elbbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof elbk)) {
            return false;
        }
        elbk elbkVar = (elbk) obj;
        elbkVar.c();
        elbb elbbVar = this.a;
        Object obj2 = elbkVar.a;
        return elbbVar.d().contains(obj2) && elbbVar.e(obj2).contains(elbkVar.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new elbl(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return eonc.f(this.a.a());
    }
}
