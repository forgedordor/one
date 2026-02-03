package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektr extends AbstractSet {
    final /* synthetic */ ektt a;

    public ektr(ektt ekttVar) {
        this.a = ekttVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<ekrz<?>> iterator() {
        return new ektq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
