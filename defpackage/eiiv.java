package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiiv implements fdmv {
    public static final eiiu a = new eiiu();
    public final eifq b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final eiit f;

    public eiiv(eifq eifqVar, boolean z, boolean z2, boolean z3) {
        this.b = eifqVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        boolean z4 = false;
        if (z && !z2) {
            z4 = true;
        }
        this.f = new eiit(eifqVar, z4);
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ Object a(fcyh fcyhVar) {
        fcyhVar.getClass();
        eifi eifiVarB = eidc.b();
        eiit eiitVar = eifiVarB.e;
        eifn eifnVar = eifiVarB.c;
        eiit eiitVar2 = this.f;
        eifiVarB.e = eiitVar2;
        eidc.x(eifiVarB, eiitVar2.a, 1);
        return new eiis(eifnVar, eiitVar);
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ void b(fcyh fcyhVar, Object obj) {
        eiis eiisVar = (eiis) obj;
        fcyhVar.getClass();
        eiisVar.getClass();
        eifn eifnVar = eiisVar.a;
        eifi eifiVarB = eidc.b();
        eidc.x(eifiVarB, eifnVar, 3);
        eifiVarB.e = eiisVar.b;
    }

    public final eiiv c() {
        eiit eiitVar = eidc.b().e;
        boolean zE = eiitVar != null ? eiitVar.e() : false;
        return new eiiv(this.b, eidc.a || this.c || this.e, (!(eiitVar != null ? eiitVar.b : true) || zE || this.d || this.f.e()) && !this.e, false);
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return a;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
