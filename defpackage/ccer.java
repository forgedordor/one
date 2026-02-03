package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccer {
    private final cbqj a;

    public ccer(cbqj cbqjVar) {
        cbqjVar.getClass();
        this.a = cbqjVar;
    }

    public final ccep a(ConversationIdType conversationIdType, asrg asrgVar) {
        String str;
        asrgVar.getClass();
        if (asrgVar.d()) {
            str = asrgVar.b().c;
        } else {
            cbqx cbqxVarC = this.a.c(conversationIdType);
            str = cbqxVarC != null ? cbqxVarC.a : null;
            if (str == null) {
                throw new IllegalArgumentException("Missing encryption ID for the 1:1 MLS conversation.");
            }
        }
        str.getClass();
        return new ccep(str);
    }
}
