package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwcl extends cmwg implements efaq {
    public final eygg b;
    public final fcsu c;
    public final bvut d;
    public final fcsu e;
    public final eosc f;
    public final eygg g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fcsu n;
    private final fcsu o;
    private final eosc p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final AtomicBoolean t = new AtomicBoolean(false);
    private static final String l = RcsProfileService.class.getName();
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "E2eeStartupTask");
    private static final ekrg m = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStartupTask");

    public bwcl(eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, fcsu fcsuVar2, bvut bvutVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        this.b = eyggVar;
        this.g = eyggVar2;
        this.n = fcsuVar;
        this.c = fcsuVar2;
        this.d = bvutVar;
        this.o = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.e = fcsuVar6;
        this.f = eoscVar;
        this.p = eoscVar2;
        this.q = fcsuVar7;
        this.r = fcsuVar8;
        this.j = fcsuVar9;
        this.s = fcsuVar10;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("E2eeStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        fcsu fcsuVar = this.r;
        fcsuVar.b();
        final dzub dzubVarD = ((dzuc) this.j.b()).d();
        coha cohaVar = (coha) fcsuVar.b();
        eiju eijuVarC = auvw.c(cohaVar.b, fcyi.a, fdjz.a, new cogz(cohaVar, null));
        ejvr ejvrVar = new ejvr() { // from class: bwcf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((dzuc) this.a.j.b()).f(dzubVarD, new dzfh("TrustedTime.Initialized"), null, dzua.SUCCESS);
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarC.h(ejvrVar, eoqgVar).e(Throwable.class, new ejvr() { // from class: bwcg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((dzuc) this.a.j.b()).f(dzubVarD, new dzfh("TrustedTime.Initialized"), null, dzua.ERROR);
                return null;
            }
        }, eoqgVar);
        return eijx.f(new Runnable() { // from class: bwcj
            @Override // java.lang.Runnable
            public final void run() {
                bwcl bwclVar = this.a;
                if (bwclVar.d.g()) {
                    bwclVar.b.b();
                    if (bwclVar.h()) {
                        ((cmfe) bwclVar.c.b()).o(bwclVar);
                    }
                    bwclVar.g();
                }
            }
        }, this.f);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.efaq
    public final void e(String str) {
        if (!h()) {
            ekrw ekrwVarI = m.i();
            ekrwVarI.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStartupTask", "handleServiceConnected", 338, "E2eeStartupTask.java")).q("E2eeStartupTask#handleServiceConnected called when jibe SIP is disabled. No JibeService should be attempting to connect.");
            return;
        }
        eieu eieuVarK = eiiy.k("E2eeStartupTask#handleServiceConnected");
        try {
            if (l.equals(str)) {
                this.b.b();
                Runnable runnable = new Runnable() { // from class: bwce
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g();
                    }
                };
                eosc eoscVar = this.f;
                eijx.f(runnable, eoscVar).k(auvh.b(), eoscVar);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void g() {
        if (!this.t.getAndSet(true)) {
            Set<aubq> setE = ((cozg) this.q.b()).e();
            if (setE.isEmpty()) {
                a.r("No identities to perform prekey checking for.");
                ((ains) this.o.b()).e("Bugle.Etouffee.StartupTask.Failure.Reason", 5);
            }
            for (final aubq aubqVar : setE) {
                final String str = aubqVar.d;
                eiju eijuVarC = this.d.c(str);
                eooz eoozVar = new eooz() { // from class: bwck
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.d.e(str);
                    }
                };
                eosc eoscVar = this.f;
                final eiju eijuVarI = eijuVarC.i(eoozVar, eoscVar).i(new eooz() { // from class: bwcb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            return eijx.e(false);
                        }
                        final bwcl bwclVar = this.a;
                        if (bwbv.e() || bwbv.f()) {
                            aubq aubqVar2 = aubqVar;
                            bwno bwnoVar = (bwno) bwclVar.e.b();
                            bwnd bwndVar = (bwnd) bwne.a.createBuilder();
                            bwndVar.copyOnWrite();
                            bwne bwneVar = (bwne) bwndVar.instance;
                            aubqVar2.getClass();
                            bwneVar.c = aubqVar2;
                            bwneVar.b |= 1;
                            ((cazj) bwnoVar.a.b()).g(cbcu.f("ftd_data_clean_up_work", (bwne) bwndVar.build()));
                        }
                        String str2 = str;
                        bwjf bwjfVar = (bwjf) bwclVar.h.b();
                        bwjf.a.m("Checking if any prekeys are present");
                        bwjfVar.e.b();
                        final Scope scopeCreate = Scope.create(bwjfVar.b.b());
                        eiju eijuVarH = bwjfVar.c.a(str2).h(new ejvr() { // from class: bwjb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return ((NativeBaseCrypto) obj2).hasAnyGeneratedPrekeys(scopeCreate);
                            }
                        }, bwjfVar.d);
                        ejvr ejvrVar = new ejvr() { // from class: bwjc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return (Boolean) bwlb.a((StatusOr) obj2);
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarH.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: bwch
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                if (!((Boolean) obj2).booleanValue()) {
                                    aill aillVar = (aill) bwclVar.i.b();
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    aillVar.j(ellgVar);
                                }
                                return Boolean.valueOf(!r5.booleanValue());
                            }
                        }, eoqgVar).e(fbtf.class, new ejvr() { // from class: bwci
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                bwcl.a.s("Skipping missing prekey check due to unexpected error", (fbtf) obj2);
                                return false;
                            }
                        }, bwclVar.f);
                    }
                }, eoscVar);
                eiju eijuVarE = ((cejj) this.n.b()).e(aubqVar.d, 6);
                ejvr ejvrVar = new ejvr() { // from class: bwcc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((cejg) obj).o();
                    }
                };
                eosc eoscVar2 = this.p;
                final eiju eijuVarI2 = eijuVarE.h(ejvrVar, eoscVar2).i(new eooz() { // from class: bwcd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((cexm) obj).b.h().h(new ejvr() { // from class: cewi
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cevp cevpVarB = cevp.b(((cevr) obj2).j);
                                return cevpVarB == null ? cevp.UNRECOGNIZED : cevpVarB;
                            }
                        }, eoqg.a);
                    }
                }, eoscVar2);
                cqnx.c(eijx.k(eijuVarI2, eijuVarI).a(new Callable() { // from class: bwca
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        String str2 = aubqVar.d;
                        if (eork.q(eijuVarI2) == cevp.LOW_PREKEYS) {
                            cqbd cqbdVarC = bwcl.a.c();
                            cqbdVarC.I("Needs prekeys");
                            cqbdVarC.x(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2, 2);
                            cqbdVarC.r();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((Boolean) eork.q(eijuVarI)).booleanValue()) {
                            bwcl.a.p("Prekeys are missing, will re-upload");
                        } else if (!z) {
                            cqbd cqbdVarA = bwcl.a.a();
                            cqbdVarA.I("Skip. Not low keys nor missing prekeys.");
                            cqbdVarA.x(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2, 2);
                            cqbdVarA.r();
                            return null;
                        }
                        ((bwjg) this.a.g.b()).a(str2);
                        return null;
                    }
                }, eoqg.a), "BugleE2eeEtouffee", "Failed to schedule prekey upload.");
            }
        }
    }

    @Deprecated
    public final boolean h() {
        return dfog.L() || !((arha) this.s.b()).a();
    }

    @Override // defpackage.efaq
    public final void f(String str) {
    }

    @Override // defpackage.efaq
    public final void d(String str, efap efapVar) {
    }
}
