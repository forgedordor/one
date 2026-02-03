package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmc extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ bzmf c;
    final /* synthetic */ byiv d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmc(fcxy fcxyVar, List list, bzmf bzmfVar, byiv byivVar, int i, String str) {
        super(2, fcxyVar);
        this.b = list;
        this.c = bzmfVar;
        this.d = byivVar;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        boolean z = true;
        fctl.b(obj);
        if (i == 0) {
            List<byiv> list = this.b;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (byiv byivVar : list) {
                bzmf bzmfVar = this.c;
                fcyi fcyiVar = fcyi.a;
                arrayList.add(fdin.b(bzmfVar.c, eicg.a(fcyiVar), fdjz.a, new bzmd(null, bzmfVar, this.d, byivVar, this.e, this.f)));
            }
            this.a = 1;
            obj = fdii.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzmc bzmcVar = new bzmc(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        bzmcVar.g = obj;
        return bzmcVar;
    }
}
