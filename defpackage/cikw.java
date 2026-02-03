package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cikw extends cilf {
    public final ConversationIdType a;
    public final String b;
    public final String c;

    public cikw(ConversationIdType conversationIdType, String str, String str2) {
        this.a = conversationIdType;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.cilf
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.cilf
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cilf
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cilf) {
            cilf cilfVar = (cilf) obj;
            if (this.a.equals(cilfVar.a()) && this.b.equals(cilfVar.b()) && ((str = this.c) != null ? str.equals(cilfVar.c()) : cilfVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Identifiers{conversationId=" + this.a.toString() + ", groupId=" + this.b + ", telephonyRecipientId=" + this.c + "}";
    }
}
