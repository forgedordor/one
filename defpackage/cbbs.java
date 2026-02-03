package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbs extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbbk b;
    final /* synthetic */ cbcf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbbs(fcxy fcxyVar, cbbk cbbkVar, cbcf cbcfVar) {
        super(2, fcxyVar);
        this.b = cbbkVar;
        this.c = cbcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbbs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (((Boolean) cbcf.a.e()).booleanValue()) {
                int iOrdinal = this.b.ordinal();
                if (iOrdinal == 0) {
                    return fcvq.a;
                }
                if (iOrdinal == 1) {
                    return ((Map) this.c.b.b()).keySet();
                }
                throw new fctg();
            }
            cbcf cbcfVar = this.c;
            this.a = 1;
            obj = cbcfVar.f(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Set setEntrySet = ((Map) obj).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (((cbbk) ((Map.Entry) obj2).getValue()) == this.b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbbs cbbsVar = new cbbs(fcxyVar, this.b, this.c);
        cbbsVar.d = obj;
        return cbbsVar;
    }
}
