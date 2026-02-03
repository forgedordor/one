package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobm implements cobo {
    public final Instant a;
    public final Instant b;
    private final int c;
    private final UUID d;
    private final UUID e;

    public cobm(Instant instant, Instant instant2, int i, UUID uuid, UUID uuid2) {
        instant.getClass();
        instant2.getClass();
        this.a = instant;
        this.b = instant2;
        this.c = i;
        this.d = uuid;
        this.e = uuid2;
    }

    @Override // defpackage.cobo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cobo
    public final cnsx b(cnsy cnsyVar) {
        return cnsyVar.a(this.b.toEpochMilli(), this.a.toEpochMilli());
    }

    @Override // defpackage.cobo
    public final UUID c() {
        return this.e;
    }

    @Override // defpackage.cobo
    public final UUID d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cobm)) {
            return false;
        }
        cobm cobmVar = (cobm) obj;
        return fdbq.f(this.a, cobmVar.a) && fdbq.f(this.b, cobmVar.b) && this.c == cobmVar.c && fdbq.f(this.d, cobmVar.d) && fdbq.f(this.e, cobmVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TimeBasedSyncBatch(upperBoundTime=" + this.a + ", lowerBoundTime=" + this.b + ", targetMessagesToUpdate=" + this.c + ", syncId=" + this.d + ", batchId=" + this.e + ")";
    }
}
