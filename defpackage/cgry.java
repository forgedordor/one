package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgry {
    public final cogw a;

    public cgry(cogw cogwVar) {
        cogwVar.getClass();
        this.a = cogwVar;
    }

    public final boolean a(long j) {
        long epochMilli = this.a.f().toEpochMilli();
        Object objE = crbf.Z.e();
        objE.getClass();
        long jLongValue = j + ((Number) objE).longValue();
        Object objE2 = crbf.aa.e();
        objE2.getClass();
        return jLongValue <= epochMilli && epochMilli <= ((Number) objE2).longValue() + jLongValue;
    }
}
