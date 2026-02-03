package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edli implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edlj b;

    public edli(edlj edljVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edljVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etwm etwmVar = (etwm) obj;
        synchronized (this) {
            edlj edljVar = this.b;
            List list = edljVar.c;
            etud etudVar = etwmVar.b;
            if (etudVar == null) {
                etudVar = etud.a;
            }
            list.addAll(etudVar.d);
            List list2 = edljVar.d;
            edhi edhiVar = this.a;
            etud etudVar2 = etwmVar.b;
            if (etudVar2 == null) {
                etudVar2 = etud.a;
            }
            list2.add(edhiVar.b(etudVar2.d.size()));
            lvy lvyVar = edljVar.e;
            ekgb ekgbVarN = ekgb.n(list);
            etud etudVar3 = etwmVar.b;
            if (etudVar3 == null) {
                etudVar3 = etud.a;
            }
            int i = etudVar3.b & 1;
            lvyVar.j(new edld(ekgbVarN, ejud.a, 1 == i, ekgb.n(list2)));
            etud etudVar4 = etwmVar.b;
            if (etudVar4 == null) {
                etudVar4 = etud.a;
            }
            edljVar.g = 1 == (etudVar4.b & 1);
            edljVar.l = false;
            edljVar.f = false;
        }
        this.b.b();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edlj edljVar = this.b;
        edhe edheVarA = edljVar.a.a(th);
        edhi edhiVar = this.a;
        List list = edljVar.d;
        eure eureVarC = edhiVar.c(th);
        list.add(eureVarC);
        euqz euqzVar = (euqz) eura.a.createBuilder();
        eurc eurcVar = eureVarC.f;
        if (eurcVar == null) {
            eurcVar = eurc.a;
        }
        edgv edgvVar = edljVar.b;
        euqzVar.copyOnWrite();
        eura euraVar = (eura) euqzVar.instance;
        eurcVar.getClass();
        euraVar.c = eurcVar;
        euraVar.b |= 2;
        edgvVar.b((eura) euqzVar.build());
        edljVar.e.j(new edld(ekgb.n(edljVar.c), ejwi.j(edheVarA), true, ekgb.n(list)));
        edljVar.l = false;
        edljVar.f = true;
    }
}
