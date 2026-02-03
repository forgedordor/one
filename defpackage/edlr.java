package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edlr implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ edlt c;

    public edlr(edlt edltVar, edhi edhiVar, boolean z) {
        this.a = edhiVar;
        this.b = z;
        this.c = edltVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etwq etwqVar = (etwq) obj;
        synchronized (this) {
            etwy etwyVar = etwqVar.b;
            if (etwyVar == null) {
                etwyVar = etwy.a;
            }
            edlt edltVar = this.c;
            List list = edltVar.c;
            list.addAll(etwyVar.e);
            List list2 = edltVar.d;
            list2.add(this.a.b(etwyVar.e.size()));
            edltVar.e.j(new edle(ekgb.n(list), ejud.a, 1 == (etwyVar.b & 1), ekgb.n(list2)));
            edltVar.g = 1 == (etwyVar.b & 1);
            edltVar.o = false;
            edltVar.f = false;
            if (edltVar.g) {
                edgv edgvVar = edltVar.a;
                euqu euquVar = (euqu) euqv.a.createBuilder();
                int i = true != etwyVar.e.isEmpty() ? 109 : 108;
                euquVar.copyOnWrite();
                euqv euqvVar = (euqv) euquVar.instance;
                euqvVar.c = i - 1;
                euqvVar.b |= 1;
                edgvVar.a((euqv) euquVar.build());
            }
            if (this.b && !edltVar.d()) {
                edgv edgvVar2 = edltVar.a;
                euqu euquVar2 = (euqu) euqv.a.createBuilder();
                euquVar2.copyOnWrite();
                euqv euqvVar2 = (euqv) euquVar2.instance;
                euqvVar2.c = 106;
                euqvVar2.b |= 1;
                long j = edltVar.h;
                euquVar2.copyOnWrite();
                euqv euqvVar3 = (euqv) euquVar2.instance;
                euqvVar3.b |= 2;
                euqvVar3.d = j;
                edgvVar2.a((euqv) euquVar2.build());
            }
        }
        this.c.b();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edlt edltVar = this.c;
        edhe edheVarA = edltVar.b.a(th);
        edhi edhiVar = this.a;
        List list = edltVar.d;
        eure eureVarC = edhiVar.c(th);
        list.add(eureVarC);
        euqz euqzVar = (euqz) eura.a.createBuilder();
        eurc eurcVar = eureVarC.f;
        if (eurcVar == null) {
            eurcVar = eurc.a;
        }
        edgv edgvVar = edltVar.a;
        euqzVar.copyOnWrite();
        eura euraVar = (eura) euqzVar.instance;
        eurcVar.getClass();
        euraVar.c = eurcVar;
        euraVar.b |= 2;
        edgvVar.b((eura) euqzVar.build());
        edltVar.e.j(new edle(ekgb.n(edltVar.c), ejwi.j(edheVarA), true, ekgb.n(list)));
        edltVar.o = false;
        edltVar.f = true;
    }
}
