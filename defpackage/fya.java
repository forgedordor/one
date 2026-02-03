package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fya implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;
    final /* synthetic */ ikp d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ long g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ fdat j;
    final /* synthetic */ fdat k;

    public fya(fdat fdatVar, fdat fdatVar2, fdat fdatVar3, ikp ikpVar, long j, float f, long j2, long j3, long j4, fdat fdatVar4, fdat fdatVar5) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = fdatVar3;
        this.d = ikpVar;
        this.e = j;
        this.f = f;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = fdatVar4;
        this.k = fdatVar5;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fyb.d(hxe.d(1367541877, new fxz(this.j, this.k), hmlVar), null, this.a, this.b, this.c, this.d, this.e, this.f, gdd.g(26, hmlVar), this.g, this.h, this.i, hmlVar, 6, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
