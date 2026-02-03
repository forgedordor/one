package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cozm b;
    final /* synthetic */ coze c;
    final /* synthetic */ Map d;
    final /* synthetic */ cozo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cozj(fcxy fcxyVar, cozm cozmVar, coze cozeVar, Map map, cozo cozoVar) {
        super(2, fcxyVar);
        this.b = cozmVar;
        this.c = cozeVar;
        this.d = map;
        this.e = cozoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cozj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekib ekibVarF = ((cozw) this.b.d.b()).a().u().f();
            coze cozeVar = this.c;
            ekhx ekhxVarC = ekibVarF.c(cozeVar);
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = ekhxVarC.iterator();
            while (it.hasNext()) {
                cozu cozuVar = (cozu) this.d.get((dggp) it.next());
                if (cozuVar != null) {
                    arrayList.add(cozuVar);
                }
            }
            Set setAv = fcva.av(arrayList);
            ekrw ekrwVarH = cozm.a.h();
            ekrwVarH.X(eksq.a, "BugleTransport");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$refreshMultiSimTransportRegistration$2$invokeSuspend$lambda$2$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 245, "ChatTransportControllerImpl.kt");
            ArrayList arrayList2 = new ArrayList(fcva.p(setAv, 10));
            Iterator it2 = setAv.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Integer(((cozu) it2.next()).b));
            }
            ekrdVar.D("Deregister all SIMs except for SIMs with subIds: %s from chat transport: %s.", arrayList2, cozeVar.name());
            cozo cozoVar = this.e;
            this.a = 1;
            if (cozoVar.a(setAv, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cozj cozjVar = new cozj(fcxyVar, this.b, this.c, this.d, this.e);
        cozjVar.f = obj;
        return cozjVar;
    }
}
