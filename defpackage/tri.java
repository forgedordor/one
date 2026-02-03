package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tri implements egps<Void, Void> {
    final /* synthetic */ trj a;

    public tri(trj trjVar) {
        this.a = trjVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        trj trjVar = this.a;
        if (((dfmb) trjVar.C.b()).a()) {
            ((ckkv) trjVar.D.b()).a(true);
        }
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        trj trjVar = this.a;
        if (((dfmb) trjVar.C.b()).a()) {
            ((ckkv) trjVar.D.b()).a(false);
        }
        trj.a.s("Failed to start disabling multi-device", th);
        if (trjVar.w.a()) {
            cpri.c("Failed to start disabling multi-device", th);
        } else {
            ((cden) trjVar.u.b()).b(th).k(auvh.b(), eoqg.a);
        }
        trjVar.c(true);
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
