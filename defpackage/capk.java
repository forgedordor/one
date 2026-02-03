package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capk implements bzaa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter");
    public final cpmc b;
    public final aukz c;
    public final aurx d;
    public final fcsu e;
    public final fcsu f;
    public final apow g;
    public final appi h;
    public final autx i;
    public final cogw j;
    public final apps k;
    public final baqj l;
    public final awlc m;
    public final caiy n;
    private final bysy o;
    private final eosc p;
    private final eosc q;
    private final apoy r;
    private final aqfp s;
    private final byeq t;

    public capk(cpmc cpmcVar, bysy bysyVar, aukz aukzVar, aurx aurxVar, cogw cogwVar, byeq byeqVar, autx autxVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, apow apowVar, appi appiVar, apoy apoyVar, apps appsVar, baqj baqjVar, awlc awlcVar, aqfp aqfpVar, caiy caiyVar) {
        this.b = cpmcVar;
        this.o = bysyVar;
        this.c = aukzVar;
        this.d = aurxVar;
        this.j = cogwVar;
        this.t = byeqVar;
        this.i = autxVar;
        this.p = eoscVar;
        this.q = eoscVar2;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = apowVar;
        this.h = appiVar;
        this.r = apoyVar;
        this.k = appsVar;
        this.l = baqjVar;
        this.m = awlcVar;
        this.s = aqfpVar;
        this.n = caiyVar;
    }

    @Override // defpackage.bzaa
    public final aumn a() {
        return aumn.MESSAGES;
    }

    @Override // defpackage.bzaa
    public final bmra b() {
        return bmra.MESSAGE_OBJECT;
    }

    @Override // defpackage.bzaa
    public final bykl c() {
        return this.o;
    }

    @Override // defpackage.bzaa
    public final eiju d(String str) {
        return i(str, this.s.a());
    }

    @Override // defpackage.bzaa
    public final eiju e(final pzs pzsVar) {
        eiju eijuVarH = this.t.b("CmsRestoreMessagesWorkerAdapter#onAllItemsRestored", new Runnable() { // from class: capf
            @Override // java.lang.Runnable
            public final void run() {
                capk capkVar = this.a;
                if (!capkVar.k.a()) {
                    capkVar.i.h();
                }
                ekrw ekrwVarH = capk.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "onAllItemsRestored", 238, "CmsRestoreMessagesWorkerAdapter.java")).q("Scheduling Conversation Metadata Full Sync in the background");
                baqj baqjVar = capkVar.l;
                evrl evrlVar = evrl.a;
                caxr caxrVar = new caxr();
                caxrVar.b = "cms";
                ((cazj) baqjVar.a.b()).a(cbcu.g("conversation_metadata_full_sync", evrlVar, caxrVar.a()));
            }
        }).h(new ejvr() { // from class: capg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.m.d(new Consumer() { // from class: caow
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((caiq) obj2).s();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.p);
        return this.k.a() ? eijuVarH : eijuVarH.i(new eooz() { // from class: caph
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.j(pzsVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bzaa
    public final emec f() {
        return emec.RESTORE_MESSAGE;
    }

    @Override // defpackage.bzaa
    public final /* synthetic */ String g(Object obj) {
        return ((eqnd) obj).c;
    }

    @Override // defpackage.bzaa
    public final String h() {
        return "Messages";
    }

    public final eiju i(final String str, final boolean z) {
        if (this.s.a()) {
            caiy caiyVar = this.n;
            eiju eijuVarB = caiyVar.b(str, eqnd.class);
            if (eijuVarB == null) {
                eijuVarB = null;
            } else if (z) {
                eijuVarB = caiyVar.a(eijuVarB, new fdap() { // from class: caoz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return this.a.i((String) obj, false);
                    }
                }, eqnd.class);
            }
            if (eijuVarB != null) {
                return eijuVarB;
            }
        }
        if (this.r.a()) {
            return this.d.m().i(new eooz() { // from class: caox
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    evvp evvpVar = (evvp) obj;
                    boolean zEquals = evvpVar.equals(evxc.c);
                    final capk capkVar = this.a;
                    String str2 = str;
                    boolean z2 = z;
                    if (zEquals) {
                        ekrw ekrwVarH = capk.a.h();
                        ekrwVarH.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "listCmsItems", 183, "CmsRestoreMessagesWorkerAdapter.java")).q("CmsRestoreMessagesWorkerAdapter: Cms Delta sync timestamp is not present.");
                        eiju eijuVarJ = capkVar.b.J(str2);
                        return !z2 ? eijuVarJ : capkVar.n.a(eijuVarJ, new fdap() { // from class: cape
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                return capkVar.i((String) obj2, false);
                            }
                        }, eqnd.class);
                    }
                    ekrw ekrwVarH2 = capk.a.h();
                    ekrwVarH2.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "listCmsItems", 169, "CmsRestoreMessagesWorkerAdapter.java")).t("CmsRestoreMessagesWorkerAdapter: Passing delta sync timestamp %s in ListMessageObjects.", evxc.h(evvpVar));
                    eiju eijuVarK = capkVar.b.K(str2, evvpVar);
                    return !z2 ? eijuVarK : capkVar.n.a(eijuVarK, new fdap() { // from class: capd
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            return capkVar.i((String) obj2, false);
                        }
                    }, eqnd.class);
                }
            }, this.p);
        }
        eiju eijuVarJ = this.b.J(str);
        return z ? this.n.a(eijuVarJ, new fdap() { // from class: caoy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return this.a.i((String) obj, false);
            }
        }, eqnd.class) : eijuVarJ;
    }

    public final eiju j(final pzs pzsVar) {
        Callable callable = new Callable() { // from class: capa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(toc.b());
            }
        };
        eosc eoscVar = this.q;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: capb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                bmqr bmqrVarA = bmqy.a();
                bmqrVarA.A("onAllItemsRestored");
                bmqrVarA.c(new Function() { // from class: caov
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmqx bmqxVar = (bmqx) obj2;
                        bmqxVar.b(bmqz.INITIAL_RESTORE_MAX_RETRIED, bmqz.INITIAL_RESTORE_NON_RETRIABLE);
                        return bmqxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int iH = bmqrVarA.b().h();
                capk capkVar = this.a;
                if (!capkVar.g.a()) {
                    return capj.j(num.intValue(), iH);
                }
                try {
                    aumq aumqVarC = capkVar.d.c();
                    caot caotVar = new caot();
                    caotVar.j(num.intValue());
                    caotVar.i(iH);
                    ausj ausjVar = aumqVarC.C;
                    if (ausjVar == null) {
                        ausjVar = ausj.a;
                    }
                    caotVar.h(ausjVar.k);
                    ausj ausjVar2 = aumqVarC.C;
                    if (ausjVar2 == null) {
                        ausjVar2 = ausj.a;
                    }
                    caotVar.g(ausjVar2.l);
                    ausj ausjVar3 = aumqVarC.C;
                    if (ausjVar3 == null) {
                        ausjVar3 = ausj.a;
                    }
                    caotVar.d(ausjVar3.g);
                    ausj ausjVar4 = aumqVarC.C;
                    if (ausjVar4 == null) {
                        ausjVar4 = ausj.a;
                    }
                    caotVar.c(ausjVar4.h);
                    ausj ausjVar5 = aumqVarC.C;
                    if (ausjVar5 == null) {
                        ausjVar5 = ausj.a;
                    }
                    caotVar.f(ausjVar5.c);
                    ausj ausjVar6 = aumqVarC.C;
                    if (ausjVar6 == null) {
                        ausjVar6 = ausj.a;
                    }
                    caotVar.e(ausjVar6.d);
                    if (capkVar.h.a()) {
                        ausg ausgVar = aumqVarC.G;
                        if (ausgVar == null) {
                            ausgVar = ausg.a;
                        }
                        emcs emcsVar = (emcs) emct.a.createBuilder();
                        long j = ausgVar.e;
                        emcsVar.copyOnWrite();
                        emct emctVar = (emct) emcsVar.instance;
                        emctVar.b |= 4;
                        emctVar.e = j;
                        long j2 = ausgVar.d;
                        emcsVar.copyOnWrite();
                        emct emctVar2 = (emct) emcsVar.instance;
                        emctVar2.b |= 2;
                        emctVar2.d = j2;
                        long j3 = ausgVar.c;
                        emcsVar.copyOnWrite();
                        emct emctVar3 = (emct) emcsVar.instance;
                        emctVar3.b |= 1;
                        emctVar3.c = j3;
                        long j4 = ausgVar.g;
                        emcsVar.copyOnWrite();
                        emct emctVar4 = (emct) emcsVar.instance;
                        emctVar4.b |= 8;
                        emctVar4.f = j4;
                        caotVar.b((emct) emcsVar.build());
                    } else {
                        caotVar.b(emct.a);
                    }
                    return caotVar.a();
                } catch (evtj e) {
                    ekrw ekrwVarJ = capk.a.j();
                    ekrwVarJ.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "createClearcutLoggingInfoFromSettingsData", (char) 364, "CmsRestoreMessagesWorkerAdapter.java")).q("CmsRestoreMessagesWorkerAdapter: Skipping getting initial sync counts in clearcut events");
                    return capj.j(num.intValue(), iH);
                }
            }
        }, eoscVar).h(new ejvr() { // from class: capc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iH;
                capj capjVar = (capj) obj;
                int iF = capjVar.f();
                int iE = capjVar.e();
                capk capkVar = this.a;
                long epochMilli = capkVar.j.f().toEpochMilli();
                long jB = epochMilli - pzsVar.b("restore_start_time_millis", epochMilli);
                Duration durationOfMillis = jB > 0 ? Duration.ofMillis(jB) : Duration.ZERO;
                aukz aukzVar = capkVar.c;
                int iD = capjVar.d();
                int iC = capjVar.c();
                int iB = capjVar.b();
                int iA = capjVar.a();
                long jH = capjVar.h();
                long jG = capjVar.g();
                Map mapC = aulq.c(new fdap() { // from class: aulb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        brec brecVar = (brec) obj2;
                        brecVar.getClass();
                        brecVar.k(cpyi.RESTORED_FROM_CMS, cpyi.MERGED_FROM_CMS);
                        return brecVar;
                    }
                });
                aulp aulpVar = aulp.a;
                int iIntValue = ((Number) Map.EL.getOrDefault(mapC, aulpVar, 0)).intValue();
                int iB2 = aulq.b(bmra.MESSAGE_OBJECT);
                int iIntValue2 = ((Number) Map.EL.getOrDefault(aulq.a(new fdap() { // from class: aulg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        botl botlVar = (botl) obj2;
                        botlVar.getClass();
                        botlVar.h(cpyi.RESTORED_FROM_CMS, cpyi.MERGED_FROM_CMS);
                        return botlVar;
                    }
                }), aulpVar, 0)).intValue();
                int iB3 = aulq.b(bmra.CONVERSATION);
                int iIntValue3 = ((Number) Map.EL.getOrDefault(aulq.d(new fdap() { // from class: aulk
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        bsbx bsbxVar = (bsbx) obj2;
                        bsbxVar.getClass();
                        bsbxVar.h(cpyi.RESTORED_FROM_CMS, cpyi.MERGED_FROM_CMS);
                        return bsbxVar;
                    }
                }), aulpVar, 0)).intValue();
                int iB4 = aulq.b(bmra.PARTICIPANT);
                if (eotp.a("bugle.records_merged_message_count_in_initial_sync_database_profile", "bugle")) {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("createMetadataForRestore");
                    brdrVarD.s();
                    brdrVarD.h(new Function() { // from class: aulf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar = (brec) obj2;
                            brecVar.i(cpyi.MERGED_FROM_CMS);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    iH = brdrVarD.b().h();
                } else {
                    iH = -1;
                }
                aulr aulrVar = new aulr(iIntValue, iB2, iIntValue2, iB3, iIntValue3, iB4, iD, iC, 0, 0, iB, iA, 0, 0, jH, jG, iH, 0L, 0L);
                emct emctVarI = capjVar.i();
                emec emecVarC = aukzVar.c(emec.RESTORE);
                emcw emcwVar = (emcw) emcx.a.createBuilder();
                emec emecVarC2 = aukzVar.c(emecVarC);
                emcwVar.copyOnWrite();
                emcx emcxVar = (emcx) emcwVar.instance;
                emcxVar.c = emecVarC2.s;
                emcxVar.b |= 1;
                long millis = durationOfMillis.toMillis();
                emcwVar.copyOnWrite();
                emcx emcxVar2 = (emcx) emcwVar.instance;
                emcxVar2.b |= 8;
                emcxVar2.f = millis;
                emcwVar.copyOnWrite();
                emcx emcxVar3 = (emcx) emcwVar.instance;
                emcxVar3.d = 2;
                emcxVar3.b = 2 | emcxVar3.b;
                emcn emcnVar = emcn.NO_FAILURE;
                emcwVar.copyOnWrite();
                emcx emcxVar4 = (emcx) emcwVar.instance;
                emcxVar4.e = emcnVar.bs;
                emcxVar4.b |= 4;
                emcwVar.copyOnWrite();
                emcx emcxVar5 = (emcx) emcwVar.instance;
                emcxVar5.b |= 64;
                emcxVar5.i = iF;
                emcwVar.copyOnWrite();
                emcx emcxVar6 = (emcx) emcwVar.instance;
                emcxVar6.b |= 128;
                emcxVar6.j = iE;
                if (aukzVar.j.a() && !emctVarI.equals(emct.a)) {
                    emcwVar.copyOnWrite();
                    emcx emcxVar7 = (emcx) emcwVar.instance;
                    emcxVar7.n = emctVarI;
                    emcxVar7.b |= 1024;
                }
                if (emecVarC.equals(emec.OPTIMIZED_RESTORE)) {
                    ecem.b();
                    emch emchVar = (emch) emci.a.createBuilder();
                    try {
                        aumq aumqVarC = aukzVar.d.c();
                        if (aukzVar.k.a()) {
                            evvp evvpVar = aumqVarC.I;
                            if (evvpVar == null) {
                                evvpVar = evvp.a;
                            }
                            if (!Objects.equals(evvpVar, evxc.c)) {
                                evvp evvpVar2 = aumqVarC.I;
                                if (evvpVar2 == null) {
                                    evvpVar2 = evvp.a;
                                }
                                long j = evvpVar2.b * 1000;
                                emchVar.copyOnWrite();
                                emci emciVar = (emci) emchVar.instance;
                                emciVar.b |= 1;
                                emciVar.c = j;
                            }
                        }
                    } catch (evtj e) {
                        ekrw ekrwVarJ = aukz.a.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger", "getDeltaSyncTimestamps", (char) 1385, "CmsClearcutLogger.java")).q("Failed to CmsSettingsData for delta sync. Do not log DeltaSyncTimestamps.");
                    }
                    emci emciVar2 = (emci) emchVar.build();
                    emcwVar.copyOnWrite();
                    emcx emcxVar8 = (emcx) emcwVar.instance;
                    emciVar2.getClass();
                    emcxVar8.p = emciVar2;
                    emcxVar8.b |= 4096;
                }
                emcwVar.a(aukzVar.b());
                emce emceVar = (emce) emek.a.createBuilder();
                emcx emcxVar9 = (emcx) emcwVar.build();
                emceVar.copyOnWrite();
                emek emekVar = (emek) emceVar.instance;
                emcxVar9.getClass();
                emekVar.c = emcxVar9;
                emekVar.b |= 1;
                aukzVar.k((emek) emceVar.build(), aulrVar, true);
                if (((Boolean) capkVar.f.b()).booleanValue()) {
                    ((ajfo) capkVar.e.b()).e(ajfo.F);
                }
                ekrw ekrwVarH = capk.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "logRestoreSuccessEvent", 316, "CmsRestoreMessagesWorkerAdapter.java")).I("CmsRestoreMessagesWorkerAdapter: Restore complete, unknownSenderCount: %d, restoreSkippedItemCount: %d, restoreDuration: %s", Integer.valueOf(iF), Integer.valueOf(iE), durationOfMillis);
                return null;
            }
        }, eoqg.a);
    }
}
