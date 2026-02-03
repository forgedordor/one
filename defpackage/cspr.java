package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspr extends fcyz implements fdat {
    int a;
    final /* synthetic */ csps b;
    final /* synthetic */ alqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cspr(csps cspsVar, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cspsVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cspr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((aofc) this.b.d.b()).a().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            alqm alqmVar = (alqm) fdct.b(((aoer) it.next()).o());
            if (alqmVar != null) {
                arrayList.add(alqmVar);
            }
        }
        return Boolean.valueOf(arrayList.contains(this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cspr(this.b, this.c, fcxyVar);
    }
}
