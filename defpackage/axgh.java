package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axgh {
    public final fcsu a;
    private final fcsu b;

    public axgh(fcsu fcsuVar, fcsu fcsuVar2) {
        new ConcurrentHashMap();
        this.b = fcsuVar;
        this.a = fcsuVar2;
    }

    public final bajf a(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("BugleDbOperationsCached::getExistingConversation");
        try {
            bajf bajfVarA = ((bapl) this.b.b()).a(conversationIdType);
            eieuVarK.close();
            return bajfVarA;
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
