package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfxg implements eora {
    final /* synthetic */ cjku a;

    public dfxg(cjku cjkuVar) {
        this.a = cjkuVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dhip dhipVar = dfxh.a;
        cjjw cjjwVar = this.a.f;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        dhja.l(dhipVar, "[%s] Notification completed.", cjjwVar.c);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhip dhipVar = dfxh.a;
        cjjw cjjwVar = this.a.f;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        dhja.h(dhipVar, "[%s] Error while notifying operation completed: %s", cjjwVar.c, th);
    }
}
