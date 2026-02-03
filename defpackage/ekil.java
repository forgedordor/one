package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekil extends ekgb {
    final /* synthetic */ ekim a;

    public ekil(ekim ekimVar) {
        this.a = ekimVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
