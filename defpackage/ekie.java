package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekie extends ekgr {
    final /* synthetic */ ekih a;

    public ekie(ekih ekihVar) {
        this.a = ekihVar;
    }

    @Override // defpackage.ekgr
    public final ekgp a() {
        return this.a;
    }

    @Override // defpackage.ekhx
    public final ekgb h() {
        return new ekid(this);
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return g().iterator();
    }

    @Override // defpackage.ekgr, defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
