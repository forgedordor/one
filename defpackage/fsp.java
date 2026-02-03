package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsp implements fdau {
    final /* synthetic */ frd a;
    final /* synthetic */ ehc b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdau g;
    final /* synthetic */ fdat h;
    final /* synthetic */ fdat i;
    final /* synthetic */ fdau j;
    final /* synthetic */ fsv k;

    public fsp(frd frdVar, ehc ehcVar, long j, long j2, int i, fdat fdatVar, fdau fdauVar, fdat fdatVar2, fdat fdatVar3, fdau fdauVar2, fsv fsvVar) {
        this.a = frdVar;
        this.b = ehcVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = fdatVar;
        this.g = fdauVar;
        this.h = fdatVar2;
        this.i = fdatVar3;
        this.j = fdauVar2;
        this.k = fsvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(icsVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final frd frdVar = this.a;
            boolean zD = hmlVar.D(frdVar);
            final ehc ehcVar = this.b;
            boolean zD2 = zD | hmlVar.D(ehcVar);
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                objF = new fdap() { // from class: fsm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        frdVar.a.b(new eeb(ehcVar, (ehc) obj4));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fuh.a(ehm.a(icsVar, (fdap) objF), null, this.c, this.d, 0.0f, hxe.d(-1761194824, new fso(this.e, this.f, this.g, this.h, frdVar, this.i, this.j, this.k), hmlVar), hmlVar, 1572864, 50);
        }
        return fctx.a;
    }
}
