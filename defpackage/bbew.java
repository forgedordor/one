package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbew {
    public static final cqce a = cqce.g("BugleAnnotation", "MessageAnnotationData");
    public volatile ConversationIdType b;
    public volatile MessageIdType c = bary.a;
    public final ArrayList d = new ArrayList();
    private final Object e = new Object();

    public static SuggestionData a(ConversationIdType conversationIdType, MessageIdType messageIdType, ezei ezeiVar) {
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        String strB = messageIdType.b();
        ezgfVar.copyOnWrite();
        ezgg ezggVar = (ezgg) ezgfVar.instance;
        strB.getClass();
        ezggVar.m = strB;
        String strA = conversationIdType.a();
        ezgfVar.copyOnWrite();
        ezgg ezggVar2 = (ezgg) ezgfVar.instance;
        strA.getClass();
        ezggVar2.n = strA;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).k = "CopyOTP";
        ezan ezanVar = ezan.COPY_OTP;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgg ezggVar3 = (ezgg) ezgfVar.build();
        ezggVar3.getClass();
        ezgiVar.e = ezggVar3;
        ezgiVar.b |= 1;
        ezghVar.copyOnWrite();
        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
        ezeiVar.getClass();
        ezgiVar2.d = ezeiVar;
        ezgiVar2.c = 18;
        return new SmartSuggestionItemSuggestionData((ezgi) ezghVar.build());
    }

    public final Optional b() {
        return Collection.EL.stream(this.d).filter(new Predicate() { // from class: bbep
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
                return ((ezds) obj).e == 1;
            }
        }).findFirst();
    }

    public final List c() {
        final ArrayList arrayList = new ArrayList();
        b().ifPresent(new Consumer() { // from class: bbeo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bbew bbewVar = this.a;
                ezds ezdsVar = (ezds) obj;
                arrayList.add(bbew.a(bbewVar.b, bbewVar.c, ezdsVar.c == 2 ? (ezei) ezdsVar.d : ezei.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return arrayList;
    }

    public final void d(List list) {
        Set set = (Set) Collection.EL.stream(list).map(new Function() { // from class: bbeq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.ofNullable(((bpyn) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: bber
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Stream) ((Optional) obj).map(new Function() { // from class: bbem
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Stream.CC.of((MessageIdType) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new bbel());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: bbes
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageIdType) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
        if (!list.isEmpty() && set.size() != 1) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("bind should only be called with annotations for a single message. Message IDs: ");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                cqbdVarB.d(bary.b((String) it.next()));
            }
            cqbdVarB.r();
        }
        Stream streamFlatMap = Collection.EL.stream(list).map(new Function() { // from class: bbet
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final bpyn bpynVar = (bpyn) obj;
                return Optional.ofNullable(bpynVar.o()).map(new Function() { // from class: bben
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ezdr ezdrVar = (ezdr) ((ezds) obj2).toBuilder();
                        int iK = bpynVar.k();
                        ezdrVar.copyOnWrite();
                        ((ezds) ezdrVar.instance).e = iK;
                        return (ezds) ezdrVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: bbeu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Stream) ((Optional) obj).map(new Function() { // from class: bbev
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Stream.CC.of((ezds) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new bbel());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        List list2 = (List) streamFlatMap.collect(ekcv.a);
        if (!list.isEmpty()) {
            bpyn bpynVar = (bpyn) ekis.j(list);
            ConversationIdType conversationIdTypeM = bpynVar.m();
            MessageIdType messageIdTypeN = bpynVar.n();
            synchronized (this.e) {
                if (conversationIdTypeM.b()) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.I("conversationId was null for annotation");
                    cqbdVarE.I(bpynVar);
                    cqbdVarE.r();
                } else {
                    this.b = conversationIdTypeM;
                }
                if (messageIdTypeN.c()) {
                    cqbd cqbdVarE2 = a.e();
                    cqbdVarE2.I("messageId was null for annotation");
                    cqbdVarE2.I(bpynVar);
                    cqbdVarE2.r();
                } else {
                    this.c = messageIdTypeN;
                }
            }
        }
        synchronized (this.e) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            arrayList.addAll(list2);
        }
    }
}
