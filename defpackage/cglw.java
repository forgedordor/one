package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cglw extends cglz {
    private final ConversationIdType a;
    private final cgrc b;
    private final long c;
    private final badt d;
    private final ekgb e;
    private final cgpe f;
    private final int g;

    public cglw(ConversationIdType conversationIdType, cgrc cgrcVar, long j, badt badtVar, ekgb ekgbVar, cgpe cgpeVar, int i) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        if (cgrcVar == null) {
            throw new NullPointerException("Null conversationMuteThreshold");
        }
        this.b = cgrcVar;
        this.c = j;
        if (badtVar == null) {
            throw new NullPointerException("Null conversationData");
        }
        this.d = badtVar;
        if (ekgbVar == null) {
            throw new NullPointerException("Null messagesDataAsc");
        }
        this.e = ekgbVar;
        this.f = cgpeVar;
        this.g = i;
    }

    @Override // defpackage.cglz
    public final int a() {
        return this.g;
    }

    @Override // defpackage.cglz
    public final long b() {
        return this.c;
    }

    @Override // defpackage.cglz
    public final badt c() {
        return this.d;
    }

    @Override // defpackage.cglz
    public final ConversationIdType d() {
        return this.a;
    }

    @Override // defpackage.cglz
    public final cgpe e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cglz) {
            cglz cglzVar = (cglz) obj;
            if (this.a.equals(cglzVar.d()) && this.b.equals(cglzVar.f()) && this.c == cglzVar.b() && this.d.equals(cglzVar.c()) && ekjz.h(this.e, cglzVar.g()) && this.f.equals(cglzVar.e()) && this.g == cglzVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cglz
    public final cgrc f() {
        return this.b;
    }

    @Override // defpackage.cglz
    public final ekgb g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        cgpe cgpeVar = this.f;
        ekgb ekgbVar = this.e;
        badt badtVar = this.d;
        cgrc cgrcVar = this.b;
        return "ConversationAndMessagesData{conversationId=" + this.a.toString() + ", conversationMuteThreshold=" + cgrcVar.toString() + ", earliestTimestamp=" + this.c + ", conversationData=" + badtVar.toString() + ", messagesDataAsc=" + ekgbVar.toString() + ", latestIncomingMessageLineInfo=" + cgpeVar.toString() + ", totalMessagesCount=" + this.g + "}";
    }
}
