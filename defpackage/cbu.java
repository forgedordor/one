package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbu implements bll {
    final /* synthetic */ cbc a;
    final /* synthetic */ cby b;

    public cbu(cby cbyVar, cbc cbcVar) {
        this.b = cbyVar;
        this.a = cbcVar;
    }

    @Override // defpackage.bll
    public final void a(Throwable th) {
        cby cbyVar = this.b;
        if (cbyVar.j == this.a) {
            cbyVar.a(th);
        }
    }

    @Override // defpackage.bll
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cbb cbbVar = (cbb) obj;
        cbbVar.getClass();
        cby cbyVar = this.b;
        if (cbyVar.j == this.a) {
            bbs.a("AudioSource", "Receive BufferProvider state change: " + cbyVar.g + " to " + cbbVar);
            if (cbyVar.g != cbbVar) {
                cbyVar.g = cbbVar;
                cbyVar.f();
            }
        }
    }
}
