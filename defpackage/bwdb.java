package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdb implements bvut, cfsb {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EtouffeeStateMachine");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine");
    public final ains c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final eosc g;
    public final eosc h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final eygg q;
    private final Object s = new Object();
    private final Map r = ekmi.h(2);

    public bwdb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, ains ainsVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, eosc eoscVar, eosc eoscVar2, eygg eyggVar) {
        this.l = fcsuVar;
        this.j = fcsuVar3;
        this.m = fcsuVar2;
        this.n = fcsuVar4;
        this.c = ainsVar;
        this.d = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.e = fcsuVar8;
        this.k = fcsuVar9;
        this.f = fcsuVar10;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.q = eyggVar;
        this.i = fcsuVar11;
    }

    public static elyq j(bwrp bwrpVar) {
        int iOrdinal = bwrpVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? elyq.UNKNOWN_PROVISIONING_STATE : elyq.NOT_PROVISIONED_BUT_INITIALIZED : elyq.NOT_PROVISIONED : elyq.PROVISIONED;
    }

    @Override // defpackage.bvut
    public final eiju a(String str) {
        return i(str);
    }

    @Override // defpackage.bvut
    public final eiju b(String str, final long j) {
        a.p("Deleting old data if any.");
        this.q.b();
        final Scope scopeCreate = Scope.create(((bwkr) this.p.b()).b());
        return ((bwbn) this.n.b()).a(str).h(new ejvr() { // from class: bwcx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((NativeBaseCrypto) obj).deleteOldOneTimeKeys(scopeCreate, j);
            }
        }, this.h).h(new ejvr() { // from class: bwcy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Status status = (Status) obj;
                if (status.f()) {
                    return 0;
                }
                this.a.c.c("Bugle.Etouffee.OtkCleanUp.FailureCount");
                throw new fbtf(status);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvut
    public final eiju c(final String str) {
        a.p("Ensuring state machine consistency");
        eiju eijuVarE = ((cejj) this.m.b()).e(str, 7);
        ejvr ejvrVar = new ejvr() { // from class: bwcu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cejg) obj).o();
            }
        };
        eosc eoscVar = this.g;
        return eijuVarE.h(ejvrVar, eoscVar).i(new eooz() { // from class: bwcv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cexm) obj).i();
            }
        }, eoscVar).i(new eooz() { // from class: bwcw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cevq cevqVar = (cevq) obj;
                return this.a.k(str, cevqVar, cevqVar, 7);
            }
        }, eoscVar);
    }

    @Override // defpackage.bvut
    public final eiju d(String str) {
        return !bwbt.a() ? eijx.e(elyq.DISABLED) : h(str).a().h(new ejvr() { // from class: bwcz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return bwdb.j((bwrp) obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvut
    public final eiju e(String str) {
        return (TextUtils.isEmpty(str) || !bwbt.a()) ? eijx.e(false) : h(str).a().h(new ejvr() { // from class: bwct
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bwrp) obj) == bwrp.PROVISIONED);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvut
    public final void f(String str) {
        ((bwjg) this.o.b()).a(str);
    }

    @Override // defpackage.bvut
    public final boolean g() {
        return bwbt.a();
    }

    public final bwrw h(String str) {
        bwrw bwrwVar;
        synchronized (this.s) {
            Map map = this.r;
            bwrwVar = (bwrw) map.get(str);
            if (bwrwVar == null) {
                cmgk cmgkVar = (cmgk) ((bwrx) this.l.b()).a.b();
                cmgkVar.getClass();
                str.getClass();
                bwrw bwrwVar2 = new bwrw(cmgkVar, str);
                map.put(str, bwrwVar2);
                bwrwVar = bwrwVar2;
            }
        }
        return bwrwVar;
    }

    public final eiju i(String str) {
        return ((bwbn) this.n.b()).c(str);
    }

    public final eiju k(final String str, final cevq cevqVar, final cevq cevqVar2, final int i) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("onRegistrationUpdate from Tachyon");
        cqbdVarC.A("previousState", cevqVar.name());
        cqbdVarC.A("newState", cevqVar2.name());
        cqbdVarC.A("reason", i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "STARTUP_ENSURE_CONSISTENCY" : "TACHYON_UPDATE_DEBUG" : "TACHYON_UPDATE_REFRESH" : "TACHYON_UPDATE_REGISTER_VERIFY" : "TACHYON_UPDATE_REGISTER" : "TACHYON_UPDATE_RESET");
        cqbdVarC.r();
        final bwrp bwrpVar = cevqVar2 == cevq.REGISTERED_WITH_PREKEYS ? bwbt.a() ? bwrp.PROVISIONED : bwrp.NOT_PROVISIONED_BUT_INITIALIZED : bwrp.NOT_PROVISIONED;
        return h(str).a().i(new eooz() { // from class: bwcp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bwrp bwrpVar2 = (bwrp) obj;
                cqbd cqbdVarC2 = bwdb.a.c();
                cqbdVarC2.I("E2EE provisioning state update");
                cqbdVarC2.A("Previous Etouffee status", bwrpVar2.name());
                final bwrp bwrpVar3 = bwrpVar;
                cqbdVarC2.A("New Etouffee status", bwrpVar3.name());
                cqbdVarC2.r();
                if (bwrpVar2 == bwrpVar3) {
                    return eijx.e(bwrpVar2);
                }
                bwdb bwdbVar = this.a;
                if (bwrpVar3 == bwrp.PROVISIONED) {
                    bwdbVar.c.c("Bugle.etouffee.provision.success");
                }
                elyq elyqVarJ = bwdb.j(bwrpVar2);
                elyq elyqVarJ2 = bwdb.j(bwrpVar3);
                if (elyqVarJ != elyqVarJ2) {
                    int i2 = i;
                    cevq cevqVar3 = cevqVar2;
                    cevq cevqVar4 = cevqVar;
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.BUGLE_E2EE_STATE_TRANSITION;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    elyl elylVar = (elyl) elyn.a.createBuilder();
                    elylVar.copyOnWrite();
                    elyn elynVar = (elyn) elylVar.instance;
                    elynVar.c = elyqVarJ.g;
                    elynVar.b |= 1;
                    elylVar.copyOnWrite();
                    elyn elynVar2 = (elyn) elylVar.instance;
                    elynVar2.d = elyqVarJ2.g;
                    elynVar2.b |= 2;
                    elyu elyuVarR = cexm.r(cevqVar4);
                    elylVar.copyOnWrite();
                    elyn elynVar3 = (elyn) elylVar.instance;
                    elynVar3.f = elyuVarR.e;
                    elynVar3.b |= 8;
                    elyu elyuVarR2 = cexm.r(cevqVar3);
                    elylVar.copyOnWrite();
                    elyn elynVar4 = (elyn) elylVar.instance;
                    elynVar4.g = elyuVarR2.e;
                    elynVar4.b |= 16;
                    elylVar.copyOnWrite();
                    elyn elynVar5 = (elyn) elylVar.instance;
                    elynVar5.e = i2 - 1;
                    elynVar5.b |= 4;
                    elyn elynVar6 = (elyn) elylVar.build();
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    elynVar6.getClass();
                    ellhVar2.S = elynVar6;
                    ellhVar2.c |= 524288;
                    ((aill) bwdbVar.d.b()).j(ellgVar);
                }
                bwrw bwrwVarH = bwdbVar.h(str);
                cqbd cqbdVarC3 = bwrw.a.c();
                cqbdVarC3.I("Setting Etouffee provisioning status set");
                cqbdVarC3.A("state", bwrpVar3.name());
                cqbdVarC3.r();
                eiju eijuVarJ = bwrwVarH.b.j(new ejvr() { // from class: bwrs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bwro bwroVar = (bwro) ((bwrq) obj2).toBuilder();
                        bwroVar.copyOnWrite();
                        ((bwrq) bwroVar.instance).b = bwrpVar3.a();
                        return (bwrq) bwroVar.build();
                    }
                });
                ejvr ejvrVar = new ejvr() { // from class: bwrt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarJ.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: bwcm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return bwrpVar2;
                    }
                }, eoqgVar);
            }
        }, eoqg.a).i(new eooz() { // from class: bwcq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bwdb bwdbVar = this.a;
                final String str2 = str;
                final bwrp bwrpVar2 = bwrpVar;
                final bwrp bwrpVar3 = (bwrp) obj;
                return ((bwrpVar3 == null || !((bwrpVar3 == bwrp.PROVISIONED || bwrpVar3 == bwrp.NOT_PROVISIONED_BUT_INITIALIZED) && bwrpVar2 == bwrp.NOT_PROVISIONED)) ? (bwrpVar3 != null && bwrpVar3 == bwrp.NOT_PROVISIONED && bwrpVar2 == bwrp.PROVISIONED) ? eijx.f(new Runnable() { // from class: bwcn
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        bwdb bwdbVar2 = bwdbVar;
                        aubq aubqVarC = ((asqx) bwdbVar2.k.b()).c(str2);
                        ekgb ekgbVarC = ((bvus) bwdbVar2.e.b()).c(((Integer) bwbt.y.e()).intValue());
                        cqbd cqbdVarC2 = bwdb.a.c();
                        cqbdVarC2.I("E2EE provisioned. Restoring E2EE state in previously-E2EE conversations");
                        cqbdVarC2.A("conversations", ekgbVarC);
                        cqbdVarC2.r();
                        int i2 = ((ekoe) ekgbVarC).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ConversationIdType conversationIdType = (ConversationIdType) ekgbVarC.get(i3);
                            bvvs bvvsVar = (bvvs) bvvt.a.createBuilder();
                            String strA = conversationIdType.a();
                            bvvsVar.copyOnWrite();
                            bvvt bvvtVar = (bvvt) bvvsVar.instance;
                            strA.getClass();
                            bvvtVar.b = strA;
                            bvvsVar.a(aubqVarC);
                            bvvt bvvtVar2 = (bvvt) bvvsVar.build();
                            String str3 = conversationIdType.a() + "#" + aubqVarC.hashCode();
                            bvvu bvvuVar = (bvvu) bwdbVar2.f.b();
                            caxr caxrVar = new caxr();
                            caxrVar.b = str3;
                            ((cazj) bvvuVar.a.b()).a(cbcu.g("update_conversation_encryption_status", bvvtVar2, caxrVar.a()));
                        }
                    }
                }, bwdbVar.h) : eijx.e(null) : bwdbVar.i(str2).i(new eooz() { // from class: bwda
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final bwdb bwdbVar2 = bwdbVar;
                        final String str3 = str2;
                        return eijx.g(new Callable() { // from class: bwcs
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                bwdb bwdbVar3 = bwdbVar2;
                                axcy axcyVarC = ((chtu) bwdbVar3.j.b()).c(((asqx) bwdbVar3.k.b()).c(str3));
                                if (axcyVarC == null) {
                                    ekrw ekrwVarJ = bwdb.b.j();
                                    ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
                                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine", "disableConversationE2eeIfNeeded", 288, "E2eeStateMachine.java")).q("Skip disabling E2EE in conversations, subscription is null.");
                                    return null;
                                }
                                fcsu fcsuVar = bwdbVar3.e;
                                ((bvus) fcsuVar.b()).g(axcyVarC.f());
                                return null;
                            }
                        }, bwdbVar2.h);
                    }
                }, bwdbVar.h)).i(new eooz() { // from class: bwco
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        bwrp bwrpVar4 = bwrp.PROVISIONED;
                        boolean z = bwrpVar4 == bwrpVar3;
                        boolean z2 = bwrpVar4 == bwrpVar2;
                        if (z == z2) {
                            return eijx.e(null);
                        }
                        bwdb bwdbVar2 = bwdbVar;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Set) bwdbVar2.i.b()).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((bvup) it.next()).a(str2, z2));
                        }
                        return eijx.j(arrayList).a(new Callable() { // from class: bwcr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, bwdbVar.g);
            }
        }, this.g);
    }

    @Override // defpackage.cfsb
    public final eiju l(String str, cevq cevqVar, cevq cevqVar2, int i) {
        int i2 = i - 1;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 4;
                if (i2 != 3) {
                    i3 = i2 != 4 ? 6 : 5;
                }
            } else {
                i3 = 3;
            }
        }
        return k(str, cevqVar2, cevqVar, i3);
    }
}
