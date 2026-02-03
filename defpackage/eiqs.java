package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqs {
    public static final eipz a;
    public static final eivp b;

    static {
        new ArrayList();
        new HashMap();
        new ArrayList();
        new HashMap();
        Supplier supplier = new Supplier() { // from class: eiqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiqa();
            }
        };
        new ArrayList();
        new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        final Function function = new Function() { // from class: eiqg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiqq) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        arrayList.add(new eivq(new Function() { // from class: eivj
            public final /* synthetic */ String a = "softwareInstruction.name";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eiwd eiwdVar = (eiwd) function.apply(obj);
                final eiyn eiynVar = (eiyn) eiyo.a.createBuilder();
                eiynVar.copyOnWrite();
                ((eiyo) eiynVar.instance).b = this.a;
                boolean zC = eiwdVar.c();
                eiynVar.copyOnWrite();
                ((eiyo) eiynVar.instance).d = zC;
                boolean zD = eiwdVar.d();
                eiynVar.copyOnWrite();
                ((eiyo) eiynVar.instance).e = zD;
                eiwdVar.e();
                eiynVar.copyOnWrite();
                ((eiyo) eiynVar.instance).f = false;
                Collection.EL.stream((List) Collection.EL.stream(eiwdVar.b()).map(new Function() { // from class: eirn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eiwc eiwcVar = (eiwc) obj2;
                        eiwcVar.b();
                        Enum enumA = eiwcVar.a();
                        eiyq eiyqVar = (eiyq) eiyr.a.createBuilder();
                        String string = enumA.toString();
                        eiyqVar.copyOnWrite();
                        eiyr eiyrVar = (eiyr) eiyqVar.instance;
                        string.getClass();
                        eiyrVar.b |= 1;
                        eiyrVar.c = string;
                        return (eiyr) eiyqVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).collect(eivu.a())).forEach(new Consumer() { // from class: eirm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        eiyn eiynVar2 = eiynVar;
                        eiyr eiyrVar = (eiyr) obj2;
                        eiynVar2.copyOnWrite();
                        eiyo eiyoVar = (eiyo) eiynVar2.instance;
                        eiyo eiyoVar2 = eiyo.a;
                        eiyrVar.getClass();
                        evtg evtgVar = eiyoVar.c;
                        if (!evtgVar.c()) {
                            eiyoVar.c = evsn.mutableCopy(evtgVar);
                        }
                        eiyoVar.c.add(eiyrVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return Optional.of((eiyo) eiynVar.build());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new eivi(eiqr.class, new BiConsumer() { // from class: eiqh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((eiqk) obj).b((eixz) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        })));
        final Function function2 = new Function() { // from class: eiqi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eiqp) obj).a();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final Function function3 = new Function() { // from class: eiqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eipz eipzVar = eiqs.a;
                eiyh eiyhVar = ((eiqn) obj).a;
                eizh eizhVar = (eizh) eizi.a.createBuilder();
                evvj evvjVar = (evvj) evvl.a.createBuilder();
                evwf evwfVar = (evwf) evwg.a.createBuilder();
                evwfVar.copyOnWrite();
                evwg evwgVar = (evwg) evwfVar.instance;
                evwgVar.b = 3;
                evwgVar.c = "GenericErrorStatus";
                evvjVar.a("@type", (evwg) evwfVar.build());
                evvl evvlVar = (evvl) evvjVar.build();
                eizhVar.copyOnWrite();
                eizi eiziVar = (eizi) eizhVar.instance;
                evvlVar.getClass();
                eiziVar.d = evvlVar;
                eiziVar.c = 6;
                return (eizi) eizhVar.build();
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        map.put("executionStatus", new Function() { // from class: eivl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (List) ((Optional) function2.apply(obj)).stream().map(function3).collect(eivu.a());
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        });
        b = new eivp(supplier, DesugarCollections.unmodifiableList(arrayList), map);
        eipy eipyVarC = eipz.c();
        eiqc eiqcVar = new eiqc();
        eiqcVar.a = Optional.of(new eiqn(new eiye().a()));
        ((eipw) eipyVarC).a = eiqcVar.a();
        a = eipyVarC.a();
    }
}
