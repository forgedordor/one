package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxpe extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ Map c;
    final /* synthetic */ dxns d;
    final /* synthetic */ dxpf e;
    final /* synthetic */ dxha f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxpe(Map map, dxns dxnsVar, dxpf dxpfVar, dxha dxhaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = map;
        this.d = dxnsVar;
        this.e = dxpfVar;
        this.f = dxhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxpe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : this.c.entrySet()) {
                dxhe dxheVarA = (dxhe) entry.getValue();
                int iA = this.d.a(dxheVarA);
                if (dxheVarA.b() != iA) {
                    dxhd dxhdVarH = dxheVarA.h();
                    dxhdVarH.i(iA);
                    dxheVarA = dxhdVarH.a();
                    arrayList.add(dxheVarA);
                }
                map.put(entry.getKey(), dxheVarA);
            }
            dxrk dxrkVarA = this.e.a.a(this.f);
            this.a = map;
            this.b = 1;
            obj = dxrkVarA.e(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = map;
        }
        dxft dxftVar = (dxft) obj;
        return dxftVar instanceof dxfo ? dxftVar : new dxfx(obj2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxpe(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
