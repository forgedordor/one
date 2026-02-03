package com.google.android.ims.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.SparseBooleanArray;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.ims.service.JibeService;
import defpackage.craf;
import defpackage.deyt;
import defpackage.dfcp;
import defpackage.dfdu;
import defpackage.dflg;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dgtt;
import defpackage.dgtw;
import defpackage.dheq;
import defpackage.dhfc;
import defpackage.dhfd;
import defpackage.dhfg;
import defpackage.dhfn;
import defpackage.dhfr;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.eiid;
import defpackage.eosc;
import defpackage.eygg;
import defpackage.fcsu;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class JibeService extends Service implements Thread.UncaughtExceptionHandler {
    public static final dhip a = new dhip("JibeService");
    private static final dfny k;
    private static final dfny l;
    public final AtomicReference b = new AtomicReference(dhfn.STOPPED);
    public Thread.UncaughtExceptionHandler c;
    public eygg d;
    public eosc e;
    public fcsu f;
    public dgtw g;
    public fcsu h;
    public dfdu i;
    public eygg j;
    private deyt m;

    static {
        new WeakReference(null);
        k = dfod.a(179710499);
        l = dfod.a(193752012);
    }

    public static void a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) JibeService.class);
        intent.setAction(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            dhja.d(a, "Ignoring start action because we are running in Tycho", new Object[0]);
            return;
        }
        if (dhka.i(context) && dhka.a(context) == 2) {
            dhja.r(a, "Ignoring start action because JibeService is running in CS.apk.", new Object[0]);
        } else if (dhka.d(context)) {
            context.startService(intent);
        } else {
            dhja.r(a, "Ignoring start action: %s", str);
        }
    }

    private final void c() {
        eygg eyggVar = this.d;
        if (eyggVar == null) {
            return;
        }
        dheq dheqVar = (dheq) eyggVar.b();
        if (Objects.isNull(dheqVar)) {
            return;
        }
        dheqVar.j();
    }

    private final boolean d(Intent intent) {
        String action = intent.getAction();
        boolean zA = dflg.a();
        if ("action.bootCompleted".equals(action)) {
            dhja.d(a, "Handling boot completed. No action.", new Object[0]);
            return true;
        }
        if ("action.upgraded".equals(action)) {
            dhja.d(a, "Handling app upgraded. No action.", new Object[0]);
            return true;
        }
        if ("com.google.android.ims.SIM_LOADED".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("SIM_CHANGED", false);
            if (zA) {
                dhja.r(a, "CslibDeprecateJibeServiceSimEventProcessing: ACTION_SIM_LOADED processing is deprecated.", new Object[0]);
            } else if (this.g != null) {
                dhja.l(a, "Handling SIM loaded; changed: %b", Boolean.valueOf(booleanExtra));
                this.g.onSimLoaded(booleanExtra);
            } else {
                dhja.r(a, "unable to handle ACTION_SIM_LOADED event, with null rcsEngineProxy", new Object[0]);
            }
            return true;
        }
        if (!"com.google.android.ims.SIM_ABSENT".equals(action)) {
            return false;
        }
        if (zA) {
            dhja.r(a, "CslibDeprecateJibeServiceSimEventProcessing: ACTION_SIM_ABSENT processing is deprecated.", new Object[0]);
        } else if (this.g != null) {
            dhja.l(a, "Handling SIM absent", new Object[0]);
            this.g.onSimAbsent();
        } else {
            dhja.r(a, "unable to handle ACTION_SIM_ABSENT event, with null rcsEngineProxy", new Object[0]);
        }
        return true;
    }

    public final void b(dhfn dhfnVar) {
        this.b.set(dhfnVar);
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        printWriter.println("** Carrier Services Lib Log **");
        eosc eoscVar = this.e;
        if (Objects.isNull(eoscVar)) {
            printWriter.printf("  Not initialized. (state=%s)%n", this.b.get());
        } else {
            try {
                eoscVar.submit(eiid.k(new Runnable() { // from class: dhfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrintWriter printWriter2 = printWriter;
                        JibeService jibeService = this.a;
                        AtomicReference atomicReference = jibeService.b;
                        if (atomicReference.get() != dhfn.STARTED) {
                            printWriter2.printf("  Not initialized. (state=%s)%n", atomicReference.get());
                            return;
                        }
                        fcsu fcsuVar = jibeService.h;
                        if (fcsuVar != null) {
                            dfin dfinVar = (dfin) fcsuVar.b();
                            dheq dheqVar = (dheq) dfinVar.b.b();
                            String strI = ((dgsz) dfinVar.e.b()).i(dheqVar.f());
                            String str = deyn.c;
                            printWriter2.println("- IMS Diagnostics Sender");
                            printWriter2.println(" Session ID: ".concat(String.valueOf(deyn.c)));
                            printWriter2.println(" Sequence Number: ".concat(String.valueOf(String.valueOf(deyn.d))));
                            printWriter2.println(" Provisioning Session ID: ".concat(String.valueOf(strI)));
                            dheqVar.a.k(printWriter2);
                            ((dgtw) dfinVar.c.b()).dumpState(printWriter2);
                            dhgz dhgzVar = (dhgz) dfinVar.d.b();
                            printWriter2.println("- Private Jibe Data -");
                            dhgzVar.l("sessionid", printWriter2);
                            dhgzVar.l("requestid", printWriter2);
                            dhgzVar.l("first_time_discovery_finished", printWriter2);
                            dhgzVar.l("provisioning_acs_url_override", printWriter2);
                            dhgzVar.l("provisioning_sms_port_override", printWriter2);
                            dhgzVar.l("provisioning_last_attempt", printWriter2);
                            dhgzVar.l("send_error_result_from_engine", printWriter2);
                            dhgzVar.l("capabilities_pidf_etag", printWriter2);
                            printWriter2.println("======== Carrier Services Phenotype Feature Flags ========");
                            dfnr.a().k(printWriter2);
                            dfog.o().k(printWriter2);
                            dfoi.a().k(printWriter2);
                            dfok.a().k(printWriter2);
                            dfom.a().k(printWriter2);
                            dfoq.c().k(printWriter2);
                            dfos.a().k(printWriter2);
                            dfou.a().k(printWriter2);
                            dfow.a().k(printWriter2);
                            dfoy.a().k(printWriter2);
                            if (dfpa.a == null) {
                                dfpa.a();
                            }
                            dfpa.a.k(printWriter2);
                            dfpc.a().k(printWriter2);
                            dfpe.c().k(printWriter2);
                            dfpg.a().k(printWriter2);
                            dfpi.t().k(printWriter2);
                            dfpk.a().k(printWriter2);
                            dfpo.p().k(printWriter2);
                            dfpq.a().k(printWriter2);
                            dfps.c().k(printWriter2);
                            dfpm.a().k(printWriter2);
                            dfoo.a().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Phenotype Feature Flags ========");
                            String str2 = dfaq.E().L() == 6 ? "MobileConfiguration" : dfaq.E().L() == 5 ? "Phenotype" : "GServices";
                            printWriter2.printf("======== Carrier Services %s Rcs Flags ========%n", str2);
                            Iterator it = dfaq.E().G().iterator();
                            while (it.hasNext()) {
                                printWriter2.println((dfap) it.next());
                            }
                            printWriter2.printf("======== End Carrier Services %s Rcs Flags ========%n", str2);
                            printWriter2.println("======== Carrier Services Kill Switches ========");
                            dfod.c().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Kill Switches ========");
                            printWriter2.println("======== Carrier Services Allow Switches ========");
                            if (dfnv.b != null) {
                                dfnv.a().k(printWriter2);
                            }
                            printWriter2.println("======== End Carrier Services Allow Switches ========");
                            printWriter2.flush();
                            Context context = dfinVar.a;
                            String[] strArr2 = dhka.a;
                            StringBuilder sb = new StringBuilder("Carrier Services GServices flags:\n");
                            try {
                                for (Map.Entry entry : devd.d(context.getApplicationContext().getContentResolver(), "carrier_services_").entrySet()) {
                                    sb.append("   ");
                                    sb.append((String) entry.getKey());
                                    sb.append(": ");
                                    sb.append((String) entry.getValue());
                                    sb.append("\n");
                                }
                                sb.append("====================\n");
                            } catch (Exception e) {
                                sb.append("Error: Cannot get GServices values.\n");
                                sb.append(e);
                            }
                            printWriter2.print(sb.toString());
                            dhja.f(printWriter2);
                        }
                    }
                })).get(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                dhja.h(a, "Unable to dump report on JibeService: %s", e.getMessage());
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                dhja.h(a, "Unable to dump report on JibeService: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                dhja.h(a, "Timed out while dumping RCS bugreport: %s", e3.getMessage());
            }
        }
        printWriter.println("** End Carrier Services Lib Log **");
        printWriter.flush();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws PackageManager.NameNotFoundException {
        fcsu fcsuVar;
        String action = intent.getAction();
        dhip dhipVar = a;
        AtomicReference atomicReference = this.b;
        dhfn dhfnVar = (dhfn) atomicReference.get();
        dhfn dhfnVar2 = dhfn.STOPPED;
        dhja.l(dhipVar, "onBind in state %s, intent action = %s", dhfnVar.e, action);
        if (craf.i(this)) {
            dhja.r(dhipVar, "Running as secondary user - binding not allowed!", new Object[0]);
            deyt deytVar = this.m;
            deytVar.getClass();
            deytVar.a(4);
            return null;
        }
        if (!((Boolean) l.a()).booleanValue() && (atomicReference.get() == dhfn.STOPPING || atomicReference.get() == dhfn.STOPPED)) {
            dhja.h(dhipVar, "onBind should never be called while in state %s", atomicReference);
            deyt deytVar2 = this.m;
            deytVar2.getClass();
            deytVar2.a(3);
            return null;
        }
        if (!d(intent)) {
            if ("csapk.created".equals(action)) {
                dhja.d(dhipVar, "onBind: CS apk created", new Object[0]);
            } else if ("com.google.android.ims.JibeServiceBase".equals(action)) {
                dhja.d(dhipVar, "onBind: JibeServiceBase", new Object[0]);
            } else {
                if (((Boolean) k.a()).booleanValue() && (fcsuVar = this.f) != null) {
                    ((dgtt) fcsuVar.b()).a();
                }
                String action2 = intent.getAction();
                if (action2 != null) {
                    if (dhfr.a(getApplicationContext()).b(action2).isPresent()) {
                        return (IBinder) dhfr.a(getApplicationContext()).b(action2).get();
                    }
                    dhja.r(dhipVar, "[BUG] Can't find a IBinder for %s. This should not happen.", action2);
                    deyt deytVar3 = this.m;
                    deytVar3.getClass();
                    deytVar3.a(7);
                    return null;
                }
            }
        }
        dhja.r(dhipVar, "onBind: JibeService not returning binder", new Object[0]);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r7 = this;
            dfdp r0 = defpackage.dfdr.a(r7)
            android.content.Context r1 = r7.getApplicationContext()
            defpackage.dzzh.f(r1)
            defpackage.dfoc.m()
            dhes r1 = r0.p()
            dexw r0 = r0.h()
            defpackage.dfaq.I(r7)
            dhip r2 = com.google.android.ims.service.JibeService.a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "onCreate:"
            defpackage.dhja.d(r2, r5, r4)
            android.content.Context r4 = r7.getApplicationContext()
            boolean r4 = defpackage.dhka.i(r4)
            if (r4 == 0) goto L3f
            android.content.Context r4 = r7.getApplicationContext()
            int r4 = defpackage.dhka.a(r4)
            r5 = 2
            if (r4 != r5) goto L3f
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "RCS Engine is supposed to run in CS.apk."
            defpackage.dhja.r(r2, r5, r4)
        L3f:
            android.content.Context r4 = r7.getApplicationContext()
            defpackage.dhfr.a(r4)
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            if (r4 == r5) goto L57
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "must be called from the main thread!"
            defpackage.dhja.u(r5, r4)
        L57:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Starting JibeService."
            defpackage.dhja.d(r2, r5, r4)
            java.util.concurrent.atomic.AtomicReference r4 = r7.b
            java.lang.Object r5 = r4.get()
            dhfn r6 = defpackage.dhfn.STARTED
            if (r5 == r6) goto Laa
            java.lang.Object r5 = r4.get()
            dhfn r6 = defpackage.dhfn.STARTING
            if (r5 != r6) goto L71
            goto Laa
        L71:
            boolean r4 = defpackage.cqaz.n()
            if (r4 != 0) goto L88
            boolean r4 = defpackage.craf.i(r7)
            if (r4 == 0) goto L88
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Running as secondary user - stopping service!"
            defpackage.dhja.r(r2, r4, r3)
            r7.stopSelf()
            goto Lb4
        L88:
            r7.b(r6)
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r3 = "JibeServiceInitThread"
            r2.<init>(r3)
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4)
            dhfj r4 = new dhfj
            r4.<init>()
            r3.post(r4)
            r2.quitSafely()
            goto Lb4
        Laa:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r4
            java.lang.String r3 = "Already started. state=%s"
            defpackage.dhja.d(r2, r3, r5)
        Lb4:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r7)
            deyt r2 = new deyt
            android.content.Context r3 = r7.getApplicationContext()
            r2.<init>(r3, r1, r0)
            r7.m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.service.JibeService.onCreate():void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        dhja.l(a, "onDestroy: stopping service", new Object[0]);
        if (this.b.get() == dhfn.STOPPED) {
            return;
        }
        new WeakReference(null);
        b(dhfn.STOPPING);
        try {
            try {
                dgtw dgtwVar = this.g;
                if (dgtwVar != null) {
                    dgtwVar.destroyRcsEngine();
                    dhfd dhfdVar = (dhfd) this.j.b();
                    if (!Objects.isNull(dhfdVar)) {
                        dhfdVar.a();
                    }
                }
                Context applicationContext = getApplicationContext();
                DebugOptionsReceiver.b(applicationContext);
                dhfc.b(applicationContext);
                if ("com.google.android.apps.messaging".equals(applicationContext.getPackageName())) {
                    boolean z = dfcp.a;
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    SparseBooleanArray sparseBooleanArray = dfcp.b;
                    if (sparseBooleanArray.get(applicationContext2.hashCode(), false)) {
                        applicationContext2.unregisterReceiver(dfcp.d);
                        applicationContext2.unregisterReceiver(dfcp.e);
                        sparseBooleanArray.delete(applicationContext2.hashCode());
                    }
                }
            } catch (Exception e) {
                dhja.j(e, a, "onDestroy() unregister factory exception", new Object[0]);
            }
        } finally {
            dhfr.a(getApplicationContext()).c();
            dhfg.b();
            c();
            b(dhfn.STOPPED);
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        fcsu fcsuVar;
        dhja.d(a, "onRebind(), intent=%s", intent);
        if (((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction()) && (fcsuVar = this.f) != null) {
            ((dgtt) fcsuVar.b()).a();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return super.onStartCommand(null, i, i2);
        }
        if (this.b.get() != dhfn.STARTED) {
            return super.onStartCommand(intent, i, i2);
        }
        d(intent);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        dhja.d(a, "onUnbind(), intent=%s", intent);
        return ((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(final Thread thread, final Throwable th) {
        Runnable runnable = new Runnable() { // from class: dhfm
            @Override // java.lang.Runnable
            public final void run() {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.c;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        };
        if (getMainLooper().getThread() != thread) {
            dhja.j(th, a, "Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(runnable);
        } else {
            dhja.j(th, a, "Uncaught exception in primary thread %s", thread);
            runnable.run();
        }
    }
}
