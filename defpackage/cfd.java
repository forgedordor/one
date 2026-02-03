package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfd implements bpu {
    final /* synthetic */ cgh a;

    public cfd(cgh cghVar) {
        this.a = cghVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        this.a.k(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgh cghVar = this.a;
        cgl cglVar = (cgl) obj;
        cglVar.a(cghVar.f());
        cglVar.c();
        cglVar.c = true;
        cglVar.e();
        bqk.i(cglVar.b(), new cfc(this), cghVar.h);
    }
}
