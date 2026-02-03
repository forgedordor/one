package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlc implements fdau {
    final /* synthetic */ float a;
    final /* synthetic */ hox b;

    public dmlc(float f, hox hoxVar) {
        this.a = f;
        this.b = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ico icoVar = ics.e;
        long j = dmpj.a;
        ics icsVarK = egq.k(icoVar, 52.0f);
        long j2 = dmpj.c;
        long j3 = ije.d;
        long j4 = glz.a(hmlVar).a;
        long j5 = glz.a(hmlVar).b;
        long j6 = ije.h;
        long jF = ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.38f, ije.f(j3));
        gda gdaVarA = glz.a(hmlVar);
        long j7 = ((ije) hmlVar.e(gea.a)).i;
        gke gkeVar = gdaVarA.V;
        if (gkeVar == null) {
            long j8 = ije.g;
            gkeVar = new gke(j8, j7, j8, ijg.f(ije.d(j7), ije.c(j7), ije.b(j7), 0.38f, ije.f(j7)), j8, gdd.f(gdaVarA, 26));
            gdaVarA.V = gkeVar;
        }
        long j9 = j2 == 16 ? gkeVar.a : j2;
        if (j3 == 16) {
            j3 = gkeVar.b;
        }
        long j10 = j3;
        if (j6 == 16) {
            j6 = gkeVar.c;
        }
        long j11 = j6;
        if (jF == 16) {
            jF = gkeVar.d;
        }
        long j12 = jF;
        if (j4 == 16) {
            j4 = gkeVar.e;
        }
        long j13 = j4;
        if (j5 == 16) {
            j5 = gkeVar.f;
        }
        gke gkeVar2 = new gke(j9, j10, j11, j12, j13, j5);
        final hox hoxVar = this.b;
        boolean zE = dmlr.e(hoxVar);
        hmlVar.v(5004770);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new fdap() { // from class: dmlb
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    Boolean bool = (Boolean) obj4;
                    bool.booleanValue();
                    hoxVar.b(bool);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        dmsm.a(this.a, icsVarK, gkeVar2, zE, (fdap) objF, hmlVar, 24624);
        return fctx.a;
    }
}
