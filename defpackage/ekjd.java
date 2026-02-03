package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjd extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ ekjn b;

    public ekjd(ekjn ekjnVar, Object obj) {
        this.a = obj;
        this.b = ekjnVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ekjm(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        ekjj ekjjVar = (ekjj) this.b.c.get(this.a);
        if (ekjjVar == null) {
            return 0;
        }
        return ekjjVar.c;
    }
}
