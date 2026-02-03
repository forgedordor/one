package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyca extends eycq {
    /* JADX WARN: Illegal instructions before constructor call */
    public eyca(eycb eycbVar, int i) {
        ejwl.b(i > 0, "Chunk granularity must be greater than 0.");
        long j = i;
        ejwl.b(j < eycbVar.c(), "Chunk granularity must be smaller than the read ahead limit.");
        long jD = eycbVar.d();
        long jE = eycbVar.e();
        if (jE < 0) {
            while (eycbVar.i() && eycbVar.d() - eycbVar.b() < eycbVar.c()) {
                eycbVar.f(eycbVar.c());
            }
            jE = eycbVar.d();
            eycbVar.h();
            eycbVar.f(jD - eycbVar.b());
        } else {
            long jB = eycbVar.b() + eycbVar.c();
            if (jB > 0 && jB < jE) {
                jE = jB;
            }
        }
        super(eycbVar, ((jE - jD) / j) * j);
    }
}
