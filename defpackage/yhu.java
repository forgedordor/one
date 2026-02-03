package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhu implements fdap {
    final /* synthetic */ fdjx a;
    final /* synthetic */ yhw b;
    final /* synthetic */ ekgb c;
    final /* synthetic */ fdpl d;

    public yhu(fdjx fdjxVar, yhw yhwVar, ekgb ekgbVar, fdpl fdplVar) {
        this.a = fdjxVar;
        this.b = yhwVar;
        this.c = ekgbVar;
        this.d = fdplVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        fdci fdciVar = new fdci();
        fdpl fdplVar = this.d;
        yhw yhwVar = this.b;
        fdciVar.a = auvw.k(this.a, null, null, new yhs(fdplVar, ahatVar, yhwVar, fdciVar, null), 3);
        return yhwVar.a(this.c, ahatVar, new yht(fdciVar));
    }
}
