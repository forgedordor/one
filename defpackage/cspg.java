package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspg {
    private final fcsu a;

    public cspg(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final cspf a(ConversationIdType conversationIdType) {
        if (conversationIdType == null || conversationIdType.b()) {
            return null;
        }
        return ((csph) this.a.b()).a(conversationIdType);
    }
}
