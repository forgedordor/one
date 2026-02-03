package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmz {
    public final String a;
    private final Map b;
    private final int c;
    private final int d;

    public dqmz(String str, Map map, int i, int i2) {
        this.a = str;
        this.b = map;
        this.c = i;
        this.d = i2;
    }

    public final dqmr a() {
        long jA = 0;
        long jC = 0;
        long jB = 0;
        for (dqmr dqmrVar : this.b.values()) {
            jA += dqmrVar.a();
            jC += dqmrVar.c();
            jB += dqmrVar.b();
        }
        dqmr dqmrVar2 = dqmr.d;
        return new dqmn(jA, jC, jB);
    }

    public final String toString() {
        return "ThreadPoolStatsSnapshot{threadPoolName='" + this.a + "', startedTaskCount=" + this.c + ", finishedTaskCount=" + this.d + ", taskSchedStats=" + this.b + ", aggregatedSchedStats=" + a() + '}';
    }
}
