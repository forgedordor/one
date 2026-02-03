package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixq implements egsc {
    public static final cczi a = cdag.f(cdag.b, "rcs_limbo_messages_resolver_worker_frequency_hours", 6);
    private final fcsu b;

    public cixq(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        eiju eijuVarI;
        final cixk cixkVar = (cixk) this.b.b();
        if (cixkVar.m.a()) {
            eiju eijuVarA = cixkVar.a();
            eooz eoozVar = new eooz() { // from class: cixi
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final cixk cixkVar2 = cixkVar;
                    final long epochMilli = cixkVar2.e.f().minus(cixk.b).toEpochMilli();
                    return eijx.g(new Callable() { // from class: ciwt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            bfsa bfsaVar = (bfsa) cixkVar2.k.b();
                            brdr brdrVarD = MessagesTable.d();
                            bran branVar = MessagesTable.c;
                            brdrVarD.c(branVar.a);
                            botb botbVarE = botm.e();
                            botbVarE.v();
                            botbVarE.i(new Function() { // from class: ciwu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    botl botlVar = (botl) obj2;
                                    cqce cqceVar = cixk.a;
                                    botlVar.j(0);
                                    botlVar.q();
                                    return botlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdr brdrVar = (brdr) brdrVarD.j(dqts.i(botbVarE.b(), botm.c.a, branVar.b));
                            final long j = epochMilli;
                            brdrVar.h(new Function() { // from class: ciwv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar = (brec) obj2;
                                    cqce cqceVar = cixk.a;
                                    brecVar.J(3);
                                    brecVar.ah(cixk.c);
                                    brecVar.R(j);
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return bfsaVar.f(brdrVar).b().E();
                        }
                    }, cixkVar2.f);
                }
            };
            eosc eoscVar = cixkVar.g;
            eijuVarI = eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: cixj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Stream streamDistinct = ((Stream) obj).limit(200L).map(new Function() { // from class: ciwo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cqce cqceVar = cixk.a;
                            return Optional.ofNullable(((bdxm) obj2).h());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new ciwz()).distinct();
                    final cixk cixkVar2 = cixkVar;
                    Stream map = streamDistinct.map(new Function() { // from class: cixc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((alrj) cixkVar2.j.b()).r((String) ((Optional) obj2).get());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new cixd(cixkVar2));
                    try {
                        int i = ekgb.d;
                        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                        eiju eijuVarA2 = ekgbVar.isEmpty() ? ((cixm) ((Optional) cixkVar2.i.b()).get()).a() : eijx.j(ekgbVar).a(new Callable() { // from class: cixe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekgb ekgbVar2 = ekgbVar;
                                int size = ekgbVar2.size();
                                int iIntValue = 0;
                                for (int i2 = 0; i2 < size; i2++) {
                                    iIntValue += ((Integer) eork.q((eiju) ekgbVar2.get(i2))).intValue();
                                }
                                if (iIntValue <= 0) {
                                    return null;
                                }
                                cixkVar2.b(iIntValue);
                                return null;
                            }
                        }, cixkVar2.f);
                        if (map != null) {
                            map.close();
                        }
                        return eijuVarA2;
                    } catch (Throwable th) {
                        if (map != null) {
                            try {
                                map.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }, eoscVar);
        } else {
            eiju eijuVarA2 = cixkVar.a();
            eooz eoozVar2 = new eooz() { // from class: ciwr
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final cixk cixkVar2 = cixkVar;
                    long epochMilli = cixkVar2.e.f().minus(cixk.b).toEpochMilli();
                    String[] strArr = bgvl.a;
                    final bgvk bgvkVar = new bgvk();
                    bgvkVar.ap(new dqty("messages.message_protocol", 1, 3));
                    bgvkVar.f(cixk.c);
                    bgvkVar.e(epochMilli);
                    int iIntValue = bgvl.c().intValue();
                    if (iIntValue < 10007) {
                        dqru.x("conv_type", iIntValue);
                    }
                    bgvkVar.ap(new dqty("conversations.conv_type", 1, 0));
                    int iIntValue2 = bgvl.c().intValue();
                    if (iIntValue2 < 12001) {
                        dqru.x("has_ea2p_bot_recipient", iIntValue2);
                    }
                    bgvkVar.ap(new dqty("conversations.has_ea2p_bot_recipient", 1, 0));
                    return eijx.g(new Callable() { // from class: ciww
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            bgvg bgvgVarA = ((bfsa) cixkVar2.k.b()).a();
                            bgvgVarA.e(bgvkVar);
                            return bgvgVarA.b().E();
                        }
                    }, cixkVar2.f);
                }
            };
            eosc eoscVar2 = cixkVar.g;
            eijuVarI = eijuVarA2.i(eoozVar2, eoscVar2).i(new eooz() { // from class: ciws
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Stream streamDistinct = ((Stream) obj).limit(200L).map(new Function() { // from class: cixf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cqce cqceVar = cixk.a;
                            return Optional.ofNullable(((bfsb) obj2).h());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new ciwz()).distinct();
                    final cixk cixkVar2 = cixkVar;
                    Stream map = streamDistinct.map(new Function() { // from class: cixg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((alrj) cixkVar2.j.b()).r((String) ((Optional) obj2).get());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new cixd(cixkVar2));
                    try {
                        int i = ekgb.d;
                        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                        eiju eijuVarA3 = ekgbVar.isEmpty() ? ((cixm) ((Optional) cixkVar2.i.b()).get()).a() : eijx.j(ekgbVar).a(new Callable() { // from class: cixh
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekgb ekgbVar2 = ekgbVar;
                                int size = ekgbVar2.size();
                                int iIntValue = 0;
                                for (int i2 = 0; i2 < size; i2++) {
                                    iIntValue += ((Integer) eork.q((eiju) ekgbVar2.get(i2))).intValue();
                                }
                                if (iIntValue <= 0) {
                                    return null;
                                }
                                cixkVar2.b(iIntValue);
                                return null;
                            }
                        }, cixkVar2.f);
                        if (map != null) {
                            map.close();
                        }
                        return eijuVarA3;
                    } catch (Throwable th) {
                        if (map != null) {
                            try {
                                map.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }, eoscVar2);
        }
        return eijuVarI.h(new ejvr() { // from class: cixp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = cixq.a;
                return new qao();
            }
        }, eoqg.a);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
