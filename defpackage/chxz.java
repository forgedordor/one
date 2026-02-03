package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chxz extends chzj {
    public final chyz a;
    public final long b;
    public final UUID c;

    public chxz(chyz chyzVar, long j, UUID uuid) {
        if (chyzVar == null) {
            throw new NullPointerException("Null rcsAvailabilityUpdate");
        }
        this.a = chyzVar;
        this.b = j;
        if (uuid == null) {
            throw new NullPointerException("Null execId");
        }
        this.c = uuid;
    }

    @Override // defpackage.chzj
    public final long a() {
        return this.b;
    }

    @Override // defpackage.chzj
    public final chyz b() {
        return this.a;
    }

    @Override // defpackage.chzj
    public final UUID c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chzj) {
            chzj chzjVar = (chzj) obj;
            if (this.a.equals(chzjVar.b()) && this.b == chzjVar.a() && this.c.equals(chzjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        UUID uuid = this.c;
        return "ExecutionInfo{rcsAvailabilityUpdate=" + this.a.toString() + ", triggerTime=" + this.b + ", execId=" + uuid.toString() + "}";
    }
}
