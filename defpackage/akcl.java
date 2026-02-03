package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akcl extends fcyz implements fdat {
    final /* synthetic */ akcp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akcl(akcp akcpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akcpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akcl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb<bnfk> ekgbVarZ = akcp.d(this.a.c.a).z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (bnfk bnfkVar : ekgbVarZ) {
            aukf aukfVarN = bnfkVar.n();
            aukfVarN.getClass();
            aukd aukdVarM = bnfkVar.m();
            aukdVarM.getClass();
            arrayList.add(new akcf(aukfVarN, aukdVarM, bnfkVar.k(), bnfkVar.o()));
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akcl(this.a, fcxyVar);
    }
}
