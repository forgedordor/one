package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abmm implements ablf {
    final /* synthetic */ abmq a;

    public abmm(abmq abmqVar) {
        this.a = abmqVar;
    }

    @Override // defpackage.ablf
    public final abmj a() {
        return abmj.PAUSED;
    }

    @Override // defpackage.ablf
    public final abmj b() {
        return abmj.PAUSING;
    }

    @Override // defpackage.ablf
    public final eiju c() {
        abmq abmqVar = this.a;
        return abmqVar.f.c().i(new eooz() { // from class: abmk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final abmm abmmVar = this.a;
                if (!zBooleanValue) {
                    ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$PauseOperation", "run", 634, "JsBridgeDittoControllerV2.java")).q("Skipping pause operation for auth page.");
                    abmq abmqVar2 = abmmVar.a;
                    ((abpk) abmqVar2.b.b()).d(abmqVar2.i);
                    return eijx.e(null);
                }
                abmq abmqVar3 = abmmVar.a;
                abpk abpkVar = (abpk) abmqVar3.b.b();
                abou abouVar = abmqVar3.i;
                if (!abpkVar.h(abouVar)) {
                    throw new IllegalStateException("Could not pause nonexistent channel.");
                }
                abod abodVarA = abmqVar3.a();
                abodVarA.e = true;
                eppg eppgVar = (eppg) eppi.a.createBuilder();
                evrl evrlVar = evrl.a;
                eppgVar.copyOnWrite();
                eppi eppiVar = (eppi) eppgVar.instance;
                evrlVar.getClass();
                eppiVar.c = evrlVar;
                eppiVar.b = 204;
                return abodVarA.a(abouVar, (eppi) eppgVar.build()).h(new ejvr() { // from class: abml
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        abmq abmqVar4 = abmmVar.a;
                        ((abpk) abmqVar4.b.b()).d(abmqVar4.i);
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
        eppiVar.b = 205;
        abodVarA.d(abmqVar.i, (eppi) eppgVar.build());
    }
}
