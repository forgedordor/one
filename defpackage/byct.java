package defpackage;

import android.util.ArrayMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byct implements bycs {
    private static final eksp a = eksp.c("BugleSearch");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public byct(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
    }

    @Override // defpackage.byfc
    public final eiju a(bppd bppdVar) {
        eiju eijuVarD;
        ejwl.a(d(bppdVar));
        eieu eieuVarK = eiiy.k("IcingWorkerImpl::process");
        try {
            String strR = bppdVar.r();
            if (strR == null) {
                eksl ekslVar = (eksl) a.j();
                ekslVar.X(bxze.g, "IcingWorkerImpl");
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 137, "IcingWorkerImpl.java")).q("Icing can't process the workitem as workItemId is null");
                eijuVarD = eijx.e(false);
            } else if (((asaw) this.e.b()).a() && bppdVar.m() == 4) {
                eksl ekslVar2 = (eksl) a.j();
                ekslVar2.X(bxze.g, "IcingWorkerImpl");
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 146, "IcingWorkerImpl.java")).q("Skip process message annotation.");
                eijuVarD = eijx.e(true);
            } else {
                eksp ekspVar = a;
                ekrw ekrwVarO = ekspVar.o();
                ekrz ekrzVar = bxze.g;
                ekrwVarO.X(ekrzVar, "IcingWorkerImpl");
                ekrwVarO.X(bxze.h, Integer.valueOf(bppdVar.m()));
                ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 154, "IcingWorkerImpl.java")).q("Processing work item.");
                if (((aqdi) this.d.b()).a()) {
                    eijuVarD = ((bxrh) this.c.b()).b(bppdVar.m(), ekgb.r(strR));
                } else {
                    int iM = bppdVar.m();
                    if (iM == 1) {
                        ekrw ekrwVarO2 = ekspVar.o();
                        ekrwVarO2.X(cqnc.a, strR);
                        ekrwVarO2.X(ekrzVar, "IcingWorkerImpl");
                        ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 177, "IcingWorkerImpl.java")).q("Indexing message");
                        eijuVarD = ((bxzf) this.b.b()).d(ekgb.r(bary.b(strR)));
                    } else if (iM == 2) {
                        ekrw ekrwVarO3 = ekspVar.o();
                        ekrwVarO3.X(cqnc.r, strR);
                        ekrwVarO3.X(ekrzVar, "IcingWorkerImpl");
                        ((eksl) ekrwVarO3.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 167, "IcingWorkerImpl.java")).q("Indexing conversation");
                        eijuVarD = ((bxzf) this.b.b()).b(ekgb.r(barn.b(strR)));
                    } else if (iM == 3) {
                        ekrw ekrwVarO4 = ekspVar.o();
                        ekrwVarO4.X(cqnc.p, strR);
                        ekrwVarO4.X(ekrzVar, "IcingWorkerImpl");
                        ((eksl) ekrwVarO4.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 187, "IcingWorkerImpl.java")).q("Indexing participant");
                        eijuVarD = ((bxzf) this.b.b()).e(ekgb.r(strR));
                    } else if (iM != 4) {
                        ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 199, "IcingWorkerImpl.java")).r("Icing can't process the work item because it has an unknown type: %s", bppdVar.m());
                        eijuVarD = eijx.e(false);
                    } else {
                        ekrw ekrwVarO5 = ekspVar.o();
                        ekrwVarO5.X(cqnc.Z, strR);
                        ekrwVarO5.X(ekrzVar, "IcingWorkerImpl");
                        ((eksl) ekrwVarO5.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "processInternal", 194, "IcingWorkerImpl.java")).q("Indexing annotation");
                        eijuVarD = ((bxzf) this.b.b()).c(ekgb.r(strR));
                    }
                }
            }
            eieuVarK.b(eijuVarD);
            eieuVarK.close();
            return eijuVarD;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.byfb
    public final Map b(Collection collection) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bppd bppdVar = (bppd) it.next();
            if (d(bppdVar)) {
                arrayMap.put(bppdVar.q(), a(bppdVar));
            }
        }
        return arrayMap;
    }

    @Override // defpackage.byfb
    public final Set c(Collection collection) {
        css cssVar = new css();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bppd bppdVar = (bppd) it.next();
            if (d(bppdVar)) {
                cssVar.add(bppdVar.q());
            }
        }
        return cssVar;
    }

    @Override // defpackage.byfc
    public final boolean d(bppd bppdVar) {
        try {
            aumq aumqVarC = ((aurx) this.f.b()).c();
            if (autx.m(aumqVarC)) {
                ((eksl) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "canProcess", 96, "IcingWorkerImpl.java")).q("Skipping icing index work because CMS Restore is running.");
                return false;
            }
        } catch (evtj e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingWorkerImpl", "canProcess", 'Y', "IcingWorkerImpl.java")).q("Failed to get CmsSettingsData, will schedule icing index work.");
        }
        return (bppdVar.o() & 1) != 0;
    }
}
