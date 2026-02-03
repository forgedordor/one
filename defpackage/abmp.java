package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abmp implements ablf {
    final /* synthetic */ abmq a;

    public abmp(abmq abmqVar) {
        this.a = abmqVar;
    }

    @Override // defpackage.ablf
    public final abmj a() {
        return abmj.CONNECTED;
    }

    @Override // defpackage.ablf
    public final abmj b() {
        return abmj.UNPAUSING;
    }

    @Override // defpackage.ablf
    public final eiju c() {
        abmq abmqVar = this.a;
        return abmqVar.f.c().i(new eooz() { // from class: abmo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                abmp abmpVar = this.a;
                if (!zBooleanValue) {
                    ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$UnpauseOperation", "run", 696, "JsBridgeDittoControllerV2.java")).q("Skipping pause operation for auth page.");
                    abmq abmqVar2 = abmpVar.a;
                    ((abpk) abmqVar2.b.b()).f(abmqVar2.i);
                    return eijx.e(null);
                }
                abmq abmqVar3 = abmpVar.a;
                eygg eyggVar = abmqVar3.b;
                abpk abpkVar = (abpk) eyggVar.b();
                abou abouVar = abmqVar3.i;
                abpkVar.f(abouVar);
                if (!((abpk) eyggVar.b()).h(abouVar)) {
                    throw new IllegalStateException("Could not unpause nonexistent channel.");
                }
                abod abodVarA = abmqVar3.a();
                abodVarA.e = false;
                eppg eppgVar = (eppg) eppi.a.createBuilder();
                evrl evrlVar = evrl.a;
                eppgVar.copyOnWrite();
                eppi eppiVar = (eppi) eppgVar.instance;
                evrlVar.getClass();
                eppiVar.c = evrlVar;
                eppiVar.b = 205;
                return abodVarA.a(abouVar, (eppi) eppgVar.build()).h(new ejvr() { // from class: abmn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, abmqVar3.c);
            }
        }, abmqVar.c);
    }

    @Override // defpackage.ablf
    public final void d() {
        abmq abmqVar = this.a;
        abod abodVarA = abmqVar.a();
        abodVarA.e = true;
        eppg eppgVar = (eppg) eppi.a.createBuilder();
        evrl evrlVar = evrl.a;
        eppgVar.copyOnWrite();
        eppi eppiVar = (eppi) eppgVar.instance;
        evrlVar.getClass();
        eppiVar.c = evrlVar;
        eppiVar.b = 204;
        abodVarA.d(abmqVar.i, (eppi) eppgVar.build());
    }
}
