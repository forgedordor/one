package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgvb {
    private final fcsu a;

    public cgvb(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public static /* synthetic */ void c(cgvb cgvbVar, List list, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            list = fcvo.a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        cgvbVar.b(list, i, z & ((i2 & 4) == 0));
    }

    public final void a(enrp enrpVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.be = enrpVar;
        ellhVar.f |= 128;
        aillVar.j((ellg) elgr.a(ellgVar).toBuilder());
    }

    public final void b(List list, int i, boolean z) {
        list.getClass();
        enrd enrdVar = (enrd) enrp.a.createBuilder();
        enrdVar.getClass();
        enri enriVar = (enri) enro.a.createBuilder();
        enriVar.getClass();
        if (i != 0) {
            enrk enrkVar = (enrk) enrl.b.createBuilder();
            enrkVar.getClass();
            enrkVar.copyOnWrite();
            enrl enrlVar = (enrl) enrkVar.instance;
            if (i == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            enrlVar.d = i - 2;
            enrlVar.c |= 1;
            new evsz(enrlVar.e, enrl.a);
            enrkVar.copyOnWrite();
            enrl enrlVar2 = (enrl) enrkVar.instance;
            evsx evsxVar = enrlVar2.e;
            if (!evsxVar.c()) {
                enrlVar2.e = evsn.mutableCopy(evsxVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                enrlVar2.e.h(((eaid) it.next()).a());
            }
            evsn evsnVarBuild = enrkVar.build();
            evsnVarBuild.getClass();
            enriVar.copyOnWrite();
            enro enroVar = (enro) enriVar.instance;
            enroVar.d = (enrl) evsnVarBuild;
            enroVar.c = 3;
        } else {
            enrm enrmVar = (enrm) enrn.a.createBuilder();
            enrmVar.getClass();
            evsn evsnVarBuild2 = enrmVar.build();
            evsnVarBuild2.getClass();
            enriVar.copyOnWrite();
            enro enroVar2 = (enro) enriVar.instance;
            enroVar2.d = (enrn) evsnVarBuild2;
            enroVar2.c = 2;
        }
        enriVar.copyOnWrite();
        enro enroVar3 = (enro) enriVar.instance;
        enroVar3.b |= 1;
        enroVar3.e = z;
        evsn evsnVarBuild3 = enriVar.build();
        evsnVarBuild3.getClass();
        enrdVar.copyOnWrite();
        enrp enrpVar = (enrp) enrdVar.instance;
        enrpVar.c = (enro) evsnVarBuild3;
        enrpVar.b = 2;
        a(enrq.a(enrdVar));
    }
}
