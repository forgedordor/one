package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekof extends ekgb {
    final /* synthetic */ ekog a;

    public ekof(ekog ekogVar) {
        this.a = ekogVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ekog ekogVar = this.a;
        ejwl.v(i, ekogVar.c);
        Object[] objArr = ekogVar.a;
        int i2 = i + i;
        int i3 = ekogVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
