package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycr extends fcyz implements fdat {
    int a;
    final /* synthetic */ cyda b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cycr(fcxy fcxyVar, cyda cydaVar) {
        super(2, fcxyVar);
        this.b = cydaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cycr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cyda cydaVar = this.b;
            eiju eijuVarA = cydaVar.f.a(cydaVar.e);
            this.a = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        List list = (List) obj;
        int size = list.size();
        list.getClass();
        String str = "KeyMaterials size: " + size + "\n***********************************\n\n" + fcva.aF(list, "\n***********************************\n\n", null, null, cycs.a, 30);
        cyda.a.p("keyMaterial: \n\n".concat(str));
        return str;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cycr cycrVar = new cycr(fcxyVar, this.b);
        cycrVar.c = obj;
        return cycrVar;
    }
}
