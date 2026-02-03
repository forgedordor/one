package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnxg {
    public final cnxu a;
    public final cnrx b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Instant f;
    public final int g;
    public final int h;

    public cnxg(cnxu cnxuVar, cnrx cnrxVar, boolean z, int i, int i2, Instant instant, int i3, int i4) {
        cnxuVar.getClass();
        this.a = cnxuVar;
        this.b = cnrxVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = instant;
        this.g = i3;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnxg)) {
            return false;
        }
        cnxg cnxgVar = (cnxg) obj;
        return this.a == cnxgVar.a && fdbq.f(this.b, cnxgVar.b) && this.c == cnxgVar.c && this.d == cnxgVar.d && this.e == cnxgVar.e && fdbq.f(this.f, cnxgVar.f) && this.g == cnxgVar.g && this.h == cnxgVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Instant instant = this.f;
        return (((((((((((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d) * 31) + this.e) * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "ScanResults(status=" + this.a + ", messagesToSync=" + this.b + ", syncComplete=" + this.c + ", messagesUpdatedCount=" + this.d + ", messagesSyncedCount=" + this.e + ", lastMessageTimestamp=" + this.f + ", remoteTotal=" + this.g + ", localTotal=" + this.h + ")";
    }

    public /* synthetic */ cnxg(cnxu cnxuVar) {
        this(cnxuVar, new cnrx(), false, 0, 0, null, 0, 0);
    }
}
