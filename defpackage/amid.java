package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amid implements anpj {
    public final BugleConversationId a;
    private final ajmh b;
    private final eosc c;

    public amid(ajmh ajmhVar, eosc eoscVar, BugleConversationId bugleConversationId) {
        this.b = ajmhVar;
        this.c = eoscVar;
        this.a = bugleConversationId;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.b.l(new amic(anpiVar));
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return eijx.g(new Callable() { // from class: amib
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType conversationIdType = this.a.a.a;
                dqxe dqxeVar = bxjj.a;
                eieu eieuVarK = eiiy.k("UnreadMessagesCountQuery#getUnreadConversationMessagesCount");
                try {
                    int iH = bxjj.b(conversationIdType).b().h();
                    eieuVarK.close();
                    return Integer.valueOf(iH);
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
