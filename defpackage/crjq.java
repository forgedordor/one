package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crjq {
    public static final brdr a(final ConversationIdType conversationIdType) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.b(new Function() { // from class: crjo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.ak();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: crjp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.af();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brec brecVar2 = new brec();
        brecVar2.am(avbn.d);
        brec brecVar3 = new brec();
        brecVar3.A(false);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("createLatestSuggestableMessageQuery");
        brdrVarD.h(new Function() { // from class: crjg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar4 = (brec) obj;
                brecVar4.m(conversationIdType);
                return brecVar4;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.g(brecVar);
        brdrVarD.g(brecVar2);
        brdrVarD.g(brecVar3);
        brdrVarD.d(new brdo(MessagesTable.c.i, false));
        brdrVarD.y(1);
        return brdrVarD;
    }

    public static final brdr b(final ConversationIdType conversationIdType, int i) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.b(new Function() { // from class: crjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.ak();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: crji
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.af();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brec brecVar2 = new brec();
        brecVar2.am(avbn.d);
        brec brecVar3 = new brec();
        brecVar3.A(false);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("createLatestSuggestableMessagesQuery");
        brdrVarD.h(new Function() { // from class: crjj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar4 = (brec) obj;
                brecVar4.m(conversationIdType);
                return brecVar4;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.g(brecVar);
        brdrVarD.g(brecVar2);
        brdrVarD.g(brecVar3);
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("createLatestSuggestableMessagesQuery");
        bsjeVarC.h(new Function() { // from class: crjk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.i(conversationIdType);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjl bsjlVar = new bsjl();
        bsjlVar.f("text/plain");
        bsjeVarC.g(bsjlVar);
        bsgs bsgsVar = PartsTable.d.b;
        bsjeVarC.w(bsgsVar);
        bsjc bsjcVarB = bsjeVarC.b();
        bran branVar = MessagesTable.c;
        brdr brdrVar = (brdr) brdrVarD.j(dqts.i(bsjcVarB, bsgsVar, branVar.a));
        brdrVar.d(new brdo(branVar.i, false));
        brdrVar.y(i);
        return brdrVar;
    }

    public static final brmz c(ConversationIdType conversationIdType, final ezan ezanVar, final ezaj ezajVar) {
        conversationIdType.getClass();
        final brdr brdrVarA = a(conversationIdType);
        brna brnaVarA = brnk.a();
        brnaVarA.A("createSmartSuggestionsQuery");
        brnaVarA.d(new Function() { // from class: crjl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                Function function = new Function() { // from class: crjf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bran) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                brdr brdrVar = brdrVarA;
                brdrVar.f(function);
                brnjVar.ap(new dqpk("p2p_suggestions.target_message_id", 1, brdrVar.b()));
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brnaVarA.d(new Function() { // from class: crjm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                ezan ezanVar2 = ezanVar;
                if (ezanVar2 != null) {
                    brnjVar.e(ezanVar2);
                }
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brnaVarA.d(new Function() { // from class: crjn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ezaj ezajVar2 = ezajVar;
                brnj brnjVar = (brnj) obj;
                if (ezajVar2 != null) {
                    int iIntValue = brnk.c().intValue();
                    if (iIntValue < 53080) {
                        dqru.x("consumption_state", iIntValue);
                    }
                    brnjVar.ap(new dqty("p2p_suggestions.consumption_state", 1, Integer.valueOf(ezajVar2.a())));
                }
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brnaVarA.b();
    }
}
