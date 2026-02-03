package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqpb implements eora {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ cqpc b;

    public cqpb(cqpc cqpcVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = cqpcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eylm eylmVar = (eylm) eyln.a.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(((cqpw) obj).a()).map(new Function() { // from class: cqoy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                final cqps cqpsVar = (cqps) obj2;
                final int i = true != ((cqey) this.a.b.e.a()).w() ? 300000 : 1000000;
                List list = (List) DesugarArrays.stream(cqpc.d).filter(new Predicate() { // from class: cqou
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
                    public final boolean test(Object obj3) {
                        cqce cqceVar = cqpc.a;
                        return cqpsVar.d((String) obj3) != null;
                    }
                }).map(new Function() { // from class: cqov
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        cqce cqceVar = cqpc.a;
                        cqpt cqptVarD = cqpsVar.d((String) obj3);
                        cqptVarD.getClass();
                        return cqptVarD;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cqow
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
                    public final boolean test(Object obj3) {
                        cqpt cqptVar = (cqpt) obj3;
                        cqce cqceVar = cqpc.a;
                        if (cqptVar.c() == null || cqptVar.d() == null || cqptVar.a() == null) {
                            return false;
                        }
                        int i2 = i;
                        Integer numA = cqptVar.a();
                        numA.getClass();
                        return numA.intValue() <= i2;
                    }
                }).sorted(Comparator.EL.reversed(Comparator.CC.comparingInt(new ToIntFunction() { // from class: cqox
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj3) {
                        cqce cqceVar = cqpc.a;
                        Integer numA = ((cqpt) obj3).a();
                        numA.getClass();
                        return numA.intValue();
                    }
                }))).limit(2L).collect(Collectors.toCollection(new Supplier() { // from class: cqoo
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (list.isEmpty()) {
                    return eylp.a;
                }
                if (list.size() == 1) {
                    list.add(1, (cqpt) list.get(0));
                }
                eylo eyloVar = (eylo) eylp.a.createBuilder();
                eyloVar.copyOnWrite();
                ((eylp) eyloVar.instance).h = 3;
                eylj eyljVarB = cqpc.b((cqpt) list.get(0));
                eyloVar.copyOnWrite();
                eylp eylpVar = (eylp) eyloVar.instance;
                eyljVarB.getClass();
                eylpVar.f = eyljVarB;
                eylpVar.b |= 1;
                eylj eyljVarB2 = cqpc.b((cqpt) list.get(1));
                eyloVar.copyOnWrite();
                eylp eylpVar2 = (eylp) eyloVar.instance;
                eyljVarB2.getClass();
                eylpVar2.g = eyljVarB2;
                eylpVar2.b |= 2;
                String strB = cqpsVar.b();
                eyloVar.copyOnWrite();
                ((eylp) eyloVar.instance).c = strB;
                eyloVar.copyOnWrite();
                ((eylp) eyloVar.instance).d = "tenor.com";
                String strB2 = cqpsVar.b();
                eyloVar.copyOnWrite();
                ((eylp) eyloVar.instance).e = strB2;
                String strA = cqpsVar.a();
                eyloVar.copyOnWrite();
                ((eylp) eyloVar.instance).i = strA;
                return (eylp) eyloVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: cqoz
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
                return !((eylp) obj2).equals(eylp.a);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cqpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        eylmVar.copyOnWrite();
        eyln eylnVar = (eyln) eylmVar.instance;
        evtg evtgVar = eylnVar.b;
        if (!evtgVar.c()) {
            eylnVar.b = evsn.mutableCopy(evtgVar);
        }
        SettableFuture settableFuture = this.a;
        evpz.addAll(iterable, eylnVar.b);
        settableFuture.set((eyln) eylmVar.build());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (!(th instanceof fhcc)) {
            this.a.setException(th);
            return;
        }
        cqbd cqbdVarB = cqpc.a.b();
        cqbdVarB.I("Failed to query Tenor API.");
        cqbdVarB.y("status", ((fhcc) th).a);
        cqbdVarB.s(th);
        this.a.set(eyln.a);
    }
}
