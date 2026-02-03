package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzof extends dzny implements dzlo {
    public final dzlm a;
    public final Context b;
    public final Executor c;
    public final fcsu d;
    public final dzhb e;
    public final eygg f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final dzhk j;
    public final dznx k;

    public dzof(dzln dzlnVar, Context context, Executor executor, dznx dznxVar, fcsu fcsuVar, eygg eyggVar, dzhb dzhbVar, dzhk dzhkVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = dzlnVar.a(executor, eyggVar, null);
        this.b = context;
        this.c = executor;
        this.k = dznxVar;
        this.d = fcsuVar;
        this.e = dzhbVar;
        this.j = dzhkVar;
        this.f = eyggVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
    }

    @Override // defpackage.dzlo
    public final void n() {
        eooy eooyVar = new eooy() { // from class: dzob
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final dzof dzofVar = this.a;
                return dqyw.c(dzofVar.b, new Runnable() { // from class: dzoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        final dzof dzofVar2 = dzofVar;
                        eork.n(new eooy() { // from class: dzoe
                            @Override // defpackage.eooy
                            public final ListenableFuture a() throws IOException, NumberFormatException {
                                int i;
                                int i2;
                                int i3;
                                String str;
                                long j;
                                ekfw ekfwVar;
                                ListenableFuture listenableFutureI;
                                ekfw ekfwVar2;
                                Long lValueOf;
                                final dzof dzofVar3 = dzofVar2;
                                eygg eyggVar = dzofVar3.f;
                                if (!Application.getProcessName().equals(String.valueOf(dzofVar3.b.getPackageName()).concat(((dznt) eyggVar.b()).d()))) {
                                    return eorv.a;
                                }
                                if (!((Boolean) dzofVar3.g.b()).booleanValue()) {
                                    return eorv.a;
                                }
                                final dznx dznxVar = dzofVar3.k;
                                fcsu fcsuVar = dzofVar3.d;
                                String string = ((SharedPreferences) fcsuVar.b()).getString("lastExitProcessName", null);
                                long j2 = ((SharedPreferences) fcsuVar.b()).getLong("lastExitTimestamp", -1L);
                                Context context = dznxVar.a;
                                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                                activityManager.getClass();
                                List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
                                int i4 = ekgb.d;
                                ekfw ekfwVar3 = new ekfw();
                                Iterator it = historicalProcessExitReasons.iterator();
                                while (it.hasNext()) {
                                    ApplicationExitInfo applicationExitInfoM = aee$$ExternalSyntheticApiModelOutline0.m(it.next());
                                    if (applicationExitInfoM.getProcessName().equals(string) && applicationExitInfoM.getTimestamp() == j2) {
                                        ListenableFuture listenableFutureE = eork.e(ekfwVar3.g());
                                        ejvr ejvrVar = new ejvr() { // from class: dznw
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj) {
                                                return ekgb.n((List) obj);
                                            }
                                        };
                                        eoqg eoqgVar = eoqg.a;
                                        return eooq.g(eooq.f(listenableFutureE, ejvrVar, eoqgVar), new eooz() { // from class: dznz
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj) {
                                                final ekgb ekgbVar = (ekgb) obj;
                                                if (ekgbVar.isEmpty()) {
                                                    return eorv.a;
                                                }
                                                final dzof dzofVar4 = dzofVar3;
                                                feco fecoVar = (feco) dzofVar4.h.b();
                                                fecl feclVar = (fecl) fecm.a.createBuilder();
                                                int size = ekgbVar.size();
                                                feclVar.copyOnWrite();
                                                fecm fecmVar = (fecm) feclVar.instance;
                                                fecmVar.b |= 2;
                                                fecmVar.e = size;
                                                feclVar.copyOnWrite();
                                                fecm fecmVar2 = (fecm) feclVar.instance;
                                                fecoVar.getClass();
                                                fecmVar2.d = fecoVar;
                                                fecmVar2.b |= 1;
                                                HashSet hashSet = new HashSet();
                                                for (int i5 = 0; i5 < fecoVar.b.size(); i5++) {
                                                    int iA = fecj.a(fecoVar.b.d(i5));
                                                    if (iA == 0) {
                                                        iA = 1;
                                                    }
                                                    hashSet.add(Integer.valueOf(iA - 1));
                                                }
                                                int size2 = ekgbVar.size();
                                                for (int i6 = 0; i6 < size2; i6++) {
                                                    feck feckVar = (feck) ekgbVar.get(i6);
                                                    int iA2 = fecj.a(feckVar.d);
                                                    if (iA2 == 0) {
                                                        iA2 = 1;
                                                    }
                                                    if (hashSet.contains(Integer.valueOf(iA2 - 1))) {
                                                        feclVar.copyOnWrite();
                                                        fecm fecmVar3 = (fecm) feclVar.instance;
                                                        feckVar.getClass();
                                                        evtg evtgVar = fecmVar3.c;
                                                        if (!evtgVar.c()) {
                                                            fecmVar3.c = evsn.mutableCopy(evtgVar);
                                                        }
                                                        fecmVar3.c.add(feckVar);
                                                    }
                                                }
                                                fecm fecmVar4 = (fecm) feclVar.build();
                                                dzlm dzlmVar = dzofVar4.a;
                                                dzle dzleVarN = dzlf.n();
                                                feiw feiwVar = (feiw) feix.a.createBuilder();
                                                feiwVar.copyOnWrite();
                                                feix feixVar = (feix) feiwVar.instance;
                                                fecmVar4.getClass();
                                                feixVar.q = fecmVar4;
                                                feixVar.b |= 131072;
                                                dzleVarN.f((feix) feiwVar.build());
                                                return eooq.f(dzlmVar.b(dzleVarN.a()), new ejvr() { // from class: dzod
                                                    /* JADX WARN: Incorrect condition in loop: B:4:0x002d */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.ejvr
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct add '--show-bad-code' argument
                                                    */
                                                    public final java.lang.Object apply(java.lang.Object r7) {
                                                        /*
                                                            r6 = this;
                                                            java.lang.Void r7 = (java.lang.Void) r7
                                                            ekgb r7 = r2
                                                            r0 = 0
                                                            java.lang.Object r7 = r7.get(r0)
                                                            feck r7 = (defpackage.feck) r7
                                                        Lb:
                                                            dzof r1 = r1
                                                            java.lang.String r2 = r7.c
                                                            long r3 = r7.g
                                                            fcsu r1 = r1.d
                                                            java.lang.Object r1 = r1.b()
                                                            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
                                                            android.content.SharedPreferences$Editor r1 = r1.edit()
                                                            java.lang.String r5 = "lastExitProcessName"
                                                            android.content.SharedPreferences$Editor r1 = r1.putString(r5, r2)
                                                            java.lang.String r2 = "lastExitTimestamp"
                                                            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)
                                                            boolean r1 = r1.commit()
                                                            if (r1 != 0) goto L4f
                                                            int r0 = r0 + 1
                                                            r1 = 3
                                                            if (r0 < r1) goto Lb
                                                            ekrg r7 = defpackage.dzfq.a
                                                            ekrw r7 = r7.j()
                                                            ekrd r7 = (defpackage.ekrd) r7
                                                            r0 = 220(0xdc, float:3.08E-43)
                                                            java.lang.String r1 = "ApplicationExitMetricServiceImpl.java"
                                                            java.lang.String r2 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
                                                            java.lang.String r3 = "updateLastRecordedAppExit"
                                                            ekrw r7 = r7.h(r2, r3, r0, r1)
                                                            ekrd r7 = (defpackage.ekrd) r7
                                                            java.lang.String r0 = "Failed to persist most recent App Exit"
                                                            r7.q(r0)
                                                        L4f:
                                                            r7 = 0
                                                            return r7
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzod.apply(java.lang.Object):java.lang.Object");
                                                    }
                                                }, dzofVar4.c);
                                            }
                                        }, eoqgVar);
                                    }
                                    final fecg fecgVar = (fecg) feck.a.createBuilder();
                                    String processName = applicationExitInfoM.getProcessName();
                                    fecgVar.copyOnWrite();
                                    feck feckVar = (feck) fecgVar.instance;
                                    processName.getClass();
                                    feckVar.b |= 1;
                                    feckVar.c = processName;
                                    int status = applicationExitInfoM.getStatus();
                                    fecgVar.copyOnWrite();
                                    feck feckVar2 = (feck) fecgVar.instance;
                                    int i5 = 4;
                                    feckVar2.b |= 4;
                                    feckVar2.e = status;
                                    long timestamp = applicationExitInfoM.getTimestamp();
                                    fecgVar.copyOnWrite();
                                    feck feckVar3 = (feck) fecgVar.instance;
                                    feckVar3.b |= 16;
                                    feckVar3.g = timestamp;
                                    long pss = applicationExitInfoM.getPss();
                                    fecgVar.copyOnWrite();
                                    feck feckVar4 = (feck) fecgVar.instance;
                                    feckVar4.b |= 64;
                                    feckVar4.i = pss;
                                    long rss = applicationExitInfoM.getRss();
                                    fecgVar.copyOnWrite();
                                    feck feckVar5 = (feck) fecgVar.instance;
                                    feckVar5.b |= 128;
                                    feckVar5.j = rss;
                                    boolean zIsLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                                    fecgVar.copyOnWrite();
                                    feck feckVar6 = (feck) fecgVar.instance;
                                    feckVar6.b |= 256;
                                    feckVar6.k = zIsLowMemoryKillReportSupported;
                                    switch (applicationExitInfoM.getReason()) {
                                        case 0:
                                            i = 15;
                                            break;
                                        case 1:
                                            i = 2;
                                            break;
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                            i = 4;
                                            break;
                                        case 4:
                                            i = 5;
                                            break;
                                        case 5:
                                            i = 6;
                                            break;
                                        case 6:
                                            i = 7;
                                            break;
                                        case 7:
                                            i = 8;
                                            break;
                                        case 8:
                                            i = 9;
                                            break;
                                        case 9:
                                            i = 10;
                                            break;
                                        case 10:
                                            i = 11;
                                            break;
                                        case 11:
                                            i = 12;
                                            break;
                                        case 12:
                                            i = 13;
                                            break;
                                        case 13:
                                            i = 14;
                                            break;
                                        case 14:
                                            i = 100;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i != 0) {
                                        fecgVar.copyOnWrite();
                                        i2 = 1;
                                        feck feckVar7 = (feck) fecgVar.instance;
                                        i3 = 2;
                                        feckVar7.d = i - 1;
                                        feckVar7.b |= 2;
                                    } else {
                                        i2 = 1;
                                        i3 = 2;
                                        i = 0;
                                    }
                                    int importance = applicationExitInfoM.getImportance();
                                    if (importance == 100) {
                                        i5 = i3;
                                    } else if (importance == 125) {
                                        i5 = 3;
                                    } else if (importance == 200) {
                                        i5 = 5;
                                    } else if (importance == 230) {
                                        i5 = 6;
                                    } else if (importance == 300) {
                                        i5 = 8;
                                    } else if (importance != 325) {
                                        i5 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
                                    }
                                    if (i5 != 0) {
                                        fecgVar.copyOnWrite();
                                        feck feckVar8 = (feck) fecgVar.instance;
                                        feckVar8.f = i5 - 1;
                                        feckVar8.b |= 8;
                                    }
                                    if (i == 7 && Build.VERSION.SDK_INT >= 33 && ((Boolean) dznxVar.e.b()).booleanValue()) {
                                        try {
                                            InputStream traceInputStream = applicationExitInfoM.getTraceInputStream();
                                            try {
                                                String description = applicationExitInfoM.getDescription();
                                                if (traceInputStream != null && !ejwk.c(description)) {
                                                    evqs evqsVarB = evqs.B(traceInputStream);
                                                    fcsu fcsuVar2 = dznxVar.g;
                                                    if (((Long) fcsuVar2.b()).longValue() < 0 || evqsVarB.d() <= ((Long) fcsuVar2.b()).longValue()) {
                                                        fece feceVar = (fece) fecf.a.createBuilder();
                                                        feceVar.copyOnWrite();
                                                        fecf fecfVar = (fecf) feceVar.instance;
                                                        description.getClass();
                                                        fecfVar.b |= 1;
                                                        fecfVar.e = description;
                                                        if (((Boolean) dznxVar.f.b()).booleanValue()) {
                                                            evqr evqrVar = new evqr();
                                                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(evqrVar);
                                                            try {
                                                                evqsVarB.q(gZIPOutputStream);
                                                                gZIPOutputStream.close();
                                                                evqs evqsVarB2 = evqrVar.b();
                                                                fcsu fcsuVar3 = dznxVar.h;
                                                                if (((Long) fcsuVar3.b()).longValue() < 0 || evqsVarB2.d() <= ((Long) fcsuVar3.b()).longValue()) {
                                                                    feceVar.copyOnWrite();
                                                                    fecf fecfVar2 = (fecf) feceVar.instance;
                                                                    evqsVarB2.getClass();
                                                                    fecfVar2.c = 5;
                                                                    fecfVar2.d = evqsVarB2;
                                                                }
                                                            } finally {
                                                            }
                                                        } else {
                                                            feceVar.copyOnWrite();
                                                            fecf fecfVar3 = (fecf) feceVar.instance;
                                                            evqsVarB.getClass();
                                                            fecfVar3.c = i3;
                                                            fecfVar3.d = evqsVarB;
                                                        }
                                                        fecf fecfVar4 = (fecf) feceVar.build();
                                                        fecgVar.copyOnWrite();
                                                        feck feckVar9 = (feck) fecgVar.instance;
                                                        fecfVar4.getClass();
                                                        feckVar9.l = fecfVar4;
                                                        feckVar9.b |= 512;
                                                    }
                                                } else if (traceInputStream != null) {
                                                }
                                                traceInputStream.close();
                                            } catch (Throwable th) {
                                                if (traceInputStream != null) {
                                                    try {
                                                        traceInputStream.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 321, "ApplicationExitInfoCaptureImpl.java")).q("Failed to read ANR trace");
                                        }
                                    }
                                    dzgu dzguVar = dznxVar.o;
                                    final int pid = applicationExitInfoM.getPid();
                                    evvp evvpVarC = evxc.c(applicationExitInfoM.getTimestamp());
                                    if (((Boolean) dzguVar.b.b()).booleanValue()) {
                                        File file = new File(dzguVar.a.getFilesDir(), "flight_records");
                                        if (file.exists()) {
                                            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: dzgt
                                                @Override // java.io.FilenameFilter
                                                public final boolean accept(File file2, String str2) {
                                                    return str2.startsWith(pid + "_");
                                                }
                                            });
                                            if (fileArrListFiles == null) {
                                                ((ekrd) ((ekrd) dzfq.a.h()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 54, "FlightRecordReaderImpl.java")).r("Failed to find any valid flight records for process id %d", pid);
                                                listenableFutureI = eork.i(ejud.a);
                                            } else {
                                                str = string;
                                                j = j2;
                                                int i6 = 0;
                                                File file2 = null;
                                                Long l = null;
                                                while (i6 < fileArrListFiles.length) {
                                                    File file3 = fileArrListFiles[i6];
                                                    int i7 = i6;
                                                    List listI = ejxk.b('_').i(file3.getName());
                                                    Long l2 = l;
                                                    if (listI.size() != 2) {
                                                        ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 63, "FlightRecordReaderImpl.java")).t("Invalid flight record file name: %s", file3.getName());
                                                        ekfwVar2 = ekfwVar3;
                                                    } else {
                                                        try {
                                                            long j3 = Long.parseLong((String) listI.get(i2));
                                                            ekfwVar2 = ekfwVar3;
                                                            long j4 = evvpVarC.b;
                                                            if (j3 <= j4 && (l2 == null || j4 - j3 < l2.longValue())) {
                                                                lValueOf = Long.valueOf(evvpVarC.b - j3);
                                                                file2 = file3;
                                                            }
                                                        } catch (NumberFormatException e2) {
                                                            ekfwVar2 = ekfwVar3;
                                                            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e2)).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 70, "FlightRecordReaderImpl.java")).t("Invalid timestamp in flight record file name: %s", file3.getName());
                                                        }
                                                        i6 = i7 + 1;
                                                        ekfwVar3 = ekfwVar2;
                                                        i2 = 1;
                                                        l = lValueOf;
                                                    }
                                                    lValueOf = l2;
                                                    i6 = i7 + 1;
                                                    ekfwVar3 = ekfwVar2;
                                                    i2 = 1;
                                                    l = lValueOf;
                                                }
                                                ekfwVar = ekfwVar3;
                                                if (file2 == null) {
                                                    ((ekrd) ((ekrd) dzfq.a.h()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 87, "FlightRecordReaderImpl.java")).r("Failed to find any valid flight records for process id %d", pid);
                                                    listenableFutureI = eork.i(ejud.a);
                                                } else {
                                                    try {
                                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                                        try {
                                                            dzgs dzgsVar = (dzgs) evsn.parseFrom(dzgs.a, fileInputStream, evrr.a());
                                                            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 93, "FlightRecordReaderImpl.java")).q("Read and serialization successful");
                                                            listenableFutureI = eork.i(ejwi.j(dzgsVar));
                                                            fileInputStream.close();
                                                        } finally {
                                                        }
                                                    } catch (IOException e3) {
                                                        ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e3)).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", '`', "FlightRecordReaderImpl.java")).q("Failed to read FlightRecord from file");
                                                        listenableFutureI = eork.i(ejud.a);
                                                    }
                                                }
                                                ekfwVar.h(eooq.f(listenableFutureI, new ejvr() { // from class: dznu
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj) {
                                                        boolean z;
                                                        ekgb ekgbVarA;
                                                        ejwi ejwiVar = (ejwi) obj;
                                                        boolean zG = ejwiVar.g();
                                                        fecg fecgVar2 = fecgVar;
                                                        if (!zG) {
                                                            return (feck) fecgVar2.build();
                                                        }
                                                        for (dzgj dzgjVar : ((dzgs) ejwiVar.c()).e) {
                                                            int i8 = dzgjVar.b;
                                                            int i9 = 3;
                                                            boolean z2 = true;
                                                            int i10 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                            if (i10 == 0) {
                                                                throw null;
                                                            }
                                                            int i11 = i10 - 1;
                                                            dznx dznxVar2 = dznxVar;
                                                            if (i11 != 0) {
                                                                if (i11 == 1) {
                                                                    evvp evvpVar = (i8 == 2 ? (dzgl) dzgjVar.c : dzgl.a).c;
                                                                    if (evvpVar == null) {
                                                                        evvpVar = evvp.a;
                                                                    }
                                                                    long jA = evxc.a(evvpVar);
                                                                    fecgVar2.copyOnWrite();
                                                                    feck feckVar10 = (feck) fecgVar2.instance;
                                                                    feck feckVar11 = feck.a;
                                                                    feckVar10.b |= 32;
                                                                    feckVar10.h = jA;
                                                                } else if (i11 != 2) {
                                                                    if (i11 == 3) {
                                                                        dzgr dzgrVar = i8 == 4 ? (dzgr) dzgjVar.c : dzgr.a;
                                                                        if (((Boolean) dznxVar2.i.b()).booleanValue()) {
                                                                            fejj fejjVar = (fejj) fejk.a.createBuilder();
                                                                            if (dzgrVar.c.equals(dznxVar2.b.b())) {
                                                                                z = false;
                                                                            } else {
                                                                                String str2 = dzgrVar.c;
                                                                                fejjVar.copyOnWrite();
                                                                                fejk fejkVar = (fejk) fejjVar.instance;
                                                                                str2.getClass();
                                                                                fejkVar.b |= 1;
                                                                                fejkVar.c = str2;
                                                                                z = true;
                                                                            }
                                                                            if (dzgrVar.d != ((Integer) dznxVar2.c.b()).intValue()) {
                                                                                int i12 = dzgrVar.d;
                                                                                fejjVar.copyOnWrite();
                                                                                fejk fejkVar2 = (fejk) fejjVar.instance;
                                                                                fejkVar2.b = 2 | fejkVar2.b;
                                                                                fejkVar2.d = i12;
                                                                                z = true;
                                                                            }
                                                                            if (dzgrVar.e != ((Integer) dznxVar2.d.b()).intValue()) {
                                                                                int i13 = dzgrVar.e;
                                                                                fejjVar.copyOnWrite();
                                                                                fejk fejkVar3 = (fejk) fejjVar.instance;
                                                                                fejkVar3.b = 4 | fejkVar3.b;
                                                                                fejkVar3.e = i13;
                                                                            } else {
                                                                                z2 = z;
                                                                            }
                                                                            if (dzgrVar.f != Build.VERSION.SDK_INT) {
                                                                                int i14 = dzgrVar.f;
                                                                                fejjVar.copyOnWrite();
                                                                                fejk fejkVar4 = (fejk) fejjVar.instance;
                                                                                fejkVar4.b |= 8;
                                                                                fejkVar4.f = i14;
                                                                            } else if (z2) {
                                                                            }
                                                                            fejk fejkVar5 = (fejk) fejjVar.build();
                                                                            fecgVar2.copyOnWrite();
                                                                            feck feckVar12 = (feck) fecgVar2.instance;
                                                                            feck feckVar13 = feck.a;
                                                                            fejkVar5.getClass();
                                                                            feckVar12.o = fejkVar5;
                                                                            feckVar12.b |= 4096;
                                                                        }
                                                                    }
                                                                } else if ((((feck) fecgVar2.instance).b & 512) != 0 && ((Boolean) dznxVar2.j.b()).booleanValue()) {
                                                                    dzgp dzgpVar = dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a;
                                                                    fcsu fcsuVar4 = dznxVar2.l;
                                                                    List list = dzgpVar.c;
                                                                    if (((Long) fcsuVar4.b()).longValue() >= 0) {
                                                                        Instant instantMinusSeconds = Instant.ofEpochMilli(((feck) fecgVar2.instance).g).minusSeconds(((Long) fcsuVar4.b()).longValue());
                                                                        evvp evvpVar2 = (dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).d;
                                                                        if (evvpVar2 == null) {
                                                                            evvpVar2 = evvp.a;
                                                                        }
                                                                        if (!evwz.d(evvpVar2).isBefore(instantMinusSeconds)) {
                                                                        }
                                                                    }
                                                                    fcsu fcsuVar5 = dznxVar2.k;
                                                                    if (((Long) fcsuVar5.b()).longValue() >= 0) {
                                                                        final Instant instantMinusSeconds2 = Instant.ofEpochMilli(((feck) fecgVar2.instance).g).minusSeconds(((Long) fcsuVar5.b()).longValue());
                                                                        Stream streamFilter = Collection.EL.stream(list).filter(new Predicate() { // from class: dznv
                                                                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                                                                return Predicate$CC.$default$and(this, predicate);
                                                                            }

                                                                            @Override // java.util.function.Predicate
                                                                            /* renamed from: negate */
                                                                            public final /* synthetic */ Predicate mo538negate() {
                                                                                return Predicate$CC.$default$negate(this);
                                                                            }

                                                                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                                                                return Predicate$CC.$default$or(this, predicate);
                                                                            }

                                                                            @Override // java.util.function.Predicate
                                                                            public final boolean test(Object obj2) {
                                                                                Instant instantD;
                                                                                feji fejiVar = (feji) obj2;
                                                                                int i15 = fejiVar.c;
                                                                                if (i15 == 1) {
                                                                                    evvp evvpVar3 = ((fegm) fejiVar.d).g;
                                                                                    if (evvpVar3 == null) {
                                                                                        evvpVar3 = evvp.a;
                                                                                    }
                                                                                    instantD = evwz.d(evvpVar3);
                                                                                } else {
                                                                                    evvp evvpVar4 = (i15 == 3 ? (fejw) fejiVar.d : fejw.a).e;
                                                                                    if (evvpVar4 == null) {
                                                                                        evvpVar4 = evvp.a;
                                                                                    }
                                                                                    instantD = evwz.d(evvpVar4);
                                                                                }
                                                                                return instantD.isAfter(instantMinusSeconds2);
                                                                            }
                                                                        });
                                                                        int i15 = ekgb.d;
                                                                        list = (List) streamFilter.collect(ekcv.a);
                                                                    }
                                                                    long jLongValue = ((Long) dznxVar2.m.b()).longValue();
                                                                    long jLongValue2 = ((Long) dznxVar2.n.b()).longValue();
                                                                    Iterator it2 = list.iterator();
                                                                    boolean z3 = false;
                                                                    boolean z4 = false;
                                                                    while (it2.hasNext()) {
                                                                        int i16 = ((feji) it2.next()).c;
                                                                        z3 |= i16 == 1;
                                                                        z4 |= i16 == 3;
                                                                    }
                                                                    if (z3 && z4) {
                                                                        ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceMetrics", 61, "TraceFilter.java")).q("TraceMetric list contains both Trace and TraceRecord");
                                                                        int i17 = ekgb.d;
                                                                        ekgbVarA = ekoe.a;
                                                                    } else if (z3) {
                                                                        Stream map = Collection.EL.stream(list).map(new Function() { // from class: dzhq
                                                                            @Override // java.util.function.Function
                                                                            /* renamed from: andThen */
                                                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                                                return Function$CC.$default$andThen(this, function);
                                                                            }

                                                                            @Override // java.util.function.Function
                                                                            public final Object apply(Object obj2) {
                                                                                feji fejiVar = (feji) obj2;
                                                                                return new dzhu(fejiVar, dzht.b(fejiVar.c == 1 ? (fegm) fejiVar.d : fegm.a));
                                                                            }

                                                                            public final /* synthetic */ Function compose(Function function) {
                                                                                return Function$CC.$default$compose(this, function);
                                                                            }
                                                                        });
                                                                        int i18 = ekgb.d;
                                                                        ekgbVarA = dzhx.a((List) map.collect(ekcv.a), jLongValue, jLongValue2);
                                                                    } else if (z4) {
                                                                        Stream map2 = Collection.EL.stream(list).map(new Function() { // from class: dzhs
                                                                            @Override // java.util.function.Function
                                                                            /* renamed from: andThen */
                                                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                                                return Function$CC.$default$andThen(this, function);
                                                                            }

                                                                            @Override // java.util.function.Function
                                                                            public final Object apply(Object obj2) {
                                                                                feji fejiVar = (feji) obj2;
                                                                                return new dzhu(fejiVar, dzhv.b(fejiVar.c == 3 ? (fejw) fejiVar.d : fejw.a));
                                                                            }

                                                                            public final /* synthetic */ Function compose(Function function) {
                                                                                return Function$CC.$default$compose(this, function);
                                                                            }
                                                                        });
                                                                        int i19 = ekgb.d;
                                                                        ekgbVarA = dzhx.a((List) map2.collect(ekcv.a), jLongValue, jLongValue2);
                                                                    } else {
                                                                        ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceMetrics", 71, "TraceFilter.java")).q("TraceMetric list contains neither Trace nor TraceRecord");
                                                                        int i20 = ekgb.d;
                                                                        ekgbVarA = ekoe.a;
                                                                    }
                                                                    if (!ekgbVarA.isEmpty()) {
                                                                        feja fejaVar = (feja) fejc.a.createBuilder();
                                                                        fejaVar.copyOnWrite();
                                                                        fejc fejcVar = (fejc) fejaVar.instance;
                                                                        evtg evtgVar = fejcVar.c;
                                                                        if (!evtgVar.c()) {
                                                                            fejcVar.c = evsn.mutableCopy(evtgVar);
                                                                        }
                                                                        evpz.addAll(ekgbVarA, fejcVar.c);
                                                                        evvp evvpVar3 = (dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).d;
                                                                        if (evvpVar3 == null) {
                                                                            evvpVar3 = evvp.a;
                                                                        }
                                                                        fejaVar.copyOnWrite();
                                                                        fejc fejcVar2 = (fejc) fejaVar.instance;
                                                                        evvpVar3.getClass();
                                                                        fejcVar2.d = evvpVar3;
                                                                        fejcVar2.b |= 1;
                                                                        int iA = dzgo.a((dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).e);
                                                                        if (iA == 0) {
                                                                            iA = 1;
                                                                        }
                                                                        int i21 = iA - 1;
                                                                        if (i21 == 0) {
                                                                            i9 = 1;
                                                                        } else if (i21 == 1) {
                                                                            i9 = 2;
                                                                        }
                                                                        fejaVar.copyOnWrite();
                                                                        fejc fejcVar3 = (fejc) fejaVar.instance;
                                                                        fejcVar3.e = i9 - 1;
                                                                        fejcVar3.b |= 2;
                                                                        fejc fejcVar4 = (fejc) fejaVar.build();
                                                                        fecgVar2.copyOnWrite();
                                                                        feck feckVar14 = (feck) fecgVar2.instance;
                                                                        fejcVar4.getClass();
                                                                        feckVar14.n = fejcVar4;
                                                                        feckVar14.b |= 2048;
                                                                    }
                                                                }
                                                            } else if ((((feck) fecgVar2.instance).b & 1024) != 0) {
                                                                ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ApplicationExitInfoCaptureImpl.java")).q("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                            } else {
                                                                feeg feegVar = i8 == 1 ? (feeg) dzgjVar.c : feeg.a;
                                                                fecgVar2.copyOnWrite();
                                                                feck feckVar15 = (feck) fecgVar2.instance;
                                                                feegVar.getClass();
                                                                feckVar15.m = feegVar;
                                                                feckVar15.b |= 1024;
                                                            }
                                                        }
                                                        return (feck) fecgVar2.build();
                                                    }
                                                }, eoqg.a));
                                                ekfwVar3 = ekfwVar;
                                                string = str;
                                                j2 = j;
                                            }
                                        } else {
                                            ((ekrd) ((ekrd) dzfq.a.h()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 46, "FlightRecordReaderImpl.java")).q("Flight records directory does not exist");
                                            listenableFutureI = eork.i(ejud.a);
                                        }
                                    } else {
                                        listenableFutureI = eork.i(ejud.a);
                                    }
                                    str = string;
                                    j = j2;
                                    ekfwVar = ekfwVar3;
                                    ekfwVar.h(eooq.f(listenableFutureI, new ejvr() { // from class: dznu
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj) {
                                            boolean z;
                                            ekgb ekgbVarA;
                                            ejwi ejwiVar = (ejwi) obj;
                                            boolean zG = ejwiVar.g();
                                            fecg fecgVar2 = fecgVar;
                                            if (!zG) {
                                                return (feck) fecgVar2.build();
                                            }
                                            for (dzgj dzgjVar : ((dzgs) ejwiVar.c()).e) {
                                                int i8 = dzgjVar.b;
                                                int i9 = 3;
                                                boolean z2 = true;
                                                int i10 = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                if (i10 == 0) {
                                                    throw null;
                                                }
                                                int i11 = i10 - 1;
                                                dznx dznxVar2 = dznxVar;
                                                if (i11 != 0) {
                                                    if (i11 == 1) {
                                                        evvp evvpVar = (i8 == 2 ? (dzgl) dzgjVar.c : dzgl.a).c;
                                                        if (evvpVar == null) {
                                                            evvpVar = evvp.a;
                                                        }
                                                        long jA = evxc.a(evvpVar);
                                                        fecgVar2.copyOnWrite();
                                                        feck feckVar10 = (feck) fecgVar2.instance;
                                                        feck feckVar11 = feck.a;
                                                        feckVar10.b |= 32;
                                                        feckVar10.h = jA;
                                                    } else if (i11 != 2) {
                                                        if (i11 == 3) {
                                                            dzgr dzgrVar = i8 == 4 ? (dzgr) dzgjVar.c : dzgr.a;
                                                            if (((Boolean) dznxVar2.i.b()).booleanValue()) {
                                                                fejj fejjVar = (fejj) fejk.a.createBuilder();
                                                                if (dzgrVar.c.equals(dznxVar2.b.b())) {
                                                                    z = false;
                                                                } else {
                                                                    String str2 = dzgrVar.c;
                                                                    fejjVar.copyOnWrite();
                                                                    fejk fejkVar = (fejk) fejjVar.instance;
                                                                    str2.getClass();
                                                                    fejkVar.b |= 1;
                                                                    fejkVar.c = str2;
                                                                    z = true;
                                                                }
                                                                if (dzgrVar.d != ((Integer) dznxVar2.c.b()).intValue()) {
                                                                    int i12 = dzgrVar.d;
                                                                    fejjVar.copyOnWrite();
                                                                    fejk fejkVar2 = (fejk) fejjVar.instance;
                                                                    fejkVar2.b = 2 | fejkVar2.b;
                                                                    fejkVar2.d = i12;
                                                                    z = true;
                                                                }
                                                                if (dzgrVar.e != ((Integer) dznxVar2.d.b()).intValue()) {
                                                                    int i13 = dzgrVar.e;
                                                                    fejjVar.copyOnWrite();
                                                                    fejk fejkVar3 = (fejk) fejjVar.instance;
                                                                    fejkVar3.b = 4 | fejkVar3.b;
                                                                    fejkVar3.e = i13;
                                                                } else {
                                                                    z2 = z;
                                                                }
                                                                if (dzgrVar.f != Build.VERSION.SDK_INT) {
                                                                    int i14 = dzgrVar.f;
                                                                    fejjVar.copyOnWrite();
                                                                    fejk fejkVar4 = (fejk) fejjVar.instance;
                                                                    fejkVar4.b |= 8;
                                                                    fejkVar4.f = i14;
                                                                } else if (z2) {
                                                                }
                                                                fejk fejkVar5 = (fejk) fejjVar.build();
                                                                fecgVar2.copyOnWrite();
                                                                feck feckVar12 = (feck) fecgVar2.instance;
                                                                feck feckVar13 = feck.a;
                                                                fejkVar5.getClass();
                                                                feckVar12.o = fejkVar5;
                                                                feckVar12.b |= 4096;
                                                            }
                                                        }
                                                    } else if ((((feck) fecgVar2.instance).b & 512) != 0 && ((Boolean) dznxVar2.j.b()).booleanValue()) {
                                                        dzgp dzgpVar = dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a;
                                                        fcsu fcsuVar4 = dznxVar2.l;
                                                        List list = dzgpVar.c;
                                                        if (((Long) fcsuVar4.b()).longValue() >= 0) {
                                                            Instant instantMinusSeconds = Instant.ofEpochMilli(((feck) fecgVar2.instance).g).minusSeconds(((Long) fcsuVar4.b()).longValue());
                                                            evvp evvpVar2 = (dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).d;
                                                            if (evvpVar2 == null) {
                                                                evvpVar2 = evvp.a;
                                                            }
                                                            if (!evwz.d(evvpVar2).isBefore(instantMinusSeconds)) {
                                                            }
                                                        }
                                                        fcsu fcsuVar5 = dznxVar2.k;
                                                        if (((Long) fcsuVar5.b()).longValue() >= 0) {
                                                            final Instant instantMinusSeconds2 = Instant.ofEpochMilli(((feck) fecgVar2.instance).g).minusSeconds(((Long) fcsuVar5.b()).longValue());
                                                            Stream streamFilter = Collection.EL.stream(list).filter(new Predicate() { // from class: dznv
                                                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                                                    return Predicate$CC.$default$and(this, predicate);
                                                                }

                                                                @Override // java.util.function.Predicate
                                                                /* renamed from: negate */
                                                                public final /* synthetic */ Predicate mo538negate() {
                                                                    return Predicate$CC.$default$negate(this);
                                                                }

                                                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                                                    return Predicate$CC.$default$or(this, predicate);
                                                                }

                                                                @Override // java.util.function.Predicate
                                                                public final boolean test(Object obj2) {
                                                                    Instant instantD;
                                                                    feji fejiVar = (feji) obj2;
                                                                    int i15 = fejiVar.c;
                                                                    if (i15 == 1) {
                                                                        evvp evvpVar3 = ((fegm) fejiVar.d).g;
                                                                        if (evvpVar3 == null) {
                                                                            evvpVar3 = evvp.a;
                                                                        }
                                                                        instantD = evwz.d(evvpVar3);
                                                                    } else {
                                                                        evvp evvpVar4 = (i15 == 3 ? (fejw) fejiVar.d : fejw.a).e;
                                                                        if (evvpVar4 == null) {
                                                                            evvpVar4 = evvp.a;
                                                                        }
                                                                        instantD = evwz.d(evvpVar4);
                                                                    }
                                                                    return instantD.isAfter(instantMinusSeconds2);
                                                                }
                                                            });
                                                            int i15 = ekgb.d;
                                                            list = (List) streamFilter.collect(ekcv.a);
                                                        }
                                                        long jLongValue = ((Long) dznxVar2.m.b()).longValue();
                                                        long jLongValue2 = ((Long) dznxVar2.n.b()).longValue();
                                                        Iterator it2 = list.iterator();
                                                        boolean z3 = false;
                                                        boolean z4 = false;
                                                        while (it2.hasNext()) {
                                                            int i16 = ((feji) it2.next()).c;
                                                            z3 |= i16 == 1;
                                                            z4 |= i16 == 3;
                                                        }
                                                        if (z3 && z4) {
                                                            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceMetrics", 61, "TraceFilter.java")).q("TraceMetric list contains both Trace and TraceRecord");
                                                            int i17 = ekgb.d;
                                                            ekgbVarA = ekoe.a;
                                                        } else if (z3) {
                                                            Stream map = Collection.EL.stream(list).map(new Function() { // from class: dzhq
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj2) {
                                                                    feji fejiVar = (feji) obj2;
                                                                    return new dzhu(fejiVar, dzht.b(fejiVar.c == 1 ? (fegm) fejiVar.d : fegm.a));
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            });
                                                            int i18 = ekgb.d;
                                                            ekgbVarA = dzhx.a((List) map.collect(ekcv.a), jLongValue, jLongValue2);
                                                        } else if (z4) {
                                                            Stream map2 = Collection.EL.stream(list).map(new Function() { // from class: dzhs
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj2) {
                                                                    feji fejiVar = (feji) obj2;
                                                                    return new dzhu(fejiVar, dzhv.b(fejiVar.c == 3 ? (fejw) fejiVar.d : fejw.a));
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            });
                                                            int i19 = ekgb.d;
                                                            ekgbVarA = dzhx.a((List) map2.collect(ekcv.a), jLongValue, jLongValue2);
                                                        } else {
                                                            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceMetrics", 71, "TraceFilter.java")).q("TraceMetric list contains neither Trace nor TraceRecord");
                                                            int i20 = ekgb.d;
                                                            ekgbVarA = ekoe.a;
                                                        }
                                                        if (!ekgbVarA.isEmpty()) {
                                                            feja fejaVar = (feja) fejc.a.createBuilder();
                                                            fejaVar.copyOnWrite();
                                                            fejc fejcVar = (fejc) fejaVar.instance;
                                                            evtg evtgVar = fejcVar.c;
                                                            if (!evtgVar.c()) {
                                                                fejcVar.c = evsn.mutableCopy(evtgVar);
                                                            }
                                                            evpz.addAll(ekgbVarA, fejcVar.c);
                                                            evvp evvpVar3 = (dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).d;
                                                            if (evvpVar3 == null) {
                                                                evvpVar3 = evvp.a;
                                                            }
                                                            fejaVar.copyOnWrite();
                                                            fejc fejcVar2 = (fejc) fejaVar.instance;
                                                            evvpVar3.getClass();
                                                            fejcVar2.d = evvpVar3;
                                                            fejcVar2.b |= 1;
                                                            int iA = dzgo.a((dzgjVar.b == 3 ? (dzgp) dzgjVar.c : dzgp.a).e);
                                                            if (iA == 0) {
                                                                iA = 1;
                                                            }
                                                            int i21 = iA - 1;
                                                            if (i21 == 0) {
                                                                i9 = 1;
                                                            } else if (i21 == 1) {
                                                                i9 = 2;
                                                            }
                                                            fejaVar.copyOnWrite();
                                                            fejc fejcVar3 = (fejc) fejaVar.instance;
                                                            fejcVar3.e = i9 - 1;
                                                            fejcVar3.b |= 2;
                                                            fejc fejcVar4 = (fejc) fejaVar.build();
                                                            fecgVar2.copyOnWrite();
                                                            feck feckVar14 = (feck) fecgVar2.instance;
                                                            fejcVar4.getClass();
                                                            feckVar14.n = fejcVar4;
                                                            feckVar14.b |= 2048;
                                                        }
                                                    }
                                                } else if ((((feck) fecgVar2.instance).b & 1024) != 0) {
                                                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ApplicationExitInfoCaptureImpl.java")).q("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                } else {
                                                    feeg feegVar = i8 == 1 ? (feeg) dzgjVar.c : feeg.a;
                                                    fecgVar2.copyOnWrite();
                                                    feck feckVar15 = (feck) fecgVar2.instance;
                                                    feegVar.getClass();
                                                    feckVar15.m = feegVar;
                                                    feckVar15.b |= 1024;
                                                }
                                            }
                                            return (feck) fecgVar2.build();
                                        }
                                    }, eoqg.a));
                                    ekfwVar3 = ekfwVar;
                                    string = str;
                                    j2 = j;
                                }
                                ListenableFuture listenableFutureE2 = eork.e(ekfwVar3.g());
                                ejvr ejvrVar2 = new ejvr() { // from class: dznw
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        return ekgb.n((List) obj);
                                    }
                                };
                                eoqg eoqgVar2 = eoqg.a;
                                return eooq.g(eooq.f(listenableFutureE2, ejvrVar2, eoqgVar2), new eooz() { // from class: dznz
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj) {
                                        final ekgb ekgbVar = (ekgb) obj;
                                        if (ekgbVar.isEmpty()) {
                                            return eorv.a;
                                        }
                                        final dzof dzofVar4 = dzofVar3;
                                        feco fecoVar = (feco) dzofVar4.h.b();
                                        fecl feclVar = (fecl) fecm.a.createBuilder();
                                        int size = ekgbVar.size();
                                        feclVar.copyOnWrite();
                                        fecm fecmVar = (fecm) feclVar.instance;
                                        fecmVar.b |= 2;
                                        fecmVar.e = size;
                                        feclVar.copyOnWrite();
                                        fecm fecmVar2 = (fecm) feclVar.instance;
                                        fecoVar.getClass();
                                        fecmVar2.d = fecoVar;
                                        fecmVar2.b |= 1;
                                        HashSet hashSet = new HashSet();
                                        for (int i52 = 0; i52 < fecoVar.b.size(); i52++) {
                                            int iA = fecj.a(fecoVar.b.d(i52));
                                            if (iA == 0) {
                                                iA = 1;
                                            }
                                            hashSet.add(Integer.valueOf(iA - 1));
                                        }
                                        int size2 = ekgbVar.size();
                                        for (int i62 = 0; i62 < size2; i62++) {
                                            feck feckVar10 = (feck) ekgbVar.get(i62);
                                            int iA2 = fecj.a(feckVar10.d);
                                            if (iA2 == 0) {
                                                iA2 = 1;
                                            }
                                            if (hashSet.contains(Integer.valueOf(iA2 - 1))) {
                                                feclVar.copyOnWrite();
                                                fecm fecmVar3 = (fecm) feclVar.instance;
                                                feckVar10.getClass();
                                                evtg evtgVar = fecmVar3.c;
                                                if (!evtgVar.c()) {
                                                    fecmVar3.c = evsn.mutableCopy(evtgVar);
                                                }
                                                fecmVar3.c.add(feckVar10);
                                            }
                                        }
                                        fecm fecmVar4 = (fecm) feclVar.build();
                                        dzlm dzlmVar = dzofVar4.a;
                                        dzle dzleVarN = dzlf.n();
                                        feiw feiwVar = (feiw) feix.a.createBuilder();
                                        feiwVar.copyOnWrite();
                                        feix feixVar = (feix) feiwVar.instance;
                                        fecmVar4.getClass();
                                        feixVar.q = fecmVar4;
                                        feixVar.b |= 131072;
                                        dzleVarN.f((feix) feiwVar.build());
                                        return eooq.f(dzlmVar.b(dzleVarN.a()), new ejvr() { // from class: dzod
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object v) {
                                                /*
                                                    this = this;
                                                    java.lang.Void r7 = (java.lang.Void) r7
                                                    ekgb r7 = r2
                                                    r0 = 0
                                                    java.lang.Object r7 = r7.get(r0)
                                                    feck r7 = (defpackage.feck) r7
                                                Lb:
                                                    dzof r1 = r1
                                                    java.lang.String r2 = r7.c
                                                    long r3 = r7.g
                                                    fcsu r1 = r1.d
                                                    java.lang.Object r1 = r1.b()
                                                    android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
                                                    android.content.SharedPreferences$Editor r1 = r1.edit()
                                                    java.lang.String r5 = "lastExitProcessName"
                                                    android.content.SharedPreferences$Editor r1 = r1.putString(r5, r2)
                                                    java.lang.String r2 = "lastExitTimestamp"
                                                    android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)
                                                    boolean r1 = r1.commit()
                                                    if (r1 != 0) goto L4f
                                                    int r0 = r0 + 1
                                                    r1 = 3
                                                    if (r0 < r1) goto Lb
                                                    ekrg r7 = defpackage.dzfq.a
                                                    ekrw r7 = r7.j()
                                                    ekrd r7 = (defpackage.ekrd) r7
                                                    r0 = 220(0xdc, float:3.08E-43)
                                                    java.lang.String r1 = "ApplicationExitMetricServiceImpl.java"
                                                    java.lang.String r2 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
                                                    java.lang.String r3 = "updateLastRecordedAppExit"
                                                    ekrw r7 = r7.h(r2, r3, r0, r1)
                                                    ekrd r7 = (defpackage.ekrd) r7
                                                    java.lang.String r0 = "Failed to persist most recent App Exit"
                                                    r7.q(r0)
                                                L4f:
                                                    r7 = 0
                                                    return r7
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.dzod.apply(java.lang.Object):java.lang.Object");
                                            }
                                        }, dzofVar4.c);
                                    }
                                }, eoqgVar2);
                            }
                        }, dzofVar2.c);
                    }
                });
            }
        };
        Executor executor = this.c;
        eork.n(eooyVar, executor);
        eork.l(new Runnable() { // from class: dzoa
            @Override // java.lang.Runnable
            public final void run() {
                dzof dzofVar = this.a;
                if (((Boolean) dzofVar.i.b()).booleanValue()) {
                    dzofVar.e.b();
                }
                final dzhk dzhkVar = dzofVar.j;
                if (((Boolean) dzhkVar.c.b()).booleanValue()) {
                    double dLongValue = ((Long) dzhkVar.d.b()).longValue();
                    Random random = dzhkVar.b;
                    fcsu fcsuVar = dzhkVar.e;
                    dzhkVar.a.scheduleWithFixedDelay(new Runnable() { // from class: dzhj
                        @Override // java.lang.Runnable
                        public final void run() {
                            dzhkVar.f.a(2);
                        }
                    }, Math.round(dLongValue + (random.nextDouble() * ((Long) fcsuVar.b()).longValue())), ((Long) fcsuVar.b()).longValue(), TimeUnit.MILLISECONDS);
                }
            }
        }, executor);
    }
}
