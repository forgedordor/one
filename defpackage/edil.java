package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edil implements eora {
    final /* synthetic */ ejvr a;
    final /* synthetic */ edim b;
    final /* synthetic */ int c;

    public edil(edim edimVar, ejvr ejvrVar, int i) {
        this.a = ejvrVar;
        this.c = i;
        this.b = edimVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ediz edizVar = (ediz) this.a.apply((List) obj);
        edim edimVar = this.b;
        edimVar.g.j(edizVar);
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurf eurfVar = (eurf) eurg.a.createBuilder();
        eurfVar.copyOnWrite();
        eurg eurgVar = (eurg) eurfVar.instance;
        eurgVar.c = this.c - 1;
        eurgVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurg eurgVar2 = (eurg) eurfVar.build();
        eurgVar2.getClass();
        eureVar.d = eurgVar2;
        eureVar.c = 9;
        edimVar.e.b(eurdVar);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        List listC = ejxy.c(th);
        listC.getClass();
        rhs rhsVar = (rhs) ekis.i(ekis.d(listC, new ejwo(rhs.class)), null);
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurf eurfVar = (eurf) eurg.a.createBuilder();
        eurfVar.copyOnWrite();
        eurg eurgVar = (eurg) eurfVar.instance;
        eurgVar.c = this.c - 1;
        eurgVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurg eurgVar2 = (eurg) eurfVar.build();
        eurgVar2.getClass();
        eureVar.d = eurgVar2;
        eureVar.c = 9;
        eurc eurcVarA = edgn.a(rhsVar);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eurcVarA.getClass();
        eureVar2.f = eurcVarA;
        eureVar2.b |= 2;
        edim edimVar = this.b;
        edimVar.e.b(eurdVar);
        edimVar.g.j(ediz.b(edhe.RETRYABLE));
    }
}
