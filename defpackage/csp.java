package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csp extends ctd {
    final /* synthetic */ csq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csp(csq csqVar) {
        super(csqVar.d);
        this.a = csqVar;
    }

    @Override // defpackage.ctd
    protected final Object a(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.ctd
    protected final void b(int i) {
        this.a.e(i);
    }
}
