package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xar extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ xax c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xar(fcxy fcxyVar, List list, xax xaxVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = xaxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyh fcyhVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.d;
        List<vvs> list = this.b;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (vvs vvsVar : list) {
            if (vvsVar instanceof vvp) {
                fcyhVarA = fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new xas(null, vvsVar, this.c));
            } else {
                if (!(vvsVar instanceof vvr)) {
                    throw new fctg();
                }
                fcyhVarA = fdje.a(vvsVar);
            }
            arrayList.add(fcyhVarA);
        }
        this.a = 1;
        Object objA = fdii.a(arrayList, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xar xarVar = new xar(fcxyVar, this.b, this.c);
        xarVar.d = obj;
        return xarVar;
    }
}
