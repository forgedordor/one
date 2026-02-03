package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duvr implements eora {
    final /* synthetic */ duvs a;

    public duvr(duvs duvsVar) {
        this.a = duvsVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dtrw dtrwVar = this.a.a.c;
        if (dtrwVar == null) {
            dtrwVar = dtrw.a;
        }
        durt.c("%s: Successfully incremented LoggingStateStore network usage for %s", "NetworkUsageMonitor", dtrwVar.c);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dtrw dtrwVar = this.a.a.c;
        if (dtrwVar == null) {
            dtrwVar = dtrw.a;
        }
        durt.k(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", dtrwVar.c);
    }
}
