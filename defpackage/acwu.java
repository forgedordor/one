package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwu extends oqw {
    final CancellationSignal c = new CancellationSignal();
    public final dqpi d = new acwt(this);
    final /* synthetic */ acwx e;

    public acwu(acwx acwxVar) {
        this.e = acwxVar;
    }

    @Override // defpackage.opq
    public final void c() {
        final acwx acwxVar = this.e;
        if (!((arfq) acwxVar.p.b()).a()) {
            this.c.cancel();
            if (acwxVar.w == acww.FINISHED) {
                acwxVar.w = acww.REFRESHING;
            }
            long epochMilli = acwxVar.c.f().toEpochMilli();
            AtomicLong atomicLong = acwxVar.B;
            long j = epochMilli - atomicLong.get();
            if (j < ((Integer) acwxVar.D.e()).intValue()) {
                ekrw ekrwVarE = acwx.b.e();
                ekrwVarE.X(eksq.a, "ConversationListDataSources");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarE).g(eiip.b(new RuntimeException("HomeScreenInvalidationFrequencyException")))).h("com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "invalidateWithoutDebouncing", 950, "ConversationListDataSources.java")).s("Home Screen invalidated too quickly. timeSinceLastInvalidation: %d", j);
            }
            atomicLong.set(epochMilli);
            super.c();
            return;
        }
        long epochMilli2 = acwxVar.c.f().toEpochMilli();
        AtomicLong atomicLong2 = acwxVar.B;
        long j2 = epochMilli2 - atomicLong2.get();
        if (j2 < ((Integer) acwxVar.D.e()).intValue()) {
            ekrw ekrwVarE2 = acwx.b.e();
            ekrwVarE2.X(eksq.a, "ConversationListDataSources");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarE2).g(eiip.b(new RuntimeException("HomeScreenInvalidationFrequencyException")))).h("com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "checkInvalidationFrequency", 969, "ConversationListDataSources.java")).s("Home Screen invalidated too quickly. timeSinceLastInvalidation: %d", j2);
        }
        AtomicBoolean atomicBoolean = acwxVar.C;
        if (atomicBoolean.get()) {
            ekrw ekrwVarE3 = acwx.b.e();
            ekrwVarE3.X(eksq.a, "ConversationListDataSources");
            ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "invalidateWithDebouncing", 924, "ConversationListDataSources.java")).q("Home Screen invalidation already scheduled; skipping");
            return;
        }
        if (acwxVar.w == acww.FINISHED) {
            acwxVar.w = acww.REFRESHING;
        }
        atomicLong2.set(epochMilli2);
        if (j2 >= ((Long) acwxVar.q.b()).longValue()) {
            j();
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            eosd eosdVar = acwxVar.j;
            Runnable runnable = new Runnable() { // from class: acwo
                @Override // java.lang.Runnable
                public final void run() {
                    oqw oqwVar;
                    acwx acwxVar2 = acwxVar;
                    if (acwxVar2.C.compareAndSet(true, false) && (oqwVar = acwxVar2.s) != null) {
                        ((acwu) oqwVar).j();
                        return;
                    }
                    ekrw ekrwVarE4 = acwx.b.e();
                    ekrwVarE4.X(eksq.a, "ConversationListDataSources");
                    ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/home/list/ConversationListDataSources", "tryScheduleDataSourceInvalidation", 450, "ConversationListDataSources.java")).q("Scheduled Home Screen invalidation was unscheduled; skipping");
                }
            };
            long jLongValue = cqbe.j() ? 0L : ((Long) acwxVar.r.b()).longValue();
            Long.valueOf(jLongValue).getClass();
            eosdVar.schedule(runnable, jLongValue, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.oqw
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        adao adaoVar = (adao) obj;
        return new acvs(adaoVar.k().w(), adaoVar.k().o(), adaoVar.k().af(), adaoVar.k().D());
    }

    @Override // defpackage.oqw
    public final void g(final oqt oqtVar, final oqq oqqVar) {
        acwx acwxVar = this.e;
        eieh eiehVarC = acwxVar.f.c("ConversationListDataSources.create#loadAfter", "com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "loadAfter", 613);
        try {
            auvh.h(eijx.e(crku.a).h(new ejvr() { // from class: acws
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    acwu acwuVar = this.a;
                    acwx acwxVar2 = acwuVar.e;
                    crku crkuVar = (crku) obj;
                    acwxVar2.e();
                    oqt oqtVar2 = oqtVar;
                    try {
                        adms admsVar = acwxVar2.n;
                        cdpg cdpgVar = acwxVar2.l;
                        SuperSortLabel superSortLabel = (SuperSortLabel) acwxVar2.m.get();
                        afcy afcyVarG = afcz.g();
                        acwb acwbVar = (acwb) oqtVar2.a;
                        afcyVarG.f(acwx.a(acwbVar));
                        ((admw) afcyVarG).a = acwbVar.b();
                        afcyVarG.b(acwbVar.d());
                        afcyVarG.d(oqtVar2.b);
                        afcyVarG.e(crkuVar);
                        afcz afczVarA = afcyVarG.a();
                        dqpi dqpiVar = acwuVar.d;
                        Map map = acwxVar2.A;
                        CancellationSignal cancellationSignal = acwuVar.c;
                        adms.d("queryNextPage", cdpgVar, superSortLabel);
                        List listC = admsVar.c(admsVar.a(admsVar.b(cdpgVar, superSortLabel).j(afczVarA, admsVar.b), dqpiVar, cancellationSignal), map, cancellationSignal);
                        oqq oqqVar2 = oqqVar;
                        cqbd cqbdVarD = acwx.a.d();
                        cqbdVarD.I("loadAfter");
                        cqbdVarD.A("key", ((acwb) oqtVar2.a).b());
                        cqbdVarD.y("load size", oqtVar2.b);
                        cqbdVarD.y("returned list size", listC.size());
                        cqbdVarD.r();
                        acwuVar.e.w = acww.FINISHED;
                        oqqVar2.a(listC);
                        return null;
                    } catch (dqwt unused) {
                        cqbd cqbdVarD2 = acwx.a.d();
                        cqbdVarD2.I("Inflight query was cancelled, due to invalidation.");
                        cqbdVarD2.r();
                        return null;
                    }
                }
            }, acwxVar.g));
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.oqw
    public final void h(final oqt oqtVar, final oqq oqqVar) {
        acwx acwxVar = this.e;
        eieh eiehVarC = acwxVar.f.c("ConversationListDataSources.create#loadBefore", "com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "loadBefore", 670);
        try {
            auvh.h(eijx.e(crku.a).h(new ejvr() { // from class: acwr
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    acwu acwuVar = this.a;
                    acwx acwxVar2 = acwuVar.e;
                    crku crkuVar = (crku) obj;
                    acwxVar2.e();
                    oqt oqtVar2 = oqtVar;
                    try {
                        adms admsVar = acwxVar2.n;
                        cdpg cdpgVar = acwxVar2.l;
                        SuperSortLabel superSortLabel = (SuperSortLabel) acwxVar2.m.get();
                        afcy afcyVarG = afcz.g();
                        acwb acwbVar = (acwb) oqtVar2.a;
                        afcyVarG.f(acwx.a(acwbVar));
                        ((admw) afcyVarG).a = acwbVar.b();
                        afcyVarG.b(acwbVar.d());
                        afcyVarG.d(oqtVar2.b);
                        afcyVarG.e(crkuVar);
                        afcz afczVarA = afcyVarG.a();
                        dqpi dqpiVar = acwuVar.d;
                        Map map = acwxVar2.A;
                        CancellationSignal cancellationSignal = acwuVar.c;
                        adms.d("queryPrevPage", cdpgVar, superSortLabel);
                        List listC = admsVar.c(admsVar.a(admsVar.b(cdpgVar, superSortLabel).l(afczVarA, admsVar.b), dqpiVar, cancellationSignal), map, cancellationSignal);
                        oqq oqqVar2 = oqqVar;
                        cqbd cqbdVarD = acwx.a.d();
                        cqbdVarD.I("loadBefore");
                        cqbdVarD.A("key", ((acwb) oqtVar2.a).b());
                        cqbdVarD.y("load size", oqtVar2.b);
                        cqbdVarD.y("returned list size", listC.size());
                        cqbdVarD.r();
                        acwuVar.e.w = acww.FINISHED;
                        oqqVar2.a(listC);
                        return null;
                    } catch (dqwt unused) {
                        cqbd cqbdVarD2 = acwx.a.d();
                        cqbdVarD2.I("Inflight query was cancelled, due to invalidation.");
                        cqbdVarD2.r();
                        return null;
                    }
                }
            }, acwxVar.g));
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.oqw
    public final void i(oqs oqsVar, final oqr oqrVar) {
        acwx acwxVar = this.e;
        eieh eiehVarC = acwxVar.f.c("ConversationListDataSources.create#loadInitial", "com/google/android/apps/messaging/home/list/ConversationListDataSources$ConversationListDataSource", "loadInitial", 470);
        try {
            final acwb acwbVar = (acwb) oqsVar.a;
            if (acwbVar != null) {
                acwxVar.u = false;
            }
            final int i = acwxVar.u ? acwxVar.x : oqsVar.b;
            eieu eieuVarK = eiiy.k("ConversationListDataSources#loadInitialSync");
            try {
                if (acwxVar.z == null) {
                    acwxVar.z = eijx.e(crku.a);
                }
                eiju eijuVarH = acwxVar.z.h(new ejvr() { // from class: acwq
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0293  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x02d5  */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x02d7  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x02dd  */
                    /* JADX WARN: Removed duplicated region for block: B:126:0x02e0  */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x02e2  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #13 {all -> 0x0035, blocks: (B:5:0x0019, B:7:0x001d, B:9:0x0023, B:21:0x004b, B:23:0x0058, B:24:0x005c, B:29:0x0092, B:30:0x0099, B:36:0x00a9, B:14:0x002d), top: B:183:0x0019 }] */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: all -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x040d, blocks: (B:3:0x0015, B:26:0x0086, B:37:0x00b5, B:38:0x00c2), top: B:172:0x0015 }] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0229 A[Catch: all -> 0x040b, TryCatch #5 {all -> 0x040b, blocks: (B:57:0x015f, B:58:0x0162, B:60:0x0173, B:63:0x017b, B:65:0x01f4, B:75:0x0204, B:77:0x0219, B:79:0x0229, B:81:0x0230, B:83:0x023b, B:85:0x0241, B:93:0x025d, B:92:0x025a, B:73:0x0202, B:72:0x01ff, B:103:0x026f, B:100:0x0269, B:99:0x0266, B:76:0x020a, B:64:0x0198, B:89:0x0255, B:69:0x01fa), top: B:171:0x00b5, inners: #10, #14, #16, #20 }] */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x023b A[Catch: all -> 0x040b, TryCatch #5 {all -> 0x040b, blocks: (B:57:0x015f, B:58:0x0162, B:60:0x0173, B:63:0x017b, B:65:0x01f4, B:75:0x0204, B:77:0x0219, B:79:0x0229, B:81:0x0230, B:83:0x023b, B:85:0x0241, B:93:0x025d, B:92:0x025a, B:73:0x0202, B:72:0x01ff, B:103:0x026f, B:100:0x0269, B:99:0x0266, B:76:0x020a, B:64:0x0198, B:89:0x0255, B:69:0x01fa), top: B:171:0x00b5, inners: #10, #14, #16, #20 }] */
                    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
                    /* JADX WARN: Type inference failed for: r14v10, types: [int] */
                    /* JADX WARN: Type inference failed for: r14v11 */
                    /* JADX WARN: Type inference failed for: r14v5 */
                    /* JADX WARN: Type inference failed for: r14v6 */
                    /* JADX WARN: Type inference failed for: r14v7 */
                    /* JADX WARN: Type inference failed for: r14v8 */
                    /* JADX WARN: Type inference failed for: r14v9 */
                    /* JADX WARN: Type inference failed for: r1v50, types: [ains] */
                    /* JADX WARN: Type inference failed for: r20v0 */
                    /* JADX WARN: Type inference failed for: r20v1 */
                    /* JADX WARN: Type inference failed for: r20v2 */
                    @Override // defpackage.ejvr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r22) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 1050
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwq.apply(java.lang.Object):java.lang.Object");
                    }
                }, acwxVar.g);
                eieuVarK.b(eijuVarH);
                auvh.h(eijuVarH);
                eieuVarK.close();
                eiehVarC.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j() {
        this.c.cancel();
        super.c();
    }
}
