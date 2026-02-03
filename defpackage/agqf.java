package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqf extends cayv {
    private final eosd a;
    private final agpc b;

    public agqf(eosd eosdVar, agpc agpcVar) {
        this.a = eosdVar;
        this.b = agpcVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("P13nWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return agqd.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eiju eijuVarI;
        if (((Boolean) agpz.a.e()).booleanValue()) {
            final agpg agpgVar = (agpg) this.b;
            final agoz agozVar = agpgVar.c;
            eooy eooyVar = new eooy() { // from class: agoq
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String[] strArr = brgt.a;
                    brgq brgqVar = new brgq(brgt.a);
                    brgqVar.A("getDaysWhichHaveFeatures");
                    brgqVar.u();
                    brgqVar.d(new Function() { // from class: agox
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((brgd) obj).b;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brgqVar.c(new brgn(brgt.c.b));
                    brgqVar.y(((Integer) agpz.d.e()).intValue());
                    return brgqVar.b().x().h(new ejvr() { // from class: agoy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            final HashSet hashSet = new HashSet();
                            Collection.EL.stream((ekgb) obj).forEach(new Consumer() { // from class: agow
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    brfq brfqVar = (brfq) obj2;
                                    brfqVar.aA(1, "date");
                                    hashSet.add(brfqVar.b);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return hashSet;
                        }
                    }, agozVar.c);
                }
            };
            eosc eoscVar = agozVar.b;
            final eiju eijuVarH = eijx.h(eooyVar, eoscVar);
            final Instant instantB = barq.b(agozVar.a.f().toEpochMilli());
            final eiju eijuVarH2 = eijx.h(new eooy() { // from class: agou
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("getDaysWhichHaveSentMessages");
                    brdrVarD.u();
                    final Instant instant = instantB;
                    brdrVarD.h(new Function() { // from class: agor
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.Z(instant.minus(Duration.ofDays(((Integer) agpz.d.e()).intValue())).toEpochMilli());
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.f(new Function() { // from class: agos
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bran) obj).g;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brdrVarD.b().x().h(new ejvr() { // from class: agot
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            final HashSet hashSet = new HashSet();
                            Collection.EL.stream((ekgb) obj).forEach(new Consumer() { // from class: agov
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    hashSet.add(barq.b(((MessagesTable.BindData) obj2).z()));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return hashSet;
                        }
                    }, agozVar.c);
                }
            }, eoscVar);
            eijuVarI = eijx.k(eijuVarH, eijuVarH2).a(new Callable() { // from class: agop
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Set set = (Set) eork.q(eijuVarH);
                    Set set2 = (Set) eork.q(eijuVarH2);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int iIntValue = ((Integer) agpz.d.e()).intValue(); iIntValue > 0; iIntValue--) {
                        Instant instantMinus = instantB.minus(Duration.ofDays(iIntValue));
                        if (set2.contains(instantMinus) && !set.contains(instantMinus)) {
                            arrayDeque.add(instantMinus);
                        }
                    }
                    return arrayDeque;
                }
            }, agozVar.c).i(new eooz() { // from class: agpe
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return agpgVar.a((Queue) obj);
                }
            }, agpgVar.b);
        } else {
            eijuVarI = eijx.e(null);
        }
        return eijuVarI.h(new ejvr() { // from class: agqe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cbcw.i();
            }
        }, this.a);
    }
}
