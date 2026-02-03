package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzjr extends cayl {
    private final bzkg a;

    public bzjr(bzkg bzkgVar) {
        this.a = bzkgVar;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.d(((Integer) bzip.a.e()).intValue());
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.g(((Long) bzkg.b.e()).longValue());
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsBatchBackupWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return byiv.a.getParserForType();
    }

    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, final ekgb ekgbVar) {
        final Optional optionalEmpty;
        final bzkg bzkgVar = this.a;
        if (bzkgVar.j.a()) {
            int iIntValue = ((Integer) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bzjy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((byiv) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).max(new Comparator() { // from class: bzjz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }).orElse(0)).intValue();
            carc carcVar = (carc) bzkgVar.i;
            optionalEmpty = Optional.of(new carg(carcVar.a, iIntValue, carcVar.b.a.get()));
        } else {
            optionalEmpty = Optional.empty();
        }
        eiju eijuVarI = bzkgVar.g.m.b().i(new eooz() { // from class: bzka
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((eksl) ((eksl) bzkg.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupWorkHandlerDelegate", "processPendingWorkItemAsync", 136, "CmsBatchBackupWorkHandlerDelegate.java")).q("Cms feature is disabled, quit the batch flow");
                    return eijx.e(cbcw.i());
                }
                final ekgb ekgbVar2 = ekgbVar;
                final Optional optional = optionalEmpty;
                final bzkg bzkgVar2 = bzkgVar;
                ejwl.b(!ekgbVar2.isEmpty(), "PWQ passed in empty requests!");
                final int i = ((byiv) ekgbVar2.get(0)).c;
                final bzjq bzjqVar = (bzjq) bzkgVar2.c;
                eiju eijuVarF = eijx.f(new Runnable() { // from class: bziy
                    @Override // java.lang.Runnable
                    public final void run() {
                        Stream stream = Collection.EL.stream(ekgbVar2);
                        Function function = new Function() { // from class: bzjl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Integer.valueOf(((byiv) obj2).d);
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        Supplier supplier = new Supplier() { // from class: bzjm
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new HashMap();
                            }
                        };
                        Function function2 = new Function() { // from class: bzjn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function3) {
                                return Function$CC.$default$andThen(this, function3);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((byiv) obj2).e;
                            }

                            public final /* synthetic */ Function compose(Function function3) {
                                return Function$CC.$default$compose(this, function3);
                            }
                        };
                        int i2 = ekgb.d;
                        final Map map = (Map) stream.collect(Collectors.groupingBy(function, supplier, Collectors.mapping(function2, ekcv.a)));
                        final bzjq bzjqVar2 = bzjqVar;
                        bzjqVar2.o.d("CmsBatchBackupSchedulerImpl#markNextBatchItemAsScheduled", new Runnable() { // from class: bzjo
                            @Override // java.lang.Runnable
                            public final void run() {
                                Map map2 = map;
                                bzjq bzjqVar3 = bzjqVar2;
                                bzjq.d(map2, 3, bzjqVar3.q);
                                bzjq.d(map2, 2, bzjqVar3.r);
                                bzjq.d(map2, 1, bzjqVar3.s);
                            }
                        });
                    }
                }, bzjqVar.i);
                eooz eoozVar = new eooz() { // from class: bzkd
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ekgb ekgbVar3;
                        ekgb ekgbVar4 = ekgbVar2;
                        if (ekgbVar4.isEmpty()) {
                            bzim.a.r("Work handler passed in empty request!");
                            ekgbVar3 = ekoe.a;
                        } else {
                            bzkg bzkgVar3 = bzkgVar2;
                            final Optional optional2 = optional;
                            final int i2 = ((byiv) ekgbVar4.get(0)).c;
                            Stream stream = Collection.EL.stream(ekgbVar4);
                            Function function = new Function() { // from class: bzii
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return Integer.valueOf(((byiv) obj3).d);
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            };
                            Supplier supplier = new Supplier() { // from class: bzij
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new HashMap();
                                }
                            };
                            Collector collector = ekcv.a;
                            Stream stream2 = Collection.EL.stream(((Map) stream.collect(Collectors.groupingBy(function, supplier, collector))).entrySet());
                            final bzim bzimVar = bzkgVar3.n;
                            ekgbVar3 = (ekgb) stream2.map(new Function() { // from class: bzik
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    Map.Entry entry = (Map.Entry) obj3;
                                    final ekgb ekgbVar5 = (ekgb) entry.getValue();
                                    final int iIntValue2 = ((Integer) entry.getKey()).intValue();
                                    cqbd cqbdVarC = bzim.a.c();
                                    cqbdVarC.y("type of jobs", iIntValue2);
                                    cqbdVarC.y("number of jobs", ekgbVar5.size());
                                    cqbdVarC.r();
                                    final bzim bzimVar2 = bzimVar;
                                    final Optional optional3 = optional2;
                                    eiju eijuVarI2 = bzimVar2.c.b(i2).i(new eooz() { // from class: bzif
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            final int i3 = iIntValue2;
                                            final ekgb ekgbVar6 = ekgbVar5;
                                            Consumer consumer = new Consumer() { // from class: bzie
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj5) {
                                                    carg cargVar = (carg) obj5;
                                                    cogw cogwVar = cargVar.a;
                                                    int size = ekgbVar6.size();
                                                    long jA = cogwVar.a();
                                                    int i4 = i3;
                                                    Integer numB = cargVar.b(i4);
                                                    if (numB != null) {
                                                        cargVar.d.set(numB.intValue(), new carf(jA, i4, size));
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                                    return Consumer$CC.$default$andThen(this, consumer2);
                                                }
                                            };
                                            Optional optional4 = optional3;
                                            optional4.ifPresent(consumer);
                                            bypt byptVar = (bypt) ((bzil) ehlh.a(bzimVar2.b, bzil.class, (efwo) obj4)).hd().get(Integer.valueOf(i3));
                                            byptVar.getClass();
                                            return byptVar.a(ekgbVar6, optional4);
                                        }
                                    }, bzimVar2.d);
                                    ejvr ejvrVar = new ejvr() { // from class: bzig
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            byhd byhdVar = (byhd) obj4;
                                            byqu byquVar = byhdVar.c;
                                            if (byquVar == null) {
                                                return new byhc(byhdVar.a, (Map) Collection.EL.stream(byhdVar.b.entrySet()).filter(new Predicate() { // from class: bzib
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
                                                    public final boolean test(Object obj5) {
                                                        return ((Map.Entry) obj5).getValue() instanceof byqo;
                                                    }
                                                }).collect(ekcv.a(new Function() { // from class: bzic
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        return (byiv) ((Map.Entry) obj5).getKey();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                }, new Function() { // from class: bzid
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        return (byqo) ((Map.Entry) obj5).getValue();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                })));
                                            }
                                            throw new bzia(byquVar.a);
                                        }
                                    };
                                    eosc eoscVar = bzimVar2.e;
                                    eiju eijuVarH = eijuVarI2.h(ejvrVar, eoscVar);
                                    return optional3.isPresent() ? eijuVarH.h(new ejvr() { // from class: bzih
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            byhc byhcVar = (byhc) obj4;
                                            carg cargVar = (carg) optional3.get();
                                            long jA = cargVar.a.a();
                                            carf carfVarA = cargVar.a(iIntValue2);
                                            if (carfVarA != null) {
                                                carfVarA.f = jA;
                                            }
                                            return byhcVar;
                                        }
                                    }, eoscVar) : eijuVarH;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            }).collect(collector);
                        }
                        return eijx.a(ekgbVar3);
                    }
                };
                eosc eoscVar = bzkgVar2.d;
                return eijuVarF.i(eoozVar, eoscVar).i(new eooz() { // from class: bzke
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        bzhw bzhwVarD = bzhx.d();
                        for (byhc byhcVar : (List) obj2) {
                            int i2 = byhcVar.a;
                            if (i2 == 1) {
                                bzhwVarD.c(ekgp.j(byhcVar.b));
                            } else if (i2 != 2) {
                                bzhwVarD.d(ekgp.j(byhcVar.b));
                            } else {
                                bzhwVarD.b(ekgp.j(byhcVar.b));
                            }
                        }
                        bzkg bzkgVar3 = bzkgVar2;
                        Optional optional2 = optional;
                        ekgb ekgbVar3 = ekgbVar2;
                        return bzkgVar3.c.a(i, bzhwVarD.a(), ekgbVar3, optional2);
                    }
                }, eoscVar).h(new ejvr() { // from class: bzkf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Stream map = Collection.EL.stream((ekgb) obj2).map(new Function() { // from class: bzjv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bzhn bzhnVar = (bzhn) obj3;
                                return cbcu.g("cms_batch_backup", bzhnVar.a(), bzhnVar.b());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i2 = ekgb.d;
                        return cbcw.j((ekgb) map.collect(ekcv.a));
                    }
                }, bzkgVar2.l).f(bzia.class, new eooz() { // from class: bzjt
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eiju eijuVarE;
                        boolean z = ((bzia) obj2).getCause() instanceof cpyy;
                        bzkg bzkgVar3 = bzkgVar2;
                        if (z) {
                            int i2 = i;
                            bzht bzhtVar = (bzht) bzkgVar3.f;
                            eijuVarE = auvw.c(bzhtVar.p, fcyi.a, fdjz.a, new bzhu(bzhtVar, i2, null)).h(new ejvr() { // from class: bzkb
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eksp ekspVar = bzkg.a;
                                    return cbcw.k();
                                }
                            }, bzkgVar3.d);
                        } else {
                            eijuVarE = eijx.e(cbcw.k());
                        }
                        Optional optional2 = optional;
                        if (!optional2.isPresent()) {
                            return eijuVarE;
                        }
                        return bzkgVar3.a(eijuVarE, (carg) optional2.get(), ekgbVar2);
                    }
                }, eoscVar).f(Exception.class, new eooz() { // from class: bzju
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Exception exc = (Exception) obj2;
                        bzkg bzkgVar3 = bzkgVar2;
                        if (bzkgVar3.m.a()) {
                            cpri.b("Terminating batch backup", exc);
                        } else {
                            bzkgVar3.h.b(exc);
                        }
                        Optional optional2 = optional;
                        ((eksl) ((eksl) ((eksl) bzkg.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupWorkHandlerDelegate", "processPendingWorkItemAsyncInternal", (char) 211, "CmsBatchBackupWorkHandlerDelegate.java")).q("Failed to continue batch backup, terminating the initial sync.");
                        eiju eijuVarH = bzkgVar3.e.b(2).h(new ejvr() { // from class: bzjw
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                eksp ekspVar = bzkg.a;
                                return cbcw.k();
                            }
                        }, bzkgVar3.d);
                        if (!optional2.isPresent()) {
                            return eijuVarH;
                        }
                        return bzkgVar3.a(eijuVarH, (carg) optional2.get(), ekgbVar2);
                    }
                }, eoscVar);
            }
        }, bzkgVar.d);
        return optionalEmpty.isPresent() ? bzkgVar.a(eijuVarI, (carg) optionalEmpty.get(), ekgbVar) : eijuVarI;
    }
}
