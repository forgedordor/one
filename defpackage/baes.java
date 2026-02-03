package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baes {
    public final bfsa a;

    public baes(bfsa bfsaVar) {
        this.a = bfsaVar;
    }

    public final bfrm a(MessageIdType messageIdType) {
        bfro bfroVarC = this.a.c(new MessageIdType[]{messageIdType});
        bfroVarC.A("ConversationMessageDataQueryHelperV2::getMessageByIdQuery");
        return bfroVarC.b();
    }

    public final bfrm b(final long j, boolean z, int i) {
        ejwl.a(i >= 0);
        bfrl bfrlVar = z ? new bfrl(bfrt.b.a, true) : new bfrl(bfrt.b.a, false);
        bfsa bfsaVar = this.a;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.h(new Function() { // from class: baeq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.R(j);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdo[] brdoVarArr = new brdo[2];
        brdoVarArr[0] = z ? new brdo(MessagesTable.c.i, true) : new brdo(MessagesTable.c.i, false);
        brdoVarArr[1] = new brdo(MessagesTable.c.a, false);
        brdrVarD.d(brdoVarArr);
        brdrVarD.y(i);
        bfro bfroVarF = bfsaVar.f(brdrVarD);
        bfroVarF.D((String) DesugarArrays.stream(new bfrl[]{bfrlVar}).map(new Function() { // from class: bfrn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bfrl) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        bfroVarF.A("ConversationMessageDataQueryHelperV2::getMessagesAfterTimestampQuery");
        return bfroVarF.b();
    }

    public final bfro c(final ConversationIdType conversationIdType, int i, int i2, boolean z) {
        dqwl dqwlVarB;
        if (z) {
            bjqo bjqoVarD = bjdl.d(conversationIdType, i);
            bjqoVarD.d(new Function() { // from class: baen
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjqq bjqqVar = (bjqq) obj;
                    bjqqVar.b();
                    return bjqqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjqi bjqiVar = bjqr.b;
            bjqoVarD.c(new bjql(bjqiVar.b), new bjql(bjqiVar.a));
            bjqoVarD.y(i);
            bjqoVarD.B(i2);
            dqwlVarB = bjqoVarD.b();
        } else {
            bjjp bjjpVarB = bjdl.b(conversationIdType, i);
            bjjpVarB.d(new Function() { // from class: baeo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjjt bjjtVar = (bjjt) obj;
                    bjjtVar.b(conversationIdType);
                    bjjtVar.c();
                    return bjjtVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjjj bjjjVar = bjju.b;
            bjjpVarB.c(new bjjm(bjjjVar.b), new bjjm(bjjjVar.a));
            bjjpVarB.y(i);
            bjjpVarB.B(i2);
            dqwlVarB = bjjpVarB.b();
        }
        bfro bfroVarB = this.a.b(dqwlVarB);
        bfroVarB.A("ConversationMessageDataQueryHelperV2::getLastSentAndReceivedMessagesQuerySql");
        return bfroVarB;
    }

    public final bfro d(ConversationIdType conversationIdType, int i, int i2) {
        return c(conversationIdType, i, i2, true);
    }

    public final bfrm e(final MessageIdType[] messageIdTypeArr) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.c(MessagesTable.c.a);
        brdrVarD.h(new Function() { // from class: baer
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.u(messageIdTypeArr);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bfro bfroVarF = this.a.f(brdrVarD);
        bfroVarF.A("ConversationMessageDataQueryHelperV2::getConversationMessagesByIdsQuerySql");
        return bfroVarF.b();
    }

    public final bfro f(ConversationIdType conversationIdType, int i) {
        return c(conversationIdType, i, 0, false);
    }
}
