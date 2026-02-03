package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cemv implements eooz {
    public final /* synthetic */ ceni a;

    public /* synthetic */ cemv(ceni ceniVar) {
        this.a = ceniVar;
    }

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        final cejg cejgVar = (cejg) obj;
        final eiju eijuVarG = eiju.g(cejgVar.y());
        eiju eijuVarI = cejgVar.o().i();
        ejvr ejvrVar = new ejvr() { // from class: cehm
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cevq cevqVar = (cevq) obj2;
                ekrg ekrgVar = cejg.a;
                boolean z = true;
                if (cevqVar != cevq.REGISTERED_WITH_PREKEYS && cevqVar != cevq.REGISTERED_WITHOUT_PREKEYS) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        eoqg eoqgVar = eoqg.a;
        final eiju eijuVarH = eijuVarI.h(ejvrVar, eoqgVar);
        final eiju eijuVarH2 = cejgVar.o().i().h(new ejvr() { // from class: ceie
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cevq cevqVar = (cevq) obj2;
                ekrg ekrgVar = cejg.a;
                return Boolean.valueOf(cevqVar == cevq.REGISTERED_WITH_PREKEYS);
            }
        }, eoqgVar);
        eijw eijwVarM = eijx.m(eijuVarG, eijuVarH, eijuVarH2);
        final ceni ceniVar = this.a;
        return eijwVarM.b(new eooy() { // from class: cenb
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                boolean zBooleanValue = ((Boolean) eork.q(eijuVarG)).booleanValue();
                ceni ceniVar2 = ceniVar;
                cejg cejgVar2 = cejgVar;
                if (!zBooleanValue) {
                    ceni.a.m("Performing registration because it is currently not registered.");
                    return ceniVar2.g(cejgVar2);
                }
                if (ceniVar2.i.get()) {
                    ceni.a.m("Forcing a refresh.");
                    return ceniVar2.g(cejgVar2);
                }
                if (!((Boolean) eork.q(eijuVarH)).booleanValue()) {
                    ceni.a.m("Forcing a re-register because the state is set to not registered.");
                    return ceniVar2.g(cejgVar2);
                }
                if (!((bvut) ceniVar2.h.b()).g() || ((Boolean) eork.q(eijuVarH2)).booleanValue()) {
                    ceni.a.m("Already registered, skipping refresh");
                    return eijx.e(ezns.a);
                }
                ceni.a.m("Forcing a refresh for etouffee.");
                return ceniVar2.g(cejgVar2);
            }
        }, ceniVar.f);
    }
}
