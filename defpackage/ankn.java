package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankn implements ankg {
    public final ankq a;
    public final bxlc b;
    private final eosc c;
    private final eosc d;

    public ankn(ankq ankqVar, eosc eoscVar, eosc eoscVar2, bxlc bxlcVar) {
        this.a = ankqVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.b = bxlcVar;
    }

    public static ctho f(ConversationId conversationId, MessageIdType messageIdType, String str, int i) {
        cthn cthnVar = (cthn) ctho.a.createBuilder();
        String strB = conversationId.b();
        cthnVar.copyOnWrite();
        ctho cthoVar = (ctho) cthnVar.instance;
        strB.getClass();
        cthoVar.b = strB;
        String strB2 = messageIdType.b();
        cthnVar.copyOnWrite();
        ctho cthoVar2 = (ctho) cthnVar.instance;
        strB2.getClass();
        cthoVar2.c = strB2;
        cthnVar.copyOnWrite();
        ((ctho) cthnVar.instance).e = ejwk.b(str);
        cthnVar.copyOnWrite();
        ((ctho) cthnVar.instance).d = i - 2;
        return (ctho) cthnVar.build();
    }

    @Override // defpackage.ankg
    public final eiju a() {
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.A("getCountOfStarredMessages");
        bqshVar.s();
        return eiju.g(bqshVar.b().D());
    }

    @Override // defpackage.ankg
    public final eiju b(ConversationId conversationId) {
        final ConversationIdType conversationIdTypeB = barn.b(conversationId.b());
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        brdr brdrVarD = MessagesTable.d();
        brao braoVar = MessagesTable.c.a;
        brdrVarD.c(braoVar);
        brdrVarD.h(new Function() { // from class: ankj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.m(conversationIdTypeB);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqshVar.E(dqts.i(brdrVarD.b(), braoVar, bqsm.c.b).g());
        bqshVar.A("getCountOfStarredMessagesByConversation");
        return eiju.g(bqshVar.b().D());
    }

    @Override // defpackage.ankg
    public final eiju c(ConversationId conversationId, final MessageIdType messageIdType, String str, int i) {
        ejwl.a(conversationId instanceof BugleConversationId);
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return eijx.f(new Runnable() { // from class: ankk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(messageIdType, bugleConversationId);
            }
        }, this.c).h(new ankl(this, conversationId, messageIdType, str, i), this.d);
    }

    @Override // defpackage.ankg
    public final eiju d(ConversationId conversationId, final MessageIdType messageIdType, String str, int i) {
        ejwl.a(conversationId instanceof BugleConversationId);
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return eijx.f(new Runnable() { // from class: anki
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bqsm.a;
                bqsc bqscVar = new bqsc();
                bqscVar.f("unstarMessage");
                final MessageIdType messageIdType2 = messageIdType;
                bqscVar.b = new bqsk((bqsl) new Function() { // from class: ankh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqsl bqslVar = (bqsl) obj;
                        bqslVar.b(messageIdType2);
                        return bqslVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bqsl()));
                if (bqscVar.d() > 0) {
                    this.a.b.l(bugleConversationId.a, messageIdType2, new String[0]);
                }
            }
        }, this.c).h(new ankm(this, conversationId, messageIdType, str, i), this.d);
    }

    public final /* synthetic */ void e(MessageIdType messageIdType, BugleConversationId bugleConversationId) {
        try {
            String[] strArr = bqsm.a;
            bqrp bqrpVar = new bqrp();
            bqrpVar.b(messageIdType);
            final bqrm bqrmVarA = bqrpVar.a();
            final dqsy dqsyVarA = bqsm.a();
            long jB = dqru.b(bqsm.a(), "message_star", bqrmVarA, new Function() { // from class: bqrj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.P("message_star", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bqrk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bqrmVarA.m((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Long.valueOf(jB).getClass();
            if (jB > 0) {
                this.b.l(bugleConversationId.a, messageIdType, new String[0]);
            }
        } catch (SQLiteConstraintException unused) {
        }
    }
}
