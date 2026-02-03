package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edir implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edis b;

    public edir(edis edisVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edisVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etve etveVar = (etve) obj;
        eure eureVarA = this.a.a();
        edkb edkbVar = new edkb();
        edkbVar.d(ekjz.g(etveVar.b, new ejvr() { // from class: edip
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
        edkbVar.b(ekjz.g(etveVar.c, new edio()));
        edkbVar.c(eureVarA);
        this.b.b.j(edkbVar.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edis edisVar = this.b;
        edhe edheVarA = edisVar.a.a(th);
        eure eureVarC = this.a.c(th);
        edkb edkbVar = new edkb();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        edkbVar.d(ekgbVar);
        edkbVar.b(ekgbVar);
        edkbVar.a = ejwi.j(edheVarA);
        edkbVar.c(eureVarC);
        edisVar.b.j(edkbVar.a());
    }
}
