package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycf extends cayv {
    public static final eksp a = eksp.c("BugleSearch");
    public final eosc b;
    public final fcsu c;
    public final eygg d;
    public final eygg e;
    public final fcsu f;
    public final fcsu g;
    public final bxxd h;
    public final bybc i;
    private final eosc j;
    private final fcsu k;
    private final bybo l;

    public bycf(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar3, fcsu fcsuVar4, bxxd bxxdVar, bybc bybcVar, bybo byboVar) {
        this.j = eoscVar;
        this.b = eoscVar2;
        this.c = fcsuVar;
        this.k = fcsuVar2;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = bxxdVar;
        this.i = bybcVar;
        this.l = byboVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
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
        caxzVarL.f(pza.a);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IcingIndexRebuildSingleWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return byay.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final byay byayVar = (byay) evuhVar;
        if (((asaw) this.k.b()).a() && byayVar.b == 4) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 117, "IcingIndexRebuildSingleWorkHandler.java")).q("Skip indexing message annotation.");
            return eijx.e(cbcw.i());
        }
        if (byayVar.d <= byayVar.e) {
            final long jIntValue = ((Integer) ccze.E.e()).intValue();
            final long j = byayVar.d;
            final long j2 = j + jIntValue;
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(bxze.h, Integer.valueOf(byayVar.b));
            ekslVar.X(bxze.m, Long.valueOf(j));
            ekslVar.X(bxze.n, Long.valueOf(j2));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 146, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild runs on a table.");
            Callable callable = new Callable() { // from class: bybx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.h.n(byayVar.b, j, j2);
                }
            };
            eosc eoscVar = this.j;
            return eijx.g(callable, eoscVar).i(new eooz() { // from class: byby
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    eiju eijuVarD;
                    Set set = (Set) obj;
                    bycf bycfVar = this.a;
                    fcsu fcsuVar = bycfVar.c;
                    boolean zA = ((aqdk) fcsuVar.b()).a();
                    byay byayVar2 = byayVar;
                    if (!zA && (set == null || set.isEmpty())) {
                        return eijx.d(new IllegalStateException("No data to index for table type: " + byayVar2.b));
                    }
                    ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                    int i = byayVar2.b;
                    if (((aqdk) fcsuVar.b()).a() && set.isEmpty()) {
                        eijuVarD = eijx.e(true);
                    } else if (((aqdi) bycfVar.f.b()).a()) {
                        bxrh bxrhVar = (bxrh) bycfVar.e.b();
                        Stream map = Collection.EL.stream(set).map(new Function() { // from class: bybs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eksp ekspVar = bycf.a;
                                return Long.toString(((Long) obj2).longValue());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i2 = ekgb.d;
                        eijuVarD = bxrhVar.b(i, (List) map.collect(ekcv.a));
                    } else {
                        Stream map2 = Collection.EL.stream(set).map(new Function() { // from class: bybt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((Long) obj2).toString();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i3 = ekgb.d;
                        ekgb ekgbVar = (ekgb) map2.collect(ekcv.a);
                        if (i == 1) {
                            eijuVarD = ((bxzf) bycfVar.d.b()).d((List) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bybu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return bary.b((String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: bybv
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            })));
                        } else if (i == 2) {
                            eijuVarD = ((bxzf) bycfVar.d.b()).b(ekgb.n((java.util.Collection) Collection.EL.stream(ekgbVar).map(new bari()).collect(Collectors.toCollection(new barj()))));
                        } else if (i == 3) {
                            eijuVarD = ((bxzf) bycfVar.d.b()).e(ekgbVar);
                        } else {
                            if (i != 4) {
                                throw new IllegalArgumentException("Unknown table type while updating index asynchronously.");
                            }
                            eijuVarD = ((bxzf) bycfVar.d.b()).c(ekgbVar);
                        }
                    }
                    listenableFutureArr[0] = eijuVarD;
                    final Long lValueOf = Long.valueOf(byayVar2.f);
                    listenableFutureArr[1] = bycfVar.i.a().h(new ejvr() { // from class: bybr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(lValueOf.equals((Long) obj2));
                        }
                    }, bycfVar.b);
                    return eijx.b(listenableFutureArr);
                }
            }, eoscVar).h(new ejvr() { // from class: bybz
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    list.getClass();
                    ejwl.a(list.size() == 2);
                    boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                    byay byayVar2 = byayVar;
                    if (!zBooleanValue2) {
                        eksl ekslVar2 = (eksl) bycf.a.j();
                        ekslVar2.X(bxze.h, Integer.valueOf(byayVar2.b));
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 177, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild job is outdated. Stops the job without retry.");
                        return cbcw.k();
                    }
                    if (!zBooleanValue) {
                        eksl ekslVar3 = (eksl) bycf.a.j();
                        ekslVar3.X(bxze.h, Integer.valueOf(byayVar2.b));
                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 185, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild failing on updating index. Retry later.");
                        return cbcw.m();
                    }
                    long j3 = jIntValue;
                    cbcv cbcvVarH = cbcw.h();
                    byax byaxVar = (byax) byayVar2.toBuilder();
                    long j4 = byayVar2.d + j3;
                    byaxVar.copyOnWrite();
                    ((byay) byaxVar.instance).d = j4;
                    ((caxp) cbcvVarH).a = ekgb.r(bycg.a((byay) byaxVar.build()));
                    cbcvVarH.b(true);
                    cbcvVarH.c(true);
                    return cbcvVarH.a();
                }
            }, this.b).e(Throwable.class, new ejvr() { // from class: byca
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) ((eksl) bycf.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 199, "IcingIndexRebuildSingleWorkHandler.java")).q("Failed to process indexing work item.");
                    if (!((aqdi) this.a.f.b()).a() || cayyVar.c()) {
                        return cbcw.m();
                    }
                    byay byayVar2 = byayVar;
                    cbcv cbcvVarH = cbcw.h();
                    byax byaxVar = (byax) byayVar2.toBuilder();
                    long j3 = byayVar2.d;
                    byaxVar.copyOnWrite();
                    ((byay) byaxVar.instance).d = j3;
                    byay byayVar3 = (byay) byaxVar.build();
                    caxr caxrVar = new caxr();
                    caxrVar.c = Duration.ofMillis(((Long) bxth.b.e()).longValue());
                    ((caxp) cbcvVarH).a = ekgb.r(cbcu.g("icing_index_rebuild_single_work_handler", byayVar3, caxrVar.a()));
                    cbcvVarH.b(true);
                    cbcvVarH.c(false);
                    return cbcvVarH.a();
                }
            }, eoqg.a);
        }
        eksp ekspVar = a;
        eksl ekslVar2 = (eksl) ekspVar.h();
        ekslVar2.X(bxze.h, Integer.valueOf(byayVar.b));
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 125, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild completed for a table.");
        bybo byboVar = this.l;
        long j3 = byayVar.f;
        synchronized (byboVar.a) {
            if (j3 != byboVar.d) {
                byboVar.b.a(5, Long.toString(j3));
            } else {
                int i = byboVar.c - 1;
                byboVar.c = i;
                if (i == 0) {
                    byboVar.b.a(4, Long.toString(j3));
                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 128, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild job is fully completed.");
                    if (((aqdi) this.f.b()).a()) {
                        int iB = bycu.b(byayVar.g);
                        return ((iB != 0 && iB == 4) ? ((bxso) this.g.b()).a().i(new eooz() { // from class: bycb
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                if (!((Boolean) obj).booleanValue()) {
                                    return eijx.e(null);
                                }
                                bycf bycfVar = this.a;
                                ((eksl) ((eksl) bycf.a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "updateIndexableRestoreState", 228, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing and AppSearch index restore completed.");
                                return ((bxso) bycfVar.g.b()).c().i(new eooz() { // from class: byce
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        eksp ekspVar2 = bycf.a;
                                        return eijx.e(null);
                                    }
                                }, bycfVar.b);
                            }
                        }, this.b) : ((bxso) this.g.b()).b().i(new eooz() { // from class: bycc
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                if (!((Boolean) obj).booleanValue()) {
                                    return eijx.e(null);
                                }
                                bycf bycfVar = this.a;
                                ((eksl) ((eksl) bycf.a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "updateIndexableRestoreState", 249, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index restore completed.");
                                return ((bxso) bycfVar.g.b()).e().i(new eooz() { // from class: bycd
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        eksp ekspVar2 = bycf.a;
                                        return eijx.e(null);
                                    }
                                }, bycfVar.b);
                            }
                        }, this.b)).h(new ejvr() { // from class: bybw
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                eksp ekspVar2 = bycf.a;
                                return cbcw.i();
                            }
                        }, this.b);
                    }
                }
            }
        }
        return eijx.e(cbcw.i());
    }
}
