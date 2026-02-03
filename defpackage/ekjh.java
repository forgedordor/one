package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjh extends AbstractSequentialList {
    final /* synthetic */ ekjn a;

    public ekjh(ekjn ekjnVar) {
        this.a = ekjnVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ekjl ekjlVar = new ekjl(this.a, i);
        return new ekjg(ekjlVar, ekjlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.d;
    }
}
