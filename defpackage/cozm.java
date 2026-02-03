package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozm implements cozg, ccyz, dggy, dggv, dggm, devu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl");
    public final Map b;
    public final fcsu c;
    public final fcsu d;
    public final eizx e;
    private final fcsu f;
    private final fcsu g;
    private final dggl h;
    private final fdjx i;
    private final AtomicBoolean j;

    public cozm(Map map, fcsu fcsuVar, fcsu fcsuVar2, dggl dgglVar, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dgglVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.b = map;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = dgglVar;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.i = fdjxVar;
        this.e = new eizx();
        this.j = new AtomicBoolean(false);
    }

    private final Set h(Iterable iterable) {
        dghj dghjVar = (dghj) this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            dggk dggkVarA = dghjVar.a((dggn) it.next());
            if (dggkVarA != null) {
                arrayList.add(dggkVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((asqx) this.g.b()).c(((dggk) it2.next()).a));
        }
        return fcva.av(arrayList2);
    }

    private final void i() {
        if (!this.j.get()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleTransport");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 206, "ChatTransportControllerImpl.kt")).q("Not kicking off update transport registration because RCS provisioning change has not been received.");
        } else {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleTransport");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 211, "ChatTransportControllerImpl.kt")).q("Kicking off update transport registration.");
            auvw.k(this.i, null, null, new cozi(this, null), 3);
        }
    }

    @Override // defpackage.ccyz
    public final void a() throws IOException {
        eieu eieuVarH = eiiy.h("ChatTransportControllerImpl#onBuglePhenotypeFlagChanged");
        try {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleTransport");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onBuglePhenotypeFlagChanged", 98, "ChatTransportControllerImpl.kt")).q("onBuglePhenotypeFlagChanged event received. Kicking off transport registration update.");
            i();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.dggm
    public final void b(Set set) throws IOException {
        eieu eieuVarH = eiiy.h("ChatTransportControllerImpl#onRcsProvisioningChange");
        try {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleTransport");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onRcsProvisioningChange", 116, "ChatTransportControllerImpl.kt")).q("onRcsProvisioningChange event received. Kicking off transport registration update.");
            this.j.set(true);
            i();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.cozg
    public final coze c(aubq aubqVar) throws IOException {
        aubqVar.getClass();
        eieu eieuVarA = eiiy.a("ChatTransportControllerImpl#getChatTransport");
        try {
            dghj dghjVar = (dghj) this.f.b();
            dggl dgglVar = this.h;
            String str = aubqVar.d;
            str.getClass();
            dggn dggnVarC = dghjVar.c(dgglVar.a(str));
            if (dggnVarC == null) {
                coze cozeVar = coze.a;
                fczl.a(eieuVarA, null);
                return cozeVar;
            }
            coze cozeVar2 = (coze) ((cozw) this.d.b()).a().get(dggo.a(dggnVarC));
            if (cozeVar2 == null) {
                cozeVar2 = coze.a;
            }
            fczl.a(eieuVarA, null);
            return cozeVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.cozg
    @fcsv
    public final enmr d() throws IOException {
        eieu eieuVarA = eiiy.a("ChatTransportControllerImpl#enabledTransport");
        try {
            coze cozeVar = (coze) fcva.O(g());
            if (cozeVar == null) {
                cozeVar = coze.a;
            }
            enmr enmrVar = cozeVar.f;
            fczl.a(eieuVarA, null);
            return enmrVar;
        } finally {
        }
    }

    @Override // defpackage.cozg
    public final Set e() throws IOException {
        eieu eieuVarA = eiiy.a("ChatTransportControllerImpl#getChatEndpoints");
        try {
            ekgp ekgpVarA = ((cozw) this.d.b()).a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ekgpVarA.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((coze) entry.getValue()) != coze.a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setH = h(linkedHashMap.keySet());
            fczl.a(eieuVarA, null);
            return setH;
        } finally {
        }
    }

    @Override // defpackage.cozg
    public final Set f(coze cozeVar) throws IOException {
        cozeVar.getClass();
        eieu eieuVarA = eiiy.a("ChatTransportControllerImpl#getChatEndpoints_forChatTransport");
        try {
            Set setH = h(((cozw) this.d.b()).a().u().f().c(cozeVar));
            fczl.a(eieuVarA, null);
            return setH;
        } finally {
        }
    }

    @Override // defpackage.cozg
    public final Set g() throws IOException {
        eieu eieuVarA = eiiy.a("ChatTransportControllerImpl#getChatTransports");
        try {
            Collection collectionValues = ((cozw) this.d.b()).a().values();
            collectionValues.getClass();
            Set setAv = fcva.av(collectionValues);
            fczl.a(eieuVarA, null);
            return setAv;
        } finally {
        }
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }

    @Override // defpackage.dggv
    public final void gf(String str, dgid dgidVar) throws IOException {
        eieu eieuVarH = eiiy.h("ChatTransportControllerImpl#onRcsAvailabilityUpdate");
        try {
            b(fcwm.b(new dggp(str)));
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.dggy
    public final void gg(String str, Optional optional) throws IOException {
        eieu eieuVarH = eiiy.h("ChatTransportControllerImpl#onRcsConfigurationUpdate");
        try {
            b(fcwm.b(new dggp(str)));
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.devu
    public final void u() throws IOException {
        eieu eieuVarH = eiiy.h("ChatTransportControllerImpl#onSystemBound");
        try {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleTransport");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onSystemBound", 108, "ChatTransportControllerImpl.kt")).q("onSystemBound event received. Kicking off transport registration update.");
            i();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
