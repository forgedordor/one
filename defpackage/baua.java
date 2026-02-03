package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baua {
    public static final cqce a = cqce.g("BugleDataModel", "ConversationMessageListDatabaseOperations");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final aqmq e;

    public baua(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aqmq aqmqVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = aqmqVar;
    }

    public final bgvb a(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#getLastMessagesInConversation");
        try {
            bgvb bgvbVar = (bgvb) ((bael) this.c.b()).g(conversationIdType, 1).b().p();
            eieuVarK.close();
            return bgvbVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bfrj b(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#getLastMessagesInConversation");
        try {
            bfrj bfrjVar = (bfrj) ((baes) this.d.b()).f(conversationIdType, 1).b().p();
            eieuVarK.close();
            return bfrjVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb c(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#getLastMessagesInConversationWithReactions");
        try {
            ekgb ekgbVarZ = ((bael) this.c.b()).e(conversationIdType, 7, 0).b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb d(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#getLastMessagesInConversationWithReactions");
        try {
            ekgb ekgbVarZ = ((baes) this.d.b()).d(conversationIdType, 7, 0).b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
