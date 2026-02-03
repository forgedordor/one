package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekje extends AbstractSequentialList {
    final /* synthetic */ ekjn a;

    public ekje(ekjn ekjnVar) {
        this.a = ekjnVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry> listIterator(int i) {
        return new ekjl(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
