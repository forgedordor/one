package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqd implements iqp {
    private final fdae a;
    private final ygn b;

    public zqd(ygn ygnVar, fdae fdaeVar) {
        this.b = ygnVar;
        this.a = fdaeVar;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) < 0.0f) {
            this.b.b(0.0f);
            return 0L;
        }
        ygn ygnVar = this.b;
        ygnVar.b(((ygm) ygnVar.a.c()).b + Float.intBitsToFloat(i2));
        return 0L;
    }

    @Override // defpackage.iqp
    public final long b(long j, int i) {
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f || !ira.a(i, 1)) {
            return 0L;
        }
        this.a.invoke();
        return 0L;
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object c(long j, long j2, fcxy fcxyVar) {
        return new kjo(0L);
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object d(long j, fcxy fcxyVar) {
        return new kjo(0L);
    }
}
