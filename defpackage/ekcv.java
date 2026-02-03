package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcv {
    public static final Collector a = Collector.CC.of(new Supplier() { // from class: ekcd
        @Override // java.util.function.Supplier
        public final Object get() {
            int i = ekgb.d;
            return new ekfw();
        }
    }, new BiConsumer() { // from class: ekcg
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ekfw) obj).h(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: ekch
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            ekfw ekfwVar = (ekfw) obj;
            ekfw ekfwVar2 = (ekfw) obj2;
            ekfwVar.a(ekfwVar2.a, ekfwVar2.b);
            return ekfwVar;
        }
    }, new Function() { // from class: ekci
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ekfw) obj).g();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(new Supplier() { // from class: ekcj
        @Override // java.util.function.Supplier
        public final Object get() {
            return new ekhv();
        }
    }, new BiConsumer() { // from class: ekck
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ekhv) obj).c(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: ekcl
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            ekhv ekhvVar = (ekhv) obj;
            ekhvVar.k((ekhv) obj2);
            return ekhvVar;
        }
    }, new Function() { // from class: ekcm
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ekhv) obj).g();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(new Supplier() { // from class: ekcn
            @Override // java.util.function.Supplier
            public final Object get() {
                ekhu ekhuVar = ekhu.a;
                return new ekhs();
            }
        }, new BiConsumer() { // from class: ekco
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ekhs) obj).b((eknz) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: ekce
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ekhs ekhsVar = (ekhs) obj;
                ekhsVar.c(((ekhs) obj2).a);
                return ekhsVar;
            }
        }, new Function() { // from class: ekcf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ekhs) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: ekcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ekgi();
            }
        }, new BiConsumer() { // from class: ekcq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector = ekcv.a;
                ((ekgi) obj).i(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: ekcr
            public final /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ekgi ekgiVar = (ekgi) obj;
                ekgiVar.k((ekgi) obj2);
                return ekgiVar;
            }
        }, new Function() { // from class: ekcs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ekgi) obj).c();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        function2.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: ekct
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: ekcu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ekgp.j((LinkedHashMap) obj);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }
}
