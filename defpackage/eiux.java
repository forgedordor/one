package defpackage;

import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiux {
    private final List a = new ArrayList();
    private eiuv b;

    private eiux() {
    }

    static eiux b(String str, Supplier supplier) {
        eiux eiuxVarO = o(str);
        eiuxVarO.l("identifier", new Function() { // from class: eitu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiyb) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVarO.l("name", new Function() { // from class: eitv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiyb) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return eiuxVarO;
    }

    public static evwg c(String str) {
        evwf evwfVar = (evwf) evwg.a.createBuilder();
        evwfVar.copyOnWrite();
        evwg evwgVar = (evwg) evwfVar.instance;
        str.getClass();
        evwgVar.b = 3;
        evwgVar.c = str;
        return (evwg) evwfVar.build();
    }

    public static evwg d(evvl evvlVar) {
        evwf evwfVar = (evwf) evwg.a.createBuilder();
        evwfVar.copyOnWrite();
        evwg evwgVar = (evwg) evwfVar.instance;
        evvlVar.getClass();
        evwgVar.c = evvlVar;
        evwgVar.b = 5;
        return (evwg) evwfVar.build();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eiuv] */
    static eiux o(final String str) {
        eiux eiuxVar = new eiux();
        eiuxVar.l("@type", new Function() { // from class: eiuu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.of(str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eiuxVar.b = new Object() { // from class: eiuv
        };
        return eiuxVar;
    }

    final eith a() {
        Optional.ofNullable(this.b);
        return new eiuz(this.a);
    }

    public final void e(String str, Function function, eirk eirkVar) {
        this.a.add(new eirj(str, function, eirkVar));
    }

    final void f(final Function function) {
        e("duration", new Function() { // from class: eius
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eiua
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Duration) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eiut
        });
    }

    final void g(String str, final Function function) {
        e(str, new Function() { // from class: eiuw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eitz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Enum) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eitj
        });
    }

    final void h(String str, final Function function) {
        e(str, new Function() { // from class: eiuo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eiue
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((LocalDate) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eiup
        });
    }

    final void i(String str, final Function function) {
        e(str, new Function() { // from class: eitk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eiun
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((LocalTime) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eitl
        });
    }

    public final void j(String str, final Function function, final Function function2) {
        e(str, new Function() { // from class: eiub
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Function function3 = function;
                if (((List) function3.apply(obj)).isEmpty()) {
                    return Optional.empty();
                }
                List list = (List) Collection.EL.stream((List) function3.apply(obj)).map(function2).filter(new Predicate() { // from class: eitq
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
                        return ((Optional) obj2).isPresent();
                    }
                }).map(new Function() { // from class: eitr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function4) {
                        return Function$CC.$default$andThen(this, function4);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (evwg) ((Optional) obj2).get();
                    }

                    public final /* synthetic */ Function compose(Function function4) {
                        return Function$CC.$default$compose(this, function4);
                    }
                }).collect(eivu.a());
                evwf evwfVar = (evwf) evwg.a.createBuilder();
                evtt evttVar = (evtt) evtu.a.createBuilder();
                evttVar.copyOnWrite();
                evtu evtuVar = (evtu) evttVar.instance;
                evtg evtgVar = evtuVar.b;
                if (!evtgVar.c()) {
                    evtuVar.b = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list, evtuVar.b);
                evtu evtuVar2 = (evtu) evttVar.build();
                evwfVar.copyOnWrite();
                evwg evwgVar = (evwg) evwfVar.instance;
                evtuVar2.getClass();
                evwgVar.c = evtuVar2;
                evwgVar.b = 6;
                return Optional.of((evwg) evwfVar.build());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new eirk() { // from class: eium
        });
    }

    final void k(String str, final Function function, final eith eithVar) {
        e(str, new Function() { // from class: eiug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional map = ((Optional) function.apply(obj)).map(Function$CC.identity());
                final eith eithVar2 = eithVar;
                eithVar2.getClass();
                return map.map(new Function() { // from class: eiuk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eithVar2.a(obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new Function() { // from class: eiul
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eiux.d((evvl) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eiuh
        });
    }

    final void l(String str, final Function function) {
        e(str, new Function() { // from class: eitw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eitx
        });
    }

    final void m(String str, final Function function) {
        e(str, new Function() { // from class: eiuc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) function.apply(obj)).map(new Function() { // from class: eitn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ZonedDateTime) obj2).toOffsetDateTime();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new Function() { // from class: eito
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((OffsetDateTime) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new eitp());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eirk() { // from class: eiud
        });
    }

    final void n(String str, Function function, final eith eithVar) {
        j(str, function, new Function() { // from class: eitm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional optionalOfNullable = Optional.ofNullable(obj);
                final eith eithVar2 = eithVar;
                return optionalOfNullable.map(new Function() { // from class: eitt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eiux.d(eithVar2.a(obj2));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
    }
}
