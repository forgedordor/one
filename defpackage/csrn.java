package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrn {
    public final boolean a;
    public final long b;
    public final long c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    private final List j;

    public csrn(boolean z, long j, long j2, List list, List list2, int i, int i2, int i3, int i4, String str) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.a = z;
        this.b = j;
        this.c = j2;
        this.j = list;
        this.d = list2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csrn)) {
            return false;
        }
        csrn csrnVar = (csrn) obj;
        return this.a == csrnVar.a && this.b == csrnVar.b && this.c == csrnVar.c && fdbq.f(this.j, csrnVar.j) && fdbq.f(this.d, csrnVar.d) && this.e == csrnVar.e && this.f == csrnVar.f && this.g == csrnVar.g && this.h == csrnVar.h && fdbq.f(this.i, csrnVar.i);
    }

    public final int hashCode() {
        boolean z = this.a;
        return ((((((((((((((((((true != z ? 1237 : 1231) * 31) + csrm.a(this.b)) * 31) + csrm.a(this.c)) * 31) + this.j.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "TachyonSpamMetadata(isContact=" + this.a + ", earliestIncomingTimestamp=" + this.b + ", earliestOutgoingTimestamp=" + this.c + ", suspectedSpamSource=" + this.j + ", latestClassificationsBySource=" + this.d + ", messagesFromReporterCount=" + this.e + ", messagesFromReportedCount=" + this.f + ", totalMessagesCount=" + this.g + ", otherParticipantCount=" + this.h + ", rcsGroupId=" + this.i + ")";
    }
}
