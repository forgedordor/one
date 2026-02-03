package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eivh implements eiqt {
    public final eipv a;
    public final eivp b;
    private final Optional c;
    private final Object d;
    private final Optional e;
    private final Executor f;

    public eivh(eivp eivpVar, Optional optional, Object obj, eipv eipvVar, Optional optional2, Executor executor) {
        this.b = eivpVar;
        this.c = optional;
        this.d = obj;
        this.a = eipvVar;
        this.e = optional2;
        this.f = executor;
    }

    @Override // defpackage.eipu
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.eiqt
    public final eiyl d() {
        eiyk eiykVar = (eiyk) eiyl.a.createBuilder();
        eivp eivpVar = this.b;
        String str = eivpVar.a;
        eiykVar.copyOnWrite();
        ((eiyl) eiykVar.instance).b = str;
        Stream stream = Collection.EL.stream(eivpVar.c);
        final Object obj = this.d;
        Iterable iterable = (Iterable) stream.map(new Function() { // from class: eivm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (Optional) ((eivr) obj2).b().apply(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: eivn
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
        }).map(new Function() { // from class: eivo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (eiyo) ((Optional) obj2).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(eivu.a());
        eiykVar.copyOnWrite();
        eiyl eiylVar = (eiyl) eiykVar.instance;
        evtg evtgVar = eiylVar.d;
        if (!evtgVar.c()) {
            eiylVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eiylVar.d);
        eiyk eiykVar2 = (eiyk) ((eiyl) eiykVar.build()).toBuilder();
        Optional optional = this.c;
        if (optional.isPresent()) {
            String str2 = (String) optional.get();
            eiykVar2.copyOnWrite();
            ((eiyl) eiykVar2.instance).c = str2;
        }
        Optional optional2 = this.e;
        if (optional2.isPresent()) {
            eizj eizjVar = (eizj) eizk.a.createBuilder();
            Boolean bool = (Boolean) optional2.get();
            bool.booleanValue();
            eizjVar.copyOnWrite();
            eizk eizkVar = (eizk) eizjVar.instance;
            eizkVar.b = 1;
            eizkVar.c = bool;
            eiykVar2.copyOnWrite();
            eiyl eiylVar2 = (eiyl) eiykVar2.instance;
            eizk eizkVar2 = (eizk) eizjVar.build();
            eizkVar2.getClass();
            evtg evtgVar2 = eiylVar2.f;
            if (!evtgVar2.c()) {
                eiylVar2.f = evsn.mutableCopy(evtgVar2);
            }
            eiylVar2.f.add(eizkVar2);
        }
        return (eiyl) eiykVar2.build();
    }

    @Override // defpackage.eiqt
    public final void e(eiqv eiqvVar, eiou eiouVar) throws eiva {
        Map map = (Map) Collection.EL.stream(((eiqw) eiqvVar).a.entrySet()).collect(Collectors.collectingAndThen(Collectors.toMap(new Function() { // from class: eivb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: eivc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (List) Collection.EL.stream((List) ((Map.Entry) obj).getValue()).filter(new Predicate() { // from class: eive
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
                        return (((eiyx) obj2).b & 1) != 0;
                    }
                }).map(new Function() { // from class: eivf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eizi eiziVar = ((eiyx) obj2).c;
                        return eiziVar == null ? eizi.a : eiziVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(eivu.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new Function() { // from class: eivt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DesugarCollections.unmodifiableMap((Map) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        try {
            eivp eivpVar = this.b;
            eiqy eiqyVar = (eiqy) eivpVar.b.get();
            for (eivr eivrVar : eivpVar.c) {
                List list = (List) map.get(eivrVar.a());
                if (list != null) {
                    try {
                        eivi eiviVarC = eivrVar.c();
                        if (!list.isEmpty()) {
                            BiConsumer biConsumer = eiviVarC.b;
                            final eizi eiziVar = (eizi) list.get(0);
                            if ((eiziVar.b & 1) != 0) {
                                Optional optionalFindFirst = Collection.EL.stream(EnumSet.allOf(eiviVarC.a)).filter(new Predicate() { // from class: eivk
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
                                        return ((Enum) obj).toString().equals(eiziVar.e);
                                    }
                                }).findFirst();
                                if (optionalFindFirst.isPresent()) {
                                    biConsumer.accept(eiqyVar, new eiwg((Enum) optionalFindFirst.get()));
                                }
                            }
                            eizi eiziVar2 = (eizi) list.get(0);
                            eith eithVar = eitg.a;
                            String str = (eiziVar2.b & 1) != 0 ? eiziVar2.e : eiziVar2.c == 2 ? (String) eiziVar2.d : "";
                            str.getClass();
                            biConsumer.accept(eiqyVar, new eiwh(str));
                        }
                    } catch (eiva e) {
                        throw new eiva(String.format("Failed to parse parameter '%s' from assistant because of failure: %s", eivrVar.a(), e.getMessage()), e);
                    }
                }
            }
            try {
                final Object objA = eiqyVar.a();
                final ListenableFuture listenableFutureA = kol.a(new koi() { // from class: eirc
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        return Boolean.valueOf(kogVar.b(null));
                    }
                });
                final Function function = new Function() { // from class: eivd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eiql eiqlVar = (eiql) objA;
                        if (!eiqlVar.a().isPresent()) {
                            final eipz eipzVar = eiqs.a;
                            return kol.a(new koi() { // from class: eirb
                                @Override // defpackage.koi
                                public final Object a(kog kogVar) {
                                    return Boolean.valueOf(kogVar.b(eipzVar));
                                }
                            });
                        }
                        eivh eivhVar = this.a;
                        return eork.i((eipz) ((didr) ((eiqm) eivhVar.a).a).a.apply(eiqlVar.a().get()));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final Executor executor = this.f;
                eiri.a(kol.a(new koi() { // from class: eird
                    public final /* synthetic */ String d = "actionExecutor";

                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        eiri.a(listenableFutureA, new eirg(function, kogVar), executor);
                        return this.d;
                    }
                }), new eivg(this, eiouVar), executor);
            } catch (IllegalStateException e2) {
                throw new eiva(String.format("Failed to build Argument class because of failure: %s", e2.getMessage()), e2);
            }
        } catch (eiva e3) {
            if (e3.getMessage() != null) {
                String message = e3.getMessage();
                if (eivv.a != null) {
                    Log.e("ActionCapability", message);
                }
            }
            eiouVar.a(6);
        }
    }

    @Override // defpackage.eiqt
    public final /* synthetic */ void f() {
    }
}
