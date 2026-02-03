package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxt {
    public final cnxu a;
    public final boolean b;
    public final Instant c;
    public final int d;
    public final int e;
    public final Duration f;
    public final Duration g;
    public final int h;
    public final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public cnxt() {
        this(null, 0 == true ? 1 : 0, 511);
    }

    public static /* synthetic */ cnxt a(cnxt cnxtVar, cnxu cnxuVar) {
        boolean z = cnxtVar.b;
        Instant instant = cnxtVar.c;
        int i = cnxtVar.d;
        int i2 = cnxtVar.e;
        Duration duration = cnxtVar.f;
        Duration duration2 = cnxtVar.g;
        int i3 = cnxtVar.h;
        int i4 = cnxtVar.i;
        cnxuVar.getClass();
        return new cnxt(cnxuVar, z, instant, i, i2, duration, duration2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnxt)) {
            return false;
        }
        cnxt cnxtVar = (cnxt) obj;
        return this.a == cnxtVar.a && this.b == cnxtVar.b && fdbq.f(this.c, cnxtVar.c) && this.d == cnxtVar.d && this.e == cnxtVar.e && fdbq.f(this.f, cnxtVar.f) && fdbq.f(this.g, cnxtVar.g) && this.h == cnxtVar.h && this.i == cnxtVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Instant instant = this.c;
        return ((((((((((((((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "BatchStats(status=" + this.a + ", isFinalBatch=" + this.b + ", lastScannedMessageTime=" + this.c + ", messagesSyncedCount=" + this.d + ", messagesUpdatedCount=" + this.e + ", transactionTime=" + this.f + ", totalBatchTime=" + this.g + ", remoteTotal=" + this.h + ", localTotal=" + this.i + ")";
    }

    public cnxt(cnxu cnxuVar, boolean z, Instant instant, int i, int i2, Duration duration, Duration duration2, int i3, int i4) {
        cnxuVar.getClass();
        duration.getClass();
        duration2.getClass();
        this.a = cnxuVar;
        this.b = z;
        this.c = instant;
        this.d = i;
        this.e = i2;
        this.f = duration;
        this.g = duration2;
        this.h = i3;
        this.i = i4;
    }

    public /* synthetic */ cnxt(cnxu cnxuVar, Duration duration, int i) {
        this((i & 1) != 0 ? cnxu.a : cnxuVar, false, null, 0, 0, (i & 32) != 0 ? Duration.ZERO : null, (i & 64) != 0 ? Duration.ZERO : duration, 0, 0);
    }
}
