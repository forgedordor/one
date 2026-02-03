package com.google.android.apps.messaging.receiver;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.ahgi;
import defpackage.ains;
import defpackage.aiwp;
import defpackage.aiwq;
import defpackage.ajat;
import defpackage.ajhd;
import defpackage.auvh;
import defpackage.ayge;
import defpackage.cczi;
import defpackage.cdpk;
import defpackage.cdpn;
import defpackage.cgpi;
import defpackage.ckyz;
import defpackage.ckzd;
import defpackage.clbr;
import defpackage.clbv;
import defpackage.cldt;
import defpackage.cldx;
import defpackage.cldy;
import defpackage.coek;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqpz;
import defpackage.crnp;
import defpackage.crqv;
import defpackage.egrx;
import defpackage.egsb;
import defpackage.egsj;
import defpackage.egsn;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.pzn;
import defpackage.pzs;
import defpackage.pzy;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhoneBootAndPackageReplacedReceiver extends ahgi {
    public eygg a;
    public eygg b;
    public fcsu c;

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("PhoneBootAndPackageReplacedReceiver Receive broadcast", "com/google/android/apps/messaging/receiver/PhoneBootAndPackageReplacedReceiver", "beginRootTrace", 45);
    }

    @Override // defpackage.cldb
    public final String d() {
        cqce cqceVar = ckzd.a;
        return "Bugle.Broadcast.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        cqce cqceVar = ckzd.a;
        return "Bugle.Broadcast.ForegroundService.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        ckzd ckzdVar = (ckzd) this.b.b();
        if (ckzd.a(intent)) {
            ((ajat) ckzdVar.j.b()).h(this);
            String action = intent.getAction();
            if (action != null) {
                clbr clbrVar = (clbr) ckzdVar.t.b();
                eksp ekspVar = clbv.a;
                pzn pznVar = new pzn();
                pznVar.e("intent_action", action);
                pzs pzsVarA = pznVar.a();
                egsj egsjVarN = egsn.n(clbv.class);
                egsjVarN.g(new egsb("BOOT_AND_PACKAGE_REPLACE_WORKER", pzy.d));
                ((egrx) egsjVarN).e = pzsVarA;
                eiju eijuVarG = eiju.g(clbrVar.a.c(egsjVarN.h()));
                eijuVarG.getClass();
                auvh.h(eijuVarG);
            }
        } else if (((crnp) ckzdVar.d.b()).e()) {
            String action2 = intent.getAction();
            if ("android.intent.action.BOOT_COMPLETED".equals(action2) || "android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                long epochMilli = ((cogw) ckzdVar.e.b()).f().toEpochMilli();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((crqv) ckzdVar.f.b()).k("last_app_update_time_millis", epochMilli);
                    Iterator it = ((Set) ckzdVar.o.b()).iterator();
                    while (it.hasNext()) {
                        ((cldy) it.next()).c();
                    }
                }
                fcsu fcsuVar = ckzdVar.f;
                if (((crqv) fcsuVar.b()).e("app_install_time_millis", 0L) == 0) {
                    ((crqv) fcsuVar.b()).k("app_install_time_millis", epochMilli);
                }
                ((eksl) ((eksl) ckzd.b.h()).h("com/google/android/apps/messaging/shared/receiver/BootAndPackageReplacedReceiverDelegate", "doSync", 170, "BootAndPackageReplacedReceiverDelegate.java")).q("Silently refreshing notifications after Boot/Package replacement");
                ((cgpi) ckzdVar.s.b()).e();
                ((ckyz) ckzdVar.l.b()).a();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((cqpz) ckzdVar.g.b()).h();
                    ((ains) ckzdVar.h.b()).c("Bugle.Receiver.BootAndPackageReplacedReceiver.RefreshGmsCore");
                    ((aiwq) ckzdVar.m.b()).f(aiwp.PACKAGE_REPLACED, Optional.empty());
                }
                if ("android.intent.action.BOOT_COMPLETED".equals(action2)) {
                    ((cldx) ckzdVar.c.b()).c();
                    ((ajhd) ckzdVar.i.b()).T();
                    ((aiwq) ckzdVar.m.b()).f(aiwp.BOOT_COMPLETE, Optional.empty());
                    ((Optional) ckzdVar.n.b()).ifPresent(new Consumer() { // from class: ckzb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((clfb) obj).i();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Iterator it2 = ((Set) ckzdVar.p.b()).iterator();
                    while (it2.hasNext()) {
                        ((cldt) it2.next()).b();
                    }
                }
            } else if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
                ckzdVar.k.ifPresent(new Consumer() { // from class: ckzc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqce cqceVar = ckzd.a;
                        ((cqdn) ((fcsu) obj).b()).g();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                cqbd cqbdVarA = ckzd.a.a();
                cqbdVarA.I("refresh self participant on locale changed");
                cqbdVarA.r();
                ((ayge) ckzdVar.q.b()).b().K();
                ((aiwq) ckzdVar.m.b()).f(aiwp.LOCALE_CHANGED, Optional.empty());
            } else {
                cqbd cqbdVarC = ckzd.a.c();
                cqbdVarC.I("got unexpected action:");
                cqbdVarC.I(intent.getAction());
                cqbdVarC.r();
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                int[] iArr = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
                for (int i = 0; i < 2; i++) {
                    int i2 = iArr[i];
                    if (jobScheduler.getPendingJob(i2) != null) {
                        jobScheduler.cancel(i2);
                    }
                }
            } else {
                ckzd.a.n("JobScheduler is null");
            }
            fcsu fcsuVar2 = ckzdVar.j;
            ((ajat) fcsuVar2.b()).h(this);
            ((ajat) fcsuVar2.b()).g();
            Optional optional = (Optional) ckzdVar.r.b();
            if (optional.isPresent()) {
                auvh.h(((coek) optional.get()).a());
            }
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        userManager.getClass();
        if (userManager.isManagedProfile()) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.ConversationListActivity"), 2, 1);
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity"), 2, 1);
        }
        if (((Boolean) ((cczi) cdpn.b.get()).e()).booleanValue() && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && ((Optional) this.c.b()).isPresent()) {
            ((cdpk) ((Optional) this.c.b()).get()).a();
        }
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return !ckzd.a(intent);
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        cqce cqceVar = ckzd.a;
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
