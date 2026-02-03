package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfy<E> extends ekgb<E> {
    private final transient ekgb a;

    public ekfy(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    private final int H(int i) {
        return (size() - 1) - i;
    }

    private final int I(int i) {
        return size() - i;
    }

    @Override // defpackage.ekgb
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.ekgb
    /* renamed from: b */
    public final ekgb subList(int i, int i2) {
        ejwl.k(i, i2, size());
        return this.a.subList(I(i2), I(i)).a();
    }

    @Override // defpackage.ekgb, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        ejwl.v(i, size());
        return this.a.get(H(i));
    }

    @Override // defpackage.ekgb, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return H(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.ekgb, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return H(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekgb, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
