package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxnx extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ dxnz c;
    final /* synthetic */ String d;
    final /* synthetic */ evfy e;
    final /* synthetic */ Map f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxnx(List list, dxnz dxnzVar, String str, evfy evfyVar, Map map, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = dxnzVar;
        this.d = str;
        this.e = evfyVar;
        this.f = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxnx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        List<dxvi> list = this.b;
        Map map = this.f;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (dxvi dxviVar : list) {
            if (!map.containsKey(dxviVar)) {
                return new dxfp(new IllegalStateException("Account to register not found in accounts storage"), 18);
            }
            Object obj2 = map.get(dxviVar);
            if (obj2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add((dxhe) obj2);
        }
        List listAo = fcva.ao(arrayList);
        dxnz dxnzVar = this.c;
        String str = this.d;
        evfy evfyVar = this.e;
        this.a = 1;
        Object objA = dxnzVar.a.a(listAo, str, evfyVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxnx(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
