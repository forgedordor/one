package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axce extends fcyz implements fdat {
    final /* synthetic */ Iterable a;
    final /* synthetic */ axcl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axce(fcxy fcxyVar, Iterable iterable, axcl axclVar) {
        super(2, fcxyVar);
        this.a = iterable;
        this.b = axclVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axce) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eksp ekspVar = axcl.a;
        axav axavVarB = axcb.b("MyIdentityTablesOperations#getMyIdentitiesForTokens");
        axavVarB.c(new axcf(this.a));
        ekgb<awzp> ekgbVarZ = axavVarB.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (awzp awzpVar : ekgbVarZ) {
            axcl axclVar = this.b;
            awzpVar.getClass();
            arrayList.add(axclVar.k(awzpVar));
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axce axceVar = new axce(fcxyVar, this.a, this.b);
        axceVar.c = obj;
        return axceVar;
    }
}
