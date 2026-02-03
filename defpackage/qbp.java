package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbp {
    public final UUID a;
    public final qbo b;
    public final Set c;
    public final pzj d;
    private final pzs e;
    private final pzs f;
    private final int g;
    private final int h;
    private final long i;
    private final qbn j;
    private final long k;
    private final int l;

    public qbp(UUID uuid, qbo qboVar, Set set, pzs pzsVar, pzs pzsVar2, int i, int i2, pzj pzjVar, long j, qbn qbnVar, long j2, int i3) {
        pzsVar2.getClass();
        this.a = uuid;
        this.b = qboVar;
        this.c = set;
        this.e = pzsVar;
        this.f = pzsVar2;
        this.g = i;
        this.h = i2;
        this.d = pzjVar;
        this.i = j;
        this.j = qbnVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fdbq.f(getClass(), obj.getClass())) {
            return false;
        }
        qbp qbpVar = (qbp) obj;
        if (this.g == qbpVar.g && this.h == qbpVar.h && fdbq.f(this.a, qbpVar.a) && this.b == qbpVar.b && fdbq.f(this.e, qbpVar.e) && fdbq.f(this.d, qbpVar.d) && this.i == qbpVar.i && fdbq.f(this.j, qbpVar.j) && this.k == qbpVar.k && this.l == qbpVar.l && fdbq.f(this.c, qbpVar.c)) {
            return fdbq.f(this.f, qbpVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        qbn qbnVar = this.j;
        return (((((((iHashCode * 31) + qbl.a(this.i)) * 31) + (qbnVar != null ? qbnVar.hashCode() : 0)) * 31) + qbl.a(this.k)) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
