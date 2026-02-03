package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmk {
    public final long a;
    public final List b;
    public final int c;

    public cbmk(long j, List list, int i) {
        this.a = j;
        this.b = list;
        this.c = i;
    }

    public static /* synthetic */ cbmk a(cbmk cbmkVar, List list, int i, int i2) {
        long j = (i2 & 1) != 0 ? cbmkVar.a : 0L;
        if ((i2 & 2) != 0) {
            list = cbmkVar.b;
        }
        if ((i2 & 4) != 0) {
            i = cbmkVar.c;
        }
        list.getClass();
        return new cbmk(j, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbmk)) {
            return false;
        }
        cbmk cbmkVar = (cbmk) obj;
        return this.a == cbmkVar.a && fdbq.f(this.b, cbmkVar.b) && this.c == cbmkVar.c;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ActiveWorkerStats(startedAtTimeMillis=" + this.a + ", currentlyExecutingItems=" + this.b + ", completedWorkItems=" + this.c + ")";
    }
}
