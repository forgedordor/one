package com.google.android.ims.binding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Process;
import android.service.carrier.CarrierMessagingClientService;
import com.google.android.ims.binding.SystemBindingService;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.devw;
import defpackage.devx;
import defpackage.dfdr;
import defpackage.dhja;
import defpackage.eiid;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eosc;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SystemBindingService extends CarrierMessagingClientService {
    public static final ekrg a = ekrg.c("com/google/android/ims/binding/SystemBindingService");
    private eosc b;

    private final synchronized eosc a() {
        if (this.b == null) {
            this.b = dfdr.a(getApplicationContext()).s();
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "CarrierServices");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/binding/SystemBindingService", "onCreate", 70, "SystemBindingService.java")).q("SystemBindingService onCreate");
        super.onCreate();
        a().execute(eiid.k(new Runnable() { // from class: devy
            @Override // java.lang.Runnable
            public final void run() {
                SystemBindingService systemBindingService = this.a;
                if (dhka.h(systemBindingService.getApplicationContext())) {
                    if (!dhka.k(systemBindingService.getApplicationContext())) {
                        ekrw ekrwVarH2 = SystemBindingService.a.h();
                        ekrwVarH2.X(eksq.a, "CarrierServices");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/binding/SystemBindingService", "startJibeService", 110, "SystemBindingService.java")).q("SystemBindingService: Starting JibeService");
                        systemBindingService.startService(new Intent().setComponent(new ComponentName(systemBindingService, "com.google.android.ims.service.JibeService")));
                    }
                    dhjm.b(systemBindingService, new Intent(RcsIntents.ACTION_RCS_SYSTEM_BINDING), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dhjl.SYSTEM_BINDING_SERVICE);
                }
            }
        }));
        a().execute(eiid.k(new Runnable() { // from class: devz
            @Override // java.lang.Runnable
            public final void run() {
                final devx devxVarG = dfdr.a(this.a.getApplicationContext()).g();
                if (dfog.n() <= 0) {
                    dhja.r(devx.b, "System-Binding monitor disabled by phenotype flags.", new Object[0]);
                    return;
                }
                synchronized (devxVarG) {
                    if (devxVarG.i) {
                        return;
                    }
                    devxVarG.i = true;
                    ejxm ejxmVar = devxVarG.f;
                    ejxmVar.e();
                    ejxmVar.f();
                    ConnectivityManager connectivityManager = (ConnectivityManager) devxVarG.c.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        dhja.h(devx.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
                    } else {
                        synchronized (devxVarG) {
                            devxVarG.j = new devw(devxVarG);
                            connectivityManager.registerDefaultNetworkCallback(devxVarG.j);
                        }
                    }
                    Runnable runnable = new Runnable() { // from class: devv
                        @Override // java.lang.Runnable
                        public final void run() {
                            devx devxVar = devxVarG;
                            diep diepVar = devxVar.e;
                            Duration durationOfMillis = Duration.ofMillis(diepVar.a() - devxVar.h);
                            Duration duration = devx.a;
                            Comparable comparableA = ekdo.a(duration, durationOfMillis);
                            Comparable comparableA2 = ekdo.a(duration, Duration.ofMillis(diepVar.a()));
                            final int iMyPid = Process.myPid();
                            final Duration durationA = devxVar.a();
                            final Duration durationB = devxVar.b();
                            final Duration durationC = devxVar.c();
                            final Duration duration2 = (Duration) comparableA2;
                            final Context context = devxVar.c;
                            final Duration duration3 = (Duration) comparableA;
                            final deyj deyjVar = devxVar.g;
                            deyjVar.L(new Callable() { // from class: deyd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ewlw ewlwVar = (ewlw) ewlx.a.createBuilder();
                                    ewlz ewlzVar = (ewlz) ewma.a.createBuilder();
                                    long millis = duration3.toMillis();
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar = (ewma) ewlzVar.instance;
                                    ewmaVar.b |= 2;
                                    ewmaVar.d = millis;
                                    long millis2 = duration2.toMillis();
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar2 = (ewma) ewlzVar.instance;
                                    ewmaVar2.b |= 4;
                                    ewmaVar2.e = millis2;
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar3 = (ewma) ewlzVar.instance;
                                    ewmaVar3.b |= 8;
                                    ewmaVar3.f = iMyPid;
                                    long millis3 = durationA.toMillis();
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar4 = (ewma) ewlzVar.instance;
                                    ewmaVar4.b |= 16;
                                    ewmaVar4.g = millis3;
                                    long millis4 = durationB.toMillis();
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar5 = (ewma) ewlzVar.instance;
                                    ewmaVar5.b |= 32;
                                    ewmaVar5.h = millis4;
                                    long millis5 = durationC.toMillis();
                                    ewlzVar.copyOnWrite();
                                    ewma ewmaVar6 = (ewma) ewlzVar.instance;
                                    ewmaVar6.b |= 64;
                                    ewmaVar6.i = millis5;
                                    ewlwVar.copyOnWrite();
                                    ewlx ewlxVar = (ewlx) ewlwVar.instance;
                                    ewma ewmaVar7 = (ewma) ewlzVar.build();
                                    ewmaVar7.getClass();
                                    ewlxVar.c = ewmaVar7;
                                    ewlxVar.b = 3;
                                    deyjVar.B(context, (ewlx) ewlwVar.build());
                                    return null;
                                }
                            }, new Function() { // from class: deye
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    int i = deyj.b;
                                    dhja.i((Throwable) obj, "Fail to log RCS process uptime to clearcut!", new Object[0]);
                                    return null;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                    };
                    eosd eosdVar = devxVarG.d;
                    ejua.a(runnable, dfog.n(), TimeUnit.SECONDS, devxVarG.e, eosdVar);
                }
            }
        }));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        devw devwVar;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "CarrierServices");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/binding/SystemBindingService", "onDestroy", 85, "SystemBindingService.java")).q("SystemBindingService onDestroy");
        super.onDestroy();
        devx devxVarG = dfdr.a(getApplicationContext()).g();
        synchronized (devxVarG) {
            devwVar = devxVarG.j;
        }
        if (devwVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) devxVarG.c.getSystemService("connectivity");
            if (connectivityManager == null) {
                dhja.h(devx.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
            } else {
                connectivityManager.unregisterNetworkCallback(devwVar);
            }
        }
    }
}
