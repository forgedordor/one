package defpackage;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Bundle a;
    final /* synthetic */ acrt b;

    public acqq(acrt acrtVar, Bundle bundle) {
        this.a = bundle;
        this.b = acrtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        acrt acrtVar = this.b;
        if (acrtVar.aL) {
            final Bundle bundle = this.a;
            ecem.e(eiid.k(new Runnable() { // from class: acqp
                @Override // java.lang.Runnable
                public final void run() {
                    eieu eieuVarK = eiiy.k("HomeFragmentPeer#AppInteractive");
                    acqq acqqVar = this.a;
                    try {
                        final acrt acrtVar2 = acqqVar.b;
                        acom acomVar = acrtVar2.b;
                        if (acomVar.a.c == lvb.a) {
                            ekrw ekrwVarJ = acrt.a.j();
                            ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
                            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/home/HomeFragmentPeer$15", "onPreDraw", 1925, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
                            eieuVarK.close();
                            return;
                        }
                        eieu eieuVarK2 = eiiy.k("HomeFragmentPeer#runPostAppInteractiveColdStartupJobs");
                        try {
                            if (acrtVar2.j().x()) {
                                dztc.a.b(acomVar.G());
                                acrtVar2.t.i(3);
                                if (acrtVar2.a() == 0 && acrtVar2.bb) {
                                    ((acwj) acrtVar2.q.b()).A(new acqu(acrtVar2, acrtVar2.Z.d()));
                                }
                                auvh.h(((auwu) acrtVar2.bg.b()).a("HomeFragmentPeer#appInteractive"));
                                ekrg ekrgVar = acrt.a;
                                ekrw ekrwVarH = ekrgVar.h();
                                ekrz ekrzVar = eksq.a;
                                ekrwVarH.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "logAppInteractive", 2796, "HomeFragmentPeer.java")).q("Chat list recyclerView rendered");
                                auvh.h(((cmwj) acrtVar2.l.b()).a(acrtVar2.am));
                                ((bwwe) acrtVar2.g.b()).b();
                                ekrw ekrwVarH2 = ekrgVar.h();
                                ekrwVarH2.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2064, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):OpenBeta10p: %s", Boolean.valueOf(((eoth) ((aoqa) acrtVar2.bi).a.b()).a("bugle.enable_open_beta10p_a_a_test")));
                                ekrw ekrwVarH3 = ekrgVar.h();
                                ekrwVarH3.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2066, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):OpenBeta50p: %s", Boolean.valueOf(((eoth) ((aoqc) acrtVar2.bj).a.b()).a("bugle.enable_open_beta50p_a_a_test")));
                                ekrw ekrwVarH4 = ekrgVar.h();
                                ekrwVarH4.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2068, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):Prod1p: %s", Boolean.valueOf(((eoth) ((aoqg) acrtVar2.bk).a.b()).a("bugle.enable_prod10p_a_a_test")));
                                ekrw ekrwVarH5 = ekrgVar.h();
                                ekrwVarH5.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2069, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):Prod10p: %s", Boolean.valueOf(((eoth) ((aoqe) acrtVar2.bl).a.b()).a("bugle.enable_prod1p_a_a_test")));
                                ekrw ekrwVarH6 = ekrgVar.h();
                                ekrwVarH6.X(ekrzVar, "HomeFragmentFlogger");
                                ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "runPostAppInteractiveColdStartupJobs", 2093, "HomeFragmentPeer.java")).r("Current theme mode: %s", je.b);
                                eg egVarG = acomVar.G();
                                if (egVarG != null && egVarG.getIntent().getBooleanExtra("via_rcs_not_delivered_notification", false)) {
                                    cjnk cjnkVar = (cjnk) acrtVar2.ai.b();
                                    ((ains) cjnkVar.b.b()).c("Bugle.Notification.RcsNotDelivered.Tapped.Count");
                                    envj envjVar = (envj) envl.a.createBuilder();
                                    envjVar.copyOnWrite();
                                    envl envlVar = (envl) envjVar.instance;
                                    envlVar.c = 4;
                                    envlVar.b |= 1;
                                    envl envlVar2 = (envl) envjVar.build();
                                    envw envwVar = (envw) envy.a.createBuilder();
                                    envwVar.copyOnWrite();
                                    envy envyVar = (envy) envwVar.instance;
                                    envlVar2.getClass();
                                    envyVar.d = envlVar2;
                                    envyVar.c = 5;
                                    envwVar.copyOnWrite();
                                    envy envyVar2 = (envy) envwVar.instance;
                                    envyVar2.g = 2;
                                    envyVar2.b = 4 | envyVar2.b;
                                    envy envyVar3 = (envy) envwVar.build();
                                    aill aillVar = (aill) cjnkVar.a.b();
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.NOTIFICATION_METRICS_EVENT;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar2 = (ellh) ellgVar.instance;
                                    envyVar3.getClass();
                                    ellhVar2.bh = envyVar3;
                                    ellhVar2.f |= 2048;
                                    aillVar.j(ellgVar);
                                }
                                if (((dflk) acrtVar2.bA.b()).a()) {
                                    auvh.h(((ajec) acrtVar2.bz.b()).a(2, acrtVar2.m.f()));
                                } else {
                                    auvh.h(((ajef) acrtVar2.bt.b()).a(2, acrtVar2.m.f()));
                                }
                                avco avcoVar = (avco) acrtVar2.al.b();
                                int i = avdn.a;
                                if (!avdn.a()) {
                                    ((eksl) avco.a.e()).q("ContactsSyncFeature is not enabled. Returning no-op.");
                                } else if (!avcoVar.d.d()) {
                                    ((eksl) avco.a.e()).q("Default SMS App is not Bugle. Disabling Contacts sync.");
                                } else if (avcoVar.g.compareAndSet(false, true)) {
                                    auvw.k(avcoVar.b, null, null, new avcg(avcoVar, null), 3);
                                }
                                cjtk cjtkVar = (cjtk) acrtVar2.aa.b();
                                cjtkVar.p.set(true);
                                cjtkVar.k.a(eijx.e(null), cjxi.b);
                                ((cliy) acrtVar2.aH.b()).i();
                                for (clpo clpoVar : (Set) acrtVar2.bu.b()) {
                                    ekrw ekrwVarH7 = clpo.a.h();
                                    ekrwVarH7.X(ekrzVar, "BugleSatellite");
                                    ((ekrd) ekrwVarH7.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onColdStartup", 81, "TelephonySatelliteReporterImpl.kt")).q("Processing onColdStartup event.");
                                    clpoVar.c();
                                }
                                eieuVarK2.close();
                                if (crxi.a()) {
                                    crxn crxnVar = (crxn) acrtVar2.by.b();
                                    auvw.m(crxnVar.f, null, new crxm(crxnVar, null), 3);
                                }
                            } else {
                                eieuVarK2.close();
                            }
                            acrt.b(acomVar).y(new acqs(acrtVar2));
                            if (acrtVar2.aM.b()) {
                                eieuVarK2 = eiiy.k("registerPopUpListener");
                                try {
                                    ahaa ahaaVar = acrtVar2.ax;
                                    agzy agzyVar = acrtVar2.aw;
                                    eigp eigpVar = (eigp) ahaaVar.a.b();
                                    eigpVar.getClass();
                                    agzyVar.getClass();
                                    acrtVar2.aY = new agzz(eigpVar, agzyVar);
                                    acrtVar2.aY.e(acomVar.A());
                                    eieuVarK2.close();
                                } finally {
                                }
                            }
                            if (!acrtVar2.aM.b()) {
                                acrtVar2.b.av(true);
                            }
                            acrtVar2.s();
                            if (czwc.a()) {
                                fcsu fcsuVar = acrtVar2.O;
                                ((Optional) fcsuVar.b()).ifPresent(new Consumer() { // from class: acqj
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        cqnx.c(((clfb) obj).c(), "Bugle", "Failed to dismiss triggered reminders");
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                if (czwc.b() && ((Boolean) ((cczi) czwc.c.get()).e()).booleanValue() && ((Optional) fcsuVar.b()).isPresent()) {
                                    auvh.h(((clfb) ((Optional) fcsuVar.b()).get()).f());
                                }
                                acrtVar2.j().k();
                            }
                            caxb caxbVar = (caxb) acrtVar2.P.b();
                            cawz cawzVar = (cawz) caxa.a.createBuilder();
                            cawzVar.copyOnWrite();
                            caxa.a((caxa) cawzVar.instance);
                            caxa caxaVar = (caxa) cawzVar.build();
                            caxr caxrVar = new caxr();
                            caxrVar.b = "update_unread_counter_dedupe";
                            caxbVar.a(caxaVar, caxrVar.a());
                            if (acrtVar2.aM.b()) {
                                fcsu fcsuVar2 = acrtVar2.i;
                                ((acgu) fcsuVar2.b()).a(3);
                                acom acomVar2 = acrtVar2.b;
                                eg egVarG2 = acomVar2.G();
                                if (egVarG2 != null && egVarG2.getIntent() != null && egVarG2.getIntent().getBooleanExtra("opted_in_through_growth_kit_flow", false)) {
                                    ((acgu) fcsuVar2.b()).a(16);
                                }
                                if (bundle == null && acomVar2.aF()) {
                                    acrtVar2.m();
                                }
                            }
                            acuf acufVar = acrtVar2.D;
                            ((acut) acufVar).i.set(true);
                            Iterator it = ((acut) acufVar).j.iterator();
                            while (it.hasNext()) {
                                ((egzh) ((acut) acufVar).h.b()).a(eijx.e(null), (String) it.next());
                            }
                            Iterator it2 = ((acut) acufVar).k.iterator();
                            while (it2.hasNext()) {
                                ((egzh) ((acut) acufVar).h.b()).a(eijx.e(null), (egyk) it2.next());
                            }
                            ecem.c();
                            ((acut) acufVar).l = true;
                            ((acut) acufVar).c();
                            cvbm cvbmVar = (cvbm) ((adcm) acrtVar2.z.b()).d.b();
                            cvbmVar.d.set(true);
                            cvbmVar.b();
                            acxj acxjVar = acrtVar2.r;
                            final Optional optionalOf = dfpi.F() ? Optional.of(Long.valueOf(acrtVar2.m.f().toEpochMilli())) : Optional.empty();
                            acxjVar.a.ifPresent(new Consumer() { // from class: acxh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((actx) obj).a(optionalOf);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            acze aczeVar = (acze) acrtVar2.bh.b();
                            lvn lvnVar = acrtVar2.b.a;
                            lvnVar.getClass();
                            aczeVar.d.set(true);
                            Iterator it3 = aczeVar.a.iterator();
                            while (it3.hasNext()) {
                                ((aczd) it3.next()).f(lvnVar, aczeVar.c);
                            }
                            if (abxb.a() && cpyl.a()) {
                                Optional optional = (Optional) ((eyig) acrtVar2.au).a;
                                if (optional.isPresent()) {
                                    ((tmq) optional.get()).d();
                                }
                            }
                            ((Optional) acrtVar2.u.b()).ifPresent(new Consumer() { // from class: acqg
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    final acnz acnzVar = (acnz) obj;
                                    final acrt acrtVar3 = acrtVar2;
                                    fdat fdatVar = new fdat() { // from class: acpj
                                        @Override // defpackage.fdat
                                        public final Object a(Object obj2, Object obj3) {
                                            acrtVar3.p((abwv) obj2, (Optional) obj3);
                                            return fctx.a;
                                        }
                                    };
                                    if (acnzVar.c) {
                                        return;
                                    }
                                    acnzVar.c = true;
                                    auvw.k(acnzVar.a, null, null, new acny(acnzVar, fdatVar, null), 3).hK(new fdap() { // from class: acnv
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj2) {
                                            acnzVar.c = false;
                                            return fctx.a;
                                        }
                                    });
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            acrtVar2.aO.h();
                            eieuVarK.close();
                            acrt acrtVar3 = acqqVar.b;
                            afjt afjtVar = (afjt) acrtVar3.bo.b();
                            efwo efwoVar = acrtVar3.am;
                            efwoVar.getClass();
                            ecem.g();
                            if (afjtVar.b) {
                                Iterator it4 = ((Set) afjtVar.a.b()).iterator();
                                while (it4.hasNext()) {
                                    ((afju) it4.next()).a(efwoVar);
                                }
                                afjtVar.b = false;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
            }));
        } else {
            ekrw ekrwVarE = acrt.a.e();
            ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$15", "onPreDraw", 1944, "HomeFragmentPeer.java")).q("Skipping pre-draw");
        }
        return true;
    }
}
