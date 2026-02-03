package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.common.Feature;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceService;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwk implements bwwe {
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final eigp e;
    public final ejxr f;
    private final Context h;
    private final cqbm i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final egpm r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final AtomicReference w = new AtomicReference(barn.a);
    private final AtomicBoolean x = new AtomicBoolean(false);
    private static final cqce g = cqce.g("BugleDataModel", "DataModelImpl");
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl");

    public bwwk(Context context, final eosc eoscVar, cqbm cqbmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, egpm egpmVar, eigp eigpVar, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, final eygg eyggVar, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21) {
        this.h = context;
        this.i = cqbmVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar7;
        this.b = fcsuVar8;
        this.c = fcsuVar10;
        this.d = fcsuVar11;
        this.p = fcsuVar13;
        this.q = fcsuVar14;
        this.r = egpmVar;
        this.e = eigpVar;
        this.s = fcsuVar15;
        this.t = fcsuVar16;
        this.u = fcsuVar17;
        this.v = fcsuVar18;
        final bwwm bwwmVar = new bwwm(fcsuVar8, fcsuVar19, fcsuVar12, fcsuVar9, fcsuVar6, fcsuVar20, fcsuVar21);
        this.f = ejxx.a(new ejxr() { // from class: bwwf
            @Override // defpackage.ejxr
            public final Object get() {
                final bwwm bwwmVar2 = bwwmVar;
                return new auwp(new eooy() { // from class: bwwg
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        bwwm bwwmVar3 = bwwmVar2;
                        ((ains) bwwmVar3.g.b()).c("Bugle.Datamodel.SubscriptionChanged.CallbackEvent.Count");
                        ekrg ekrgVar = bwwk.a;
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH.X(ekrzVar, "BugleDataModel");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl", "scheduleCountryCodeDetectorAction", 299, "DataModelImpl.java")).q("Scheduling country code detector action, because a subscription changed its state.");
                        ((axms) bwwmVar3.a.b()).b().E(((Long) bwwmVar3.b.b()).longValue());
                        final cmum cmumVar = (cmum) bwwmVar3.c.b();
                        final cmup cmupVar = (cmup) bwwmVar3.d.b();
                        eiju eijuVarF = eijx.f(new Runnable() { // from class: cmuk
                            @Override // java.lang.Runnable
                            public final void run() {
                                cmumVar.c(cmupVar);
                            }
                        }, cmumVar.c);
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleDataModel");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl", "scheduleSelfParticipantsRefreshAction", 309, "DataModelImpl.java")).q("Scheduling self participants refresh action, because a subscription changed its state.");
                        ((ayge) bwwmVar3.e.b()).b().E(((Long) bwwmVar3.f.b()).longValue());
                        return eijuVarF;
                    }
                }, eoscVar);
            }
        });
    }

    private final boolean h() {
        return ((Optional) ((eyig) this.l).a).isPresent();
    }

    @Override // defpackage.bwwe
    public final aymn a() {
        return (aymn) this.m.b();
    }

    @Override // defpackage.bwwe
    public final void b() {
        if (!h() && ((crnp) this.t.b()).d()) {
            if (craf.i(this.h)) {
                bwwn bwwnVar = (bwwn) this.u.b();
                ((egxv) bwwnVar.a.b()).d(Telephony.MmsSms.CONTENT_URI, true, bwwnVar);
                ((cmqf) this.n.b()).l(enqq.SECONDARY_USER_SYNC);
            } else {
                bwwn bwwnVar2 = (bwwn) this.u.b();
                ((egxv) bwwnVar2.a.b()).e(bwwnVar2);
                cpik cpikVar = (cpik) this.p.b();
                auvw.k(cpikVar.c, null, null, new cpij(cpikVar, null), 3);
            }
        }
        final cdmb cdmbVar = (cdmb) this.s.b();
        final dzub dzubVarA = ((ajfo) cdmbVar.d.b()).a();
        ddaj ddajVar = cdmbVar.f;
        final defr defrVar = new defr();
        final ddaq ddaqVar = (ddaq) ddajVar;
        ddaqVar.b.execute(new Runnable() { // from class: ddap
            @Override // java.lang.Runnable
            public final void run() {
                ejwi ejwiVarJ;
                ddaq.a.g("start reading cache", new Object[0]);
                ddaq ddaqVar2 = ddaqVar;
                dday ddayVar = ddaqVar2.c.a;
                long jNanoTime = System.nanoTime();
                ejwi ejwiVarA = ddayVar.a();
                if (ejwiVarA.g()) {
                    etzn etznVar = (etzn) ejwiVarA.c();
                    try {
                        etzm etzmVar = (etzm) evsn.parseFrom(etzm.a, etznVar.c, evrr.a());
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(Instant.now().toEpochMilli());
                        evvp evvpVar = etzmVar.f;
                        if (evvpVar == null) {
                            evvpVar = evvp.a;
                        }
                        ejwiVarJ = seconds >= evvpVar.b ? ejud.a : ejwi.j(etznVar);
                    } catch (evtj unused) {
                        ejwiVarJ = ejud.a;
                    }
                } else {
                    ejwiVarJ = ejud.a;
                }
                final defr defrVar2 = defrVar;
                ddak ddakVarA = ddba.a(ejwiVarJ);
                double dNanoTime = System.nanoTime() - jNanoTime;
                ddbn ddbnVar = ddaq.a;
                ddbnVar.g("finished reading cache in %f ms", Double.valueOf(dNanoTime / 1000000.0d));
                if (ddakVarA.b()) {
                    ddbnVar.g("responding based on cache", new Object[0]);
                    defrVar2.d(ddakVarA);
                }
                final ddbm ddbmVar = ddaqVar2.d;
                eooy eooyVar = new eooy() { // from class: ddal
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final ddbm ddbmVar2 = ddbmVar;
                        return eork.n(new eooy() { // from class: ddbd
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                dciz dcizVar = new dciz();
                                dcizVar.a = new dcir() { // from class: ddbu
                                    @Override // defpackage.dcir
                                    public final void a(Object obj, Object obj2) {
                                        ddbt ddbtVar = (ddbt) obj;
                                        int i = ddby.a;
                                        ddbw ddbwVar = new ddbw((defr) obj2);
                                        IGmsDeviceComplianceService iGmsDeviceComplianceService = (IGmsDeviceComplianceService) ddbtVar.w();
                                        Context context = ddbtVar.c;
                                        iGmsDeviceComplianceService.getGmsDeviceCompliance(ddbwVar, ddlh.a());
                                    }
                                };
                                dcizVar.b = new Feature[]{ddaf.a};
                                dcizVar.b();
                                dcizVar.c = 13801;
                                dcja dcjaVarA = dcizVar.a();
                                final ddbm ddbmVar3 = ddbmVar2;
                                eoqt eoqtVarT = eoqt.t(drgi.a(((dcfm) ddbmVar3.d).j(dcjaVarA)));
                                ejvr ejvrVar = new ejvr() { // from class: ddbl
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        return ejwi.j((GmsDeviceComplianceResponse) obj);
                                    }
                                };
                                Executor executor = ddbmVar3.c;
                                return eooq.g(eooh.f(eooq.f(eoqtVarT, ejvrVar, executor), Exception.class, new ejvr() { // from class: ddbb
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        ddbm.a.f("apk call failed", (Exception) obj, new Object[0]);
                                        return ejud.a;
                                    }
                                }, executor), new eooz() { // from class: ddbc
                                    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                                    @Override // defpackage.eooz
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r7) {
                                        /*
                                            r6 = this;
                                            ejwi r7 = (defpackage.ejwi) r7
                                            boolean r0 = r7.g()
                                            if (r0 == 0) goto L25
                                            java.lang.Object r0 = r7.c()
                                            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r0 = (com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse) r0
                                            long r1 = defpackage.ddba.a
                                            byte[] r0 = r0.f
                                            if (r0 == 0) goto L25
                                            evrr r1 = defpackage.evrr.a()     // Catch: defpackage.evtj -> L25
                                            etzn r2 = defpackage.etzn.a     // Catch: defpackage.evtj -> L25
                                            evsn r0 = defpackage.evsn.parseFrom(r2, r0, r1)     // Catch: defpackage.evtj -> L25
                                            etzn r0 = (defpackage.etzn) r0     // Catch: defpackage.evtj -> L25
                                            ejwi r0 = defpackage.ejwi.j(r0)     // Catch: defpackage.evtj -> L25
                                            goto L27
                                        L25:
                                            ejud r0 = defpackage.ejud.a
                                        L27:
                                            ddbm r1 = r1
                                            ddbs r2 = r1.e
                                            ejxr r3 = r2.c
                                            java.lang.Object r3 = r3.get()
                                            ejwi r3 = (defpackage.ejwi) r3
                                            r4 = 0
                                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                                            java.lang.Object r3 = r3.e(r4)
                                            java.lang.Long r3 = (java.lang.Long) r3
                                            r3.longValue()
                                            ddlz r4 = new ddlz
                                            ejwi r3 = defpackage.ejwi.j(r3)
                                            ejud r5 = defpackage.ejud.a
                                            r4.<init>(r3, r5)
                                            ddbr r3 = new ddbr
                                            android.content.Context r2 = r2.a
                                            r3.<init>(r2, r4)
                                            ddbi r2 = new ddbi
                                            r2.<init>()
                                            ejwi r0 = defpackage.ddbm.a(r0, r2)
                                            ddbj r2 = new ddbj
                                            r2.<init>()
                                            ejwi r0 = r0.b(r2)
                                            ddbk r2 = new ddbk
                                            r2.<init>()
                                            java.lang.Object r7 = r0.d(r2)
                                            com.google.common.util.concurrent.ListenableFuture r7 = (com.google.common.util.concurrent.ListenableFuture) r7
                                            return r7
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddbc.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                    }
                                }, executor);
                            }
                        }, ddbmVar2.c);
                    }
                };
                Executor executor = ddaqVar2.b;
                defn defnVarA = drgf.a(eooq.f(eoqt.t(eork.n(eooyVar, executor)), new ejvr() { // from class: ddam
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ddba.a((ejwi) obj);
                    }
                }, executor));
                defnVarA.q(executor, new defh() { // from class: ddan
                    @Override // defpackage.defh
                    public final void e(Object obj) {
                        defrVar2.d((ddak) obj);
                    }
                });
                defnVarA.p(executor, new defe() { // from class: ddao
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        defrVar2.c(exc);
                    }
                });
            }
        });
        defv defvVar = defrVar.a;
        eosc eoscVar = cdmbVar.e;
        defvVar.p(eoscVar, new defe() { // from class: cdlz
            @Override // defpackage.defe
            public final void d(Exception exc) {
                cdmb cdmbVar2 = cdmbVar;
                ((ains) cdmbVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 3);
                ((ajfo) cdmbVar2.d.b()).g(dzubVarA, ajfo.v);
                cdmb.a.r("GmsDeviceCompliance API threw an exception.");
            }
        });
        defvVar.q(eoscVar, new defh() { // from class: cdma
            @Override // defpackage.defh
            public final void e(Object obj) {
                boolean zB = ((ddak) obj).b();
                cdmb cdmbVar2 = cdmbVar;
                if (zB) {
                    ((ains) cdmbVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 1);
                    Context context = cdmbVar2.b;
                    Intent intent = new Intent(context, (Class<?>) UncertifiedDeviceActivity.class);
                    TextUtils.isEmpty(null);
                    if (!TextUtils.isEmpty(null)) {
                        intent = intent.putExtra("customBodyText", (String) null);
                    }
                    intent.putExtra("overrideNavBarColor", false);
                    intent.setFlags(268468224);
                    context.startActivity(intent);
                } else {
                    ((ains) cdmbVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 2);
                }
                ((ajfo) cdmbVar2.d.b()).g(dzubVarA, ajfo.v);
            }
        });
        ((bxjn) this.j.b()).b();
        ((aipo) this.k.b()).f();
        ((cdpb) this.v.b()).b();
    }

    @Override // defpackage.bwwe
    public final void c() {
        axog axogVar = (axog) this.o.b();
        bxmv bxmvVar = (bxmv) axogVar.a.b();
        bxmvVar.getClass();
        dqsn dqsnVar = (dqsn) axogVar.b.b();
        dqsnVar.getClass();
        cogw cogwVar = (cogw) axogVar.d.b();
        cogwVar.getClass();
        fcsu fcsuVar = axogVar.f;
        new FixupMessageStatusOnStartupAction(bxmvVar, dqsnVar, axogVar.c, cogwVar, axogVar.e, fcsuVar).E(Action.t);
        ((aypv) this.q.b()).d();
        if (h()) {
            if (((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) {
                ((cmqf) this.n.b()).l(enqq.DATA_MODEL_INIT_MICRO_APP);
            } else {
                ((cmqf) this.n.b()).h();
            }
        }
        ((cqey) this.i.a()).l(new bwwj(this));
        this.r.post(new Runnable() { // from class: bwwh
            @Override // java.lang.Runnable
            public final void run() {
                bwwk bwwkVar = this.a;
                croc crocVar = (croc) bwwkVar.d.b();
                bwwi bwwiVar = new bwwi(bwwkVar);
                crocVar.l.addOnSubscriptionsChangedListener(bwwiVar);
                if (crocVar.k == null) {
                    crocVar.k = new ArrayList();
                }
                crocVar.k.add(bwwiVar);
            }
        });
    }

    @Override // defpackage.bwwe
    public final void d(boolean z) {
        if (this.x.getAndSet(z) != z) {
            g.q(a.r(z, "scrolledToNewest="));
        }
    }

    @Override // defpackage.bwwe
    public final void e(ConversationIdType conversationIdType) {
        if (((ConversationIdType) this.w.getAndSet(conversationIdType)).equals(conversationIdType)) {
            return;
        }
        g.q("focusedConversation=".concat(String.valueOf(String.valueOf(conversationIdType))));
    }

    @Override // defpackage.bwwe
    public final boolean f(ConversationIdType conversationIdType) {
        ConversationIdType conversationIdType2 = (ConversationIdType) this.w.get();
        return !conversationIdType2.b() && conversationIdType2.equals(conversationIdType);
    }

    @Override // defpackage.bwwe
    public final boolean g(ConversationIdType conversationIdType) {
        return f(conversationIdType);
    }
}
