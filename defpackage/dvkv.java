package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvkv implements dvio {
    public static dvkv a;
    public final dvrd b;
    public final dvin c;
    public final dviq d;
    public final dvyx e;
    public final dwcq h;
    public final cdps i;
    private final ConcurrentMap j = new ConcurrentHashMap();
    final ConcurrentMap g = new ConcurrentHashMap();
    public final eosc f = dvie.b().a;

    public dvkv(dvrd dvrdVar, dwcq dwcqVar, dvin dvinVar, dviq dviqVar, dvyx dvyxVar, cdps cdpsVar) {
        this.b = dvrdVar;
        this.h = dwcqVar;
        this.c = dvinVar;
        this.d = dviqVar;
        this.e = dvyxVar;
        this.i = cdpsVar;
    }

    public static String d(dwpk dwpkVar) {
        String str = dwpkVar.d() + "_" + dwpkVar.e() + "_" + dwpkVar.b().name();
        if (!dwpkVar.c().g()) {
            return str;
        }
        return str + "_" + ((String) dwpkVar.c().c());
    }

    private final boolean h(dwje dwjeVar) {
        return eonh.b((byte[]) this.b.d(dwjeVar).a("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY").c()) >= fber.a.get().a();
    }

    private static final boolean i(dwje dwjeVar) {
        return "GMB".equals(dwjeVar.f());
    }

    @Override // defpackage.dvio
    public final void a(final dwje dwjeVar) {
        dvhn.a();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (!"GMM".equals(dwjeVar.f()) && !"GMB".equals(dwjeVar.f())) {
            dvhv.a("LitBstrpCntrl", " Invalid app name.");
            eork.i(null);
            return;
        }
        if (!g(dwjeVar)) {
            dvyy.a(dwjeVar, this.e, 10101, 393);
            dvhv.a("LitBstrpCntrl", " Bootstrap already save timestamp in last 24 hours");
            eork.i(null);
        } else {
            if (!f(dwjeVar)) {
                dvyy.a(dwjeVar, this.e, 10101, 392);
                dvhv.a("LitBstrpCntrl", "bootstrapping already running.");
                eork.i(null);
                return;
            }
            dvhv.a("LitBstrpCntrl", "triggering bootstrap this should be only one ");
            dvyx dvyxVar = this.e;
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.g(10104);
            dvyxVar.b(dwhpVarR.a());
            this.f.submit(new Callable() { // from class: dvkq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ListenableFuture listenableFutureG;
                    final dvkv dvkvVar = this.a;
                    dvrd dvrdVar = dvkvVar.b;
                    final dwje dwjeVar2 = dwjeVar;
                    final dvrf dvrfVarD = dvrdVar.d(dwjeVar2);
                    final dwws dwwsVarB = dvrdVar.b(dwjeVar2);
                    ejwi ejwiVarA = dvrdVar.d(dwjeVar2).a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
                    if (ejwiVarA.g()) {
                        dvhv.a("LitBstrpCntrl", "Latest timestamp already saved previously, continue to use the existing timestamp");
                        ejwi ejwiVarA2 = dvrdVar.d(dwjeVar2).a("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY");
                        long jB = ejwiVarA2.g() ? eonh.b((byte[]) ejwiVarA2.c()) : 0L;
                        long jB2 = eonh.b((byte[]) ejwiVarA.c());
                        dvhn.a();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        dvhv.a("LitBstrpCntrl", a.u(jB, "Got lastCheckBootstrapTimestamp "));
                        dvhv.a("LitBstrpCntrl", "Got latestMessageTimestamp ".concat(ejwiVarA.toString()));
                        dvhv.a("LitBstrpCntrl", a.u(jCurrentTimeMillis2, "Got currentTimestampMills "));
                        dvhv.a("LitBstrpCntrl", "Got Bootstrap threshold  ".concat(String.valueOf(String.valueOf(fbfm.a()))));
                        if (jCurrentTimeMillis2 - jB > fbfm.a() && jCurrentTimeMillis2 - TimeUnit.MICROSECONDS.toMillis(jB2) > fbfm.a()) {
                            ejwi ejwiVarA3 = dvrfVarD.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
                            if (ejwiVarA3.g()) {
                                dvyx dvyxVar2 = dvkvVar.e;
                                dvyy.a(dwjeVar2, dvyxVar2, 10077, 409);
                                long jB3 = eonh.b((byte[]) ejwiVarA3.c());
                                dvxe dvxeVarC = dvxf.c();
                                ((dvxa) dvxeVarC).a = "Check bootstrap necessary";
                                dvxeVarC.b(dvxj.g);
                                dvxf dvxfVarA = dvxeVarC.a();
                                dvhv.a("LitBstrpCntrl", "Start verifying if bootstrap needed with server");
                                dwcq dwcqVar = dvkvVar.h;
                                UUID uuidRandomUUID = UUID.randomUUID();
                                dwfc dwfcVar = new dwfc(jB3, dwjeVar2);
                                dwcm dwcmVar = dwcqVar.a;
                                dwjeVar2 = dwjeVar2;
                                ListenableFuture listenableFutureB = dwcmVar.b(uuidRandomUUID, dwfcVar, dwcmVar.d.a(), dwjeVar2, dvxfVarA, true);
                                dvyy.a(dwjeVar2, dvyxVar2, 10088, 396);
                                listenableFutureG = eooq.g(listenableFutureB, new eooz() { // from class: dvkt
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj) {
                                        dvqr dvqrVar = (dvqr) obj;
                                        dvhn.a();
                                        byte[] bArrD = eonh.d(System.currentTimeMillis());
                                        dvrf dvrfVar = dvrfVarD;
                                        dvrfVar.c("LAST_SERVER_BOOTSTRAP_CHECK_TIMESTAMP_KEY", bArrD);
                                        int iA = dvqrVar.a();
                                        dvkv dvkvVar2 = dvkvVar;
                                        dwje dwjeVar3 = dwjeVar2;
                                        if (iA == 1) {
                                            dwws dwwsVar = dwwsVarB;
                                            dvyx dvyxVar3 = dvkvVar2.e;
                                            dvyy.a(dwjeVar3, dvyxVar3, 10088, 398);
                                            dvrfVar.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", "".getBytes(StandardCharsets.UTF_8));
                                            dvrfVar.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", eonh.d(0L));
                                            dvyy.a(dwjeVar3, dvyxVar3, 10088, 400);
                                            long jB4 = dvqrVar.b();
                                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                            dvhn.a();
                                            int iA2 = dwwsVar.a(jB4, timeUnit.toMicros(System.currentTimeMillis() - fbfm.a.get().c()));
                                            dwhp dwhpVarR2 = dwhq.r();
                                            dwhpVarR2.g(10088);
                                            dwhpVarR2.n(dwjeVar3.c().f());
                                            dwhpVarR2.f(399);
                                            dwib dwibVar = new dwib();
                                            dwibVar.a = ejwi.j(Integer.valueOf(iA2));
                                            dwhpVarR2.b(dwibVar.a());
                                            dvyxVar3.b(dwhpVarR2.a());
                                            dvhv.a("LitBstrpCntrl", "Server check Bootstrap necessary, finish checking deleting latest message timestamp from kv store.");
                                        } else {
                                            dvyy.a(dwjeVar3, dvkvVar2.e, 10088, 397);
                                        }
                                        dvrfVar.b();
                                        dvhv.a("LitBstrpCntrl", "Start downloading conversations.");
                                        return dvkvVar2.b(dwjeVar3);
                                    }
                                }, eoqg.a);
                            } else {
                                dvyy.a(dwjeVar2, dvkvVar.e, 10102, 394);
                                dvzt dvztVar = new dvzt();
                                dvztVar.c(false);
                                dvztVar.b(0);
                                listenableFutureG = eork.i(dvztVar.a());
                                dwjeVar2 = dwjeVar2;
                            }
                            eork.r(listenableFutureG, new dvku(dvkvVar, dwjeVar2, jCurrentTimeMillis), dvkvVar.f);
                            return null;
                        }
                        dwjeVar2 = dwjeVar2;
                    } else {
                        dvhv.f("LitBstrpCntrl", "No latest message timestamp found in key value store.");
                    }
                    dvyy.a(dwjeVar2, dvkvVar.e, 10077, 395);
                    dvhv.a("LitBstrpCntrl", "Local check bootstrap not necessary, finish checking deleting latest message timestamp from kv store.");
                    dvrfVarD.b();
                    listenableFutureG = dvkvVar.b(dwjeVar2);
                    eork.r(listenableFutureG, new dvku(dvkvVar, dwjeVar2, jCurrentTimeMillis), dvkvVar.f);
                    return null;
                }
            });
        }
    }

    final ListenableFuture b(final dwje dwjeVar) {
        ejwi ejwiVarA = this.b.d(dwjeVar).a("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY");
        if (!ejwiVarA.g() || "BOOTSTRAP_TOKEN_FINISH_VALUE".equals(new String((byte[]) ejwiVarA.c()))) {
            if (!ejwiVarA.g()) {
                dvyy.a(dwjeVar, this.e, 10099, 403);
            }
            dvzt dvztVar = new dvzt();
            dvztVar.c(true);
            dvztVar.b(0);
            return eork.i(dvztVar.a());
        }
        if (i(dwjeVar) && h(dwjeVar)) {
            dvzt dvztVar2 = new dvzt();
            dvztVar2.c(true);
            dvztVar2.b(0);
            return eork.i(dvztVar2.a());
        }
        String str = new String((byte[]) ejwiVarA.c());
        dvyy.a(dwjeVar, this.e, 10099, true != str.isEmpty() ? 402 : 401);
        dvhv.a("LitBstrpCntrl", "Start downloading conversation with token ".concat(true != str.isEmpty() ? str : "inital token"));
        return eooq.f(c(dwjeVar, str, true, 0), new ejvr() { // from class: dvks
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dwaq dwaqVar = (dwaq) obj;
                if (dwaqVar.b()) {
                    dwje dwjeVar2 = dwjeVar;
                    dvkv dvkvVar = this.a;
                    dvyy.a(dwjeVar2, dvkvVar.e, 10099, 404);
                    dvhv.a("LitBstrpCntrl", "start syncing block list.");
                    dvkvVar.c.a(dwjeVar2);
                }
                return dwaqVar;
            }
        }, this.f);
    }

    public final ListenableFuture c(final dwje dwjeVar, String str, boolean z, final int i) {
        if ("BOOTSTRAP_TOKEN_FINISH_VALUE".equals(str) || (TextUtils.isEmpty(str) && !z)) {
            dvzt dvztVar = new dvzt();
            dvztVar.b(i);
            dvztVar.c(true);
            return eork.i(dvztVar.a());
        }
        if (i(dwjeVar) && h(dwjeVar)) {
            dvzt dvztVar2 = new dvzt();
            dvztVar2.b(i);
            dvztVar2.c(true);
            return eork.i(dvztVar2.a());
        }
        dvxe dvxeVarC = dvxf.c();
        ((dvxa) dvxeVarC).a = "Bootstrap List Conversations";
        dvxeVarC.b(dvxj.g);
        dvxf dvxfVarA = dvxeVarC.a();
        dwcq dwcqVar = this.h;
        int iB = (int) fbfm.a.get().b();
        Context context = dwcqVar.b;
        Map map = dwcqVar.d;
        dvyx dvyxVar = dwcqVar.c;
        UUID uuidRandomUUID = UUID.randomUUID();
        dwfn dwfnVar = new dwfn(dwjeVar, iB, str, context, map, dvyxVar);
        dwcm dwcmVar = dwcqVar.a;
        return eooq.g(dwcmVar.b(uuidRandomUUID, dwfnVar, dwcmVar.d.a(), dwjeVar, dvxfVarA, true), new eooz() { // from class: dvkr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dvqs dvqsVar = (dvqs) obj;
                int size = dvqsVar.a().size() + i;
                dvkv dvkvVar = this.a;
                dvrd dvrdVar = dvkvVar.b;
                final dwje dwjeVar2 = dwjeVar;
                dwws dwwsVarB = dvrdVar.b(dwjeVar2);
                dvrf dvrfVarD = dvrdVar.d(dwjeVar2);
                ekgb ekgbVarA = dvqsVar.a();
                int size2 = ekgbVarA.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dwpa dwpaVar = (dwpa) ekgbVarA.get(i2);
                    dwpc[] dwpcVarArr = new dwpc[((ekoe) ((dwmt) dwpaVar.a()).a).c];
                    for (int i3 = 0; i3 < ((ekoe) ((dwmt) dwpaVar.a()).a).c; i3++) {
                        dwpcVarArr[i3] = (dwpc) ((dwmt) dwpaVar.a()).a.get(i3);
                    }
                    dwwsVarB.U(dwpaVar.b(), dwpcVarArr);
                    dwpx dwpxVarB = dwpaVar.b();
                    dwpu dwpuVar = dwpu.GROUP;
                    String strB = dwpuVar.equals(dwpxVarB.e()) ? dwpxVarB.d().b() : dvkv.d(dwpxVarB.c());
                    String str2 = dvkv.d(((dwis) dwpxVarB).a) + "_" + strB + "_" + dwpxVarB.e().name() + "_";
                    if (dwpuVar.equals(dwpxVarB.e())) {
                        str2 = str2 + dwpxVarB.d().a() + "_" + dwpxVarB.d().b();
                    }
                    int i4 = elcz.a;
                    dvrfVarD.c("BOOTSTRAP_DOWNLOAD_MESSAGES_TOKEN_KEY_PREFIX_".concat(elcx.a.c(str2, StandardCharsets.UTF_8).toString()), "".getBytes(StandardCharsets.UTF_8));
                    dviq dviqVar = dvkvVar.d;
                    final dwpx dwpxVarB2 = dwpaVar.b();
                    final SettableFuture settableFutureCreate = SettableFuture.create();
                    final dvop dvopVar = (dvop) dviqVar;
                    eork.m(new Callable() { // from class: dvmz
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final dvop dvopVar2 = dvopVar;
                            final dwje dwjeVar3 = dwjeVar2;
                            dwws dwwsVarL = dvopVar2.l(dwjeVar3);
                            final dwpx dwpxVar = dwpxVarB2;
                            dwwy dwwyVarQ = dwwsVarL.q(dwpxVar);
                            final SettableFuture settableFuture = settableFutureCreate;
                            dwwyVarQ.k(new dwwx() { // from class: dvmk
                                @Override // defpackage.dwwx
                                public final void a(Object obj2) {
                                    ejwi ejwiVar = (ejwi) obj2;
                                    boolean zG = ejwiVar.g();
                                    SettableFuture settableFuture2 = settableFuture;
                                    if (zG) {
                                        dvhn.a();
                                        if (System.currentTimeMillis() <= ((dwpo) ejwiVar.c()).b()) {
                                            settableFuture2.set((dwpo) ejwiVar.c());
                                            return;
                                        }
                                    }
                                    dwpx dwpxVar2 = dwpxVar;
                                    dwje dwjeVar4 = dwjeVar3;
                                    dvop dvopVar3 = dvopVar2;
                                    dwpn dwpnVarR = dwpo.r();
                                    dwpnVarR.f(dwpxVar2);
                                    dwpnVarR.h(-1L);
                                    dwpnVarR.b(new HashMap());
                                    dwpnVarR.c(dwpxVar2.e() == dwpu.ONE_TO_ONE);
                                    settableFuture2.o(dvopVar3.r(dwjeVar4, dwpnVarR.a(), true));
                                }
                            });
                            return null;
                        }
                    }, eoqg.a);
                }
                String strB2 = dvqsVar.b();
                if (true == TextUtils.isEmpty(strB2)) {
                    strB2 = "BOOTSTRAP_TOKEN_FINISH_VALUE";
                }
                dvrfVarD.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", strB2.getBytes(StandardCharsets.UTF_8));
                dvrfVarD.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", eonh.d(size));
                return dvkvVar.c(dwjeVar2, dvqsVar.b(), false, size);
            }
        }, this.f);
    }

    public final synchronized void e(dwje dwjeVar) {
        dvhv.a("LitBstrpCntrl", " Release bootstrap lock");
        this.j.put(Long.valueOf(dwjeVar.a()), false);
    }

    final synchronized boolean f(dwje dwjeVar) {
        Long lValueOf = Long.valueOf(dwjeVar.a());
        ConcurrentMap concurrentMap = this.j;
        if (concurrentMap.containsKey(lValueOf) && ((Boolean) concurrentMap.get(Long.valueOf(dwjeVar.a()))).booleanValue()) {
            return false;
        }
        concurrentMap.put(Long.valueOf(dwjeVar.a()), true);
        return true;
    }

    final synchronized boolean g(dwje dwjeVar) {
        dvrd dvrdVar = this.b;
        dvrf dvrfVarD = dvrdVar.d(dwjeVar);
        ejwi ejwiVarA = dvrfVarD.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
        Long lValueOf = Long.valueOf(dwjeVar.a());
        ConcurrentMap concurrentMap = this.g;
        if (concurrentMap.containsKey(lValueOf)) {
            dvhn.a();
            if (System.currentTimeMillis() - ((Long) concurrentMap.get(Long.valueOf(dwjeVar.a()))).longValue() < fbfm.a.get().d() && !ejwiVarA.g()) {
                dvhv.a("LitBstrpCntrl", "Timestamp already saved within 24 hours, skipping");
                return false;
            }
        }
        long jE = dvrdVar.b(dwjeVar).e();
        if (!ejwiVarA.g()) {
            dvrfVarD.c("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP", eonh.d(jE));
            dvhv.a("LitBstrpCntrl", a.u(jE, " Saving latest message timestamp to kv store with value "));
        }
        Long lValueOf2 = Long.valueOf(dwjeVar.a());
        dvhn.a();
        concurrentMap.put(lValueOf2, Long.valueOf(System.currentTimeMillis()));
        return true;
    }
}
