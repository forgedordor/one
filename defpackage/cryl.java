package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cryl {
    public final long a;
    public List b = null;
    public List c = null;
    public csdr d = null;
    public List e = null;
    public csoc f = null;
    public bvdk g = null;
    public List h = null;
    public List i = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cryl)) {
            return false;
        }
        cryl crylVar = (cryl) obj;
        return this.a == crylVar.a && fdbq.f(this.b, crylVar.b) && fdbq.f(this.c, crylVar.c) && fdbq.f(this.d, crylVar.d) && fdbq.f(this.e, crylVar.e) && fdbq.f(this.f, crylVar.f) && this.g == crylVar.g && fdbq.f(this.h, crylVar.h) && fdbq.f(this.i, crylVar.i);
    }

    public final int hashCode() {
        List list = this.b;
        int iHashCode = list == null ? 0 : list.hashCode();
        long j = this.a;
        List list2 = this.c;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        int i = (((int) (j ^ (j >>> 32))) * 31) + iHashCode;
        csdr csdrVar = this.d;
        int iHashCode3 = ((((i * 31) + iHashCode2) * 31) + (csdrVar == null ? 0 : csdrVar.hashCode())) * 31;
        List list3 = this.e;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        csoc csocVar = this.f;
        int iHashCode5 = (iHashCode4 + (csocVar == null ? 0 : csocVar.hashCode())) * 31;
        bvdk bvdkVar = this.g;
        int iHashCode6 = (iHashCode5 + (bvdkVar == null ? 0 : bvdkVar.hashCode())) * 31;
        List list4 = this.h;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.i;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        return "SpamLoggingMetadataCache(eventTimestampMillis=" + this.a + ", classifications=" + this.b + ", latestMessages=" + this.c + ", targetMessage=" + this.d + ", participants=" + this.e + ", targetParticipant=" + this.f + ", archiveStatus=" + this.g + ", conversationAndMessageLoggingIds=" + this.h + ", conversationAndMessageLoggingIds2=" + this.i + ")";
    }
}
