package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjdl {
    public static final String a = e("%CONVERSATION_ID%");
    public static final String b = e("%ORDER_DIRECTION%");
    public static final String c = e("%EXCLUDE_DRAFTS%");
    private static final String e = e("%ROOT_MESSAGE_ID%");
    private static final String f = e("%ID_COMPARATOR%");
    private static final String g = e("%TIMESTAMP_COMPARATOR%");
    private static final String h = e("%TIMESTAMP_VALUE_VAL%");
    public static final String d = e("%TIMESTAMP_COLUMN_VAL%");

    static {
        e("%PARTICIPANT_ID%");
    }

    public static bjjn a(ConversationIdType conversationIdType) {
        String[] strArr = bjju.a;
        bjjp bjjpVar = new bjjp(bjju.a);
        bjjpVar.A("queryFirstMessageIds");
        bjjpVar.o(d, "messages.received_timestamp");
        bjjpVar.o(b, "ASC");
        bjjpVar.o(a, conversationIdType.a());
        bjjpVar.o(c, "messages.message_status <> 3");
        bjjpVar.y(1);
        return bjjpVar.b();
    }

    public static bjjp b(ConversationIdType conversationIdType, int i) {
        String[] strArr = bjju.a;
        bjjp bjjpVar = new bjjp(bjju.a);
        bjjpVar.A("getLatestMessageIds");
        bjjpVar.o(d, "messages.received_timestamp");
        bjjpVar.o(b, "DESC");
        bjjpVar.o(f, "<");
        bjjpVar.o(a, conversationIdType.toString());
        bjjpVar.o(c, "messages.message_status <> 3");
        bjjpVar.y(i);
        return bjjpVar;
    }

    public static bjjp c(ConversationIdType conversationIdType, MessageIdType messageIdType, long j, int i) {
        String[] strArr = bjju.a;
        bjjp bjjpVar = new bjjp(bjju.a);
        bjjpVar.A("getMessageIdsBeforeIdChunk");
        bjjpVar.o(d, "messages.received_timestamp");
        bjjpVar.o(e, messageIdType.b());
        bjjpVar.o(b, "DESC");
        bjjpVar.o(g, "<");
        bjjpVar.o(a, conversationIdType.toString());
        bjjpVar.o(c, "messages.message_status <> 3");
        bjjpVar.o(h, String.valueOf(j));
        bjjpVar.d(new Function() { // from class: bjdg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bjjt bjjtVar = (bjjt) obj;
                String str = bjdl.a;
                bran branVar = MessagesTable.c;
                brao braoVar = branVar.i;
                bjjtVar.ar(new dqxl("$V $R $R OR ($V = $R AND $V $R $R)", new Object[]{braoVar, "%TIMESTAMP_COMPARATOR%", "%TIMESTAMP_VALUE_VAL%", braoVar, "%TIMESTAMP_VALUE_VAL%", branVar.a, "<", "%ROOT_MESSAGE_ID%"}));
                return bjjtVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bjjpVar.y(i);
        return bjjpVar;
    }

    public static bjqo d(ConversationIdType conversationIdType, int i) {
        String[] strArr = bjqr.a;
        bjqo bjqoVar = new bjqo(bjqr.a);
        bjqoVar.A("getLatestMessageIdsWithReactions");
        bjqoVar.o(d, "messages.received_timestamp");
        bjqoVar.o(b, "DESC");
        bjqoVar.o(f, "<");
        bjqoVar.o(a, conversationIdType.toString());
        bjqoVar.o(c, "messages.message_status <> 3");
        bjqoVar.d(new Function() { // from class: bjdh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bjqq bjqqVar = (bjqq) obj;
                String str = bjdl.a;
                Function[] functionArr = {new Function() { // from class: bjdj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bjqq bjqqVar2 = (bjqq) obj2;
                        String str2 = bjdl.a;
                        int iA = bjqr.a().M().a();
                        Integer.valueOf(iA).getClass();
                        if (iA < 30010) {
                            dqru.x("is_hidden", iA);
                        }
                        bjqqVar2.ap(new dqty("messages.is_hidden", 1, 0));
                        return bjqqVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bjdk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bjqq bjqqVar2 = (bjqq) obj2;
                        String str2 = bjdl.a;
                        bjqqVar2.ar(new dqxl("b.$R NOTNULL", new Object[]{"reacted_message_id"}));
                        return bjqqVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                bjqq[] bjqqVarArr = new bjqq[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    Function function = functionArr[i2];
                    String[] strArr2 = bjqr.a;
                    bjqqVarArr[i2] = (bjqq) function.apply(new bjqq());
                }
                bjqqVar.aq(bjqqVarArr);
                return bjqqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bjqoVar.y(i);
        return bjqoVar;
    }

    private static String e(String str) {
        return str.substring(1, str.length() - 1);
    }
}
