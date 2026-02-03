package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvs extends acwb {
    private final ConversationIdType a;
    private final long b;
    private final boolean c;
    private final Optional d;

    public acvs(ConversationIdType conversationIdType, long j, boolean z, Optional optional) {
        this.a = conversationIdType;
        this.b = j;
        this.c = z;
        if (optional == null) {
            throw new NullPointerException("Null nudgeAdjustedTimestamp");
        }
        this.d = optional;
    }

    @Override // defpackage.acwb
    public final long a() {
        return this.b;
    }

    @Override // defpackage.acwb
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.acwb
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.acwb
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwb) {
            acwb acwbVar = (acwb) obj;
            if (this.a.equals(acwbVar.b()) && this.b == acwbVar.a() && this.c == acwbVar.d() && this.d.equals(acwbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.b;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        return "ConversationKey{conversationId=" + this.a.toString() + ", sortTimestamp=" + this.b + ", pinStatus=" + this.c + ", nudgeAdjustedTimestamp=" + optional.toString() + "}";
    }
}
