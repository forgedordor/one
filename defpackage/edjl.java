package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edjl implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edjm b;

    public edjl(edjm edjmVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edjmVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etxe etxeVar = (etxe) obj;
        eure eureVarA = this.a.a();
        edkl edklVar = new edkl();
        edklVar.d(ekjz.g(etxeVar.b, new ejvr() { // from class: edjj
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                etvu etvuVar = (etvu) obj2;
                edju edjuVar = new edju();
                edjuVar.d(etvuVar.b);
                edjuVar.b(etvuVar.c);
                edjuVar.e(etvuVar.d);
                edjuVar.c(etvuVar.e);
                return edjuVar.a();
            }
        }));
        edklVar.b(ekjz.g(etxeVar.c, new ejvr() { // from class: edjk
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                etuf etufVar = (etuf) obj2;
                edjy edjyVar = new edjy();
                edjyVar.c(etufVar.b);
                edjyVar.b(etufVar.d);
                edjyVar.e(etufVar.c);
                edjyVar.d(etufVar.e);
                return edjyVar.a();
            }
        }));
        edklVar.c(eureVarA);
        this.b.g.j(edklVar.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edjm edjmVar = this.b;
        edhe edheVarA = edjmVar.d.a(th);
        eure eureVarC = this.a.c(th);
        edkl edklVar = new edkl();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        edklVar.d(ekgbVar);
        edklVar.b(ekgbVar);
        edklVar.a = ejwi.j(edheVarA);
        edklVar.c(eureVarC);
        edjmVar.g.j(edklVar.a());
    }
}
