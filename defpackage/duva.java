package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duva implements eora {
    final /* synthetic */ duur a;
    final /* synthetic */ duab b;
    final /* synthetic */ duvb c;

    public duva(duvb duvbVar, duur duurVar, duab duabVar) {
        this.a = duurVar;
        this.b = duabVar;
        this.c = duvbVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [duve, java.lang.Object] */
    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        duvd duvdVar = this.c.c;
        ejwi ejwiVar = duvdVar.b;
        if (ejwiVar.g()) {
            ejwiVar.c().f(((duum) this.a).a);
        }
        duvdVar.d.e(((duaa) this.b).a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [duve, java.lang.Object] */
    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.k(th, "%s: Failed to run client onComplete", "DownloaderImp");
        duvd duvdVar = this.c.c;
        ejwi ejwiVar = duvdVar.b;
        if (ejwiVar.g()) {
            ejwiVar.c().f(((duum) this.a).a);
        }
        duvdVar.d.e(((duaa) this.b).a);
    }
}
