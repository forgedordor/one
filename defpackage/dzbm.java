package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbm implements eora {
    final /* synthetic */ dzbn a;
    private final String b;

    public dzbm(dzbn dzbnVar) {
        this.a = dzbnVar;
        this.b = dyyt.a(dzbnVar.d);
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dzbn dzbnVar = this.a;
        dzbnVar.b.d(this.b, "OK", dzbnVar.c);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        String str = this.b;
        String strA = dyqf.a(th);
        dzbn dzbnVar = this.a;
        dzbnVar.b.d(str, strA, dzbnVar.c);
    }
}
