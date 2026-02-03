package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fso implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdau c;
    final /* synthetic */ fdat d;
    final /* synthetic */ frd e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdau g;
    final /* synthetic */ fsv h;

    public fso(int i, fdat fdatVar, fdau fdauVar, fdat fdatVar2, frd frdVar, fdat fdatVar3, fdau fdauVar2, fsv fsvVar) {
        this.a = i;
        this.b = fdatVar;
        this.c = fdauVar;
        this.d = fdatVar2;
        this.e = frdVar;
        this.f = fdatVar3;
        this.g = fdauVar2;
        this.h = fsvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fst.c(this.a, this.b, this.c, hxe.d(545329543, new fsn(this.g, this.h), hmlVar), this.d, this.e, this.f, hmlVar, 24576);
        }
        return fctx.a;
    }
}
