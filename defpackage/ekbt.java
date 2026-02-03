package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekbt extends eknl {
    final /* synthetic */ ekbu a;

    public ekbt(ekbu ekbuVar) {
        this.a = ekbuVar;
    }

    @Override // defpackage.eknl
    public final ekni a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<eknh> iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c();
    }
}
