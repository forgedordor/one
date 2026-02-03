package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njy implements nlv {
    final /* synthetic */ ncf a;
    final /* synthetic */ int b;
    final /* synthetic */ nkc c;

    public njy(nkc nkcVar, ncf ncfVar, int i) {
        this.a = ncfVar;
        this.b = i;
        this.c = nkcVar;
    }

    @Override // defpackage.nlv
    public final void a(long j) {
        this.c.aI(this.a, this.b, j);
    }

    @Override // defpackage.nlv
    public final void b() {
        this.c.aL(this.a, this.b);
    }
}
