package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwp extends ehyt {
    private final Set a;
    private final long b;
    private final ejwi c;

    public ehwp(Set set, long j, ejwi ejwiVar) {
        this.a = set;
        this.b = j;
        this.c = ejwiVar;
    }

    @Override // defpackage.ehyt
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ehyt
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.ehyt
    public final Set c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehyt) {
            ehyt ehytVar = (ehyt) obj;
            if (this.a.equals(ehytVar.c()) && this.b == ehytVar.a() && this.c.equals(ehytVar.b())) {
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
        ejwi ejwiVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + ejwiVar.toString() + "}";
    }
}
