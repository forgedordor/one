package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzjq implements bzip {
    public static final eksp e = eksp.c("BugleCmsBatchBackup");
    static final cczi f = cdag.e(cdag.b, "cms_batch_back_up_retry_limit_per_scheduling_request", 4);
    public final aurx g;
    public final eosc h;
    public final eosc i;
    public final cden j;
    public final bzhz k;
    public final bzhz l;
    public final bzhz m;
    public final bzho n;
    public final dqsn o;
    public final byik p;
    public final bzbb q;
    public final bzbb r;
    public final bzbb s;
    public final bzmy t;
    public final apqc u;
    public final AtomicInteger v = new AtomicInteger(0);
    private final ains w;

    public bzjq(aurx aurxVar, bzhz bzhzVar, bzhz bzhzVar2, bzhz bzhzVar3, cden cdenVar, ains ainsVar, bzho bzhoVar, dqsn dqsnVar, byik byikVar, bzbb bzbbVar, bzbb bzbbVar2, bzbb bzbbVar3, bzmy bzmyVar, apqc apqcVar, eosc eoscVar, eosc eoscVar2) {
        this.g = aurxVar;
        this.k = bzhzVar;
        this.l = bzhzVar2;
        this.m = bzhzVar3;
        this.j = cdenVar;
        this.w = ainsVar;
        this.n = bzhoVar;
        this.p = byikVar;
        this.o = dqsnVar;
        this.q = bzbbVar;
        this.r = bzbbVar2;
        this.s = bzbbVar3;
        this.t = bzmyVar;
        this.u = apqcVar;
        this.h = eoscVar;
        this.i = eoscVar2;
    }

    public static int b(final ekfw ekfwVar, final ekgi ekgiVar, ekgp ekgpVar, final int i) {
        return ekgpVar.size() - ((int) Collection.EL.stream(ekgpVar.entrySet()).filter(new Predicate() { // from class: bzjh
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
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                eksp ekspVar = bzjq.e;
                byiv byivVar = (byiv) entry.getKey();
                byqo byqoVar = (byqo) entry.getValue();
                int i2 = byivVar.h + 1;
                if (!(byqoVar instanceof byqq)) {
                    if (i2 < (cpzi.b(Status.c(byqoVar.a)) ? (Integer) cpyl.c.e() : (Integer) cpyl.d.e()).intValue()) {
                        byiu byiuVar = (byiu) byivVar.toBuilder();
                        byiuVar.copyOnWrite();
                        byiv byivVar2 = (byiv) byiuVar.instance;
                        byivVar2.b |= 32;
                        byivVar2.h = i2;
                        byiv byivVar3 = (byiv) byiuVar.build();
                        Duration durationA = (i2 % 2 == 0 || !((Boolean) bzjq.c.e()).booleanValue()) ? byjd.a(i2, i) : Duration.ofMillis(10000L);
                        ekfw ekfwVar2 = ekfwVar;
                        bzhi bzhiVar = new bzhi();
                        bzhiVar.b(byivVar3);
                        bzhiVar.a = bzio.a(byivVar3, durationA);
                        ekfwVar2.h(bzhiVar.a());
                        return false;
                    }
                }
                ekgiVar.i(byivVar, byqoVar);
                return true;
            }
        }).count());
    }

    public static eiju c(bzhz bzhzVar, final int i, final aumf aumfVar, final int i2, final Optional optional) {
        if (!f()) {
            int i3 = ekgb.d;
            return eijx.e(ekoe.a);
        }
        if (i > 0) {
            return eijx.g(new Callable() { // from class: bzkr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Consumer consumer = new Consumer() { // from class: bzko
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            carg cargVar = (carg) obj;
                            long jA = cargVar.a.a();
                            card cardVar = (card) fcva.T(cargVar.e);
                            if (cardVar != null) {
                                cardVar.b = jA;
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    Optional optional2 = optional;
                    optional2.ifPresent(consumer);
                    final long j = aumfVar.e;
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("getEligibleMessageIds");
                    brdrVarD.h(new Function() { // from class: bzkm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.w(j);
                            brecVar.h();
                            brecVar.j(cpyi.w);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.y(i);
                    bran branVar = MessagesTable.c;
                    brdrVarD.d(new brdo(branVar.i, false));
                    botb botbVarE = botm.e();
                    botbVarE.i(new Function() { // from class: bzkn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.f();
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.E(dqts.i(botbVarE.b(), botm.c.a, branVar.b).g());
                    HashSet hashSet = new HashSet(brdrVarD.b().g());
                    optional2.ifPresent(new Consumer() { // from class: bzkp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            carg cargVar = (carg) obj;
                            long jA = cargVar.a.a();
                            card cardVar = (card) fcva.T(cargVar.e);
                            if (cardVar != null) {
                                cardVar.c = jA;
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    Stream stream = Collection.EL.stream(hashSet);
                    final int i4 = i2;
                    Stream map = stream.map(new Function() { // from class: bzkq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bzhy.a(1, ((MessageIdType) obj).b(), bzas.a(17), i4);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i5 = ekgb.d;
                    return (ekgb) map.collect(ekcv.a);
                }
            }, ((bzks) bzhzVar).a);
        }
        int i4 = ekgb.d;
        return eijx.e(ekoe.a);
    }

    public static void d(Map map, int i, bzbb bzbbVar) {
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            try {
                ekgb ekgbVar = (ekgb) map.get(numValueOf);
                ekgbVar.getClass();
                bzbbVar.b(ekgbVar, cpyi.SCHEDULED_BY_BATCH_BACKUP);
            } catch (bzdd unused) {
            }
        }
    }

    public static eiju e(bzhz bzhzVar, final int i, final aumf aumfVar, final int i2) {
        if (!f()) {
            int i3 = ekgb.d;
            return eijx.e(ekoe.a);
        }
        if (i > 0) {
            return eijx.g(new Callable() { // from class: bzki
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final long j = aumfVar.d;
                    botb botbVarE = botm.e();
                    botbVarE.A("getEligibleConversationIds");
                    botbVarE.g(new Function() { // from class: bzkk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bopp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bopq bopqVar = botm.c.a;
                    botbVarE.w(bopqVar);
                    botbVarE.i(new Function() { // from class: bzkl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.v(j);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brzh brzhVar = ParticipantsTable.c;
                    brzi brziVar = brzhVar.E;
                    brzi brziVar2 = brzhVar.a;
                    botbVarE.x(new dqxl("count($V{p})=count($V{p})", new Object[]{brziVar, brziVar2}));
                    String[] strArr = boiv.a;
                    boiq boiqVar = new boiq(boiv.a);
                    boiqVar.v();
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.v();
                    bsbm bsbmVarB = bsboVarE.b();
                    boic boicVar = boiv.c;
                    dqtr dqtrVarI = dqts.i(bsbmVarB, brziVar2, boicVar.b);
                    ((dqos) dqtrVarI).e = "p";
                    boiqVar.G(dqtrVarI);
                    dqtr dqtrVarI2 = dqts.i(boiqVar.b(), boicVar.a, bopqVar);
                    ((dqos) dqtrVarI2).e = "cpt";
                    botbVarE.H(dqtrVarI2.g());
                    HashSet hashSet = new HashSet(botbVarE.b().g());
                    botb botbVarE2 = botm.e();
                    botbVarE2.A("+ConversationBatchBackupScheduler#getConversationsToBackup");
                    botl botlVar = new botl();
                    botlVar.u(hashSet);
                    ekhx ekhxVar = cpyi.w;
                    int iIntValue = botm.g().intValue();
                    if (iIntValue < 58210) {
                        dqru.x("cms_life_cycle", iIntValue);
                    }
                    final int i4 = i2;
                    int i5 = i;
                    botlVar.ap(new dqpm("conversations.cms_life_cycle", 3, botl.as((Iterable) ekpo.a(ekhxVar).map(new Function() { // from class: botk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((cpyi) obj).ordinal());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new both()))), true));
                    botlVar.g();
                    botbVarE2.h(botlVar);
                    botbVarE2.e(new bosy(bopqVar, false));
                    botbVarE2.y(i5);
                    Stream map = Collection.EL.stream(botbVarE2.b().g()).map(new Function() { // from class: bzkh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bzhy.a(2, ((ConversationIdType) obj).a(), bzas.a(17), i4);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i6 = ekgb.d;
                    return (ekgb) map.collect(ekcv.a);
                }
            }, ((bzkj) bzhzVar).a);
        }
        int i4 = ekgb.d;
        return eijx.e(ekoe.a);
    }

    private static boolean f() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("isDefaultSelfBackedUp");
        bsboVarE.h(new Function() { // from class: bziq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                eksp ekspVar = bzjq.e;
                bsbxVar.v(-1);
                bsbxVar.f();
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsboVarE.b().U();
    }

    @Override // defpackage.bzip
    public final eiju a(final int i, final bzhx bzhxVar, final ekgb ekgbVar, final Optional optional) {
        final int i2 = this.v.get();
        if (i2 > ((Integer) f.e()).intValue()) {
            ((eksl) ((eksl) e.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 157, "CmsBatchBackupSchedulerImpl.java")).q("Scheduling failed after max number of retry");
            this.w.c("Bugle.Cms.BatchBackup.Abort.SchedulerFailure");
            return this.t.b(2).h(new ejvr() { // from class: bzji
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = bzjq.e;
                    int i3 = ekgb.d;
                    return ekoe.a;
                }
            }, eoqg.a);
        }
        ((eksl) e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 164, "CmsBatchBackupSchedulerImpl.java")).q("Schedule Next batch");
        int i3 = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        return this.g.k().i(new eooz() { // from class: bzjj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eiju eijuVarH;
                aumq aumqVar = (aumq) obj;
                final int i4 = i2;
                Consumer consumer = new Consumer() { // from class: bziz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        carg cargVar = (carg) obj2;
                        cogw cogwVar = cargVar.a;
                        eksp ekspVar = bzjq.e;
                        cargVar.e.add(new card(cogwVar.a(), i4 + 1));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Optional optional2 = optional;
                optional2.ifPresent(consumer);
                final bzjq bzjqVar = this.a;
                aurw aurwVar = bzjqVar.g.m;
                boolean zE = aurw.e(aumqVar);
                final Optional optional3 = optional2;
                final ekfw ekfwVar2 = ekfwVar;
                if (!zE) {
                    ((eksl) bzjq.e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 178, "CmsBatchBackupSchedulerImpl.java")).q("Feature disabled, stop scheduling");
                    return eijx.e(ekfwVar2.g());
                }
                if ((aumqVar.b & 65536) == 0) {
                    ((eksl) ((eksl) bzjq.e.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 183, "CmsBatchBackupSchedulerImpl.java")).q("Batch backup scheduling metadata does not exist. Batch backup terminated");
                    return bzjqVar.t.b(2).h(new ejvr() { // from class: bzja
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = bzjq.e;
                            return ekfwVar2.g();
                        }
                    }, eoqg.a);
                }
                aumf aumfVar = aumqVar.t;
                if (aumfVar == null) {
                    aumfVar = aumf.a;
                }
                final aumf aumfVar2 = aumfVar;
                final int i5 = i;
                final ekgb ekgbVar2 = ekgbVar;
                bzhx bzhxVar2 = bzhxVar;
                ekgi ekgiVar = new ekgi();
                bzhl bzhlVar = (bzhl) bzhxVar2;
                int iB = bzjq.b(ekfwVar2, ekgiVar, bzhlVar.a, 3);
                int iB2 = bzjq.b(ekfwVar2, ekgiVar, bzhlVar.b, 2);
                int iB3 = bzjq.b(ekfwVar2, ekgiVar, bzhlVar.c, 1);
                if (((Boolean) bzip.b.e()).booleanValue()) {
                    Stream map = Collection.EL.stream(ekgbVar2).map(new Function() { // from class: bzjc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bzio.b((byiv) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i6 = ekgb.d;
                    final ekgb ekgbVar3 = (ekgb) map.collect(ekcv.a);
                    cbfd cbfdVarA = cbfi.a();
                    cbfdVarA.A("CmsBatchBackupScheduleImpl#scheduleNextBatch");
                    cbfdVarA.e(new Function() { // from class: bzjd
                        public final /* synthetic */ String a = "cms_batch_backup";

                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cbfh cbfhVar = (cbfh) obj2;
                            eksp ekspVar = bzjq.e;
                            cbfhVar.i(this.a);
                            cbfhVar.b(ekgbVar3);
                            return cbfhVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final int iIntValue = (((((Integer) bzip.d.e()).intValue() - cbfdVarA.b().h()) - iB) - iB2) - iB3;
                    ejwl.d(iIntValue >= 0, "Scheduling logic broken, remaining quota is < 0. Remaining quota = %s", iIntValue);
                    if (iIntValue == 0) {
                        eijuVarH = eijx.e(ekfwVar2);
                    } else {
                        eiju eijuVarA = bzjqVar.k.a(iIntValue, aumfVar2, i5);
                        ejvr ejvrVar = new ejvr() { // from class: bziv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekgb ekgbVar4 = (ekgb) obj2;
                                eksp ekspVar = bzjq.e;
                                ekfwVar2.j(ekgbVar4);
                                return Integer.valueOf(iIntValue - ekgbVar4.size());
                            }
                        };
                        eosc eoscVar = bzjqVar.h;
                        eiju eijuVarH2 = eijuVarA.h(ejvrVar, eoscVar);
                        eooz eoozVar = new eooz() { // from class: bziw
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final Integer num = (Integer) obj2;
                                int iIntValue2 = num.intValue();
                                aumf aumfVar3 = aumfVar2;
                                int i7 = i5;
                                bzjq bzjqVar2 = bzjqVar;
                                eiju eijuVarE = bzjq.e(bzjqVar2.l, iIntValue2, aumfVar3, i7);
                                final ekfw ekfwVar3 = ekfwVar2;
                                return eijuVarE.h(new ejvr() { // from class: bzjb
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ekgb ekgbVar4 = (ekgb) obj3;
                                        eksp ekspVar = bzjq.e;
                                        ekfwVar3.j(ekgbVar4);
                                        return Integer.valueOf(num.intValue() - ekgbVar4.size());
                                    }
                                }, bzjqVar2.h);
                            }
                        };
                        eosc eoscVar2 = bzjqVar.i;
                        eijuVarH = eijuVarH2.i(eoozVar, eoscVar2).i(new eooz() { // from class: bzix
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return bzjq.c(bzjqVar.m, ((Integer) obj2).intValue(), aumfVar2, i5, optional3);
                            }
                        }, eoscVar2).h(new ejvr() { // from class: bzjp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekfw ekfwVar3 = ekfwVar2;
                                ekfwVar3.j((ekgb) obj2);
                                return ekfwVar3;
                            }
                        }, eoscVar);
                    }
                } else {
                    cczi ccziVar = bzjq.a;
                    int iIntValue2 = ((Integer) ccziVar.e()).intValue() - iB;
                    final int iIntValue3 = ((Integer) ccziVar.e()).intValue() - iB2;
                    final int iIntValue4 = ((Integer) ccziVar.e()).intValue() - iB3;
                    eiju eijuVarA2 = bzjqVar.k.a(iIntValue2, aumfVar2, i5);
                    ejvr ejvrVar2 = new ejvr() { // from class: bzjp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekfw ekfwVar3 = ekfwVar2;
                            ekfwVar3.j((ekgb) obj2);
                            return ekfwVar3;
                        }
                    };
                    eosc eoscVar3 = bzjqVar.h;
                    eiju eijuVarH3 = eijuVarA2.h(ejvrVar2, eoscVar3);
                    eooz eoozVar2 = new eooz() { // from class: bzir
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return bzjq.e(bzjqVar.l, iIntValue3, aumfVar2, i5);
                        }
                    };
                    eosc eoscVar4 = bzjqVar.i;
                    eiju eijuVarH4 = eijuVarH3.i(eoozVar2, eoscVar4).h(new ejvr() { // from class: bzjp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekfw ekfwVar3 = ekfwVar2;
                            ekfwVar3.j((ekgb) obj2);
                            return ekfwVar3;
                        }
                    }, eoscVar3);
                    eooz eoozVar3 = new eooz() { // from class: bzis
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return bzjq.c(bzjqVar.m, iIntValue4, aumfVar2, i5, optional3);
                        }
                    };
                    aumfVar2 = aumfVar2;
                    i5 = i5;
                    optional3 = optional3;
                    eijuVarH = eijuVarH4.i(eoozVar3, eoscVar4).h(new ejvr() { // from class: bzjp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekfw ekfwVar3 = ekfwVar2;
                            ekfwVar3.j((ekgb) obj2);
                            return ekfwVar3;
                        }
                    }, eoscVar3);
                }
                Stream map2 = Collection.EL.stream(ekgiVar.c().entrySet()).map(new Function() { // from class: bzit
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        byiv byivVar = (byiv) entry.getKey();
                        return bzjqVar.p.a(byivVar, ((byqo) entry.getValue()).a, true, byivVar.h);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i7 = ekgb.d;
                eiju eijuVarA3 = eijx.a((Iterable) map2.collect(ekcv.a));
                ejvr ejvrVar3 = new ejvr() { // from class: bziu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = bzjq.e;
                        return null;
                    }
                };
                eosc eoscVar5 = bzjqVar.h;
                eiju eijuVarI = eijuVarA3.h(ejvrVar3, eoscVar5).i(new eooz() { // from class: bzje
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eksp ekspVar = bzjq.e;
                        return eijuVarH;
                    }
                }, eoscVar5);
                ejvr ejvrVar4 = new ejvr() { // from class: bzjf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        int i8;
                        int i9;
                        int i10;
                        int i11;
                        long j;
                        long j2;
                        ekgb ekgbVarG = ((ekfw) obj2).g();
                        ekgb ekgbVar4 = ekgbVar2;
                        bzho bzhoVar = bzjqVar.n;
                        if (!bzhoVar.a(ekgbVarG, ekgbVar4)) {
                            return ekgbVarG;
                        }
                        final int i12 = i5;
                        final aumf aumfVar3 = aumfVar2;
                        ((eksl) bzjq.e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 277, "CmsBatchBackupSchedulerImpl.java")).q("Nothing to batch, initial backup completes");
                        aumfVar3.getClass();
                        final bzht bzhtVar = (bzht) bzhoVar;
                        bzhtVar.b.d("CmsBatchBackupCompletionProcessorImpl#markBatchBackupComplete", new Runnable() { // from class: bzhs
                            @Override // java.lang.Runnable
                            public final void run() {
                                final bzht bzhtVar2 = bzhtVar;
                                bzhtVar2.m.d();
                                if (((Boolean) bzhtVar2.l.b()).booleanValue()) {
                                    ((ajfo) bzhtVar2.k.b()).e(ajfo.G);
                                }
                                int i13 = i12;
                                caby cabyVar = bzhtVar2.d;
                                bzzx bzzxVar = bzzx.a;
                                bzzw bzzwVar = (bzzw) bzzxVar.createBuilder();
                                bzzwVar.getClass();
                                bzzv.b(i13, bzzwVar);
                                bzzx bzzxVarA = bzzv.a(bzzwVar);
                                caxr caxrVar = new caxr();
                                caxrVar.b = String.valueOf(i13);
                                cabyVar.a(bzzxVarA, caxrVar.a());
                                bzky bzkyVar = bzhtVar2.f;
                                bzzw bzzwVar2 = (bzzw) bzzxVar.createBuilder();
                                bzzwVar2.getClass();
                                bzzv.b(i13, bzzwVar2);
                                ((cazj) bzkyVar.a.b()).a(cbcu.f("cms_drop_unscheduled_item_to_dlq", bzzv.a(bzzwVar2)));
                                caru caruVar = bzhtVar2.g;
                                bzzw bzzwVar3 = (bzzw) bzzxVar.createBuilder();
                                bzzwVar3.getClass();
                                bzzv.b(i13, bzzwVar3);
                                ((cazj) caruVar.a.b()).a(cbcu.f("cms_backup_validation_work_handler", bzzv.a(bzzwVar3)));
                                bzhtVar2.b.g(new dqsm() { // from class: bzhq
                                    @Override // defpackage.dqsm
                                    public final eieu a() {
                                        return eiiy.a("CBBCPI::markBatchBackupComplete::runAfterCommit");
                                    }
                                }, "CmsBatchBackupCompletionProcessorImpl#markBatchBackupComplete#AfterCommit", new Runnable() { // from class: bzhr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        bzht bzhtVar3 = bzhtVar2;
                                        if (cpyl.a() && ((Boolean) ((cczi) cpxw.k.get()).e()).booleanValue()) {
                                            bzhtVar3.o.a(eijx.e(null), cpyk.a);
                                        }
                                        bzhtVar3.c.L();
                                    }
                                });
                            }
                        });
                        Duration durationOfSeconds = Duration.ofSeconds(bzhtVar.e.f().getEpochSecond() - aumfVar3.f);
                        cqbd cqbdVarC = bzht.a.c();
                        cqbdVarC.I("Sync complete");
                        cqbdVarC.z("backupDurationInMillis", durationOfSeconds.toMillis());
                        cqbdVarC.r();
                        if (bzhtVar.n.a()) {
                            aumq aumqVarC = bzhtVar.c.c();
                            ausj ausjVar = aumqVarC.C;
                            if (ausjVar == null) {
                                ausjVar = ausj.a;
                            }
                            int i13 = ausjVar.m;
                            ausj ausjVar2 = aumqVarC.C;
                            int i14 = (ausjVar2 == null ? ausj.a : ausjVar2).n;
                            int i15 = (ausjVar2 == null ? ausj.a : ausjVar2).i;
                            int i16 = (ausjVar2 == null ? ausj.a : ausjVar2).j;
                            long j3 = (ausjVar2 == null ? ausj.a : ausjVar2).e;
                            if (ausjVar2 == null) {
                                ausjVar2 = ausj.a;
                            }
                            i8 = i13;
                            i9 = i14;
                            i10 = i15;
                            i11 = i16;
                            j = j3;
                            j2 = ausjVar2.f;
                        } else {
                            i8 = 0;
                            i9 = 0;
                            i10 = 0;
                            i11 = 0;
                            j = 0;
                            j2 = 0;
                        }
                        aukz aukzVar = bzhtVar.j;
                        Map mapC = aulq.c(new fdap() { // from class: aulj
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.getClass();
                                brecVar.w(aumfVar3.e);
                                brecVar.k(cpyi.SUCCEED_VIA_BATCH_BACKUP, cpyi.FAILED_VIA_BATCH_BACKUP);
                                return brecVar;
                            }
                        });
                        aulp aulpVar = aulp.a;
                        int iIntValue5 = ((Number) Map.EL.getOrDefault(mapC, aulpVar, 0)).intValue();
                        aulp aulpVar2 = aulp.b;
                        int iIntValue6 = ((Number) Map.EL.getOrDefault(mapC, aulpVar2, 0)).intValue();
                        java.util.Map mapA = aulq.a(new fdap() { // from class: auln
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                botl botlVar = (botl) obj3;
                                botlVar.getClass();
                                botlVar.v(aumfVar3.d);
                                botlVar.h(cpyi.SUCCEED_VIA_BATCH_BACKUP, cpyi.FAILED_VIA_BATCH_BACKUP);
                                return botlVar;
                            }
                        });
                        int iIntValue7 = ((Number) Map.EL.getOrDefault(mapA, aulpVar, 0)).intValue();
                        int iIntValue8 = ((Number) Map.EL.getOrDefault(mapA, aulpVar2, 0)).intValue();
                        java.util.Map mapD = aulq.d(new fdap() { // from class: aule
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                bsbx bsbxVar = (bsbx) obj3;
                                bsbxVar.getClass();
                                bsbxVar.n(aumfVar3.c);
                                bsbxVar.h(cpyi.SUCCEED_VIA_BATCH_BACKUP, cpyi.FAILED_VIA_BATCH_BACKUP);
                                return bsbxVar;
                            }
                        });
                        aulr aulrVar = new aulr(iIntValue5, iIntValue6, iIntValue7, iIntValue8, ((Number) Map.EL.getOrDefault(mapD, aulpVar, 0)).intValue(), ((Number) Map.EL.getOrDefault(mapD, aulpVar2, 0)).intValue(), 0, 0, i8, i9, 0, 0, i10, i11, 0L, 0L, 0L, j, j2);
                        emcw emcwVar = (emcw) emcx.a.createBuilder();
                        emec emecVarC = aukzVar.c(emec.BACKUP);
                        emcwVar.copyOnWrite();
                        emcx emcxVar = (emcx) emcwVar.instance;
                        emcxVar.c = emecVarC.s;
                        emcxVar.b |= 1;
                        long millis = durationOfSeconds.toMillis();
                        emcwVar.copyOnWrite();
                        emcx emcxVar2 = (emcx) emcwVar.instance;
                        emcxVar2.b |= 8;
                        emcxVar2.f = millis;
                        emcwVar.copyOnWrite();
                        emcx emcxVar3 = (emcx) emcwVar.instance;
                        emcxVar3.d = 8;
                        emcxVar3.b |= 2;
                        emcn emcnVar = emcn.NO_FAILURE;
                        emcwVar.copyOnWrite();
                        emcx emcxVar4 = (emcx) emcwVar.instance;
                        emcxVar4.e = emcnVar.bs;
                        emcxVar4.b |= 4;
                        emcwVar.a(aukzVar.b());
                        emce emceVar = (emce) emek.a.createBuilder();
                        emcx emcxVar5 = (emcx) emcwVar.build();
                        emceVar.copyOnWrite();
                        emek emekVar = (emek) emceVar.instance;
                        emcxVar5.getClass();
                        emekVar.c = emcxVar5;
                        emekVar.b |= 1;
                        aukzVar.k((emek) emceVar.build(), aulrVar, false);
                        if (((apoi) bzhtVar.q.b()).a()) {
                            try {
                                bzug bzugVar = ((bzht) bzhoVar).h;
                                bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
                                bzzwVar.getClass();
                                bzzv.b(i12, bzzwVar);
                                ((cazj) bzugVar.a.b()).a(cbcu.f("cms_media_download_queuer_work_handler", bzzv.a(bzzwVar)));
                            } catch (Exception e2) {
                                bzht.a.o("Failed to queue media download, media will appear as click-to-download icons.", e2);
                            }
                        }
                        if (((apoj) bzhtVar.r.b()).a()) {
                            int i17 = 3;
                            while (i17 > 0) {
                                try {
                                    bzuq bzuqVar = ((bzht) bzhoVar).i;
                                    bzzw bzzwVar2 = (bzzw) bzzx.a.createBuilder();
                                    bzzwVar2.getClass();
                                    bzzv.b(i12, bzzwVar2);
                                    ((cazj) bzuqVar.a.b()).a(cbcu.f("cms_media_upload_queuer_work_handler", bzzv.a(bzzwVar2)));
                                    i17 = 0;
                                } catch (Exception e3) {
                                    i17--;
                                    bzht.a.o(a.e(i17, "Failed to queue media upload, ", " retries left."), e3);
                                }
                            }
                        }
                        if (((eoth) ((aotl) bzhtVar.s).a.b()).a("bugle.logs_session_ids_in_cms")) {
                            bzlr bzlrVar = bzhtVar.t;
                            bzzw bzzwVar3 = (bzzw) bzzx.a.createBuilder();
                            bzzwVar3.getClass();
                            bzzv.b(i12, bzzwVar3);
                            ((cazj) bzlrVar.a.b()).a(cbcu.f("upload_previous_cms_session_ids", bzzv.a(bzzwVar3)));
                        }
                        int i18 = ekgb.d;
                        return ekoe.a;
                    }
                };
                eosc eoscVar6 = bzjqVar.i;
                eiju eijuVarH5 = eijuVarI.h(ejvrVar4, eoscVar6);
                return !optional3.isPresent() ? eijuVarH5 : eijuVarH5.h(new ejvr() { // from class: bzjg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgb ekgbVar4 = (ekgb) obj2;
                        eksp ekspVar = bzjq.e;
                        carg cargVar = (carg) optional3.get();
                        cogw cogwVar = cargVar.a;
                        List list = cargVar.e;
                        long jA = cogwVar.a();
                        card cardVar = (card) fcva.T(list);
                        if (cardVar != null) {
                            cardVar.d = jA;
                        }
                        return ekgbVar4;
                    }
                }, eoscVar6);
            }
        }, this.i).f(Throwable.class, new eooz() { // from class: bzjk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                ((eksl) ((eksl) ((eksl) bzjq.e.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", (char) 302, "CmsBatchBackupSchedulerImpl.java")).q("Schedule next batch failed, will retry");
                bzjq bzjqVar = this.a;
                if (bzjqVar.u.a()) {
                    cpri.c("Schedule next batch failed, will retry", th);
                } else {
                    bzjqVar.j.b(th);
                }
                Optional optional2 = optional;
                ekgb ekgbVar2 = ekgbVar;
                bzhx bzhxVar2 = bzhxVar;
                int i4 = i;
                bzjqVar.v.addAndGet(1);
                return bzjqVar.a(i4, bzhxVar2, ekgbVar2, optional2);
            }
        }, this.h);
    }
}
