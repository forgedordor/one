package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdi implements drcx {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl");
    public static final ekhx b = ekhx.r(ewut.GELLER_CONFIG, ewut.PRIVACY_SETTINGS);
    public final ejwi c;
    public final Geller d;
    public final eway e;
    public final ejvr f;
    public final drcp g;
    public final Context h;
    public final ExecutorService j;
    private final ejya p;
    private final ExecutorService q;
    public final Object k = new Object();
    public boolean i = false;
    final Map l = new HashMap();
    final Map m = new HashMap();
    final Map n = new HashMap();
    final Map o = new HashMap();

    public drdi(ejwi ejwiVar, Geller geller, duzr duzrVar, String str, ejvr ejvrVar, Set set, ejvr ejvrVar2, evrj evrjVar, Boolean bool, drbc drbcVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, ejya ejyaVar, ejwi ejwiVar2, ejwi ejwiVar3, Context context) {
        this.c = ejwiVar;
        this.d = geller;
        this.e = geller.e;
        this.f = ejvrVar2;
        this.p = ejyaVar;
        this.j = executorService;
        this.q = executorService2;
        this.h = context;
        this.g = new drcp(ejwiVar, geller, str, ejvrVar, set, ejvrVar2, evrjVar, bool, drbcVar, executorService, executorService2, executorService3, map, ejyaVar);
    }

    public static ekhx b(ekhx ekhxVar, dqzt dqztVar) {
        ekhv ekhvVar = new ekhv();
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ewut ewutVar = (ewut) ekqgVarListIterator.next();
            if (dqztVar.a(ewutVar)) {
                ekhvVar.c(ewutVar);
            } else {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "filterEnabled", 811, "GellerSyncSchedulerImpl.java")).t("Corpus: %s is disabled", ewutVar.name());
            }
        }
        return ekhvVar.g();
    }

    private final synchronized ListenableFuture d(final String str, final String str2, final String str3, ejwi ejwiVar) {
        if (this.i) {
            return eork.i(true);
        }
        ekgi ekgiVar = new ekgi();
        ekqg ekqgVarListIterator = b.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ewut ewutVar = (ewut) ekqgVarListIterator.next();
            Geller geller = this.d;
            String strB = drds.b(this.c);
            excw excwVar = excw.a;
            exca excaVarA = dqzu.a();
            ewbf ewbfVar = (ewbf) ewbk.a.createBuilder();
            ewbfVar.copyOnWrite();
            ewbk ewbkVar = (ewbk) ewbfVar.instance;
            ewbkVar.b |= 1;
            ewbkVar.e = 1;
            ekgiVar.i(ewutVar, eika.k(geller.d(strB, ewutVar, (ewbk) ewbfVar.build(), excwVar, excaVarA), new eooz() { // from class: drdc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ekrg ekrgVar = drdi.a;
                    return eork.i(Boolean.valueOf(((ewbm) obj).b.size() > 0));
                }
            }, this.j));
        }
        final ekgp ekgpVarC = ekgiVar.c();
        ListenableFuture listenableFutureA = eika.c(ekgpVarC.values()).a(new Callable() { // from class: drdo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekgi ekgiVar2 = new ekgi();
                for (Map.Entry entry : ((ekgp) ekgpVarC).entrySet()) {
                    ekgiVar2.i(entry.getKey(), eork.q((Future) entry.getValue()));
                }
                return ekgiVar2.b();
            }
        }, this.q);
        eooz eoozVar = new eooz() { // from class: drcz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrg ekrgVar = drdi.a;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        ((ekrd) ((ekrd) drdi.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkRequiredCorporaExist", 449, "GellerSyncSchedulerImpl.java")).t("Required corpus %s missing", ((ewut) entry.getKey()).name());
                        return eork.i(false);
                    }
                }
                return eork.i(true);
            }
        };
        ExecutorService executorService = this.j;
        return eika.k(eika.k(listenableFutureA, eoozVar, executorService), new eooz() { // from class: drdb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final drdi drdiVar = this.a;
                if (zBooleanValue) {
                    drdiVar.i = true;
                    return eork.i(true);
                }
                String str4 = str3;
                return eika.k(drdiVar.c(str, str2, str4, "geller_internal", drdi.b, ewvn.DOWNLOAD_REQUIRED_CORPORA, 4, 2, false), new eooz() { // from class: drda
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ekqg ekqgVarListIterator2 = ((ekgp) obj2).entrySet().listIterator();
                        while (ekqgVarListIterator2.hasNext()) {
                            Map.Entry entry = (Map.Entry) ekqgVarListIterator2.next();
                            drdm drdmVar = (drdm) entry.getValue();
                            if (!drdmVar.b().isEmpty()) {
                                ((ekrd) ((ekrd) drdi.a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkAndSyncRequiredCorpora", 409, "GellerSyncSchedulerImpl.java")).D("Failed to download required corpus: %s with failures %s", ((ewut) entry.getKey()).name(), drdmVar.b());
                                return eork.i(false);
                            }
                        }
                        drdiVar.i = true;
                        return eork.i(true);
                    }
                }, drdiVar.j);
            }
        }, executorService);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:9:0x0029, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0043, B:18:0x0045, B:20:0x004d, B:21:0x0053, B:23:0x0055, B:25:0x005b, B:27:0x0063, B:28:0x0069, B:30:0x006b, B:32:0x0071, B:34:0x0079, B:35:0x007f, B:37:0x0081, B:38:0x009e), top: B:50:0x0029, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture e(final defpackage.ewuj r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r10.k
            monitor-enter(r1)
            ekfw r2 = new ekfw     // Catch: java.lang.Throwable -> Le6
            r2.<init>()     // Catch: java.lang.Throwable -> Le6
            evsz r3 = new evsz     // Catch: java.lang.Throwable -> Le6
            evsx r4 = r11.d     // Catch: java.lang.Throwable -> Le6
            evsy r5 = defpackage.ewuj.a     // Catch: java.lang.Throwable -> Le6
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Le6
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le6
        L1a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Le6
            if (r4 == 0) goto La7
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Le6
            ewut r4 = (defpackage.ewut) r4     // Catch: java.lang.Throwable -> Le6
            java.lang.String r5 = "GellerSyncSchedulerImpl.java"
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Le6
            java.util.Map r6 = r10.l     // Catch: java.lang.Throwable -> La4
            boolean r7 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 != 0) goto L45
            java.util.Map r7 = r10.n     // Catch: java.lang.Throwable -> La4
            boolean r7 = r7.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 != 0) goto L45
            java.util.Map r7 = r10.o     // Catch: java.lang.Throwable -> La4
            boolean r7 = r7.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 != 0) goto L45
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.eorv.a     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            goto L9f
        L45:
            java.util.Map r7 = r10.o     // Catch: java.lang.Throwable -> La4
            boolean r8 = r7.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L55
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> La4
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            goto L9f
        L55:
            boolean r7 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L6b
            java.util.Map r7 = r10.n     // Catch: java.lang.Throwable -> La4
            boolean r7 = r7.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 != 0) goto L6b
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> La4
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            goto L9f
        L6b:
            boolean r6 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L81
            java.util.Map r6 = r10.n     // Catch: java.lang.Throwable -> La4
            boolean r7 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L81
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> La4
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            goto L9f
        L81:
            ekrg r6 = defpackage.drdi.a     // Catch: java.lang.Throwable -> La4
            ekrw r6 = r6.j()     // Catch: java.lang.Throwable -> La4
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = "com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl"
            java.lang.String r8 = "getExistingGellerSyncForBatchSync"
            r9 = 903(0x387, float:1.265E-42)
            ekrw r5 = r6.h(r7, r8, r9, r5)     // Catch: java.lang.Throwable -> La4
            ekrd r5 = (defpackage.ekrd) r5     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = "There was a scheduling bug where 2 syncs ran concurrently for corpus: %s"
            int r4 = r4.dC     // Catch: java.lang.Throwable -> La4
            r5.r(r6, r4)     // Catch: java.lang.Throwable -> La4
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.eorv.a     // Catch: java.lang.Throwable -> La4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
        L9f:
            r2.h(r4)     // Catch: java.lang.Throwable -> Le6
            goto L1a
        La4:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            throw r11     // Catch: java.lang.Throwable -> Le6
        La7:
            r3 = 2
            com.google.common.util.concurrent.ListenableFuture[] r3 = new com.google.common.util.concurrent.ListenableFuture[r3]     // Catch: java.lang.Throwable -> Le6
            ekgb r2 = r2.g()     // Catch: java.lang.Throwable -> Le6
            com.google.common.util.concurrent.ListenableFuture r2 = defpackage.eork.e(r2)     // Catch: java.lang.Throwable -> Le6
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> Le6
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.e(r0)     // Catch: java.lang.Throwable -> Le6
            r2 = 1
            r3[r2] = r0     // Catch: java.lang.Throwable -> Le6
            eorg r0 = defpackage.eork.b(r3)     // Catch: java.lang.Throwable -> Le6
            drdf r3 = new drdf     // Catch: java.lang.Throwable -> Le6
            r3.<init>()     // Catch: java.lang.Throwable -> Le6
            eooy r3 = defpackage.eiid.c(r3)     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.ExecutorService r5 = r10.j     // Catch: java.lang.Throwable -> Le6
            com.google.common.util.concurrent.ListenableFuture r0 = r0.b(r3, r5)     // Catch: java.lang.Throwable -> Le6
            com.google.common.util.concurrent.ListenableFuture[] r2 = new com.google.common.util.concurrent.ListenableFuture[r2]     // Catch: java.lang.Throwable -> Le6
            r2[r4] = r0     // Catch: java.lang.Throwable -> Le6
            eorg r2 = defpackage.eork.b(r2)     // Catch: java.lang.Throwable -> Le6
            drdg r3 = new drdg     // Catch: java.lang.Throwable -> Le6
            r3.<init>()     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.Callable r11 = defpackage.eiid.l(r3)     // Catch: java.lang.Throwable -> Le6
            com.google.common.util.concurrent.ListenableFuture r11 = r2.a(r11, r5)     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le6
            return r11
        Le6:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le6
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drdi.e(ewuj):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.drcx
    public final ListenableFuture a(final String str, final String str2, final String str3, final ekhx ekhxVar, final ewvn ewvnVar, final int i, ejwi ejwiVar) {
        eway ewayVar = this.e;
        return (ewayVar.j.size() == 0 || !ekhxVar.equals(ekhx.r(ewut.GELLER_CONFIG, ewut.PRIVACY_SETTINGS))) ? ewayVar.e ? eika.k(d(str, str2, str3, ejwiVar), new eooz() { // from class: drcy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eork.h(new GellerException(10, "Unable to download Geller required corpora.", (byte[]) null));
                }
                int i2 = i;
                ewvn ewvnVar2 = ewvnVar;
                ekhx ekhxVar2 = ekhxVar;
                String str4 = str3;
                String str5 = str2;
                String str6 = str;
                drdi drdiVar = this.a;
                return drdiVar.c(str6, str5, str4, null, drdi.b(ekhxVar2, drds.a(drdiVar.f, null)), ewvnVar2, i2, 4, true);
            }
        }, this.j) : c(str, str2, str3, null, b(ekhxVar, drds.a(this.f, null)), ewvnVar, i, 4, true) : eika.k(c(str, str2, str3, null, ekhxVar, ewvnVar, i, 4, true), new eooz() { // from class: drdh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:162:0x02ea  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x02f6  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0336 A[Catch: evtj -> 0x033f, evtj | ExecutionException -> 0x0341, TRY_ENTER, TryCatch #5 {evtj | ExecutionException -> 0x0341, blocks: (B:23:0x00b4, B:25:0x00d3, B:27:0x00e0, B:28:0x00e2, B:172:0x0336, B:173:0x033e), top: B:185:0x00b4 }] */
            /* JADX WARN: Removed duplicated region for block: B:196:0x0303 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[LOOP:0: B:19:0x0095->B:21:0x009b, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00d3 A[Catch: evtj -> 0x033f, evtj | ExecutionException -> 0x0341, TryCatch #5 {evtj | ExecutionException -> 0x0341, blocks: (B:23:0x00b4, B:25:0x00d3, B:27:0x00e0, B:28:0x00e2, B:172:0x0336, B:173:0x033e), top: B:185:0x00b4 }] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
            @Override // defpackage.eooz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r27) throws com.google.android.libraries.geller.portable.GellerException {
                /*
                    Method dump skipped, instructions count: 966
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.drdh.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.j);
    }

    public final ListenableFuture c(String str, String str2, String str3, String str4, final ekhx ekhxVar, ewvn ewvnVar, int i, int i2, boolean z) {
        ListenableFuture listenableFutureF;
        final HashMap map = new HashMap();
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            map.put((ewut) ekqgVarListIterator.next(), ejxm.c(this.p));
        }
        ejwi ejwiVar = this.c;
        if (ejwiVar.g() && ejwk.c(str)) {
            return eork.h(new IllegalArgumentException("Empty auth token"));
        }
        if (!ejwiVar.g() && ejwk.c(str3)) {
            return eork.h(new IllegalArgumentException("Empty api key"));
        }
        if (ekhxVar.isEmpty()) {
            return eork.i(ekoj.a);
        }
        HashSet hashSet = new HashSet();
        synchronized (this.k) {
            TreeSet treeSet = new TreeSet();
            ekqg ekqgVarListIterator2 = ekhxVar.listIterator();
            while (ekqgVarListIterator2.hasNext()) {
                ewut ewutVar = (ewut) ekqgVarListIterator2.next();
                Map map2 = this.m;
                if (map2.containsKey(ewutVar)) {
                    ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 500, "GellerSyncSchedulerImpl.java")).t("Returning existing pending sync for corpus: %s", ewutVar.name());
                    hashSet.add((ListenableFuture) map2.get(ewutVar));
                } else if (this.l.containsKey(ewutVar)) {
                    ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 506, "GellerSyncSchedulerImpl.java")).t("Scheduling a pending batch sync for corpus: %s", ewutVar.name());
                    ewui ewuiVar = (ewui) ewuj.b.createBuilder();
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar = (ewuj) ewuiVar.instance;
                    ewutVar.getClass();
                    ewujVar.a();
                    ewujVar.d.h(ewutVar.dC);
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar2 = (ewuj) ewuiVar.instance;
                    ewujVar2.f = ewvnVar.h;
                    ewujVar2.c |= 2;
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar3 = (ewuj) ewuiVar.instance;
                    ewujVar3.g = i - 1;
                    ewujVar3.c |= 4;
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar4 = (ewuj) ewuiVar.instance;
                    ewujVar4.h = i2 - 1;
                    ewujVar4.c |= 8;
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar5 = (ewuj) ewuiVar.instance;
                    ewujVar5.c |= 16;
                    ewujVar5.i = z;
                    String strB = ejwk.b(str);
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar6 = (ewuj) ewuiVar.instance;
                    ewujVar6.c |= 32;
                    ewujVar6.j = strB;
                    String strB2 = ejwk.b(str2);
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar7 = (ewuj) ewuiVar.instance;
                    ewujVar7.c |= 64;
                    ewujVar7.k = strB2;
                    String strB3 = ejwk.b(str3);
                    ewuiVar.copyOnWrite();
                    ewuj ewujVar8 = (ewuj) ewuiVar.instance;
                    ewujVar8.c |= 128;
                    ewujVar8.l = strB3;
                    if (str4 != null) {
                        ewuiVar.copyOnWrite();
                        ewuj ewujVar9 = (ewuj) ewuiVar.instance;
                        ewujVar9.c |= 1;
                        ewujVar9.e = str4;
                    }
                    ListenableFuture listenableFutureE = e((ewuj) ewuiVar.build());
                    map2.put(ewutVar, listenableFutureE);
                    hashSet.add(listenableFutureE);
                } else {
                    treeSet.add(ewutVar);
                }
            }
            if (!treeSet.isEmpty()) {
                ewui ewuiVar2 = (ewui) ewuj.b.createBuilder();
                ewuiVar2.copyOnWrite();
                ewuj ewujVar10 = (ewuj) ewuiVar2.instance;
                ewujVar10.a();
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    ewujVar10.d.h(((ewut) it.next()).dC);
                }
                ewuiVar2.copyOnWrite();
                ewuj ewujVar11 = (ewuj) ewuiVar2.instance;
                ewujVar11.f = ewvnVar.h;
                ewujVar11.c |= 2;
                ewuiVar2.copyOnWrite();
                ewuj ewujVar12 = (ewuj) ewuiVar2.instance;
                ewujVar12.g = i - 1;
                ewujVar12.c |= 4;
                ewuiVar2.copyOnWrite();
                ewuj ewujVar13 = (ewuj) ewuiVar2.instance;
                ewujVar13.h = i2 - 1;
                ewujVar13.c |= 8;
                ewuiVar2.copyOnWrite();
                ewuj ewujVar14 = (ewuj) ewuiVar2.instance;
                ewujVar14.c |= 16;
                ewujVar14.i = z;
                String strB4 = ejwk.b(str);
                ewuiVar2.copyOnWrite();
                ewuj ewujVar15 = (ewuj) ewuiVar2.instance;
                ewujVar15.c |= 32;
                ewujVar15.j = strB4;
                String strB5 = ejwk.b(str2);
                ewuiVar2.copyOnWrite();
                ewuj ewujVar16 = (ewuj) ewuiVar2.instance;
                ewujVar16.c |= 64;
                ewujVar16.k = strB5;
                String strB6 = ejwk.b(str3);
                ewuiVar2.copyOnWrite();
                ewuj ewujVar17 = (ewuj) ewuiVar2.instance;
                ewujVar17.c |= 128;
                ewujVar17.l = strB6;
                if (str4 != null) {
                    ewuiVar2.copyOnWrite();
                    ewuj ewujVar18 = (ewuj) ewuiVar2.instance;
                    ewujVar18.c |= 1;
                    ewujVar18.e = str4;
                }
                hashSet.add(e((ewuj) ewuiVar2.build()));
            }
            listenableFutureF = eooq.f(eork.e(hashSet), eiid.a(new ejvr() { // from class: drde
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgi ekgiVar = new ekgi();
                    for (Map map3 : (List) obj) {
                        for (ewut ewutVar2 : map3.keySet()) {
                            ekhx ekhxVar2 = ekhxVar;
                            if (ekhxVar2.contains(ewutVar2)) {
                                Map map4 = map;
                                ekgiVar.i(ewutVar2, (drdm) map3.get(ewutVar2));
                                ejxm ejxmVar = (ejxm) map4.get(ewutVar2);
                                if (ejxmVar != null) {
                                    ejxmVar.a(TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    }
                    return ekgiVar.c();
                }
            }), this.j);
        }
        return listenableFutureF;
    }
}
