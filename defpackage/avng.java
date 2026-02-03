package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avng extends avnl {
    public final ConversationIdType a;
    public final long b;
    public final elka c;
    public final SuperSortLabel d;
    public final boolean e;

    public avng(ConversationIdType conversationIdType, long j, elka elkaVar, SuperSortLabel superSortLabel, boolean z) {
        this.a = conversationIdType;
        this.b = j;
        this.c = elkaVar;
        this.d = superSortLabel;
        this.e = z;
    }

    @Override // defpackage.avnl
    public final long a() {
        return this.b;
    }

    @Override // defpackage.avnl
    public final SuperSortLabel b() {
        return this.d;
    }

    @Override // defpackage.avnl
    public final ConversationIdType c() {
        return this.a;
    }

    @Override // defpackage.avnl
    public final elka d() {
        return this.c;
    }

    @Override // defpackage.avnl
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avnl) {
            avnl avnlVar = (avnl) obj;
            if (this.a.equals(avnlVar.c()) && this.b == avnlVar.a() && this.c.equals(avnlVar.d()) && this.d.equals(avnlVar.b()) && this.e == avnlVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.d;
        elka elkaVar = this.c;
        return "ConversationDeleterParameters{conversationId=" + this.a.toString() + ", deleteTimestamp=" + this.b + ", origin=" + elkaVar.toString() + ", filter=" + superSortLabel.toString() + ", onlyIfEmpty=" + this.e + "}";
    }
}
