package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyp extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ List c;
    final /* synthetic */ wyy d;
    final /* synthetic */ Long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyp(String str, List list, wyy wyyVar, Long l, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
        this.c = list;
        this.d = wyyVar;
        this.e = l;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wyp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.f;
        String str = this.b;
        if (str != null && this.c.size() != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        wyy wyyVar = this.d;
        wmv wmvVarB = wmu.b(wyyVar.g, this.e, true);
        List<vvr> list = this.c;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (vvr vvrVar : list) {
            arrayList.add(fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new wyo(null, wyyVar, vvrVar, wmvVarB, str)));
        }
        this.a = 1;
        Object objA = fdii.a(arrayList, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wyp wypVar = new wyp(this.b, this.c, this.d, this.e, fcxyVar);
        wypVar.f = obj;
        return wypVar;
    }
}
