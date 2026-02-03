package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ediq implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edis b;

    public ediq(edis edisVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edisVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.c.j(new edjw(ekgb.j(ekjz.g(((etwe) obj).b, new ejvr() { // from class: edin
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                ettz ettzVar = (ettz) obj2;
                return edhr.a(ettzVar.b, ekjz.g(ettzVar.c, new edio()));
            }
        })), ejud.a, this.a.a()));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edis edisVar = this.b;
        edhe edheVarA = edisVar.a.a(th);
        eure eureVarC = this.a.c(th);
        int i = ekgb.d;
        edisVar.c.j(new edjw(ekoe.a, ejwi.j(edheVarA), eureVarC));
    }
}
