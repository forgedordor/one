package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajkc {
    private final eazr a;

    public ajkc(eazr eazrVar) {
        this.a = eazrVar;
    }

    public final void a(final long j, final List list) {
        ((ekrd) ((ekrd) eazr.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltLoggerImpl", "logOccurrence", 35, "MobaltLoggerImpl.java")).q("Mobalt: schedule recording occurrence metric");
        final eazr eazrVar = this.a;
        final eiju eijuVarH = eijx.h(new eooy() { // from class: eazq
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eazr eazrVar2 = eazrVar;
                final long epochMilli = eazrVar2.d.f().toEpochMilli();
                final ejro ejroVar = ejro.OCCURRENCE;
                final Consumer consumer = new Consumer() { // from class: ebbp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ejwl.b(((Long) obj).longValue() >= 0, "occurrence count can't be negative");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final ebbt ebbtVar = eazrVar2.c;
                if (!ebbtVar.d) {
                    return ebbtVar.h.a(ebbtVar.l.f());
                }
                final List list2 = list;
                final long j2 = j;
                ((ekrd) ((ekrd) ebbt.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "logNumeric", 117, "LogWriter.java")).t("Mobalt: start logging %s metric", ejroVar);
                ejwl.f(true, "logNumeric must be called with OCCURRENCE or INTEGER metric types, not %s", ejroVar);
                eiju eijuVarB = ebbtVar.h.b(ebbtVar.l.f());
                ejvr ejvrVar = new ejvr() { // from class: ebbm
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejro ejroVar2;
                        ejqu ejquVar = ebbtVar.b;
                        ejwl.b(ejquVar.b.size() == 1, "must be one customer");
                        ejwl.b(((ejqw) ejquVar.b.get(0)).c.size() == 1, "must be one project");
                        consumer.z(1L);
                        ejwl.b(Collection.EL.stream(list2).allMatch(new Predicate() { // from class: ebbj
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
                                return ((Integer) obj2).intValue() >= 0;
                            }
                        }), "event vectors can't contain negative event codes");
                        Stream stream = Collection.EL.stream(((ejrz) ((ejqw) ejquVar.b.get(0)).c.get(0)).c);
                        final long j3 = j2;
                        Optional optionalFindFirst = stream.filter(new Predicate() { // from class: ebbl
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
                                return ((long) ((ejrp) obj2).b) == j3;
                            }
                        }).findFirst();
                        ejwl.e(optionalFindFirst.isPresent(), "failed to find metric with ID: %s", j3);
                        int i = ((ejrp) optionalFindFirst.get()).c;
                        if (i != 0) {
                            switch (i) {
                                case 8:
                                    ejroVar2 = ejro.OCCURRENCE;
                                    break;
                                case 9:
                                    ejroVar2 = ejro.INTEGER;
                                    break;
                                case 10:
                                    ejroVar2 = ejro.INTEGER_HISTOGRAM;
                                    break;
                                case 11:
                                    ejroVar2 = ejro.STRING;
                                    break;
                                case 12:
                                    ejroVar2 = ejro.STRUCT;
                                    break;
                                default:
                                    ejroVar2 = null;
                                    break;
                            }
                        } else {
                            ejroVar2 = ejro.UNSET;
                        }
                        if (ejroVar2 == null) {
                            ejroVar2 = ejro.UNRECOGNIZED;
                        }
                        ejro ejroVar3 = ejroVar;
                        ejwl.i(ejroVar2 == ejroVar3, "wrong metric type, input type is %s, found %s", ejroVar3, ejroVar2);
                        return (ejrp) optionalFindFirst.get();
                    }
                };
                ExecutorService executorService = ebbtVar.e;
                return eijuVarB.h(ejvrVar, executorService).e(IllegalArgumentException.class, new ejvr() { // from class: ebbn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ebbt ebbtVar2 = ebbtVar;
                        IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                        ebbtVar2.k.c(ebbtVar2.f, (int) ebbtVar2.g, "INVALID_METRIC_PARAMS");
                        throw illegalArgumentException;
                    }
                }, executorService).i(new eooz() { // from class: ebbo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        List list3 = list2;
                        final ebbt ebbtVar2 = ebbtVar;
                        final ejrp ejrpVar = (ejrp) obj;
                        final eayr eayrVarB = eayr.b(list3);
                        int iA = ebbtVar2.c.a();
                        ejrj ejrjVar = ejrpVar.g;
                        if (ejrjVar == null) {
                            ejrjVar = ejrj.a;
                        }
                        if (iA > ejrjVar.b) {
                            return eijx.e(null);
                        }
                        final long j3 = epochMilli;
                        eiju eijuVarA = ebbtVar2.j.a();
                        ejvr ejvrVar2 = new ejvr() { // from class: ebbq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ebbt ebbtVar3 = ebbtVar2;
                                ebbtVar3.k.c(ebbtVar3.f, (int) ebbtVar3.g, "EXPERIMENT_IDS_DECODING_ERROR");
                                return ekoo.c;
                            }
                        };
                        ExecutorService executorService2 = ebbtVar2.e;
                        return eijuVarA.e(ebbd.class, ejvrVar2, executorService2).i(new eooz() { // from class: ebbr
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                int i;
                                int iA2;
                                int iA3;
                                int iA4;
                                ebbr ebbrVar = this;
                                ejrp ejrpVar2 = ejrpVar;
                                ekik ekikVar = (ekik) obj2;
                                final int iA5 = ebbb.a(ejrpVar2, Instant.ofEpochMilli(j3));
                                int i2 = ekgb.d;
                                ekfw ekfwVar = new ekfw();
                                for (ejsi ejsiVar : ejrpVar2.h) {
                                    ejsa ejsaVarB = ejsa.b(ejsiVar.q);
                                    if (ejsaVarB == null) {
                                        ejsaVarB = ejsa.UNRECOGNIZED;
                                    }
                                    ebbt ebbtVar3 = ebbtVar2;
                                    if (ejsaVarB == ejsa.RELEASE_STAGE_NOT_SET || ebbtVar3.c.a() <= ejsiVar.q) {
                                        final eayr eayrVar = eayrVarB;
                                        ejrp ejrpVar3 = ejrpVar2;
                                        final eaxo eaxoVar = new eaxo(ebbtVar3.f, ebbtVar3.g, ejrpVar2.b, ejsiVar.f);
                                        int i3 = ejsiVar.g;
                                        int iA6 = ejsf.a(i3);
                                        if (iA6 != 0 && iA6 == 14 && (((iA2 = ejsd.a((i = ejsiVar.k))) != 0 && iA2 == 9) || ((iA3 = ejsd.a(i)) != 0 && iA3 == 10))) {
                                            final eayh eayhVar = ebbtVar3.h;
                                            final ejsu ejsuVarA = ebbtVar3.i.a(ejsiVar, ekikVar);
                                            int iA7 = ejsw.a(ejsiVar.p);
                                            final int i4 = iA7 == 0 ? 1 : iA7;
                                            final long j4 = ejsiVar.m;
                                            ekfwVar.h(eiju.g(eayhVar.c.d(new ecnz() { // from class: eaxx
                                                @Override // defpackage.ecnz
                                                public final void a(ecoa ecoaVar) throws InterruptedException {
                                                    eayh.f(ecoaVar, eaxoVar, iA5, ejsuVarA, i4, eayrVar, j4, 0, new BiFunction() { // from class: eayf
                                                        public final /* synthetic */ BiFunction andThen(Function function) {
                                                            return BiFunction$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.BiFunction
                                                        public final Object apply(Object obj3, Object obj4) {
                                                            ((Integer) obj3).intValue();
                                                            ekrg ekrgVar = eayh.a;
                                                            return ((Optional) obj4).isPresent() ? Optional.empty() : Optional.of(eayg.b());
                                                        }
                                                    });
                                                }
                                            })));
                                        } else {
                                            int iA8 = ejsf.a(i3);
                                            if (iA8 != 0 && iA8 == 19 && (iA4 = ejsd.a(ejsiVar.k)) != 0 && iA4 == 5) {
                                                final eayh eayhVar2 = ebbtVar3.h;
                                                final ejsu ejsuVarA2 = ebbtVar3.i.a(ejsiVar, ekikVar);
                                                int iA9 = ejsw.a(ejsiVar.p);
                                                final int i5 = iA9 == 0 ? 1 : iA9;
                                                final long j5 = ejsiVar.m;
                                                ekfwVar.h(eiju.g(eayhVar2.c.d(new ecnz() { // from class: eaya
                                                    @Override // defpackage.ecnz
                                                    public final void a(ecoa ecoaVar) throws InterruptedException {
                                                        eayh.f(ecoaVar, eaxoVar, iA5, ejsuVarA2, i5, eayrVar, j5, 1L, new eaxq(new BiFunction() { // from class: eayb
                                                            public final /* synthetic */ BiFunction andThen(Function function) {
                                                                return BiFunction$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.BiFunction
                                                            public final Object apply(Object obj3, Object obj4) {
                                                                return Long.valueOf(Math.max(((Long) obj3).longValue(), ((Long) obj4).longValue()));
                                                            }
                                                        }));
                                                    }
                                                })));
                                            } else {
                                                int iA10 = ejsf.a(i3);
                                                if (iA10 != 0 && iA10 == 13) {
                                                    final eayh eayhVar3 = ebbtVar3.h;
                                                    final ejsu ejsuVarA3 = ebbtVar3.i.a(ejsiVar, ekikVar);
                                                    final long j6 = ejsiVar.m;
                                                    ekfwVar.h(eiju.g(eayhVar3.c.d(new ecnz() { // from class: eaxy
                                                        @Override // defpackage.ecnz
                                                        public final void a(ecoa ecoaVar) throws InterruptedException {
                                                            eayh.f(ecoaVar, eaxoVar, iA5, ejsuVarA3, 5, eayrVar, j6, 1L, new eaxq(new BiFunction() { // from class: eaxz
                                                                public final /* synthetic */ BiFunction andThen(Function function) {
                                                                    return BiFunction$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.BiFunction
                                                                public final Object apply(Object obj3, Object obj4) {
                                                                    long jLongValue = ((Long) obj3).longValue();
                                                                    long jLongValue2 = ((Long) obj4).longValue();
                                                                    long j7 = jLongValue + jLongValue2;
                                                                    if (((jLongValue2 ^ jLongValue) < 0) || ((jLongValue ^ j7) >= 0)) {
                                                                        return Long.valueOf(j7);
                                                                    }
                                                                    throw new ArithmeticException();
                                                                }
                                                            }));
                                                        }
                                                    })));
                                                }
                                            }
                                        }
                                        ebbrVar = this;
                                        ejrpVar2 = ejrpVar3;
                                    }
                                }
                                return eijx.a(ekfwVar.g());
                            }
                        }, executorService2).h(new ejvr() { // from class: ebbs
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((ekrd) ((ekrd) ebbt.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "recordSuccess", 175, "LogWriter.java")).r("Mobalt: logged event to %s reports", ((List) obj2).size());
                                return null;
                            }
                        }, executorService2).e(RuntimeException.class, new ejvr() { // from class: ebbk
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ebbt ebbtVar3 = ebbtVar2;
                                RuntimeException runtimeException = (RuntimeException) obj2;
                                ebbtVar3.k.c(ebbtVar3.f, (int) ebbtVar3.g, "UNEXPECTED_EXCEPTION");
                                throw runtimeException;
                            }
                        }, executorService2);
                    }
                }, executorService);
            }
        }, eazrVar.b);
        final Object[] objArr = new Object[0];
        eijuVarH.b(eiid.k(new Runnable() { // from class: ebai
            @Override // java.lang.Runnable
            public final void run() {
                ebaj.a(eijuVarH, objArr);
            }
        }), eoqg.a);
    }
}
