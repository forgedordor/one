package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqy extends fcyz implements fdap {
    int a;
    final /* synthetic */ qra b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ float f;
    final /* synthetic */ qrn g;
    final /* synthetic */ qnm h;
    final /* synthetic */ float i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqy(qra qraVar, int i, int i2, boolean z, float f, qrn qrnVar, qnm qnmVar, float f2, int i3, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = qraVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = f;
        this.g = qrnVar;
        this.h = qnmVar;
        this.i = f2;
        this.j = i3;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                qra qraVar = this.b;
                int i = this.c;
                qraVar.m(i);
                int i2 = this.d;
                qraVar.a.b(Integer.valueOf(i2));
                qraVar.b.b(Boolean.valueOf(this.e));
                float f = this.f;
                qraVar.d.b(Float.valueOf(f));
                qraVar.c.b(this.g);
                qnm qnmVar = this.h;
                qraVar.l(qnmVar);
                qraVar.o(this.i);
                qraVar.e.b(false);
                qraVar.u(Long.MIN_VALUE);
                if (qnmVar == null) {
                    qraVar.n(false);
                    return fctx.a;
                }
                if (Float.isInfinite(f)) {
                    qraVar.o(qraVar.d());
                    qraVar.n(false);
                    qraVar.m(i2);
                    return fctx.a;
                }
                qraVar.n(true);
                int i3 = this.j;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 != 0) {
                    throw new fctg();
                }
                fcyi fcyiVar = fcyi.a;
                qqx qqxVar = new qqx(fdlw.c(u()), i2, i, qraVar, null);
                this.a = 1;
                if (fdin.a(fcyiVar, qqxVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            fdlw.f(u());
            this.b.n(false);
            return fctx.a;
        } catch (Throwable th) {
            this.b.n(false);
            throw th;
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new qqy(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fcxy) obj).b(fctx.a);
    }
}
