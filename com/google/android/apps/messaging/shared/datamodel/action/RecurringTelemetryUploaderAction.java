package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.ajat;
import defpackage.ajbk;
import defpackage.aydr;
import defpackage.ayds;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cmlb;
import defpackage.cnod;
import defpackage.cnoy;
import defpackage.cqce;
import defpackage.cqrq;
import defpackage.ctce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekhv;
import defpackage.elgm;
import defpackage.elup;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RecurringTelemetryUploaderAction extends Action<Void> implements Parcelable {
    public final Context e;
    public final ajat f;
    public final ains g;
    public final cnoy h;
    public final cnod i;
    public final fcsu j;
    private final ajbk k;
    private final eosc l;
    private final eosc m;
    public static final cqce a = cqce.g("BugleUsageStatistics", "RecurringTelemetryUploaderAction");
    public static final cczv b = cdag.h(cdag.b, "recurring_telemetry_uploader_run_wipeout_detector", true);
    public static final cczv c = cdag.h(cdag.b, "reverse_sync_after_wipeout_in_telemetry_action", false);
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aydr();

    /* compiled from: PG */
    public interface a {
        ayds ig();
    }

    public RecurringTelemetryUploaderAction(Context context, ajat ajatVar, ains ainsVar, ajbk ajbkVar, cnoy cnoyVar, cnod cnodVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar) {
        super(elgm.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = ajatVar;
        this.g = ainsVar;
        this.k = ajbkVar;
        this.l = eoscVar;
        this.m = eoscVar2;
        this.h = cnoyVar;
        this.i = cnodVar;
        this.j = fcsuVar;
        this.v.r("retry_count", 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RecurringTelemetryUploaderAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RecurringTelemetryUpload.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        final eiju eijuVarI;
        final eiju eijuVarE;
        final int iA = this.v.a("retry_count");
        Callable callable = new Callable() { // from class: aydo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(((Long) this.a.j.b()).intValue());
            }
        };
        eosc eoscVar = this.l;
        final eiju eijuVarG = eijx.g(callable, eoscVar);
        final eiju eijuVarG2 = eijx.g(new Callable() { // from class: aydp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(RecurringTelemetryUploaderAction.d);
            }
        }, eoscVar);
        final ajbk ajbkVar = this.k;
        final ajat ajatVar = ajbkVar.a;
        final long epochMilli = ajatVar.w.f().toEpochMilli();
        final eiju eijuVarI2 = eiju.g(ajatVar.C.e()).h(new ejvr() { // from class: aizn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() < ajat.g);
            }
        }, eoqg.a).i(new eooz() { // from class: aizl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eijx.e(eluj.ENGAGEMENT_LEVEL_ACTIVE);
                }
                final long j = epochMilli;
                ListenableFuture listenableFutureA = ajatVar.C.a.a();
                ejvr ejvrVar = new ejvr() { // from class: aito
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Long.valueOf(((aith) obj2).c);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eika.k(eika.j(listenableFutureA, ejvrVar, eoqgVar), new eooz() { // from class: ajan
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return j - ((Long) obj2).longValue() < ajat.h ? eijx.e(eluj.ENGAGEMENT_LEVEL_PASSIVE) : eijx.e(eluj.ENGAGEMENT_LEVEL_INACTIVE);
                    }
                }, eoqgVar);
            }
        }, ajatVar.D);
        Callable callable2 = new Callable() { // from class: ajbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((chza) ajbkVar.c.a()).w();
            }
        };
        eosc eoscVar2 = ajbkVar.e;
        final eiju eijuVarG3 = eijx.g(callable2, eoscVar2);
        final ekhv ekhvVar = new ekhv();
        final eiju eijuVarH = ((cmlb) ajbkVar.j.b()).c().h(new ejvr() { // from class: ajbb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Iterator it = ((Set) obj).iterator();
                while (true) {
                    ekhv ekhvVar2 = ekhvVar;
                    if (!it.hasNext()) {
                        return ekhvVar2.g();
                    }
                    ajbk ajbkVar2 = ajbkVar;
                    dggn dggnVar = (dggn) it.next();
                    enpl enplVarB = ((dexw) ajbkVar2.k.b()).b(dggnVar);
                    enwr enwrVarV = ((chza) ajbkVar2.c.a()).v(dggnVar);
                    enwz enwzVar = (enwz) enxa.a.createBuilder();
                    enwzVar.copyOnWrite();
                    enxa enxaVar = (enxa) enwzVar.instance;
                    enxaVar.c = enwrVarV.N;
                    enxaVar.b |= 1;
                    enwzVar.copyOnWrite();
                    enxa enxaVar2 = (enxa) enwzVar.instance;
                    enplVarB.getClass();
                    enxaVar2.d = enplVarB;
                    enxaVar2.b |= 2;
                    ekhvVar2.c((enxa) enwzVar.build());
                }
            }
        }, eoscVar2);
        final eiju eijuVarH2 = eijuVarG3.h(new ejvr() { // from class: ajbh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((chza) ajbkVar.c.a()).c();
            }
        }, ajbkVar.d);
        final eiju eijuVarA = ajbkVar.a(new Callable() { // from class: ajbi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.a(ajhd.a));
            }
        });
        final eiju eijuVarA2 = ajbkVar.a(new Callable() { // from class: ajbj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.a(ajhd.c));
            }
        });
        final eiju eijuVarA3 = ajbkVar.a(new Callable() { // from class: ajav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.c(ajhd.a));
            }
        });
        final eiju eijuVarA4 = ajbkVar.a(new Callable() { // from class: ajaw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.c(ajhd.c));
            }
        });
        final eiju eijuVarA5 = ajbkVar.a(new Callable() { // from class: ajax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.b(ajhd.a));
            }
        });
        final eiju eijuVarA6 = ajbkVar.a(new Callable() { // from class: ajay
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ajbkVar.b.b(ajhd.c));
            }
        });
        if (((ctce) ajbkVar.i.b()).b()) {
            eijuVarE = eijx.e(0);
            eijuVarI = eijx.e(elup.UNKNOWN_HAPPINESS_TRACKING_MODE);
        } else {
            cqrq cqrqVar = (cqrq) ajbkVar.f.b();
            eiju eijuVarA7 = cqrqVar.a();
            eijuVarI = cqrqVar.c().i(new eooz() { // from class: ajaz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(elup.HAPPINESS_TRACKING_MODE_HIDDEN);
                    }
                    ajbk ajbkVar2 = ajbkVar;
                    return ((cqrx) ajbkVar2.g.b()).a().h(new ejvr() { // from class: ajau
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return ((cqrg) obj2).c();
                        }
                    }, ajbkVar2.h);
                }
            }, ajbkVar.h);
            eijuVarE = eijuVarA7;
        }
        final eiju eijuVarA8 = ajbkVar.a(new Callable() { // from class: ajba
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ajbkVar.b.d(ajhd.a);
            }
        });
        final eiju eijuVarA9 = ajbkVar.a(new Callable() { // from class: ajbd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ajbkVar.b.d(ajhd.b);
            }
        });
        final eiju eijuVarA10 = ajbkVar.a(new Callable() { // from class: ajbe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ajbkVar.b.d(ajhd.c);
            }
        });
        final eiju eijuVarA11 = ajbkVar.a(new Callable() { // from class: ajbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("SharedRecurringMetrics#create");
                brdrVarD.s();
                return Integer.valueOf(brdrVarD.b().h());
            }
        });
        final eiju eijuVarA12 = eijx.m(eijuVarG3, eijuVarH2, eijuVarA, eijuVarA2, eijuVarA3, eijuVarA4, eijuVarA5, eijuVarA6, eijuVarI, eijuVarE, eijuVarA8, eijuVarA9, eijuVarA10, eijuVarA11, eijuVarH).a(new Callable() { // from class: ajbg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new aiyw(eijuVarI2, (enwr) eork.q(eijuVarG3), (elsf) eork.q(eijuVarH2), ((Integer) eork.q(eijuVarA)).intValue(), ((Integer) eork.q(eijuVarA2)).intValue(), ((Integer) eork.q(eijuVarA3)).intValue(), ((Integer) eork.q(eijuVarA4)).intValue(), ((Integer) eork.q(eijuVarA5)).intValue(), ((Integer) eork.q(eijuVarA6)).intValue(), (elup) eork.q(eijuVarI), ((Integer) eork.q(eijuVarE)).intValue(), (ekgp) eork.q(eijuVarA8), (ekgp) eork.q(eijuVarA9), (ekgp) eork.q(eijuVarA10), ((Integer) eork.q(eijuVarA11)).intValue(), (ekhx) eork.q(eijuVarH));
            }
        }, ajbkVar.h);
        return eijx.m(eijuVarG, eijuVarG2, eijuVarA12).a(new Callable() { // from class: aydq
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v31, types: [fcsu, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v21, types: [cmfo, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v22, types: [cmfo, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r33v0 */
            /* JADX WARN: Type inference failed for: r33v1 */
            /* JADX WARN: Type inference failed for: r33v10 */
            /* JADX WARN: Type inference failed for: r3v11, types: [fcsu, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v6, types: [fcsu, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                boolean z;
                int length;
                int i2;
                eiju eijuVarE2;
                eiju eijuVarE3;
                eiju eijuVarE4;
                int i3;
                eiju eijuVarF;
                RecurringTelemetryUploaderAction recurringTelemetryUploaderAction;
                NotificationManager notificationManager;
                int iIntValue = ((Integer) eork.q(eijuVarG)).intValue();
                long jLongValue = ((Long) eork.q(eijuVarG2)).longValue();
                final ajbl ajblVar = (ajbl) eork.q(eijuVarA12);
                int i4 = iA;
                RecurringTelemetryUploaderAction recurringTelemetryUploaderAction2 = this.a;
                if (i4 == iIntValue || !(ajblVar == null || ajblVar.p() == enwr.BUGLE_LOADING_AVAILABILITY_EXCEPTION)) {
                    final ajat ajatVar2 = recurringTelemetryUploaderAction2.f;
                    final NetworkStatsManager networkStatsManager = (NetworkStatsManager) recurringTelemetryUploaderAction2.e.getSystemService(NetworkStatsManager.class);
                    ecem.b();
                    int iA2 = ajatVar2.A.a();
                    cqce cqceVar = ajat.a;
                    cqbd cqbdVarD = cqceVar.d();
                    cqbdVarD.I("Message status rows deleted");
                    cqbdVarD.G(iA2);
                    cqbdVarD.r();
                    int iA3 = ajatVar2.B.a();
                    cqbd cqbdVarD2 = cqceVar.d();
                    cqbdVarD2.I("App event rows deleted");
                    cqbdVarD2.G(iA3);
                    cqbdVarD2.r();
                    ajhd ajhdVar = ajatVar2.o;
                    if (ajhdVar.Y()) {
                        ecem.b();
                        crmx crmxVar = ajatVar2.t;
                        crny crnyVar = ajatVar2.m;
                        Optional optional = ajatVar2.x;
                        boolean zG = crmxVar.G();
                        int iE = crnyVar.e();
                        if (optional.isPresent()) {
                            z = 1;
                            length = 0;
                            i = 0;
                        } else {
                            Context context = ajatVar2.j;
                            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                            i = 0;
                            z = 1;
                            length = appWidgetManager.getAppWidgetIds(new ComponentName(context, "com.google.android.apps.messaging.widget.WidgetConversationProvider")).length + appWidgetManager.getAppWidgetIds(new ComponentName(context, "com.google.android.apps.messaging.widget.BugleWidgetProvider")).length;
                        }
                        Context context2 = ajatVar2.j;
                        int size = kyg$$ExternalSyntheticApiModelOutline0.m578m(context2.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).getPinnedShortcuts().size();
                        int iD = crnyVar.d();
                        int iC = crnyVar.c();
                        int iB = crnyVar.b();
                        ArrayList arrayList = new ArrayList();
                        if (ajatVar2.v.k()) {
                            Iterator it = crnyVar.m().iterator();
                            while (it.hasNext()) {
                                arrayList.add(ajatVar2.b(((crof) it.next()).a(), iD, iC, iB));
                            }
                        }
                        crqv crqvVar = ajatVar2.u;
                        long jE = crqvVar.e("total_millis_spent", 0L);
                        boolean zG2 = cpga.g(context2);
                        final ajhb ajhbVar = new ajhb();
                        i2 = i4;
                        ecjh ecjhVar = ajatVar2.C.a;
                        ListenableFuture listenableFutureA = ecjhVar.a();
                        ejvr ejvrVar = new ejvr() { // from class: aiud
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return Long.valueOf(((aith) obj).g);
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        final eiju eijuVarG4 = eiju.g(eika.j(listenableFutureA, ejvrVar, eoqgVar));
                        final eiju eijuVarG5 = eiju.g(eika.j(ecjhVar.a(), new ejvr() { // from class: aitz
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return Long.valueOf(((aith) obj).h);
                            }
                        }, eoqgVar));
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                        listenableFutureArr[i] = eijuVarG4;
                        listenableFutureArr[z] = eijuVarG5;
                        eijw eijwVarM = eijx.m(listenableFutureArr);
                        eooy eooyVar = new eooy() { // from class: aizg
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
                                long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
                                Long l = (Long) eork.q(eijuVarG4);
                                long jLongValue2 = -1;
                                long jLongValue3 = (l.longValue() < 0 || uidTxBytes < l.longValue()) ? -1L : uidTxBytes - l.longValue();
                                Long l2 = (Long) eork.q(eijuVarG5);
                                if (l2.longValue() >= 0 && uidRxBytes >= l2.longValue()) {
                                    jLongValue2 = uidRxBytes - l2.longValue();
                                }
                                ajhb ajhbVar2 = ajhbVar;
                                ajat ajatVar3 = ajatVar2;
                                ajhbVar2.a = jLongValue3;
                                ajhbVar2.b = jLongValue2;
                                Long lValueOf = Long.valueOf(uidTxBytes);
                                aiul aiulVar = ajatVar3.C;
                                return cqnx.a(eijx.a(Arrays.asList(aiulVar.i(lValueOf), aiulVar.f(Long.valueOf(uidRxBytes)))));
                            }
                        };
                        eosc eoscVar3 = ajatVar2.D;
                        final eiju eijuVarH3 = eijwVarM.b(eooyVar, eoscVar3).h(new ejvr() { // from class: aizm
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) throws Exception {
                                Throwable th;
                                NetworkStats networkStats;
                                NetworkStats networkStatsQuerySummary;
                                boolean nextBucket;
                                final ajat ajatVar3 = ajatVar2;
                                final long epochMilli2 = ajatVar3.w.f().toEpochMilli();
                                final long j = epochMilli2 - ajhd.a;
                                final ajhb ajhbVar2 = ajhbVar;
                                final NetworkStatsManager networkStatsManager2 = networkStatsManager;
                                if (networkStatsManager2 == null) {
                                    return ajhbVar2;
                                }
                                ajhbVar2.d = 0L;
                                ajhbVar2.c = 0L;
                                try {
                                    ajatVar3.m.o(new crnx() { // from class: ajaf
                                        @Override // defpackage.crnx
                                        public final boolean a(int i5) throws Exception {
                                            Throwable th2;
                                            ajat ajatVar4 = ajatVar3;
                                            String strY = ajatVar4.m.h(i5).y(ajatVar4.j);
                                            long j2 = j;
                                            NetworkStatsManager networkStatsManager3 = networkStatsManager2;
                                            long j3 = epochMilli2;
                                            ajhb ajhbVar3 = ajhbVar2;
                                            NetworkStats networkStats2 = null;
                                            try {
                                                try {
                                                    NetworkStats networkStatsQuerySummary2 = networkStatsManager3.querySummary(0, strY, j2, j3);
                                                    if (networkStatsQuerySummary2 != null) {
                                                        try {
                                                            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                                                            while (networkStatsQuerySummary2.getNextBucket(bucket)) {
                                                                ajhbVar3.d += bucket.getRxBytes();
                                                                ajhbVar3.c += bucket.getTxBytes();
                                                            }
                                                            cqdo.b(networkStatsQuerySummary2);
                                                            return true;
                                                        } catch (RemoteException e) {
                                                            e = e;
                                                            networkStats2 = networkStatsQuerySummary2;
                                                            cqbd cqbdVarE = ajat.a.e();
                                                            cqbdVarE.I("failed to query network stats for");
                                                            cqbdVarE.I(strY);
                                                            cqbdVarE.s(e);
                                                            cqdo.b(networkStats2);
                                                            ajhbVar3.d = -1L;
                                                            ajhbVar3.c = -1L;
                                                            cqbd cqbdVarE2 = ajat.a.e();
                                                            cqbdVarE2.I("failed to query network stats for");
                                                            cqbdVarE2.I(strY);
                                                            cqbdVarE2.r();
                                                            return false;
                                                        } catch (SecurityException e2) {
                                                            e = e2;
                                                            networkStats2 = networkStatsQuerySummary2;
                                                            cqbd cqbdVarE3 = ajat.a.e();
                                                            cqbdVarE3.I("failed to query network stats for");
                                                            cqbdVarE3.I(strY);
                                                            cqbdVarE3.s(e);
                                                            cqdo.b(networkStats2);
                                                            ajhbVar3.d = -1L;
                                                            ajhbVar3.c = -1L;
                                                            cqbd cqbdVarE22 = ajat.a.e();
                                                            cqbdVarE22.I("failed to query network stats for");
                                                            cqbdVarE22.I(strY);
                                                            cqbdVarE22.r();
                                                            return false;
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                            networkStats2 = networkStatsQuerySummary2;
                                                            cqdo.b(networkStats2);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                }
                                            } catch (RemoteException e3) {
                                                e = e3;
                                            } catch (SecurityException e4) {
                                                e = e4;
                                            }
                                            cqdo.b(networkStats2);
                                            ajhbVar3.d = -1L;
                                            ajhbVar3.c = -1L;
                                            cqbd cqbdVarE222 = ajat.a.e();
                                            cqbdVarE222.I("failed to query network stats for");
                                            cqbdVarE222.I(strY);
                                            cqbdVarE222.r();
                                            return false;
                                        }
                                    });
                                } catch (SecurityException e) {
                                    ajhbVar2.d = -1L;
                                    ajhbVar2.c = -1L;
                                    ajat.a.o("fillTransferredMobileData: READ_PHONE_STATE required", e);
                                }
                                ajhbVar2.f = 0L;
                                ajhbVar2.e = 0L;
                                NetworkStats networkStats2 = null;
                                NetworkStats networkStats3 = null;
                                networkStats = null;
                                NetworkStats networkStats4 = null;
                                try {
                                    try {
                                        networkStatsQuerySummary = networkStatsManager2.querySummary(1, null, j, epochMilli2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        networkStats = networkStats2;
                                    }
                                } catch (RemoteException e2) {
                                    e = e2;
                                } catch (SecurityException e3) {
                                    e = e3;
                                }
                                try {
                                } catch (RemoteException e4) {
                                    e = e4;
                                    networkStats4 = networkStatsQuerySummary;
                                    ajat.a.r("failed to query network stats: " + e.getLocalizedMessage());
                                    networkStats3 = networkStats4;
                                    cqdo.b(networkStats3);
                                    ajhbVar2.f = -1L;
                                    ajhbVar2.e = -1L;
                                    networkStats2 = networkStats3;
                                    return ajhbVar2;
                                } catch (SecurityException e5) {
                                    e = e5;
                                    networkStats4 = networkStatsQuerySummary;
                                    ajat.a.r("failed to query network stats: " + e.getLocalizedMessage());
                                    networkStats3 = networkStats4;
                                    cqdo.b(networkStats3);
                                    ajhbVar2.f = -1L;
                                    ajhbVar2.e = -1L;
                                    networkStats2 = networkStats3;
                                    return ajhbVar2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    networkStats = networkStatsQuerySummary;
                                    cqdo.b(networkStats);
                                    throw th;
                                }
                                if (networkStatsQuerySummary == null) {
                                    ajat.a.r("failed to query network stats for wifi");
                                    cqdo.b(networkStats3);
                                    ajhbVar2.f = -1L;
                                    ajhbVar2.e = -1L;
                                    networkStats2 = networkStats3;
                                    return ajhbVar2;
                                }
                                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                                while (true) {
                                    nextBucket = networkStatsQuerySummary.getNextBucket(bucket);
                                    if (!nextBucket) {
                                        break;
                                    }
                                    ajhbVar2.f += bucket.getRxBytes();
                                    ajhbVar2.e += bucket.getTxBytes();
                                }
                                cqdo.b(networkStatsQuerySummary);
                                networkStats2 = nextBucket;
                                return ajhbVar2;
                            }
                        }, eoscVar3);
                        final elud eludVar = (elud) eluz.a.createBuilder();
                        eludVar.copyOnWrite();
                        eluz eluzVar = (eluz) eludVar.instance;
                        eluzVar.b |= 1;
                        eluzVar.e = zG;
                        int i5 = z != zG ? 3 : 2;
                        eludVar.copyOnWrite();
                        eluz eluzVar2 = (eluz) eludVar.instance;
                        eluzVar2.r = i5 - 1;
                        eluzVar2.b |= 131072;
                        eltz eltzVar = (eltz) elua.a.createBuilder();
                        eltzVar.copyOnWrite();
                        elua eluaVar = (elua) eltzVar.instance;
                        eluaVar.b |= 2;
                        eluaVar.d = jE;
                        elua eluaVar2 = (elua) eltzVar.build();
                        eludVar.copyOnWrite();
                        eluz eluzVar3 = (eluz) eludVar.instance;
                        eluaVar2.getClass();
                        eluzVar3.f = eluaVar2;
                        eluzVar3.b |= 2;
                        eludVar.copyOnWrite();
                        eluz eluzVar4 = (eluz) eludVar.instance;
                        eluzVar4.b |= 16;
                        eluzVar4.h = iE;
                        eludVar.copyOnWrite();
                        eluz eluzVar5 = (eluz) eludVar.instance;
                        evtg evtgVar = eluzVar5.i;
                        if (!evtgVar.c()) {
                            eluzVar5.i = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(arrayList, eluzVar5.i);
                        Optional optional2 = ajatVar2.R;
                        optional2.isPresent();
                        boolean zB = ((ctbx) optional2.get().b()).b();
                        eludVar.copyOnWrite();
                        eluz eluzVar6 = (eluz) eludVar.instance;
                        eluzVar6.b |= 64;
                        eluzVar6.j = zB;
                        Optional optional3 = ajatVar2.S;
                        optional3.isPresent();
                        boolean zB2 = ((ctap) optional3.get().b()).b();
                        eludVar.copyOnWrite();
                        eluz eluzVar7 = (eluz) eludVar.instance;
                        eluzVar7.d |= 1024;
                        eluzVar7.as = zB2;
                        eludVar.copyOnWrite();
                        eluz eluzVar8 = (eluz) eludVar.instance;
                        eluzVar8.b |= 128;
                        eluzVar8.k = length;
                        eludVar.copyOnWrite();
                        eluz eluzVar9 = (eluz) eludVar.instance;
                        eluzVar9.b |= 512;
                        eluzVar9.l = zG2;
                        int i6 = 1 != (context2.getApplicationInfo().flags & 1) ? 3 : 2;
                        eludVar.copyOnWrite();
                        eluz eluzVar10 = (eluz) eludVar.instance;
                        eluzVar10.m = i6 - 1;
                        eluzVar10.b |= 4096;
                        int i7 = true != craf.i(context2) ? 2 : 3;
                        eludVar.copyOnWrite();
                        eluz eluzVar11 = (eluz) eludVar.instance;
                        eluzVar11.n = i7 - 1;
                        eluzVar11.b |= 8192;
                        int iA4 = ajblVar.a();
                        eludVar.copyOnWrite();
                        eluz eluzVar12 = (eluz) eludVar.instance;
                        eluzVar12.b |= 262144;
                        eluzVar12.s = iA4;
                        int iB2 = ajblVar.b();
                        eludVar.copyOnWrite();
                        eluz eluzVar13 = (eluz) eludVar.instance;
                        eluzVar13.b |= 524288;
                        eluzVar13.t = iB2;
                        int iG = ajblVar.g();
                        eludVar.copyOnWrite();
                        eluz eluzVar14 = (eluz) eludVar.instance;
                        eluzVar14.b |= 1048576;
                        eluzVar14.u = iG;
                        int iH = ajblVar.h();
                        eludVar.copyOnWrite();
                        eluz eluzVar15 = (eluz) eludVar.instance;
                        eluzVar15.b |= 2097152;
                        eluzVar15.v = iH;
                        eludVar.copyOnWrite();
                        eluz eluzVar16 = (eluz) eludVar.instance;
                        eluzVar16.b |= 65536;
                        eluzVar16.q = size;
                        crqx crqxVar = ajatVar2.s;
                        int iQ = crqxVar.q();
                        eludVar.copyOnWrite();
                        eluz eluzVar17 = (eluz) eludVar.instance;
                        eluzVar17.y = iQ - 1;
                        eluzVar17.b |= 16777216;
                        int iA5 = elun.a(crqxVar.a.d("fast_track_onboarding_progress", i));
                        if (iA5 == 0) {
                            iA5 = 1;
                        }
                        eludVar.copyOnWrite();
                        eluz eluzVar18 = (eluz) eludVar.instance;
                        eluzVar18.S = iA5 - 1;
                        eluzVar18.c |= 8192;
                        elvg elvgVar = cqbe.a;
                        eludVar.copyOnWrite();
                        eluz eluzVar19 = (eluz) eludVar.instance;
                        eluzVar19.ae = elvgVar.x;
                        eluzVar19.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                        int i8 = context2.getResources().getDisplayMetrics().densityDpi;
                        eludVar.copyOnWrite();
                        eluz eluzVar20 = (eluz) eludVar.instance;
                        eluzVar20.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                        eluzVar20.af = i8;
                        elvt elvtVar = (elvt) elvv.a.createBuilder();
                        int iD2 = ajhdVar.d();
                        elvtVar.copyOnWrite();
                        elvv elvvVar = (elvv) elvtVar.instance;
                        elvvVar.b |= 1;
                        elvvVar.c = iD2;
                        int iAd = ajhdVar.ad();
                        elvtVar.copyOnWrite();
                        elvv elvvVar2 = (elvv) elvtVar.instance;
                        elvvVar2.d = iAd - 1;
                        elvvVar2.b |= 2;
                        elvv elvvVar3 = (elvv) elvtVar.build();
                        eludVar.copyOnWrite();
                        eluz eluzVar21 = (eluz) eludVar.instance;
                        elvvVar3.getClass();
                        eluzVar21.z = elvvVar3;
                        eluzVar21.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                        int iT = ((chza) ajatVar2.l.a()).t();
                        eludVar.copyOnWrite();
                        eluz eluzVar22 = (eluz) eludVar.instance;
                        eluzVar22.A = iT - 1;
                        eluzVar22.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                        int i9 = ajatVar2.i();
                        eludVar.copyOnWrite();
                        eluz eluzVar23 = (eluz) eludVar.instance;
                        eluzVar23.E = i9 - 1;
                        eluzVar23.b |= 1073741824;
                        int iC2 = ajblVar.c();
                        eludVar.copyOnWrite();
                        eluz eluzVar24 = (eluz) eludVar.instance;
                        eluzVar24.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                        eluzVar24.C = iC2;
                        int iD3 = ajblVar.d();
                        eludVar.copyOnWrite();
                        eluz eluzVar25 = (eluz) eludVar.instance;
                        eluzVar25.b |= 536870912;
                        eluzVar25.D = iD3;
                        String strQ = crmxVar.q() != null ? crmxVar.q() : "NOT_AVAILABLE";
                        eludVar.copyOnWrite();
                        eluz eluzVar26 = (eluz) eludVar.instance;
                        strQ.getClass();
                        eluzVar26.b |= Integer.MIN_VALUE;
                        eluzVar26.F = strQ;
                        elup elupVarO = ajblVar.o();
                        eludVar.copyOnWrite();
                        eluz eluzVar27 = (eluz) eludVar.instance;
                        eluzVar27.M = elupVarO.h;
                        eluzVar27.c |= 64;
                        int iE2 = ajblVar.e();
                        eludVar.copyOnWrite();
                        eluz eluzVar28 = (eluz) eludVar.instance;
                        eluzVar28.c |= 128;
                        eluzVar28.N = iE2;
                        elul elulVarH = ajhdVar.h("last_video_call_button_click_time_millis");
                        eludVar.copyOnWrite();
                        eluz eluzVar29 = (eluz) eludVar.instance;
                        eluzVar29.O = elulVarH.f;
                        eluzVar29.c |= 256;
                        elul elulVarH2 = ajhdVar.h("last_rbm_active_event_time_millis");
                        eludVar.copyOnWrite();
                        eluz eluzVar30 = (eluz) eludVar.instance;
                        eluzVar30.P = elulVarH2.f;
                        eluzVar30.c |= 512;
                        elul elulVarH3 = ajhdVar.h("last_rbm_interactive_event_time_millis");
                        eludVar.copyOnWrite();
                        eluz eluzVar31 = (eluz) eludVar.instance;
                        eluzVar31.Q = elulVarH3.f;
                        eluzVar31.c |= 1024;
                        int iR = crqxVar.r();
                        eludVar.copyOnWrite();
                        eluz eluzVar32 = (eluz) eludVar.instance;
                        eluzVar32.V = iR - 1;
                        eluzVar32.c |= 65536;
                        eludVar.copyOnWrite();
                        eluz eluzVar33 = (eluz) eludVar.instance;
                        eluzVar33.T = 3;
                        eluzVar33.c |= 16384;
                        int iJ = ajatVar2.j();
                        eludVar.copyOnWrite();
                        eluz eluzVar34 = (eluz) eludVar.instance;
                        eluzVar34.R = iJ - 1;
                        eluzVar34.c |= 4096;
                        elro elroVar = (elro) elrq.a.createBuilder();
                        dhes dhesVar = ajatVar2.F;
                        String strM = dhesVar.m();
                        if (!TextUtils.isEmpty(strM)) {
                            elroVar.copyOnWrite();
                            elrq elrqVar = (elrq) elroVar.instance;
                            strM.getClass();
                            elrqVar.b |= 1;
                            elrqVar.c = strM;
                        }
                        String strI = dhesVar.i();
                        if (!TextUtils.isEmpty(strI)) {
                            elroVar.copyOnWrite();
                            elrq elrqVar2 = (elrq) elroVar.instance;
                            strI.getClass();
                            elrqVar2.b |= 2;
                            elrqVar2.d = strI;
                        }
                        boolean zT = dhesVar.t();
                        elroVar.copyOnWrite();
                        elrq elrqVar3 = (elrq) elroVar.instance;
                        elrqVar3.b |= 4;
                        elrqVar3.e = zT;
                        int i10 = true != dfaq.E().K() ? 2 : 3;
                        elroVar.copyOnWrite();
                        elrq elrqVar4 = (elrq) elroVar.instance;
                        elrqVar4.f = i10 - 1;
                        elrqVar4.b |= 8;
                        elrq elrqVar5 = (elrq) elroVar.build();
                        eludVar.copyOnWrite();
                        eluz eluzVar35 = (eluz) eludVar.instance;
                        elrqVar5.getClass();
                        eluzVar35.U = elrqVar5;
                        eluzVar35.c |= 32768;
                        int iA6 = eluy.a(crqvVar.d("rcs_tos_state", 0));
                        eludVar.copyOnWrite();
                        eluz eluzVar36 = (eluz) eludVar.instance;
                        int i11 = iA6 - 1;
                        if (iA6 == 0) {
                            throw null;
                        }
                        eluzVar36.W = i11;
                        eluzVar36.c |= 262144;
                        boolean zI = dhka.i(context2);
                        eludVar.copyOnWrite();
                        eluz eluzVar37 = (eluz) eludVar.instance;
                        eluzVar37.c |= 536870912;
                        eluzVar37.ah = zI;
                        boolean z2 = !dhky.c(context2);
                        eludVar.copyOnWrite();
                        eluz eluzVar38 = (eluz) eludVar.instance;
                        eluzVar38.c |= 1073741824;
                        eluzVar38.ai = z2;
                        if (((Boolean) ajat.c.e()).booleanValue()) {
                            int iK = ajat.k(ajblVar.f());
                            eludVar.copyOnWrite();
                            eluz eluzVar39 = (eluz) eludVar.instance;
                            eluzVar39.al = iK - 1;
                            eluzVar39.d |= 2;
                        }
                        if (((Boolean) ajat.b.e()).booleanValue()) {
                            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                            elxo elxoVar = (elxo) elxp.a.createBuilder();
                            int i12 = displayMetrics.widthPixels;
                            elxoVar.copyOnWrite();
                            elxp elxpVar = (elxp) elxoVar.instance;
                            elxpVar.b |= 1;
                            elxpVar.c = i12;
                            int i13 = displayMetrics.heightPixels;
                            elxoVar.copyOnWrite();
                            elxp elxpVar2 = (elxp) elxoVar.instance;
                            elxpVar2.b |= 2;
                            elxpVar2.d = i13;
                            elxp elxpVar3 = (elxp) elxoVar.build();
                            eludVar.copyOnWrite();
                            eluz eluzVar40 = (eluz) eludVar.instance;
                            elxpVar3.getClass();
                            eluzVar40.aj = elxpVar3;
                            eluzVar40.c |= Integer.MIN_VALUE;
                        }
                        try {
                            ajatVar2.c(eludVar);
                            ajatVar2.d(eludVar);
                            aivj aivjVar = ajatVar2.ae;
                            aivjVar.f().ifPresent(new Consumer() { // from class: ajao
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    long jLongValue2 = ((Long) obj).longValue();
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.c |= 524288;
                                    eluzVar41.X = jLongValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            aivjVar.e().ifPresent(new Consumer() { // from class: ajap
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    long jLongValue2 = ((Long) obj).longValue();
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.c |= 1048576;
                                    eluzVar41.Y = jLongValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            aivjVar.c().ifPresent(new Consumer() { // from class: ajaq
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    long jLongValue2 = ((Long) obj).longValue();
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.c |= 2097152;
                                    eluzVar41.Z = jLongValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            aivjVar.b().ifPresent(new Consumer() { // from class: ajar
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    long jLongValue2 = ((Long) obj).longValue();
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.c |= 4194304;
                                    eluzVar41.aa = jLongValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            aivjVar.d().ifPresent(new Consumer() { // from class: ajas
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    long jLongValue2 = ((Long) obj).longValue();
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                    eluzVar41.ab = jLongValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            aivjVar.a().ifPresent(new Consumer() { // from class: aizh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar41 = (eluz) eludVar2.instance;
                                    eluz eluzVar42 = eluz.a;
                                    eluzVar41.ac = ((emfe) obj).t;
                                    eluzVar41.c |= 16777216;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            long jA = ajatVar2.y.a();
                            eludVar.copyOnWrite();
                            eluz eluzVar41 = (eluz) eludVar.instance;
                            eluzVar41.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                            eluzVar41.ad = jA;
                            final eiju eijuVarI3 = ajblVar.i();
                            aiul aiulVar = ajatVar2.C;
                            final eiju eijuVarG6 = eiju.g(aiulVar.d());
                            final eiju eijuVarG7 = eiju.g(ajatVar2.o.i());
                            eiju eijuVarG8 = eiju.g(aiulVar.e());
                            ejvr ejvrVar2 = new ejvr() { // from class: aizi
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    Long l = (Long) obj;
                                    if (l == null) {
                                        return elul.UNKNOWN_EVENT_AGE;
                                    }
                                    ajat ajatVar3 = ajatVar2;
                                    return ajatVar3.o.g(l.longValue());
                                }
                            };
                            eoqg eoqgVar2 = eoqg.a;
                            final eiju eijuVarH4 = eijuVarG8.h(ejvrVar2, eoqgVar2);
                            fcsu fcsuVar = ajatVar2.ac;
                            final eiju eijuVarC = aiulVar.c();
                            boolean zA = cezu.a();
                            final Boolean boolValueOf = Boolean.valueOf(zA);
                            boolValueOf.getClass();
                            if (zA) {
                                bvuw bvuwVar = ajatVar2.G;
                                String strQ2 = ajatVar2.z.q();
                                if (TextUtils.isEmpty(strQ2)) {
                                    eijuVarE2 = eijx.e(elyv.a);
                                } else {
                                    final eiju eijuVarD = bvuwVar.a.d(strQ2);
                                    ccro ccroVar = bvuwVar.e;
                                    final eiju eijuVarC2 = auvw.c(ccroVar.a, fcyi.a, fdjz.a, new ccrn(ccroVar, null));
                                    final eiju eijuVarH5 = bvuwVar.b.a(strQ2).b.h().h(new ejvr() { // from class: cexf
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj) {
                                            cevr cevrVar = (cevr) obj;
                                            cevq cevqVarB = cevq.b(cevrVar.i);
                                            if (cevqVarB == null) {
                                                cevqVarB = cevq.UNRECOGNIZED;
                                            }
                                            elyu elyuVarR = cexm.r(cevqVarB);
                                            cevp cevpVarB = cevp.b(cevrVar.j);
                                            if (cevpVarB == null) {
                                                cevpVarB = cevp.UNRECOGNIZED;
                                            }
                                            return Pair.create(elyuVarR, cexm.q(cevpVarB));
                                        }
                                    }, eoqgVar2);
                                    eijuVarE2 = eijx.m(eijuVarD, eijuVarC2, eijuVarH5).a(new Callable() { // from class: bvuv
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            Pair pair = (Pair) eork.q(eijuVarH5);
                                            elyo elyoVar = (elyo) elyv.a.createBuilder();
                                            elyq elyqVar = (elyq) eork.q(eijuVarD);
                                            elyoVar.copyOnWrite();
                                            elyv elyvVar = (elyv) elyoVar.instance;
                                            elyvVar.c = elyqVar.g;
                                            elyvVar.b |= 1;
                                            elyq elyqVar2 = (elyq) eork.q(eijuVarC2);
                                            elyoVar.copyOnWrite();
                                            elyv elyvVar2 = (elyv) elyoVar.instance;
                                            elyvVar2.f = elyqVar2.g;
                                            elyvVar2.b |= 8;
                                            elyu elyuVar = (elyu) pair.first;
                                            elyoVar.copyOnWrite();
                                            elyv elyvVar3 = (elyv) elyoVar.instance;
                                            elyvVar3.e = elyuVar.e;
                                            elyvVar3.b |= 4;
                                            elys elysVar = (elys) pair.second;
                                            elyoVar.copyOnWrite();
                                            elyv elyvVar4 = (elyv) elyoVar.instance;
                                            elyvVar4.d = elysVar.d;
                                            elyvVar4.b |= 2;
                                            return (elyv) elyoVar.build();
                                        }
                                    }, bvuwVar.f);
                                }
                            } else {
                                eijuVarE2 = eijx.e(elyv.a);
                            }
                            final eiju eijuVar = eijuVarE2;
                            final eiju eijuVarA13 = ajatVar2.a(ajblVar.p(), ajblVar.n(), ajblVar.m());
                            eiju eijuVarA14 = aiulVar.a();
                            ejvr ejvrVar3 = new ejvr() { // from class: ajaj
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cqce cqceVar2 = ajat.a;
                                    return evwz.b(((Instant) obj).truncatedTo(ChronoUnit.DAYS));
                                }
                            };
                            eosc eoscVar4 = ajatVar2.D;
                            final eiju eijuVarE5 = eijuVarA14.h(ejvrVar3, eoscVar4).e(Exception.class, new ejvr() { // from class: ajak
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ajat.a.n("Failed to upload firstHomeScreenVisitDay: ".concat(String.valueOf(((Exception) obj).getMessage())));
                                    return evvp.a;
                                }
                            }, eoscVar4);
                            final aizf aizfVar = (aizf) ajatVar2.M.b();
                            final eiju eijuVarI4 = aizfVar.c.b().i(new eooz() { // from class: aiyy
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    String str = (String) obj;
                                    if ("NO_REFERRER".equals(str)) {
                                        return eijx.e(Optional.empty());
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        return eijx.e(Optional.of(str));
                                    }
                                    final aizf aizfVar2 = aizfVar;
                                    final qxl qxlVar = (qxl) aizfVar2.d.b();
                                    ListenableFuture listenableFutureA2 = kol.a(new koi() { // from class: aizc
                                        @Override // defpackage.koi
                                        public final Object a(kog kogVar) {
                                            ((qxl) aizfVar2.d.b()).c(new aize(kogVar, qxlVar));
                                            return "Requesting install referrer from Play Store";
                                        }
                                    });
                                    qxlVar.getClass();
                                    Runnable runnableK = eiid.k(new Runnable() { // from class: aizd
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qxlVar.b();
                                        }
                                    });
                                    eosc eoscVar5 = aizfVar2.b;
                                    listenableFutureA2.b(runnableK, eoscVar5);
                                    final eiju eijuVarG9 = eiju.g(listenableFutureA2);
                                    ejvr ejvrVar4 = new ejvr() { // from class: aiyz
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            return (String) ((Optional) obj2).orElse("NO_REFERRER");
                                        }
                                    };
                                    eoqg eoqgVar3 = eoqg.a;
                                    eiju eijuVarH6 = eijuVarG9.h(ejvrVar4, eoqgVar3);
                                    final aiul aiulVar2 = aizfVar2.c;
                                    aiulVar2.getClass();
                                    return eijuVarH6.i(new eooz() { // from class: aiza
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            final String str2 = (String) obj2;
                                            return eiju.g(aiulVar2.a.b(new ejvr() { // from class: aitu
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj3) {
                                                    int i14 = aiul.d;
                                                    aitg aitgVar = (aitg) ((aith) obj3).toBuilder();
                                                    aitgVar.copyOnWrite();
                                                    aith aithVar = (aith) aitgVar.instance;
                                                    String str3 = str2;
                                                    str3.getClass();
                                                    aithVar.b |= 512;
                                                    aithVar.k = str3;
                                                    return (aith) aitgVar.build();
                                                }
                                            }, eoqg.a));
                                        }
                                    }, eoscVar5).i(new eooz() { // from class: aizb
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            return eijuVarG9;
                                        }
                                    }, eoqgVar3);
                                }
                            }, aizfVar.b);
                            fcsu fcsuVar2 = ajatVar2.V;
                            final eiju eijuVarA15 = ((cdku) fcsuVar2.b()).a();
                            final eiju eijuVarB = ((cdku) fcsuVar2.b()).b();
                            cdku cdkuVar = (cdku) fcsuVar2.b();
                            final eiju eijuVarH6 = cdkuVar.c.h().h(new ejvr() { // from class: cdkn
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cdjt cdjtVar = (cdjt) obj;
                                    boolean z3 = cdjtVar.f;
                                    evvp evvpVar = cdjtVar.g;
                                    if (evvpVar == null) {
                                        evvpVar = evvp.a;
                                    }
                                    return new cdkt(z3, evvpVar);
                                }
                            }, cdkuVar.d);
                            final eiju eijuVarH7 = ((cdku) fcsuVar2.b()).c.h().h(new ejvr() { // from class: cdkm
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    return Boolean.valueOf(((cdjt) obj).h);
                                }
                            }, eoqgVar2);
                            final eiju eijuVarH8 = ((cdku) fcsuVar2.b()).c.h().h(new ejvr() { // from class: cdkd
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    return Boolean.valueOf(((cdjt) obj).i);
                                }
                            }, eoqgVar2);
                            final eiju eijuVarH9 = ((cdku) fcsuVar2.b()).c.h().h(new ejvr() { // from class: cdjw
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cdjs cdjsVarB = cdjs.b(((cdjt) obj).j);
                                    return cdjsVarB == null ? cdjs.GSOS_UNKNOWN : cdjsVarB;
                                }
                            }, eoqgVar2);
                            fcsu fcsuVar3 = ajatVar2.K;
                            if (((Optional) fcsuVar3.b()).isPresent()) {
                                eijuVarE3 = ((chjr) ((Optional) fcsuVar3.b()).get()).b();
                                eijuVarE4 = ((chjr) ((Optional) fcsuVar3.b()).get()).a();
                            } else {
                                eijuVarE3 = eijx.e(elqz.a);
                                eijuVarE4 = eijx.e(elqv.a);
                            }
                            final eiju eijuVar2 = eijuVarE4;
                            final eiju eijuVar3 = eijuVarE3;
                            cqnx.c(eika.d(eijuVarI3, eijuVarG6, eijuVarG7, eijuVarH4, eijuVarC, eijuVarH3, eijuVar, eijuVarA13, eijuVarE5, eijuVarI4, eijuVarA15, eijuVarB, eijuVarH6, eijuVar3, eijuVar2, eijuVarH8, eijuVarH9, eijuVarH7).a(new Callable() { // from class: aizj
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    eiju eijuVar4 = eijuVarH6;
                                    boolean z3 = ((cdkt) eork.q(eijuVar4)).a;
                                    evvp evvpVar = ((cdkt) eork.q(eijuVar4)).b;
                                    ajhb ajhbVar2 = (ajhb) eork.q(eijuVarH3);
                                    elqz elqzVar = (elqz) eork.q(eijuVar3);
                                    elqv elqvVar = (elqv) eork.q(eijuVar2);
                                    eluj elujVar = (eluj) eork.q(eijuVarI3);
                                    final elud eludVar2 = eludVar;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar42 = (eluz) eludVar2.instance;
                                    eluz eluzVar43 = eluz.a;
                                    eluzVar42.o = elujVar.e;
                                    eluzVar42.b |= 16384;
                                    long jLongValue2 = ((Long) eork.q(eijuVarG6)).longValue();
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar44 = (eluz) eludVar2.instance;
                                    eluzVar44.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                                    eluzVar44.B = jLongValue2;
                                    elua eluaVar3 = (elua) eork.q(eijuVarG7);
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar45 = (eluz) eludVar2.instance;
                                    eluaVar3.getClass();
                                    eluzVar45.g = eluaVar3;
                                    eluzVar45.b |= 4;
                                    elul elulVar = (elul) eork.q(eijuVarH4);
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar46 = (eluz) eludVar2.instance;
                                    eluzVar46.w = elulVar.f;
                                    eluzVar46.b |= 4194304;
                                    long jLongValue3 = ((Long) eork.q(eijuVarC)).longValue();
                                    ajat ajatVar3 = ajatVar2;
                                    elul elulVarG = ajatVar3.o.g(jLongValue3);
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar47 = (eluz) eludVar2.instance;
                                    eluzVar47.x = elulVarG.f;
                                    eluzVar47.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                    long j = ajhbVar2.a;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar48 = (eluz) eludVar2.instance;
                                    eluzVar48.c |= 1;
                                    eluzVar48.G = j;
                                    long j2 = ajhbVar2.b;
                                    eiju eijuVar5 = eijuVarA13;
                                    eiju eijuVar6 = eijuVarE5;
                                    Boolean bool = boolValueOf;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar49 = (eluz) eludVar2.instance;
                                    eluzVar49.c |= 2;
                                    eluzVar49.H = j2;
                                    long j3 = ajhbVar2.c;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar50 = (eluz) eludVar2.instance;
                                    eluzVar50.c |= 4;
                                    eluzVar50.I = j3;
                                    long j4 = ajhbVar2.d;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar51 = (eluz) eludVar2.instance;
                                    eluzVar51.c |= 8;
                                    eluzVar51.J = j4;
                                    long j5 = ajhbVar2.e;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar52 = (eluz) eludVar2.instance;
                                    eluzVar52.c |= 16;
                                    eluzVar52.K = j5;
                                    long j6 = ajhbVar2.f;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar53 = (eluz) eludVar2.instance;
                                    eluzVar53.c |= 32;
                                    eluzVar53.L = j6;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar54 = (eluz) eludVar2.instance;
                                    elqzVar.getClass();
                                    eluzVar54.aq = elqzVar;
                                    eluzVar54.d |= 256;
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar55 = (eluz) eludVar2.instance;
                                    elqvVar.getClass();
                                    eluzVar55.ar = elqvVar;
                                    eluzVar55.d |= 512;
                                    elip elipVar = (elip) eork.q(eijuVar5);
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar56 = (eluz) eludVar2.instance;
                                    elipVar.getClass();
                                    eluzVar56.p = elipVar;
                                    eluzVar56.b |= 32768;
                                    evvp evvpVar2 = (evvp) eork.q(eijuVar6);
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar57 = (eluz) eludVar2.instance;
                                    evvpVar2.getClass();
                                    eluzVar57.ap = evvpVar2;
                                    eluzVar57.d |= 128;
                                    if (bool.booleanValue()) {
                                        elyv elyvVar = (elyv) eork.q(eijuVar);
                                        eludVar2.copyOnWrite();
                                        eluz eluzVar58 = (eluz) eludVar2.instance;
                                        elyvVar.getClass();
                                        eluzVar58.ag = elyvVar;
                                        eluzVar58.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                                    }
                                    int i14 = ((Boolean) eork.q(eijuVarH7)).booleanValue() ? 5 : true != ((Boolean) eork.q(eijuVarA15)).booleanValue() ? 2 : 3;
                                    eiju eijuVar7 = eijuVarI4;
                                    eiju eijuVar8 = eijuVarH9;
                                    eiju eijuVar9 = eijuVarH8;
                                    eiju eijuVar10 = eijuVarB;
                                    elzt elztVar = (elzt) elzv.a.createBuilder();
                                    elztVar.copyOnWrite();
                                    elzv elzvVar = (elzv) elztVar.instance;
                                    elzvVar.c = i14 - 1;
                                    elzvVar.b |= 1;
                                    long jLongValue4 = ((Long) eork.q(eijuVar10)).longValue();
                                    elztVar.copyOnWrite();
                                    elzv elzvVar2 = (elzv) elztVar.instance;
                                    elzvVar2.b |= 2;
                                    elzvVar2.d = jLongValue4;
                                    long epochMilli2 = evwz.d(evvpVar).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
                                    elztVar.copyOnWrite();
                                    elzv elzvVar3 = (elzv) elztVar.instance;
                                    elzvVar3.b |= 4;
                                    elzvVar3.e = epochMilli2;
                                    elzv elzvVar4 = (elzv) elztVar.build();
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar59 = (eluz) eludVar2.instance;
                                    elzvVar4.getClass();
                                    eluzVar59.am = elzvVar4;
                                    eluzVar59.d |= 8;
                                    cdjo cdjoVar = (cdjo) cdjp.a.createBuilder();
                                    boolean zBooleanValue = ((Boolean) eork.q(eijuVar9)).booleanValue();
                                    cdjoVar.copyOnWrite();
                                    cdjp cdjpVar = (cdjp) cdjoVar.instance;
                                    cdjpVar.b |= 1;
                                    cdjpVar.c = zBooleanValue;
                                    cdjs cdjsVar = (cdjs) eork.q(eijuVar8);
                                    cdjoVar.copyOnWrite();
                                    cdjp cdjpVar2 = (cdjp) cdjoVar.instance;
                                    cdjpVar2.d = cdjsVar.d;
                                    cdjpVar2.b |= 2;
                                    cdjp cdjpVar3 = (cdjp) cdjoVar.build();
                                    eludVar2.copyOnWrite();
                                    eluz eluzVar60 = (eluz) eludVar2.instance;
                                    cdjpVar3.getClass();
                                    eluzVar60.at = cdjpVar3;
                                    eluzVar60.d |= 2048;
                                    ((Optional) eork.q(eijuVar7)).ifPresent(new Consumer() { // from class: ajab
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj) {
                                            elud eludVar3 = eludVar2;
                                            String str = (String) obj;
                                            eludVar3.copyOnWrite();
                                            eluz eluzVar61 = (eluz) eludVar3.instance;
                                            eluz eluzVar62 = eluz.a;
                                            str.getClass();
                                            eluzVar61.d |= 1;
                                            eluzVar61.ak = str;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.BUGLE_USER_AND_DEVICE_INFO;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar2 = (ellh) ellgVar.instance;
                                    eluz eluzVar61 = (eluz) eludVar2.build();
                                    eluzVar61.getClass();
                                    ellhVar2.q = eluzVar61;
                                    ellhVar2.b |= 256;
                                    ((aill) ajatVar3.r.b()).j(ellgVar);
                                    return new Object();
                                }
                            }, eoqgVar2), "BugleUsageStatistics", "Failed to send bugler user and device info");
                            cgba cgbaVar = (cgba) ajatVar2.Q.b();
                            if (craf.e && (notificationManager = (NotificationManager) cgbaVar.b.getSystemService("notification")) != null) {
                                aill aillVar = (aill) cgbaVar.a.b();
                                ellg ellgVar = (ellg) ellh.a.createBuilder();
                                ellf ellfVar = ellf.BUBBLE_SETTING_EVENT;
                                ellgVar.copyOnWrite();
                                ellh ellhVar = (ellh) ellgVar.instance;
                                ellhVar.j = ellfVar.f11do;
                                ellhVar.b |= 1;
                                emoh emohVar = (emoh) emoj.a.createBuilder();
                                int bubblePreference = notificationManager.getBubblePreference();
                                int i14 = bubblePreference != 1 ? bubblePreference != 2 ? 1 : 3 : 2;
                                emohVar.copyOnWrite();
                                emoj emojVar = (emoj) emohVar.instance;
                                emojVar.c = i14;
                                emojVar.b |= 1;
                                ellgVar.copyOnWrite();
                                ellh ellhVar2 = (ellh) ellgVar.instance;
                                emoj emojVar2 = (emoj) emohVar.build();
                                emojVar2.getClass();
                                ellhVar2.aR = emojVar2;
                                ellhVar2.e |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                aillVar.j(ellgVar);
                            }
                            cgdh cgdhVar = (cgdh) ajatVar2.T.b();
                            if (ecem.g()) {
                                ((eksl) ((eksl) cgdh.a.h()).h("com/google/android/apps/messaging/shared/notification/NotificationMetricsEventLogger", "logNotificationCounter", 209, "NotificationMetricsEventLogger.java")).q("Unable to log notification counter because running on main thread is not allowed");
                                i3 = 2;
                            } else {
                                try {
                                    envw envwVar = (envw) envy.a.createBuilder();
                                    boolean zB3 = cgdhVar.b();
                                    envwVar.copyOnWrite();
                                    envy envyVar = (envy) envwVar.instance;
                                    envyVar.b |= 2;
                                    envyVar.f = zB3;
                                    ejxr ejxrVar = cgdhVar.c;
                                    envp envpVar = (envp) ejxrVar.get().l();
                                    envo envoVar = (envo) envp.a.createBuilder(envpVar);
                                    if ((envpVar.b & 1) == 0) {
                                        envoVar.copyOnWrite();
                                        envp.b((envp) envoVar.instance);
                                    }
                                    i3 = 2;
                                    if ((envpVar.b & 2) == 0) {
                                        envoVar.copyOnWrite();
                                        envp.c((envp) envoVar.instance);
                                    }
                                    if ((8 & envpVar.b) == 0) {
                                        envoVar.copyOnWrite();
                                        envp.d((envp) envoVar.instance);
                                    }
                                    if ((envpVar.b & 4) == 0) {
                                        envoVar.copyOnWrite();
                                        envp envpVar2 = (envp) envoVar.instance;
                                        envpVar2.b = 4 | envpVar2.b;
                                        envpVar2.c = 0;
                                    }
                                    if ((envpVar.b & 16) == 0) {
                                        envoVar.copyOnWrite();
                                        envp.a((envp) envoVar.instance);
                                    }
                                    envwVar.copyOnWrite();
                                    envy envyVar2 = (envy) envwVar.instance;
                                    envp envpVar3 = (envp) envoVar.build();
                                    envpVar3.getClass();
                                    envyVar2.d = envpVar3;
                                    envyVar2.c = 6;
                                    aill aillVar2 = (aill) cgdhVar.b.b();
                                    ellg ellgVar2 = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar2 = ellf.NOTIFICATION_METRICS_EVENT;
                                    ellgVar2.copyOnWrite();
                                    ellh ellhVar3 = (ellh) ellgVar2.instance;
                                    ellhVar3.j = ellfVar2.f11do;
                                    ellhVar3.b |= 1;
                                    ellgVar2.copyOnWrite();
                                    ellh ellhVar4 = (ellh) ellgVar2.instance;
                                    envy envyVar3 = (envy) envwVar.build();
                                    envyVar3.getClass();
                                    ellhVar4.bh = envyVar3;
                                    ellhVar4.f |= 2048;
                                    aillVar2.j(ellgVar2);
                                    ejxrVar.get().m(new ejvr() { // from class: cgdd
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj) {
                                            eksp ekspVar = cgdh.a;
                                            envo envoVar2 = (envo) ((envp) obj).toBuilder();
                                            envoVar2.copyOnWrite();
                                            envp.b((envp) envoVar2.instance);
                                            envoVar2.copyOnWrite();
                                            envp.c((envp) envoVar2.instance);
                                            envoVar2.copyOnWrite();
                                            envp envpVar4 = (envp) envoVar2.instance;
                                            envpVar4.b |= 4;
                                            envpVar4.c = 0;
                                            envoVar2.copyOnWrite();
                                            envp.d((envp) envoVar2.instance);
                                            envoVar2.copyOnWrite();
                                            envp.a((envp) envoVar2.instance);
                                            return (envp) envoVar2.build();
                                        }
                                    });
                                } catch (evtj e) {
                                    throw new IllegalStateException("Unexpected error while getting notification counter data", e);
                                }
                            }
                            ((Optional) ajatVar2.L.b()).ifPresent(new Consumer() { // from class: ajae
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    eiju eijuVarA16 = ((ankg) obj).a();
                                    final ajat ajatVar3 = ajatVar2;
                                    auvh.h(eijuVarA16.h(new ejvr() { // from class: aizu
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            cthr cthrVar = (cthr) ajatVar3.I.b();
                                            final int iIntValue2 = ((Integer) obj2).intValue();
                                            cthrVar.k(new Supplier() { // from class: cthq
                                                @Override // java.util.function.Supplier
                                                public final Object get() {
                                                    enhx enhxVar = (enhx) enhy.a.createBuilder();
                                                    enhxVar.copyOnWrite();
                                                    enhy enhyVar = (enhy) enhxVar.instance;
                                                    enhyVar.b |= 1;
                                                    enhyVar.c = iIntValue2;
                                                    return (enhy) enhxVar.build();
                                                }
                                            });
                                            return null;
                                        }
                                    }, ajatVar3.E));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            Callable callable3 = new Callable() { // from class: ajac
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Integer.valueOf(cqjh.a());
                                }
                            };
                            eosc eoscVar5 = ajatVar2.D;
                            auvh.h(eijx.g(callable3, eoscVar5).h(new ejvr() { // from class: ajad
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ufx ufxVar = (ufx) ajatVar2.W.b();
                                    int iIntValue2 = ((Integer) obj).intValue();
                                    emtn emtnVar = (emtn) emtp.a.createBuilder();
                                    int i15 = (iIntValue2 < 0 || iIntValue2 >= 10) ? (iIntValue2 < 10 || iIntValue2 >= 100) ? (iIntValue2 < 100 || iIntValue2 >= 500) ? (iIntValue2 < 500 || iIntValue2 >= 1000) ? (iIntValue2 < 1000 || iIntValue2 >= 5000) ? iIntValue2 >= 5000 ? 7 : 1 : 6 : 5 : 4 : 3 : 2;
                                    emtnVar.copyOnWrite();
                                    emtp emtpVar = (emtp) emtnVar.instance;
                                    emtpVar.c = i15 - 1;
                                    emtpVar.b |= 1;
                                    evsn evsnVarBuild = emtnVar.build();
                                    evsnVarBuild.getClass();
                                    final emtp emtpVar2 = (emtp) evsnVarBuild;
                                    ufxVar.b(new fdap() { // from class: ufu
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj2) {
                                            ennk ennkVar = (ennk) obj2;
                                            ennkVar.getClass();
                                            emsz emszVar = ennkVar.a;
                                            emszVar.copyOnWrite();
                                            emta emtaVar = (emta) emszVar.instance;
                                            emta emtaVar2 = emta.a;
                                            emtaVar.c = emtpVar2;
                                            emtaVar.b = 5;
                                            return fctx.a;
                                        }
                                    });
                                    return null;
                                }
                            }, ajatVar2.E));
                            ((agzo) ajatVar2.J.b()).a();
                            ajatVar2.z.t();
                            cqnx.c(eika.j(ajatVar2.C.c().i(new eooz() { // from class: aizk
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    Long l = (Long) obj;
                                    if (l == null) {
                                        return eijx.e(false);
                                    }
                                    ajat ajatVar3 = ajatVar2;
                                    final long jLongValue2 = l.longValue();
                                    return eijx.g(new Callable() { // from class: ajah
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return Long.valueOf(ajat.g);
                                        }
                                    }, ajatVar3.D).h(new ejvr() { // from class: ajai
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            cqce cqceVar2 = ajat.a;
                                            return Boolean.valueOf(jLongValue2 < ((Long) obj2).longValue());
                                        }
                                    }, eoqg.a);
                                }
                            }, eoscVar5), new ejvr() { // from class: aizw
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        return null;
                                    }
                                    ajbl ajblVar2 = ajblVar;
                                    ajat ajatVar3 = ajatVar2;
                                    int iA7 = ajblVar2.a();
                                    int iB3 = ajblVar2.b();
                                    ains ainsVar = ajatVar3.p;
                                    ainsVar.e("Bugle.Rcs.Groups.Active.1Day.Counts", iA7);
                                    ainsVar.e("Bugle.Rcs.Groups.Active.28Day.Counts", iB3);
                                    int iG2 = ajblVar2.g();
                                    int iH2 = ajblVar2.h();
                                    ainsVar.e("Bugle.Rcs.Files.Transfer.Outgoing.Success.1Day.Counts", iG2);
                                    ainsVar.e("Bugle.Rcs.Files.Transfer.Outgoing.Success.28Day.Counts", iH2);
                                    return null;
                                }
                            }, eoscVar5), "BugleUsageStatistics", "Failed to log rcs active");
                            final awge awgeVar = (awge) ajatVar2.P.b();
                            if (((Boolean) awge.a.e()).booleanValue()) {
                                eieu eieuVarK = eiiy.k("PhoneNumberMinMatchGuessLogger#computeAndLog");
                                try {
                                    eiju eijuVarA16 = ((awgf) awgeVar.c.b()).a();
                                    ejvr ejvrVar4 = new ejvr() { // from class: awgc
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj) {
                                            Optional optional4 = (Optional) obj;
                                            emur emurVar = (emur) emus.a.createBuilder();
                                            if (optional4.isPresent()) {
                                                long jIntValue = ((Integer) optional4.get()).intValue();
                                                emurVar.copyOnWrite();
                                                emus emusVar = (emus) emurVar.instance;
                                                emusVar.b |= 1;
                                                emusVar.c = jIntValue;
                                            }
                                            awge awgeVar2 = awgeVar;
                                            long jA2 = awcn.a();
                                            emurVar.copyOnWrite();
                                            emus emusVar2 = (emus) emurVar.instance;
                                            emusVar2.b |= 2;
                                            emusVar2.d = jA2;
                                            aill aillVar3 = (aill) awgeVar2.b.b();
                                            ellg ellgVar3 = (ellg) ellh.a.createBuilder();
                                            ellf ellfVar3 = ellf.FUZZY_MATCH_LENGTH;
                                            ellgVar3.copyOnWrite();
                                            ellh ellhVar5 = (ellh) ellgVar3.instance;
                                            ellhVar5.j = ellfVar3.f11do;
                                            ellhVar5.b |= 1;
                                            ellgVar3.copyOnWrite();
                                            ellh ellhVar6 = (ellh) ellgVar3.instance;
                                            emus emusVar3 = (emus) emurVar.build();
                                            emusVar3.getClass();
                                            ellhVar6.aL = emusVar3;
                                            ellhVar6.e |= 32768;
                                            aillVar3.j(ellgVar3);
                                            return null;
                                        }
                                    };
                                    eosc eoscVar6 = awgeVar.e;
                                    eijuVarF = eijuVarA16.h(ejvrVar4, eoscVar6).f(Throwable.class, new eooz() { // from class: awgd
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj) {
                                            return ((cden) awgeVar.d.b()).b((Throwable) obj);
                                        }
                                    }, eoscVar6);
                                    eieuVarK.b(eijuVarF);
                                    eieuVarK.close();
                                } finally {
                                }
                            } else {
                                eijuVarF = eijx.e(null);
                            }
                            auvh.h(eijuVarF);
                            if (((Boolean) ccze.i.e()).booleanValue()) {
                                ecem.b();
                                ajatVar2.p.g("Bugle.Ditto.Pairing.Computers.Count.Daily", ajatVar2.k.a());
                            }
                            ekgp ekgpVarJ = ajblVar.j();
                            ekgp ekgpVarL = ajblVar.l();
                            ekgp ekgpVarK = ajblVar.k();
                            ajatVar2.e(ekgpVarJ, "Bugle.Rbm.UniqueBotConversations.1Day.Counts");
                            ajatVar2.e(ekgpVarL, "Bugle.Rbm.UniqueBotConversations.7Days.Counts");
                            ajatVar2.e(ekgpVarK, "Bugle.Rbm.UniqueBotConversations.28Days.Counts");
                            ecem.b();
                            eygg eyggVar = ajatVar2.n.a;
                            int size2 = ((NotificationManager) eyggVar.b()).getNotificationChannels() != null ? ((NotificationManager) eyggVar.b()).getNotificationChannels().size() : 0;
                            ains ainsVar = ajatVar2.p;
                            ainsVar.e("Bugle.Notification.Channel.Count", size2);
                            ecem.b();
                            NotificationChannel notificationChannelA = ((cgoq) ajatVar2.X.b()).a();
                            ainsVar.e("Bugle.Notification.DefaultChannel.Importance.Count", notificationChannelA.getImportance());
                            String string = notificationChannelA.getSound() != null ? notificationChannelA.getSound().toString() : null;
                            ainsVar.e("Bugle.Notification.DefaultChannel.Sound.Count", (string == null || string.endsWith("notification_sound")) ? 1 : i3);
                            ainsVar.e("Bugle.Notification.DefaultChannel.Vibrate.Count", true != notificationChannelA.shouldVibrate() ? i3 : 1);
                            int lockscreenVisibility = notificationChannelA.getLockscreenVisibility();
                            ainsVar.e("Bugle.Notification.DefaultChannel.LockScreenVisibility.Count", lockscreenVisibility == -1 ? 3 : lockscreenVisibility == 1 ? 1 : lockscreenVisibility == 0 ? i3 : 0);
                            ainsVar.e("Bugle.Notification.DefaultChannel.ShowOnBadge.Count", true != notificationChannelA.canShowBadge() ? i3 : 1);
                            ainsVar.e("Bugle.Notification.DefaultChannel.OverrideDoNotDisturb.Count", true != notificationChannelA.canBypassDnd() ? i3 : 1);
                            if (ajatVar2.v.k()) {
                                ((ajkv) ajatVar2.q.b()).d();
                            }
                            Iterator it2 = ((Set) ajatVar2.Y.b()).iterator();
                            while (it2.hasNext()) {
                                ((aiyu) it2.next()).b();
                            }
                            ajatVar2.U.ifPresent(new Consumer() { // from class: aizx
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    cqce cqceVar2 = ajat.a;
                                    ((ctal) ((fcsu) obj).b()).a();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((Optional) ajatVar2.K.b()).ifPresent(new Consumer() { // from class: aizy
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    cqce cqceVar2 = ajat.a;
                                    auvh.h(((chjr) obj).c());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            cqnx.c(ajatVar2.C.h(ajatVar2.w.f().toEpochMilli()), "BugleUsageStatistics", "Failed to update LastRecurrentAnalyticsUploadTimeInMillis");
                            Optional optional4 = ajatVar2.N;
                            optional4.isPresent();
                            auvh.h(((adjc) optional4.get().b()).a().h(new ejvr() { // from class: ajag
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    final ajat ajatVar3 = ajatVar2;
                                    ((Optional) obj).ifPresent(new Consumer() { // from class: aizt
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                            emxr emxrVar = (emxr) obj2;
                                            adja adjaVar = (adja) ajatVar3.O.b();
                                            emxl emxlVar = (emxl) emxp.a.createBuilder();
                                            emxlVar.copyOnWrite();
                                            emxp emxpVar = (emxp) emxlVar.instance;
                                            emxrVar.getClass();
                                            emxpVar.e = emxrVar;
                                            emxpVar.b |= 4;
                                            adjaVar.a((emxp) emxlVar.build());
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return true;
                                }
                            }, ajatVar2.E));
                            cdla cdlaVar = (cdla) ajatVar2.Z.b();
                            auvh.e(auvw.i(cdlaVar.b, new cdkx(cdlaVar, null)));
                            cdnf cdnfVar = (cdnf) ajatVar2.ab.b();
                            if (cdnfVar.b.b()) {
                                cdnfVar.a.c("Bugle.Kids.Engagement.Supervised.Count");
                            }
                            recurringTelemetryUploaderAction = recurringTelemetryUploaderAction2;
                        } catch (evtj e2) {
                            throw new IllegalStateException("Could not populate BugleUserAndDeviceInfo", e2);
                        }
                    } else {
                        ajat.a.m("Clearcut loggings are disabled.");
                        i2 = i4;
                        recurringTelemetryUploaderAction = recurringTelemetryUploaderAction2;
                    }
                    recurringTelemetryUploaderAction.g.e("Bugle.DataModel.Action.RecurringTelemetryUpload.Retry.Count", i2);
                } else {
                    cqbd cqbdVarE = RecurringTelemetryUploaderAction.a.e();
                    cqbdVarE.I("failed to get availability, will retry in");
                    cqbdVarE.H(jLongValue);
                    cqbdVarE.I("ms");
                    cqbdVarE.r();
                    ayds aydsVarIg = ((RecurringTelemetryUploaderAction.a) cqtf.a(RecurringTelemetryUploaderAction.a.class)).ig();
                    Context context3 = (Context) aydsVarIg.a.b();
                    context3.getClass();
                    ajat ajatVar3 = (ajat) aydsVarIg.b.b();
                    ajatVar3.getClass();
                    ains ainsVar2 = (ains) aydsVarIg.c.b();
                    ainsVar2.getClass();
                    ajbk ajbkVar2 = (ajbk) aydsVarIg.d.b();
                    ajbkVar2.getClass();
                    cnoy cnoyVar = (cnoy) aydsVarIg.e.b();
                    cnoyVar.getClass();
                    cnod cnodVar = (cnod) aydsVarIg.f.b();
                    cnodVar.getClass();
                    eosc eoscVar7 = (eosc) aydsVarIg.g.b();
                    eoscVar7.getClass();
                    eosc eoscVar8 = (eosc) aydsVarIg.h.b();
                    eoscVar8.getClass();
                    new RecurringTelemetryUploaderAction(context3, ajatVar3, ainsVar2, ajbkVar2, cnoyVar, cnodVar, eoscVar7, eoscVar8, aydsVarIg.i, i4 + 1).x(109, jLongValue);
                    recurringTelemetryUploaderAction = recurringTelemetryUploaderAction2;
                }
                if (!((Boolean) RecurringTelemetryUploaderAction.b.e()).booleanValue()) {
                    return null;
                }
                Optional optionalA = recurringTelemetryUploaderAction.h.a(emjt.RECURRING_EVENT);
                if (!optionalA.isPresent() || !((Boolean) optionalA.get()).booleanValue()) {
                    return null;
                }
                cqce cqceVar2 = RecurringTelemetryUploaderAction.a;
                cqceVar2.r("Telephony database was wiped out!");
                if (!((Boolean) RecurringTelemetryUploaderAction.c.e()).booleanValue()) {
                    return null;
                }
                cqceVar2.p("Starting reverse telephony sync due to wipeout");
                recurringTelemetryUploaderAction.i.a();
                return null;
            }
        }, this.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RecurringTelemetryUploaderAction(Context context, ajat ajatVar, ains ainsVar, ajbk ajbkVar, cnoy cnoyVar, cnod cnodVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, int i) {
        super(elgm.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = ajatVar;
        this.g = ainsVar;
        this.h = cnoyVar;
        this.k = ajbkVar;
        this.i = cnodVar;
        this.l = eoscVar;
        this.m = eoscVar2;
        this.j = fcsuVar;
        this.v.r("retry_count", i);
    }

    public RecurringTelemetryUploaderAction(Context context, ajat ajatVar, ains ainsVar, ajbk ajbkVar, eosc eoscVar, eosc eoscVar2, cnoy cnoyVar, cnod cnodVar, fcsu fcsuVar, Parcel parcel) {
        super(parcel, elgm.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = ajatVar;
        this.g = ainsVar;
        this.k = ajbkVar;
        this.h = cnoyVar;
        this.i = cnodVar;
        this.l = eoscVar;
        this.m = eoscVar2;
        this.j = fcsuVar;
    }
}
