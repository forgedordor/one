package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusf implements eora {
    final /* synthetic */ eoiu a;
    final /* synthetic */ long b;
    final /* synthetic */ dusg c;
    final /* synthetic */ int d;

    public dusf(dusg dusgVar, int i, eoiu eoiuVar, long j) {
        this.d = i;
        this.a = eoiuVar;
        this.b = j;
        this.c = dusgVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ejwi ejwiVar = (ejwi) obj;
        if (ejwiVar.g()) {
            this.c.r(this.d, this.a, this.b, (eokj) ejwiVar.c());
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.k(th, "%s: failure when sampling log!", "MddEventLogger");
    }
}
