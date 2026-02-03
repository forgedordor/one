package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctia {
    public final ConversationId a;
    public final String b;
    public final ekgb c;
    public final int d = 3;
    private final boolean e;

    public ctia(ConversationId conversationId, String str, ekgb ekgbVar, boolean z) {
        this.a = conversationId;
        this.b = str;
        this.c = ekgbVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctia)) {
            return false;
        }
        ctia ctiaVar = (ctia) obj;
        if (!fdbq.f(this.a, ctiaVar.a) || !fdbq.f(this.b, ctiaVar.b) || !fdbq.f(this.c, ctiaVar.c) || this.e != ctiaVar.e) {
            return false;
        }
        int i = ctiaVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + 3;
    }

    public final String toString() {
        return "ForGroupRename(conversationId=" + this.a + ", groupName=" + this.b + ", participants=" + this.c + ", isRcs=" + this.e + ", contactPickerSource=" + ((Object) Integer.toString(2)) + ")";
    }
}
