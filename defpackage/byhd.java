package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byhd {
    public final int a;
    public final Map b;
    public final byqu c;

    public byhd(int i, Map map, byqu byquVar) {
        this.a = i;
        this.b = map;
        this.c = byquVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byhd)) {
            return false;
        }
        byhd byhdVar = (byhd) obj;
        return this.a == byhdVar.a && fdbq.f(this.b, byhdVar.b) && fdbq.f(this.c, byhdVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        byqu byquVar = this.c;
        return (iHashCode * 31) + (byquVar == null ? 0 : byquVar.hashCode());
    }

    public final String toString() {
        return "BatchBackupResult(tableType=" + this.a + ", results=" + this.b + ", terminationError=" + this.c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public byhd(int i, Map map) {
        this(i, map, null);
        map.getClass();
    }
}
