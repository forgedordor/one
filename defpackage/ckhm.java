package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhm implements ckhh {
    public static final eksp a = eksp.p();
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningSchedulerMediatorImpl");
    public final fcsu c;
    public final fcsu d;
    public final dhkw e;
    public final arul f;
    private final fdjx g;
    private final ahgh h;
    private final fcsu i;
    private final arhh j;

    public ckhm(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, dhkw dhkwVar, apwv apwvVar, ahgh ahghVar, fcsu fcsuVar3, arul arulVar, arhh arhhVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        dhkwVar.getClass();
        apwvVar.getClass();
        ahghVar.getClass();
        fcsuVar3.getClass();
        arhhVar.getClass();
        this.g = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = dhkwVar;
        this.h = ahghVar;
        this.i = fcsuVar3;
        this.f = arulVar;
        this.j = arhhVar;
    }

    @Override // defpackage.ckhh
    public final eiju a(dggn dggnVar, enxe enxeVar) {
        enxeVar.getClass();
        return ((ckhg) this.d.b()).d(dggo.a(dggnVar), enxeVar);
    }

    @Override // defpackage.ckhh
    public final /* bridge */ /* synthetic */ void b(int i, ewjm ewjmVar) {
        ewjmVar.getClass();
        if (this.e.b(i)) {
            if (this.j.a()) {
                ((eksl) a.j()).q("SingleRegistrationConfigRemovedListener is deprecated.");
            } else {
                auvw.k(this.g, null, null, new ckhi(this, i, ewjmVar, null), 3);
            }
        }
    }

    @Override // defpackage.ckhh
    public final void c() {
        auvw.m(this.g, null, new ckhj(this, null), 3);
    }

    @Override // defpackage.ckhh
    public final void d(ewjm ewjmVar, enxe enxeVar) {
        ewjmVar.getClass();
        enxeVar.getClass();
        auvw.k(this.g, null, null, new ckhk(ewjmVar, enxeVar, this, null), 3);
    }

    @Override // defpackage.ckhh
    public final void e(dggn dggnVar, ewjm ewjmVar, enxe enxeVar) {
        dggnVar.getClass();
        ewjmVar.getClass();
        enxeVar.getClass();
        auvw.k(this.g, null, null, new ckhl(this, dggnVar, ewjmVar, enxeVar, null), 3);
    }

    public final Object f(int i, ewjm ewjmVar, fcxy fcxyVar) {
        ((eksl) a.h()).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %s", i);
        eiju eijuVarA = this.h.a(i, ewjmVar);
        eijuVarA.getClass();
        Object objC = fdxs.c(eijuVarA, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public final Set g() {
        Set setO = ((cmlb) this.c.b()).o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setO) {
            if (((cjpl) this.i.b()).b((dggn) obj) == 1) {
                arrayList.add(obj);
            }
        }
        return fcva.av(arrayList);
    }
}
