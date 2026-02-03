package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejof implements ejop {
    public static final ekrg a = ekrg.c("com/google/chat/smartmessaging/smartreply/android/providers/ConversationStarterSuggestionProvider");
    public int b;
    public int c;
    private final Duration d;
    private final ejxr e;

    public ejof(final ejkl ejklVar, final ejly ejlyVar) {
        this.d = Duration.ofMillis(ejklVar.c);
        this.e = ejxx.a(new ejxr() { // from class: ejnu
            @Override // defpackage.ejxr
            public final Object get() throws IOException {
                ezgw ezgwVar;
                ejly ejlyVar2 = ejlyVar;
                ejkl ejklVar2 = ejklVar;
                ejha ejhaVar = ejklVar2.d;
                if (ejhaVar == null) {
                    ejhaVar = ejha.a;
                }
                if (ejhaVar.equals(ejha.a)) {
                    ezgwVar = ezgw.a;
                } else {
                    try {
                        InputStream inputStreamF = ejlyVar2.f(ejhaVar);
                        try {
                            ezgwVar = (ezgw) evsn.parseFrom(ezgw.a, inputStreamF, evrr.a());
                            if (inputStreamF != null) {
                                inputStreamF.close();
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        ((ekrd) ((ekrd) ((ekrd) ejof.a.i()).g(e)).h("com/google/chat/smartmessaging/smartreply/android/providers/ConversationStarterSuggestionProvider", "readConversationStartersConfigFromFile", (char) 142, "ConversationStarterSuggestionProvider.java")).q("Unable to parse conversation starter config");
                        ezgwVar = ezgw.a;
                    }
                }
                int i = ejklVar2.b;
                int i2 = (i & 4) != 0 ? ejklVar2.e : ezgwVar.c;
                int iMin = Math.min((i & 8) != 0 ? ejklVar2.f : ezgwVar.d, i2);
                ekgb ekgbVar = (ekgb) Collection.EL.stream(ezgwVar.b).map(new Function() { // from class: ejnv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ezgy ezgyVar = ejor.a;
                        return new ejoq((ezgu) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collector.CC.of(new Supplier() { // from class: ejns
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i3 = ekgb.d;
                        return new ekfw();
                    }
                }, new BiConsumer() { // from class: ejnw
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ((ekfw) obj).h(obj2);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, new BinaryOperator() { // from class: ejnx
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        ekfw ekfwVar = (ekfw) obj;
                        ekfwVar.j(((ekfw) obj2).g());
                        return ekfwVar;
                    }
                }, new Function() { // from class: ejny
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
                }, new Collector.Characteristics[0]));
                if (ekgbVar == null) {
                    throw new NullPointerException("Null conversationStarters");
                }
                ejof ejofVar = this.a;
                ejnq ejnqVar = new ejnq(ekgbVar, i2, iMin);
                ejofVar.b = ejnqVar.b;
                ejofVar.c = ejnqVar.c;
                return ejnqVar.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        Duration duration = this.d;
        if (!duration.isZero() && !duration.isNegative() && (ezcyVar.c & 2) != 0) {
            ezdx ezdxVar = ezcyVar.f;
            if (ezdxVar == null) {
                ezdxVar = ezdx.a;
            }
            if (ezdxVar.b.size() != 0) {
                ezdx ezdxVar2 = ezcyVar.f;
                ezdx ezdxVar3 = ezdxVar2 == null ? ezdx.a : ezdxVar2;
                if (ezdxVar2 == null) {
                    ezdxVar2 = ezdx.a;
                }
                long j = ((ezdv) ezdxVar3.b.get(ezdxVar2.b.size() - 1)).e;
                Instant instantOfEpochSecond = Instant.ofEpochSecond(evwy.g(j / 1000000, (int) ((j % 1000000) * 1000)).b);
                Instant instantOfEpochMilli = Instant.ofEpochMilli(ezcyVar.l);
                if (Duration.between(instantOfEpochSecond, instantOfEpochMilli).compareTo(duration) < 0) {
                    long epochMilli = instantOfEpochSecond.plus(duration).toEpochMilli();
                    ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                    ezcv ezcvVar = ezcv.a;
                    ezghVar.copyOnWrite();
                    ezgi ezgiVar = (ezgi) ezghVar.instance;
                    ezcvVar.getClass();
                    ezgiVar.d = ezcvVar;
                    ezgiVar.c = 24;
                    ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                    ezgfVar.copyOnWrite();
                    ((ezgg) ezgfVar.instance).p = epochMilli;
                    ezan ezanVar = ezan.EXPIRATION_SENTINEL;
                    ezgfVar.copyOnWrite();
                    ((ezgg) ezgfVar.instance).l = ezanVar.a();
                    ezal ezalVar = ezal.CONVERSATION_STARTER;
                    ezgfVar.copyOnWrite();
                    ((ezgg) ezgfVar.instance).g = ezalVar.a();
                    ezghVar.copyOnWrite();
                    ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                    ezgg ezggVar = (ezgg) ezgfVar.build();
                    ezggVar.getClass();
                    ezgiVar2.e = ezggVar;
                    ezgiVar2.b |= 1;
                    arrayList.add((ezgi) ezghVar.build());
                    return arrayList;
                }
                final LocalDateTime localDateTime = instantOfEpochMilli.atZone(ZoneId.systemDefault()).toLocalDateTime();
                ArrayList arrayList2 = (ArrayList) Collection.EL.stream((ekgb) this.e.get()).map(new Function() { // from class: ejnz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return new ejor((ejoq) obj, localDateTime);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: ejoa
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
                        ejor ejorVar = (ejor) obj;
                        if (!ejorVar.i) {
                            return false;
                        }
                        Instant instant = ejorVar.g;
                        Instant instant2 = ejor.c;
                        if (instant.equals(instant2) && ejorVar.h.equals(instant2)) {
                            return true;
                        }
                        LocalDateTime localDateTime2 = ejorVar.f;
                        int year = localDateTime2.getYear();
                        LocalDateTime localDateTime3 = ejorVar.d;
                        return (year >= localDateTime3.getYear() && localDateTime2.getYear() <= ejorVar.e.getYear()) && (localDateTime2.getMonthValue() >= localDateTime3.getMonthValue() && localDateTime2.getMonthValue() <= ejorVar.e.getMonthValue()) && localDateTime2.toLocalTime().isAfter(localDateTime3.toLocalTime()) && localDateTime2.toLocalTime().isBefore(ejorVar.e.toLocalTime());
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: ejob
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                Collections.shuffle(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.addAll((java.util.Collection) Collection.EL.stream(arrayList2).filter(new Predicate() { // from class: ejoc
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
                        return ((ejor) obj).k;
                    }
                }).map(new Function() { // from class: ejod
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ejor) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).limit(this.b).collect(Collectors.toCollection(new Supplier() { // from class: ejob
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                arrayList4.addAll((java.util.Collection) Collection.EL.stream(arrayList2).filter(new Predicate() { // from class: ejoe
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
                        return ((ejor) obj).j;
                    }
                }).map(new Function() { // from class: ejnt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ejor) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).limit(this.c).collect(Collectors.toCollection(new Supplier() { // from class: ejob
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                Collections.shuffle(arrayList3);
                Collections.shuffle(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i = this.c;
                ArrayList arrayListSubList = arrayList4;
                if (size > i) {
                    arrayListSubList = arrayList4.subList(0, i);
                }
                arrayList5.addAll(arrayListSubList);
                int size2 = arrayList5.size();
                int i2 = this.b;
                if (size2 < i2) {
                    int size3 = i2 - arrayList5.size();
                    int size4 = arrayList3.size();
                    ArrayList arrayListSubList2 = arrayList3;
                    if (size4 > size3) {
                        arrayListSubList2 = arrayList3.subList(0, size3);
                    }
                    arrayList5.addAll(arrayListSubList2);
                }
                Collections.shuffle(arrayList5);
                return arrayList5;
            }
        }
        return arrayList;
    }

    @Override // defpackage.ejop
    public final /* synthetic */ void b() {
    }
}
