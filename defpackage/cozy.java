package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozy implements cozo {
    private final fcsu a;

    public cozy(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.cozo
    public final Object a(Set set, fcxy fcxyVar) {
        cies ciesVar = (cies) this.a.b();
        ewwt ewwtVar = ewwt.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION;
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((cozu) it.next()).b));
        }
        Object objC = fdxs.c(ciesVar.c(ewwtVar, arrayList), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.cozo
    public final Object b(cozu cozuVar, fcxy fcxyVar) {
        Object objC = fdxs.c(((cies) this.a.b()).b(ewwt.RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION, cozuVar.b), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.cozo
    public final boolean c(cozu cozuVar) {
        cozuVar.getClass();
        return cozuVar.a.m().C();
    }
}
