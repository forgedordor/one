package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acjj extends acjp {
    private final ekgb a;
    private final SpannableString b;
    private final ConversationIdType c;

    public acjj(ekgb ekgbVar, SpannableString spannableString, ConversationIdType conversationIdType) {
        this.a = ekgbVar;
        this.b = spannableString;
        this.c = conversationIdType;
    }

    @Override // defpackage.acjp
    public final SpannableString a() {
        return this.b;
    }

    @Override // defpackage.acjp
    public final ConversationIdType b() {
        return this.c;
    }

    @Override // defpackage.acjp
    public final ekgb c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acjp) {
            acjp acjpVar = (acjp) obj;
            if (ekjz.h(this.a, acjpVar.c()) && this.b.equals(acjpVar.a()) && this.c.equals(acjpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ConversationIdType conversationIdType = this.c;
        SpannableString spannableString = this.b;
        return "ProblematicConversation{problematicMessages=" + String.valueOf(this.a) + ", conversationName=" + spannableString.toString() + ", conversationId=" + conversationIdType.toString() + "}";
    }
}
