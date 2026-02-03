package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edia implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edib b;

    public edia(edib edibVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edibVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etuw etuwVar = (etuw) obj;
        synchronized (this) {
            edib edibVar = this.b;
            List list = edibVar.d;
            list.addAll(ekjz.g(etuwVar.c, new ejvr() { // from class: edhz
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
            List list2 = edibVar.e;
            list2.add(this.a.b(etuwVar.c.size()));
            edibVar.c.j(new edka(ekgb.n(list), ejud.a, ekgb.n(list2)));
            edibVar.g = (etuwVar.b & 4) != 0;
            edibVar.l = false;
            edibVar.f = false;
        }
        this.b.d();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        synchronized (this) {
            edib edibVar = this.b;
            edhe edheVarA = edibVar.a.a(th);
            eure eureVarC = this.a.c(th);
            List list = edibVar.e;
            list.add(eureVarC);
            edgv edgvVar = edibVar.b;
            euqz euqzVar = (euqz) eura.a.createBuilder();
            eurc eurcVar = eureVarC.f;
            if (eurcVar == null) {
                eurcVar = eurc.a;
            }
            euqzVar.copyOnWrite();
            eura euraVar = (eura) euqzVar.instance;
            eurcVar.getClass();
            euraVar.c = eurcVar;
            euraVar.b |= 2;
            edgvVar.b((eura) euqzVar.build());
            edibVar.c.j(new edka(ekgb.n(edibVar.d), ejwi.j(edheVarA), ekgb.n(list)));
            edibVar.l = false;
            edibVar.f = true;
        }
    }
}
