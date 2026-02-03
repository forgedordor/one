package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhhy implements eora {
    final /* synthetic */ dbyk a;

    public dhhy(dbyk dbykVar) {
        this.a = dbykVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dejq dejqVar = (dejq) obj;
        if (dejqVar == null) {
            return;
        }
        if (dejqVar.b()) {
            this.a.c();
        } else {
            dhja.d(dhia.a, "skipped logging metric due to user logging consent preferences", new Object[0]);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhja.h(dhia.a, "failed to get User consent with cause %s", th.getMessage());
    }
}
