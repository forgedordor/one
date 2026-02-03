package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggk extends cghn {
    private final String a;
    private final ConversationIdType b;
    private final ConversationId c;
    private final String d;
    private final boolean e;
    private final Optional f;
    private final int g;
    private final IconCompat h;
    private final Optional i;
    private final Optional j;
    private final Optional k;

    public cggk(String str, ConversationIdType conversationIdType, ConversationId conversationId, String str2, boolean z, Optional optional, int i, IconCompat iconCompat, Optional optional2, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = conversationIdType;
        this.c = conversationId;
        this.d = str2;
        this.e = z;
        this.f = optional;
        this.g = i;
        this.h = iconCompat;
        this.i = optional2;
        this.j = optional3;
        this.k = optional4;
    }

    @Override // defpackage.cghn
    public final int a() {
        return this.g;
    }

    @Override // defpackage.cghn
    public final IconCompat b() {
        return this.h;
    }

    @Override // defpackage.cghn
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.cghn
    public final ConversationIdType d() {
        return this.b;
    }

    @Override // defpackage.cghn
    public final Optional e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        IconCompat iconCompat;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cghn) {
            cghn cghnVar = (cghn) obj;
            if (this.a.equals(cghnVar.j()) && this.b.equals(cghnVar.d()) && this.c.equals(cghnVar.c()) && this.d.equals(cghnVar.i()) && this.e == cghnVar.k() && this.f.equals(cghnVar.g()) && this.g == cghnVar.a() && ((iconCompat = this.h) != null ? iconCompat.equals(cghnVar.b()) : cghnVar.b() == null) && this.i.equals(cghnVar.e()) && this.j.equals(cghnVar.f()) && this.k.equals(cghnVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cghn
    public final Optional f() {
        return this.j;
    }

    @Override // defpackage.cghn
    public final Optional g() {
        return this.f;
    }

    @Override // defpackage.cghn
    public final Optional h() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        IconCompat iconCompat = this.h;
        return (((((((((iHashCode * 1000003) ^ this.g) * 1000003) ^ (iconCompat == null ? 0 : iconCompat.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.cghn
    public final String i() {
        return this.d;
    }

    @Override // defpackage.cghn
    public final String j() {
        return this.a;
    }

    @Override // defpackage.cghn
    public final boolean k() {
        return this.e;
    }

    public final String toString() {
        Optional optional = this.k;
        Optional optional2 = this.j;
        Optional optional3 = this.i;
        IconCompat iconCompat = this.h;
        Optional optional4 = this.f;
        ConversationId conversationId = this.c;
        return "ConversationSpecificNotificationInfo{shortcutId=" + this.a + ", conversationId=" + this.b.toString() + ", mapiConversationId=" + conversationId.toString() + ", conversationLabel=" + this.d + ", isGroup=" + this.e + ", otherParticipantMessagingIdentity=" + String.valueOf(optional4) + ", shortcutRank=" + this.g + ", conversationIcon=" + String.valueOf(iconCompat) + ", bubbleClickInteractionInfo=" + String.valueOf(optional3) + ", bubbleSwipeInteractionInfo=" + String.valueOf(optional2) + ", peopleInConversation=" + String.valueOf(optional) + "}";
    }
}
