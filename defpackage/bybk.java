package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bybk extends cayl {
    public static final eksp a = eksp.c("BugleSearch");
    public final fcsu b;
    public final bxxd c;
    public final bybc d;
    public final eosc e;
    public final eosc f;
    public final bybo g;
    public final byau h;

    public bybk(fcsu fcsuVar, bxxd bxxdVar, bybc bybcVar, eosc eoscVar, eosc eoscVar2, bybo byboVar, byau byauVar) {
        this.b = fcsuVar;
        this.c = bxxdVar;
        this.d = bybcVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = byboVar;
        this.h = byauVar;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        if (((Boolean) bxth.a.e()).booleanValue()) {
            return caya.l().a();
        }
        pzh pzhVar = new pzh();
        pzhVar.d = true;
        pzhVar.c = true;
        pzhVar.b = true;
        pzhVar.a = true;
        caxz caxzVarL = caya.l();
        caxzVarL.c(3);
        caxzVarL.d(10);
        caxzVarL.f(pza.a);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IcingIndexRebuildHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bybm.a.getParserForType();
    }

    @Override // defpackage.cayl
    public final eiju j(final cayy cayyVar, ekgb ekgbVar) {
        final int iB;
        fcsu fcsuVar = this.b;
        if (((aqdi) fcsuVar.b()).a() && ekgbVar.isEmpty()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "processPendingWorkItemAsync", 97, "IcingIndexRebuildHandler.java")).q("Skip process due to empty parameters.");
            return eijx.e(cbcw.i());
        }
        if (((aqdi) fcsuVar.b()).a()) {
            iB = bycu.b(((bybm) Collection.EL.stream(ekgbVar).max(Comparator.CC.comparingInt(new ToIntFunction() { // from class: bybj
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((bybm) obj).b;
                }
            })).get()).b);
            if (iB == 0) {
                iB = 1;
            }
        } else {
            iB = 3;
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bxze.g, "IcingIndexRebuildHandler");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "processPendingWorkItemAsync", 105, "IcingIndexRebuildHandler.java")).q("Icing index rebuild job starts.");
        eiju eijuVarA = this.d.a();
        eooz eoozVar = new eooz() { // from class: bybf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Long l = (Long) obj;
                if (l == null) {
                    return eijx.d(new NullPointerException("Couldn't get last index rebuild version."));
                }
                bybk bybkVar = this.a;
                final long jLongValue = l.longValue() + 1;
                ejvr ejvrVar = new ejvr() { // from class: byaz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bybp bybpVar = (bybp) ((bybq) obj2).toBuilder();
                        bybpVar.copyOnWrite();
                        ((bybq) bybpVar.instance).b = jLongValue;
                        return (bybq) bybpVar.build();
                    }
                };
                ecjh ecjhVar = bybkVar.d.a;
                eoqg eoqgVar = eoqg.a;
                return eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).h(new ejvr() { // from class: byba
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Long.valueOf(jLongValue);
                    }
                }, eoqgVar);
            }
        };
        eosc eoscVar = this.f;
        eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: bybg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Long l = (Long) obj;
                if (l == null) {
                    return eijx.d(new NullPointerException("Couldn't set next index rebuild version."));
                }
                final bybk bybkVar = this.a;
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfwVar.h(Pair.create(1, ekgb.r("internal.3p:Message_no_gsa")));
                ekfwVar.h(Pair.create(3, ekgb.r("internal.3p:Person_no_gsa")));
                ekfwVar.h(Pair.create(2, ekgb.r("internal.3p:Conversation_no_gsa")));
                ekgb ekgbVarG = ekfwVar.g();
                bybo byboVar = bybkVar.g;
                int i2 = ((ekoe) ekgbVarG).c;
                long jLongValue = l.longValue();
                synchronized (byboVar.a) {
                    byboVar.c = i2;
                    byboVar.d = jLongValue;
                }
                bybkVar.h.a(2, Long.toString(l.longValue()));
                ekfw ekfwVar2 = new ekfw();
                ekqh it = ekgbVarG.iterator();
                while (it.hasNext()) {
                    final int i3 = iB;
                    final Pair pair = (Pair) it.next();
                    ekfwVar2.h(eijx.g(new Callable() { // from class: bybd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(bybkVar.c.a(((Integer) pair.first).intValue()));
                        }
                    }, bybkVar.f).h(new ejvr() { // from class: bybe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Long l2 = (Long) obj2;
                            eksp ekspVar = bybk.a;
                            byax byaxVar = (byax) byay.a.createBuilder();
                            long jLongValue2 = l2 == null ? 0L : l2.longValue();
                            Long l3 = l;
                            Pair pair2 = pair;
                            byaxVar.copyOnWrite();
                            ((byay) byaxVar.instance).e = jLongValue2;
                            int iIntValue = ((Integer) pair2.first).intValue();
                            byaxVar.copyOnWrite();
                            ((byay) byaxVar.instance).b = iIntValue;
                            byaxVar.copyOnWrite();
                            ((byay) byaxVar.instance).d = 0L;
                            long jLongValue3 = l3.longValue();
                            byaxVar.copyOnWrite();
                            ((byay) byaxVar.instance).f = jLongValue3;
                            Iterable iterable = (Iterable) pair2.second;
                            byaxVar.copyOnWrite();
                            byay byayVar = (byay) byaxVar.instance;
                            evtg evtgVar = byayVar.c;
                            if (!evtgVar.c()) {
                                byayVar.c = evsn.mutableCopy(evtgVar);
                            }
                            int i4 = i3;
                            evpz.addAll(iterable, byayVar.c);
                            byaxVar.copyOnWrite();
                            ((byay) byaxVar.instance).g = bycu.a(i4);
                            return (byay) byaxVar.build();
                        }
                    }, bybkVar.e));
                }
                return eijx.a(ekfwVar2.g());
            }
        }, eoscVar);
        ejvr ejvrVar = new ejvr() { // from class: bybh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVarG;
                List list = (List) obj;
                cbcv cbcvVarH = cbcw.h();
                if (list == null) {
                    eksl ekslVar2 = (eksl) bybk.a.j();
                    ekslVar2.X(bxze.g, "IcingIndexRebuildHandler");
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "createIndexingWorkQueueRequests", 246, "IcingIndexRebuildHandler.java")).q("Couldn't get lastIds from the tables.");
                    int i = ekgb.d;
                    ekgbVarG = ekoe.a;
                } else {
                    int i2 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ekfwVar.h(bycg.a((byay) it.next()));
                    }
                    ekgbVarG = ekfwVar.g();
                }
                ((caxp) cbcvVarH).a = ekgbVarG;
                cbcvVarH.c(false);
                cbcvVarH.b(true);
                return cbcvVarH.a();
            }
        };
        eosc eoscVar2 = this.e;
        return eijuVarI.h(ejvrVar, eoscVar2).e(Throwable.class, new ejvr() { // from class: bybi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) bybk.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "processPendingWorkItemAsync", 165, "IcingIndexRebuildHandler.java")).q("Failed to initialize index rebuild workers.");
                if (!((aqdi) this.a.b.b()).a() || cayyVar.c()) {
                    return cbcw.m();
                }
                int i = iB;
                cbcv cbcvVarH = cbcw.h();
                bybl byblVar = (bybl) bybm.a.createBuilder();
                byblVar.copyOnWrite();
                ((bybm) byblVar.instance).b = bycu.a(i);
                bybm bybmVar = (bybm) byblVar.build();
                caxr caxrVar = new caxr();
                caxrVar.c = Duration.ofMillis(((Long) bxth.b.e()).longValue());
                ((caxp) cbcvVarH).a = ekgb.r(cbcu.g("icing_index_rebuild_handler", bybmVar, caxrVar.a()));
                cbcvVarH.c(false);
                cbcvVarH.b(true);
                return cbcvVarH.a();
            }
        }, eoscVar2);
    }
}
