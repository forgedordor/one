package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xne extends fcyz implements fdat {
    final /* synthetic */ ekgb a;
    final /* synthetic */ xnn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xne(fcxy fcxyVar, ekgb ekgbVar, xnn xnnVar) {
        super(2, fcxyVar);
        this.a = ekgbVar;
        this.b = xnnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVar = this.a;
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        int i = 0;
        for (Object obj2 : ekgbVar) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            aoer aoerVar = (aoer) obj2;
            aoerVar.getClass();
            dlcr dlcrVarA = dlcs.a(aoerVar.d());
            String strQ = aoerVar.q();
            String strP = aoerVar.p();
            if (strP == null) {
                strP = aoerVar.s();
            }
            if (strP == null) {
                strP = "";
            }
            arrayList.add(new djex(strQ, dlcrVarA, strP));
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xne xneVar = new xne(fcxyVar, this.a, this.b);
        xneVar.c = obj;
        return xneVar;
    }
}
