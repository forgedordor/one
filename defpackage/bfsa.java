package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfsa {
    public static final /* synthetic */ int a = 0;
    private static final String b = g("%PARTS_JOIN_TIMESTAMP_CHECK%");
    private static final String c = g("%REPORTS_JOIN_TIMESTAMP_CHECK%");
    private static final String d = bkgf.b.a.toString() + " = " + MessagesTable.c.a.toString();
    private final Set e;

    public bfsa(Set set) {
        this.e = set;
    }

    private static String g(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static void h(bgvg bgvgVar) {
        if (admg.a()) {
            bqhc bqhcVarA = bqhf.a();
            bqgl bqglVar = bqhf.c;
            bqhcVarA.c(bqglVar.c);
            bqhcVarA.d(new Function() { // from class: bfrw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqhe bqheVar = (bqhe) obj;
                    int i = bfsa.a;
                    bqheVar.b(MessagesTable.c.a);
                    return bqheVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bgvgVar.n(bqhcVarA.b(), "label_subquery_expression");
            if (admg.b()) {
                bqhc bqhcVarA2 = bqhf.a();
                bqhcVarA2.c(bqglVar.f);
                bqhcVarA2.d(new Function() { // from class: bfrx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqhe bqheVar = (bqhe) obj;
                        int i = bfsa.a;
                        bqheVar.b(MessagesTable.c.a);
                        return bqheVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bgvgVar.n(bqhcVarA2.b(), "intent_subquery_expression");
            }
        }
    }

    private final void i(bgvg bgvgVar) {
        bgvgVar.o("REPLIES_VIEW_JOIN", this.e.contains(bmfs.a) ? d : "0");
    }

    private final bfro j() {
        bfro bfroVarA = bfrt.a();
        bfroVarA.A("+queryConversationMessagesInternalOptimized");
        bfroVarA.o(b, "1");
        bfroVarA.o(c, "1");
        if (admg.a()) {
            bqhc bqhcVarA = bqhf.a();
            bqgl bqglVar = bqhf.c;
            bqhcVarA.c(bqglVar.c);
            bqhcVarA.d(new Function() { // from class: bfru
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqhe bqheVar = (bqhe) obj;
                    int i = bfsa.a;
                    bqheVar.b(MessagesTable.c.a);
                    return bqheVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bfroVarA.n(bqhcVarA.b(), "label_subquery_expression");
            if (admg.b()) {
                bqhc bqhcVarA2 = bqhf.a();
                bqhcVarA2.c(bqglVar.f);
                bqhcVarA2.d(new Function() { // from class: bfrv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqhe bqheVar = (bqhe) obj;
                        int i = bfsa.a;
                        bqheVar.b(MessagesTable.c.a);
                        return bqheVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bfroVarA.n(bqhcVarA2.b(), "intent_subquery_expression");
            }
        }
        bfroVarA.o("REPLIES_VIEW_JOIN", this.e.contains(bmfs.a) ? d : "0");
        return bfroVarA;
    }

    @Deprecated
    public final bgvg a() {
        bgvg bgvgVarA = bgvl.a();
        bgvgVarA.A("+getBasicQuery");
        bgvgVarA.o(b, "1");
        bgvgVarA.o(c, "1");
        bgvk bgvkVar = new bgvk();
        bgvkVar.g(16);
        bgvkVar.g(3);
        bgvkVar.d();
        bgvgVarA.e(bgvkVar);
        bgvgVarA.s();
        h(bgvgVarA);
        i(bgvgVarA);
        return bgvgVarA;
    }

    public final bfro b(dqwl dqwlVar) {
        bfro bfroVarJ = j();
        String[] strArr = bfrt.a;
        bfrs bfrsVar = new bfrs();
        bfrsVar.b(dqwlVar);
        bfroVarJ.c(bfrsVar);
        return bfroVarJ;
    }

    public final bfro c(MessageIdType[] messageIdTypeArr) {
        bfro bfroVarJ = j();
        String[] strArr = bfrt.a;
        bfrs bfrsVar = new bfrs();
        bfrsVar.ap(new dqpm("messages._id", 3, bfrs.as((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bfrq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bary.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bfrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        bfroVarJ.c(bfrsVar);
        return bfroVarJ;
    }

    @Deprecated
    public final bgvg d(boolean z, ConversationIdType conversationIdType, dqwl dqwlVar) {
        bgvg bgvgVarE = e(z, conversationIdType);
        bgvgVarE.s();
        String[] strArr = bgvl.a;
        bgvk bgvkVar = new bgvk();
        bgvkVar.ap(new dqpk("messages._id", 3, dqwlVar));
        bgvgVarE.e(bgvkVar);
        return bgvgVarE;
    }

    public final bgvg e(boolean z, ConversationIdType conversationIdType) {
        bgvg bgvgVarA = bgvl.a();
        bgvgVarA.A("+queryConversationMessagesInternal");
        bgvgVarA.o(b, "1");
        bgvgVarA.o(c, "1");
        bgvk bgvkVar = new bgvk();
        bgvkVar.g(16);
        if (!conversationIdType.b()) {
            bgvkVar.b(conversationIdType);
        }
        bgvkVar.g(3);
        if (z) {
            dqyp[] dqypVarArr = new bgvk[2];
            bgvk bgvkVar2 = new bgvk();
            bgvkVar2.d();
            dqypVarArr[0] = bgvkVar2;
            dqyp bgvkVar3 = new bgvk();
            int iIntValue = bgvl.c().intValue();
            if (iIntValue < 46020) {
                dqru.x("reacted_message_id", iIntValue);
            }
            bgvkVar3.ap(new dqpn("message_reactions.reacted_message_id", 6));
            dqypVarArr[1] = bgvkVar3;
            bgvkVar.aq(dqypVarArr);
            bgvgVarA.s();
        } else {
            bgvkVar.d();
        }
        bgvgVarA.e(bgvkVar);
        h(bgvgVarA);
        i(bgvgVarA);
        return bgvgVarA;
    }

    public final bfro f(brdr brdrVar) {
        bfro bfroVarJ = j();
        brdrVar.h(new Function() { // from class: bfrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = bfsa.a;
                brecVar.ao(16);
                brecVar.ao(3);
                brecVar.A(false);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bfrt.a;
        bfrs bfrsVar = new bfrs();
        brdrVar.c(MessagesTable.c.a);
        bfrsVar.b(brdrVar.b());
        bfroVarJ.c(bfrsVar);
        return bfroVarJ;
    }
}
