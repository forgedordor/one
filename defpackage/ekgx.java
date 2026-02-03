package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgx extends ekfn {
    public final ekgp a;

    public ekgx(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && ekjc.m(new ekgu(this), obj);
    }

    @Override // defpackage.ekfn
    public final ekgb g() {
        return new ekgv(this.a.entrySet().g());
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return new ekgu(this);
    }

    @Override // defpackage.ekfn
    /* renamed from: k */
    public final ekqg listIterator() {
        return new ekgu(this);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekfn
    public Object writeReplace() {
        return new ekgw(this.a);
    }
}
