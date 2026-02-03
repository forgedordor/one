package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byhc {
    public final int a;
    public final Map b;

    public byhc(int i, Map map) {
        map.getClass();
        this.a = i;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byhc)) {
            return false;
        }
        byhc byhcVar = (byhc) obj;
        return this.a == byhcVar.a && fdbq.f(this.b, byhcVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BatchBackupFailureResult(tableType=" + this.a + ", results=" + this.b + ")";
    }
}
