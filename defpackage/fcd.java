package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcd implements fdau {
    final /* synthetic */ faj a;
    final /* synthetic */ fmx b;
    final /* synthetic */ kew c;
    final /* synthetic */ boolean d;
    final /* synthetic */ kel e;
    final /* synthetic */ fdy f;
    final /* synthetic */ fdap g;
    final /* synthetic */ int h;

    public fcd(faj fajVar, fmx fmxVar, kew kewVar, boolean z, kel kelVar, fdy fdyVar, fdap fdapVar, int i) {
        this.a = fajVar;
        this.b = fmxVar;
        this.c = kewVar;
        this.d = z;
        this.e = kelVar;
        this.f = fdyVar;
        this.g = fdapVar;
        this.h = i;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(851809892);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = new fno();
            hmlVar.y(objF);
        }
        fno fnoVar = (fno) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new ezi();
            hmlVar.y(objF2);
        }
        fcb fcbVar = new fcb(this.a, this.b, this.c, this.d, fnoVar, this.e, this.f, (ezi) objF2, faa.a, this.g, this.h);
        ico icoVar = ics.e;
        boolean zF = hmlVar.F(fcbVar);
        Object objF3 = hmlVar.f();
        if (zF || objF3 == obj4) {
            objF3 = new fcc(fcbVar);
            hmlVar.y(objF3);
        }
        ics icsVarA = iqk.a(icoVar, (fdap) ((fdea) objF3));
        hmlVar.o();
        return icsVarA;
    }
}
