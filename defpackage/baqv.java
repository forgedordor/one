package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class baqv {
    public static baqv c(ConversationIdType conversationIdType) {
        bakc bakcVar = new bakc();
        bakcVar.b(conversationIdType);
        bakcVar.c(false);
        return bakcVar.a();
    }

    public static baqv d(ConversationIdType conversationIdType) {
        bakc bakcVar = new bakc();
        bakcVar.b(conversationIdType);
        bakcVar.c(true);
        return bakcVar.a();
    }

    public abstract ConversationIdType a();

    public abstract boolean b();
}
