package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuyr implements efzm {
    final /* synthetic */ cuys a;
    private final fcsu b;

    public cuyr(cuys cuysVar, fcsu fcsuVar) {
        this.a = cuysVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        cuys cuysVar = this.a;
        if (cuysVar.c.a() <= 1) {
            cuysVar.b.I(cuysVar.a, efzkVar.a());
        } else {
            cuysVar.b.E(cuysVar.a, efzkVar.a());
        }
        cuysVar.a.finish();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.b.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
