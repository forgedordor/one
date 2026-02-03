package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqf implements iqp {
    final /* synthetic */ gqg a;

    public gqf(gqg gqgVar) {
        this.a = gqgVar;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        gqg gqgVar = this.a;
        if (!((Boolean) gqgVar.b.invoke()).booleanValue()) {
            return 0L;
        }
        hcq hcqVar = gqgVar.a;
        hcqVar.d(hcqVar.b() + Float.intBitsToFloat((int) (j & 4294967295L)));
        return 0L;
    }

    @Override // defpackage.iqp
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    @Override // defpackage.iqp
    public final Object c(long j, long j2, fcxy fcxyVar) {
        if (kjo.b(j2) > 0.0f) {
            this.a.a.d(0.0f);
        }
        return new kjo(0L);
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object d(long j, fcxy fcxyVar) {
        return new kjo(0L);
    }
}
