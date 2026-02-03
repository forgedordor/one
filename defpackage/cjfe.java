package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjfe {
    public static final eksp a = eksp.c("BugleRcs");
    public final asrc b;
    private final eosc c;
    private final cjfc d;

    public cjfe(eosc eoscVar, cjfc cjfcVar, asrc asrcVar) {
        this.c = eoscVar;
        this.d = cjfcVar;
        this.b = asrcVar;
    }

    public final eiju a(final aubl aublVar, final String str) {
        eiju eijuVarH;
        cjfc cjfcVar = this.d;
        if (((aqte) cjfcVar.f.b()).a()) {
            eijuVarH = ((chtk) cjfcVar.e.b()).c().h(new ejvr() { // from class: cjez
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = cjfc.a;
                    return (aubq) Collection.EL.stream((ekgb) obj).findFirst().orElseThrow(new Supplier() { // from class: cjey
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            eksp ekspVar2 = cjfc.a;
                            return new IllegalStateException("No local identities found.");
                        }
                    });
                }
            }, eoqg.a);
        } else {
            cejp cejpVar = cjfcVar.c;
            fcsu fcsuVar = cjfcVar.d;
            eiju eijuVarA = cejpVar.a();
            final asqx asqxVar = (asqx) fcsuVar.b();
            asqxVar.getClass();
            eijuVarH = eijuVarA.h(new ejvr() { // from class: cjfa
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return asqxVar.c((String) obj);
                }
            }, cjfcVar.b);
        }
        return eijuVarH.i(new eooz() { // from class: cjfb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                aubq aubqVar = (aubq) obj;
                eksp ekspVar = cjfc.a;
                aubl aublVar2 = aublVar;
                aubi aubiVarB = aubi.b(aublVar2.d);
                if (aubiVarB == null) {
                    aubiVarB = aubi.UNKNOWN_CAUSE;
                }
                String str2 = str;
                int iOrdinal = aubiVarB.ordinal();
                if (iOrdinal == 2) {
                    ((eksl) cjfc.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupTooFewParticipants", 107, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_TOO_FEW_PARTICIPANTS");
                    audb audbVar = (audb) audc.c.createBuilder();
                    audbVar.copyOnWrite();
                    audc audcVar = (audc) audbVar.instance;
                    audcVar.d |= 1;
                    audcVar.e = str2;
                    aucs aucsVar = (aucs) aucv.a.createBuilder();
                    aucu aucuVar = aucu.CAUSE_ONLY_SELF_IN_GROUP;
                    aucsVar.copyOnWrite();
                    aucv aucvVar = (aucv) aucsVar.instance;
                    aucvVar.c = aucuVar.d;
                    aucvVar.b |= 1;
                    audbVar.copyOnWrite();
                    audc audcVar2 = (audc) audbVar.instance;
                    aucv aucvVar2 = (aucv) aucsVar.build();
                    aucvVar2.getClass();
                    audcVar2.s = aucvVar2;
                    audcVar2.d |= 2048;
                    audbVar.copyOnWrite();
                    audc audcVar3 = (audc) audbVar.instance;
                    aubqVar.getClass();
                    audcVar3.t = aubqVar;
                    audcVar3.d |= 4096;
                    return eijx.e(Optional.of((audc) audbVar.build()));
                }
                if (iOrdinal == 4) {
                    audb audbVar2 = (audb) audc.c.createBuilder();
                    audbVar2.copyOnWrite();
                    audc audcVar4 = (audc) audbVar2.instance;
                    audcVar4.d |= 1;
                    audcVar4.e = str2;
                    audbVar2.copyOnWrite();
                    audc audcVar5 = (audc) audbVar2.instance;
                    aubqVar.getClass();
                    audcVar5.t = aubqVar;
                    audcVar5.d |= 4096;
                    audbVar2.f(aubqVar);
                    return eijx.e(Optional.of((audc) audbVar2.build()));
                }
                if (iOrdinal != 8) {
                    ekrw ekrwVarO = cjfc.a.o();
                    ekrwVarO.X(atnw.a, aublVar2);
                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitGroupEventForWithSelfChatEndpoint", 96, "ResponseGroupEventEmitter.java")).q("ResponseGroupEventEmitter no GroupEvent to emit for cause");
                    return eijx.e(Optional.empty());
                }
                ((eksl) cjfc.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupNotFound", 140, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_NOT_FOUND");
                audb audbVar3 = (audb) audc.c.createBuilder();
                audbVar3.copyOnWrite();
                audc audcVar6 = (audc) audbVar3.instance;
                audcVar6.d |= 1;
                audcVar6.e = str2;
                aucs aucsVar2 = (aucs) aucv.a.createBuilder();
                aucu aucuVar2 = aucu.CAUSE_GROUP_NOT_FOUND;
                aucsVar2.copyOnWrite();
                aucv aucvVar3 = (aucv) aucsVar2.instance;
                aucvVar3.c = aucuVar2.d;
                aucvVar3.b |= 1;
                audbVar3.copyOnWrite();
                audc audcVar7 = (audc) audbVar3.instance;
                aucv aucvVar4 = (aucv) aucsVar2.build();
                aucvVar4.getClass();
                audcVar7.s = aucvVar4;
                audcVar7.d |= 2048;
                audbVar3.copyOnWrite();
                audc audcVar8 = (audc) audbVar3.instance;
                aubqVar.getClass();
                audcVar8.t = aubqVar;
                audcVar8.d |= 4096;
                return eijx.e(Optional.of((audc) audbVar3.build()));
            }
        }, cjfcVar.b).i(new eooz() { // from class: cjfd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    cjfe cjfeVar = this.a;
                    ((eksl) cjfe.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 54, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor calling IncomingChatApi");
                    return cjfeVar.b.c((audc) optional.get());
                }
                ((eksl) cjfe.a.n().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventProcessor", "processEmittedGroupEventFor", 57, "ResponseGroupEventProcessor.java")).q("ResponseGroupEventProcessor not calling IncomingChatApi");
                aubg aubgVar = (aubg) aubl.a.createBuilder();
                aubk aubkVar = aubk.OK;
                aubgVar.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar.instance;
                aublVar2.c = aubkVar.f;
                aublVar2.b |= 1;
                return eijx.e((aubl) aubgVar.build());
            }
        }, this.c);
    }
}
