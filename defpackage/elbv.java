package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbv extends AbstractSet {
    final /* synthetic */ elbw a;

    public elbv(elbw elbwVar) {
        this.a = elbwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        elbw elbwVar = this.a;
        return elbwVar.b(obj) != null || elbwVar.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new elbu(this, this.a.a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.a.size();
    }
}
