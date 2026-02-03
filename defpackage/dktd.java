package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dktd implements fdau {
    final /* synthetic */ ije a;
    final /* synthetic */ ije b;
    final /* synthetic */ boolean c;

    public dktd(ije ijeVar, ije ijeVar2, boolean z) {
        this.a = ijeVar;
        this.b = ijeVar2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [dktc] */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long jF;
        dksy dksyVar;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(195237699);
        hmlVar.v(-1355131511);
        ije ijeVar = this.a;
        if (ijeVar == null) {
            long j = glz.a(hmlVar).p;
            jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j));
        } else {
            jF = ijeVar.i;
        }
        hmlVar.o();
        ije ijeVar2 = this.b;
        hmlVar.v(-1355128106);
        long j2 = ijeVar2 == null ? glz.a(hmlVar).v : ijeVar2.i;
        hmlVar.o();
        if (this.c) {
            hmlVar.v(-1355124645);
            ?? C = dkto.c(jF, hmlVar);
            hmlVar.o();
            dksyVar = C;
        } else {
            hmlVar.v(-1355123688);
            hmlVar.v(33864667);
            fctc fctcVar = dktb.a;
            dff dffVar = (dff) dktb.a.a();
            dffVar.getClass();
            dksy dksyVar2 = new dksy(jF, dffVar);
            hmlVar.o();
            hmlVar.o();
            dksyVar = dksyVar2;
        }
        ics icsVarG = icj.g(icsVar, new dktl(dkte.a, dktf.a, dksyVar, j2, ikj.a));
        hmlVar.o();
        return icsVarG;
    }
}
