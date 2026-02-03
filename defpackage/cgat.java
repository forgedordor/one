package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cgat extends cgcp {
    private final ConversationIdType a;
    private final MessageIdType b;
    private final int c;
    private final int d;

    public cgat(ConversationIdType conversationIdType, MessageIdType messageIdType, int i, int i2) {
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.cgcp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cgcp
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.cgcp
    public final MessageIdType c() {
        return this.b;
    }

    @Override // defpackage.cgcp
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgcp) {
            cgcp cgcpVar = (cgcp) obj;
            if (this.a.equals(cgcpVar.b()) && this.b.equals(cgcpVar.c()) && this.c == cgcpVar.a() && this.d == cgcpVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        MessageIdType messageIdType = this.b;
        return "FailedMessageInfo{conversationId=" + this.a.toString() + ", messageId=" + messageIdType.toString() + ", rawTelephonyStatus=" + this.c + ", failureType=" + cgcq.a(this.d) + "}";
    }
}
