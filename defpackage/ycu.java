package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycu {
    public final zny a;
    public final zqw b;
    public final bxuv c;
    public final aafp d;
    public final yca e;
    public final int f;
    public final MessageId g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Instant k;
    public final boolean l;

    public ycu(zny znyVar, zqw zqwVar, bxuv bxuvVar, aafp aafpVar, yca ycaVar, int i, MessageId messageId, boolean z, boolean z2, boolean z3, Instant instant, boolean z4) {
        this.a = znyVar;
        this.b = zqwVar;
        this.c = bxuvVar;
        this.d = aafpVar;
        this.e = ycaVar;
        this.f = i;
        this.g = messageId;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = instant;
        this.l = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycu)) {
            return false;
        }
        ycu ycuVar = (ycu) obj;
        return fdbq.f(this.a, ycuVar.a) && fdbq.f(this.b, ycuVar.b) && fdbq.f(this.c, ycuVar.c) && fdbq.f(this.d, ycuVar.d) && fdbq.f(this.e, ycuVar.e) && this.f == ycuVar.f && fdbq.f(this.g, ycuVar.g) && this.h == ycuVar.h && this.i == ycuVar.i && this.j == ycuVar.j && fdbq.f(this.k, ycuVar.k) && this.l == ycuVar.l;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        bxuv bxuvVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (bxuvVar == null ? 0 : bxuvVar.hashCode())) * 31;
        aafp aafpVar = this.d;
        int iHashCode3 = (((((iHashCode2 + (aafpVar == null ? 0 : aafpVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        MessageId messageId = this.g;
        int iHashCode4 = (((((((iHashCode3 + (messageId == null ? 0 : messageId.hashCode())) * 31) + yct.a(this.h)) * 31) + yct.a(this.i)) * 31) + yct.a(this.j)) * 31;
        Instant instant = this.k;
        return ((iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 31) + yct.a(this.l);
    }

    public final String toString() {
        return "MessagesFlowRequirements(messageListPagingData=" + this.a + ", selectionData=" + this.b + ", currentHit=" + this.c + ", searchResults=" + this.d + ", conversationProperties=" + this.e + ", selfIdentitiesCount=" + this.f + ", messageIdWithLastReadMarker=" + this.g + ", lastReadMarkerVisibility=" + this.h + ", isCurrentlyPinching=" + this.i + ", isPenpalConversation=" + this.j + ", latestReadMessageTimestamp=" + this.k + ", enableSwipeToShowTimestamps=" + this.l + ")";
    }
}
