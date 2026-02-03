package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhn implements ehsl {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ uho d;

    public uhn(uho uhoVar, ConversationIdType conversationIdType, ConversationId conversationId, MessageIdType messageIdType) {
        this.a = conversationIdType;
        this.b = conversationId;
        this.c = messageIdType;
        this.d = uhoVar;
    }

    @Override // defpackage.ehsl
    public final ejwi a() {
        return ejud.a;
    }

    @Override // defpackage.ehsl
    public final ListenableFuture c() {
        if (!((Boolean) uhh.a.e()).booleanValue()) {
            return eijx.e(ehsj.a("Deeplink by conversation_id is not enabled yet"));
        }
        final ConversationIdType conversationIdType = this.a;
        final ConversationId conversationId = this.b;
        final MessageIdType messageIdType = this.c;
        return eijx.g(new Callable() { // from class: uhm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ConversationIdType conversationIdType2 = conversationIdType;
                if (!conversationIdType2.b()) {
                    eieu eieuVarK = eiiy.k("ConversationDeeplinkGatewayHandler#hasConversation");
                    try {
                        botb botbVarE = botm.e();
                        botbVarE.A("hasConversation");
                        botbVarE.i(new Function() { // from class: uhi
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                botl botlVar = (botl) obj;
                                botlVar.r(conversationIdType2);
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean zU = botbVarE.b().U();
                        eieuVarK.close();
                        if (zU) {
                            ConversationId bugleConversationId = conversationId;
                            if (bugleConversationId == null) {
                                bugleConversationId = new BugleConversationId(conversationIdType2);
                            }
                            return this.a.d.a(bugleConversationId, messageIdType);
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return ehsj.a("Cannot find conversation by conversation_id");
            }
        }, this.d.a);
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ ehsj e() {
        return ehsk.a();
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void d() {
    }
}
