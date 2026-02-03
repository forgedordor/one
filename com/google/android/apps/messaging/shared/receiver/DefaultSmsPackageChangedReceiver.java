package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cdag;
import defpackage.ckzr;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejxr;
import defpackage.eooy;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class DefaultSmsPackageChangedReceiver extends ckzr {
    public static final cqce a = cqce.g("Bugle", "DefaultSmsPackageChangedReceiver");
    public static final ejxr b = cdag.w(188682638, "use_background_executor_for_default_sms_app_change_logging");
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public Executor j;
    public Executor k;
    public fcsu l;
    public fcsu m;
    public fcsu n;
    public fcsu o;

    @Override // defpackage.cldb
    protected final int a() {
        return 10;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.i.b()).c("DefaultSmsPackageChangedReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/DefaultSmsPackageChangedReceiver", "beginRootTrace", 92);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.DefaultPackageChanged.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return null;
    }

    @Override // defpackage.clca
    protected final eiju j(Context context, final Intent intent) {
        return eijx.h(new eooy() { // from class: ckzm
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return eijx.e(null);
                }
                String action = intent2.getAction();
                cqce cqceVar = DefaultSmsPackageChangedReceiver.a;
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("onReceive");
                cqbdVarA.I(intent2);
                cqbdVarA.r();
                ArrayList arrayList = new ArrayList();
                if ("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED".equals(action)) {
                    final DefaultSmsPackageChangedReceiver defaultSmsPackageChangedReceiver = this.a;
                    ((crnp) ((crmx) defaultSmsPackageChangedReceiver.e.b()).d.b()).c();
                    final boolean booleanExtra = intent2.getBooleanExtra("android.provider.extra.IS_DEFAULT_SMS_APP", false);
                    if (booleanExtra) {
                        cqceVar.p("default sms set, forceFullSync");
                        if (((crma) defaultSmsPackageChangedReceiver.d.b()).j()) {
                            auvh.h(((cmwj) defaultSmsPackageChangedReceiver.c.b()).c());
                        }
                        arrayList.add(eijx.f(new Runnable() { // from class: ckzj
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((cmqf) defaultSmsPackageChangedReceiver.g.b()).k(enqq.SELECTED_DEFAULT_SMS_APP);
                            }
                        }, defaultSmsPackageChangedReceiver.k));
                    } else {
                        ((ains) defaultSmsPackageChangedReceiver.o.b()).e("Bugle.DefaultSmsChanged.State.Counts", 1);
                        caxb caxbVar = (caxb) defaultSmsPackageChangedReceiver.h.b();
                        caxa caxaVar = caxa.a;
                        caxr caxrVar = new caxr();
                        caxrVar.b = "update_unread_counter_dedupe";
                        caxbVar.a(caxaVar, caxrVar.a());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", booleanExtra);
                    ((chwq) defaultSmsPackageChangedReceiver.f.b()).F(bundle);
                    arrayList.add(eijx.f(new Runnable() { // from class: ckzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajhd ajhdVar = (ajhd) defaultSmsPackageChangedReceiver.m.b();
                            boolean z = booleanExtra;
                            ajhdVar.q(!z, z);
                        }
                    }, ((Boolean) ((cczi) DefaultSmsPackageChangedReceiver.b.get()).e()).booleanValue() ? defaultSmsPackageChangedReceiver.k : defaultSmsPackageChangedReceiver.j));
                    Iterator it = ((Set) defaultSmsPackageChangedReceiver.n.b()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cldw) it.next()).d(booleanExtra));
                    }
                }
                return eijx.j(arrayList).a(new Callable() { // from class: ckzl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cqce cqceVar2 = DefaultSmsPackageChangedReceiver.a;
                        return null;
                    }
                }, eoqg.a);
            }
        }, (Executor) this.l.b());
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
    }
}
