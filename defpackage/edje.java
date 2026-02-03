package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edje implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edjg b;

    public edje(edjg edjgVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edjgVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        edkj edkjVar = new edkj();
        edkjVar.c(ekjz.g(((etvq) obj).b, new ejvr() { // from class: edjd
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                etvw etvwVar = (etvw) obj2;
                return new edkd(etvwVar.b, etvwVar.c);
            }
        }));
        edkjVar.b(this.a.a());
        this.b.f.j(edkjVar.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edjg edjgVar = this.b;
        edhe edheVarA = edjgVar.d.a(th);
        eure eureVarC = this.a.c(th);
        edkj edkjVar = new edkj();
        int i = ekgb.d;
        edkjVar.c(ekoe.a);
        edkjVar.a = ejwi.j(edheVarA);
        edkjVar.b(eureVarC);
        edjgVar.f.j(edkjVar.a());
    }
}
