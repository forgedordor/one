package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapt extends aapw {
    public final emvl a;
    public final ConversationIdType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;

    public aapt(emvl emvlVar, ConversationIdType conversationIdType, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = emvlVar;
        this.b = conversationIdType;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
        this.g = optional5;
        this.h = optional6;
    }

    @Override // defpackage.aapw
    public final ConversationIdType a() {
        return this.b;
    }

    @Override // defpackage.aapw
    public final emvl b() {
        return this.a;
    }

    @Override // defpackage.aapw
    public final Optional c() {
        return this.g;
    }

    @Override // defpackage.aapw
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.aapw
    public final Optional e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aapw) {
            aapw aapwVar = (aapw) obj;
            if (this.a.equals(aapwVar.b()) && this.b.equals(aapwVar.a()) && this.c.equals(aapwVar.d()) && this.d.equals(aapwVar.g()) && this.e.equals(aapwVar.f()) && this.f.equals(aapwVar.e()) && this.g.equals(aapwVar.c()) && this.h.equals(aapwVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aapw
    public final Optional f() {
        return this.e;
    }

    @Override // defpackage.aapw
    public final Optional g() {
        return this.d;
    }

    @Override // defpackage.aapw
    public final Optional h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.g;
        Optional optional3 = this.f;
        Optional optional4 = this.e;
        Optional optional5 = this.d;
        Optional optional6 = this.c;
        ConversationIdType conversationIdType = this.b;
        return "ReportableError{type=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", conversationType=" + String.valueOf(optional6) + ", messageId=" + String.valueOf(optional5) + ", forkedConversationJoinStates=" + String.valueOf(optional4) + ", forkedConversationDifferentNamesLocalCount=" + String.valueOf(optional3) + ", conversationForking=" + String.valueOf(optional2) + ", mixedUpParticipantStatistics=" + String.valueOf(optional) + "}";
    }
}
