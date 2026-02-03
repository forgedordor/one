package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awie implements awhr {
    public final fcsu a;
    private final asxy b;
    private final eosc c;

    public awie(asxy asxyVar, eosc eoscVar, fcsu fcsuVar) {
        this.b = asxyVar;
        this.c = eoscVar;
        this.a = fcsuVar;
    }

    @Override // defpackage.awhg
    public final eiju a(int i, alqm alqmVar) {
        return c(alqmVar);
    }

    @Override // defpackage.awhr
    public final eiju b(ekgb ekgbVar) {
        Stream streamFilter = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: awhs
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
                return ((alqm) obj).e().isPresent();
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        ekgb ekgbVar2 = (ekgb) streamFilter.collect(collector);
        final ekgb ekgbVar3 = (ekgb) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: awhw
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
                return ((alqm) obj).e().isEmpty();
            }
        }).collect(collector);
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(ekgbVar2).collect(ekcv.a(new Function() { // from class: awhx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aubq) ((alqm) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: awhy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (alqm) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        return this.b.a((ekgb) Collection.EL.stream(ekgbVar2).map(new Function() { // from class: awhz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aubq) ((alqm) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector)).h(new ejvr() { // from class: awia
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream(((Map) obj).entrySet());
                final ekgp ekgpVar2 = ekgpVar;
                Function function = new Function() { // from class: awhu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        alqm alqmVar = (alqm) ekgpVar2.get(((Map.Entry) obj2).getKey());
                        alqmVar.getClass();
                        return alqmVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final awie awieVar = this.a;
                ekgp ekgpVar3 = (ekgp) stream.collect(ekcv.a(function, new Function() { // from class: awhv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        return ((aoor) awieVar.a.b()).a() ? awhq.a((asts) entry.getValue()) : awhq.b(((asts) entry.getValue()).a());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }));
                HashMap map = new HashMap();
                ekqg ekqgVarListIterator = ekgpVar3.entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    map.put((alqm) entry.getKey(), (awhp) entry.getValue());
                }
                ekgb ekgbVar4 = ekgbVar3;
                int size = ekgbVar4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    map.put((alqm) ekgbVar4.get(i2), awhp.e());
                }
                return ekgp.j(map);
            }
        }, this.c);
    }

    @Override // defpackage.awhr
    public final eiju c(alqm alqmVar) {
        Optional optionalE = alqmVar.e();
        return optionalE.isEmpty() ? eijx.e(awhp.e()) : this.b.b((aubq) optionalE.get()).h(new ejvr() { // from class: awid
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                asts astsVar = (asts) obj;
                return ((aoor) this.a.a.b()).a() ? awhq.a(astsVar) : awhq.b(astsVar.a());
            }
        }, this.c);
    }

    @Override // defpackage.awhr
    public final eiju d(aubq aubqVar) {
        return this.b.b(aubqVar).h(new ejvr() { // from class: awht
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return assi.b(((asts) obj).a());
            }
        }, this.c);
    }

    @Override // defpackage.awhr
    public final eiju e(alqm alqmVar) {
        return (eiju) alqmVar.e().map(new Function() { // from class: awib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.d((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: awic
            @Override // java.util.function.Supplier
            public final Object get() {
                return eijx.e(assi.d());
            }
        });
    }
}
