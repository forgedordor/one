package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimi implements fdat {
    final /* synthetic */ diks a;

    public dimi(diks diksVar) {
        this.a = diksVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long jD;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diks diksVar = this.a;
            hmlVar.v(1363695565);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                hmlVar.v(546417371);
                jD = diln.d(diksVar, hmlVar);
                hmlVar.o();
            } else if (diksVar.f()) {
                hmlVar.v(546419607);
                jD = dljt.a(hmlVar).b.k;
                hmlVar.o();
            } else if (diksVar.h() && diksVar.g()) {
                hmlVar.v(546422074);
                jD = dljt.a(hmlVar).b.i;
                hmlVar.o();
            } else if (diksVar.h()) {
                hmlVar.v(546424186);
                jD = dljt.a(hmlVar).b.f;
                hmlVar.o();
            } else if (diksVar.g()) {
                hmlVar.v(546426298);
                jD = dljt.a(hmlVar).b.d;
                hmlVar.o();
            } else {
                hmlVar.v(546428218);
                jD = dljt.a(hmlVar).b.b;
                hmlVar.o();
            }
            long jF = ijg.f(ije.d(jD), ije.c(jD), ije.b(jD), 0.25f, ije.f(jD));
            hmlVar.o();
            dimx.c(jF, hmlVar, 0);
        }
        return fctx.a;
    }
}
