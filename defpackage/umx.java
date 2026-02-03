package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umx extends una {
    private final unm a;
    private final SelfIdentityId b;
    private final cklv c;

    public umx(unm unmVar, SelfIdentityId selfIdentityId, cklv cklvVar) {
        this.a = unmVar;
        this.b = selfIdentityId;
        this.c = cklvVar;
    }

    @Override // defpackage.una
    public final unm a() {
        return this.a;
    }

    @Override // defpackage.una
    public final SelfIdentityId b() {
        return this.b;
    }

    @Override // defpackage.una
    public final cklv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        SelfIdentityId selfIdentityId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof una) {
            una unaVar = (una) obj;
            if (this.a.equals(unaVar.a()) && ((selfIdentityId = this.b) != null ? selfIdentityId.equals(unaVar.b()) : unaVar.b() == null) && this.c.equals(unaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        SelfIdentityId selfIdentityId = this.b;
        return (((iHashCode * 1000003) ^ (selfIdentityId == null ? 0 : selfIdentityId.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        cklv cklvVar = this.c;
        SelfIdentityId selfIdentityId = this.b;
        return "ReactionBadgeClickEvent{reactionSelectionData=" + this.a.toString() + ", selfParticipantId=" + String.valueOf(selfIdentityId) + ", messageReactionsData=" + cklvVar.toString() + "}";
    }
}
